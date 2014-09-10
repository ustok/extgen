/*******************************************************************************
 * Copyright (c) 2011, 2012 www.ustok.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.ustok.extgen.internal.core.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Assert;
import org.ustok.extgen.core.model.epmodel.EPAttribute;
import org.ustok.extgen.core.model.epmodel.EPElement;
import org.ustok.extgen.core.model.epmodel.EPModel;
import org.ustok.extgen.core.model.epmodel.EPModelFactory;
import org.ustok.extgen.core.model.epmodel.EPRef;
import org.ustok.extgen.core.model.epmodel.Type;
import org.ustok.extgen.core.model.epmodel.Use;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Extension point reader to read extension points from their schema files.
 * 
 * @author Thomas
 * @created 28.02.2011
 */
public class ExtensionPointReader {

	/** model to build */
	private EPModel fModel;

	/** maps element names to elements with that name */
	private Map<String, EPElement> fMapName2Element;

	/**
	 * Reads an extension point schema file into an extension point.
	 * 
	 * @param pFile
	 *            the file to read. Cannot be <code>null</code>.
	 * @return new extension point instance read from given file. Never
	 *         <code>null</code>.
	 * @throws IOException
	 *             if file cannot be read.
	 */
	public synchronized EPModel read(IFile pFile) throws IOException {
		Assert.isNotNull(pFile);

		fMapName2Element = new HashMap<String, EPElement>();

		fModel = EPModelFactory.eINSTANCE.createEPModel();
		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder documentBulder = documentBuilderFactory
					.newDocumentBuilder();
			Document document = documentBulder.parse(new File(pFile
					.getLocation().toString()));

			Element rootElement = document.getDocumentElement();
			parseHeader(rootElement);
			parseElements(rootElement);

		} catch (ParserConfigurationException ex) {
			throw new IOException("Error creating document builder", ex);
		} catch (SAXException ex) {
			throw new IOException("Error parsing document", ex);
		} catch (java.io.IOException ex) {
			throw new IOException("Error parsing document", ex);
		}

		EPModel model = fModel;

		postRead(model);

		fModel = null;
		fMapName2Element.clear();

		return model;
	}

	/**
	 * Performs post-read actions.
	 * 
	 * @param pModel
	 *            the model to process.
	 */
	private void postRead(EPModel pModel) {
		createAttributeExtensionContributor(pModel);
	}

	/**
	 * Creates the contributor attribute at the extension (root) element.
	 * 
	 * @param pModel
	 *            the model to process.
	 */
	private void createAttributeExtensionContributor(EPModel pModel) {
		EPElement root = pModel.getRootElement();
		if (root != null) {
			EPAttribute attr = EPModelFactory.eINSTANCE.createEPAttribute();
			attr.setType(Type.STRING);
			attr.setName("contributor");
			root.getAttributes().add(attr);
		}
	}

	/**
	 * Parses the header of an extension point schema.
	 * 
	 * @param pRootElement
	 *            root element to parse. Must not be <code>null</code>.
	 * @throws IOException
	 *             if there was a problem reading the extension point
	 */
	private void parseHeader(Element pRootElement) throws IOException {
		Assert.isNotNull(pRootElement);

		List<Element> annotations = findElements(pRootElement, "annotation");
		for (Element annotation : annotations) {
			List<Element> appInfoNodes = findElements(annotation, "appinfo");
			if (appInfoNodes.size() == 1) {
				Element appInfo = appInfoNodes.get(0);
				Element metaSchema = findSingleChild(appInfo, "meta.schema",
						true);

				String plugin = metaSchema.getAttribute("plugin");
				String id = metaSchema.getAttribute("id");
				String name = metaSchema.getAttribute("name");

				fModel.setPluginName(plugin);
				fModel.setName(name);
				fModel.setId(id);

				return;
			}
		}

		throw new IOException("Error parsing the header.");
	}

	/**
	 * Parses all elements of the extension point.
	 * 
	 * @param pRootElement
	 *            root element of the extension point.
	 * @throws IOException
	 *             if there was a problem parsing the elements.
	 */
	private void parseElements(Element pRootElement) throws IOException {
		List<Element> elmts = findElements(pRootElement, "element");

		// First create all EPElements, then parse each element.
		// Necessary because element x can refer to element y. So, y
		// must exist when parsing x.

		for (Element elmt : elmts) {
			String name = elmt.getAttribute("name");

			EPElement newElement = EPModelFactory.eINSTANCE.createEPElement();
			newElement.setName(name);

			if ("extension".equals(name)) {
				fModel.setRootElement(newElement);
			}

			fModel.getElements().add(newElement);
			fMapName2Element.put(name, newElement);
		}

		for (Element element : elmts) {
			parseElement(element);
		}

	}

	/**
	 * Parses a single extension point element.
	 * 
	 * @param pElement
	 *            xml element representing an extension point element to be
	 *            parsed.
	 * @return Extension point element, never <code>null</code>
	 * @throws IOException
	 *             if there was a problem parsing the extension point.
	 */
	private void parseElement(Element pElement) throws IOException {
		String name = pElement.getAttribute("name");

		EPElement targetElement = fMapName2Element.get(name);
		Assert.isNotNull(targetElement);

		Element annotation = findSingleChild(pElement, "annotation", false);
		if (annotation != null) {
			Element documentation = findSingleChild(annotation,
					"documentation", false);
			if (documentation != null) {
				String doc = documentation.getTextContent();
				targetElement.setDescription(doc);
			}

			Element appinfo = findSingleChild(annotation, "appinfo", false);
			if (appinfo != null) {
				Element meta = findSingleChild(appinfo, "meta.element", false);
				if (meta != null) {
					String rawDeprecated = meta.getAttribute("deprecated");
					targetElement.setDeprecated(Boolean
							.parseBoolean(rawDeprecated));
				}
			}
		}

		Element complexType = findSingleChild(pElement, "complexType", false);
		if (complexType != null) {
			for (Element attribute : findElements(complexType, "attribute")) {
				EPAttribute epAttribute = parseAttribute(attribute);
				targetElement.getAttributes().add(epAttribute);
			}
			parseElementReferences(targetElement, complexType);
		}
	}

	/**
	 * Parses all element references of an extension point element.
	 * 
	 * @param pTargetElement
	 *            the element to build the references into.
	 * @param pElement
	 *            root xml element of the extension point element. Contains
	 *            either a "choice" element or a "sequence" element.
	 * @throws IOException
	 *             if there was a problem parsing the children elements.
	 */
	private void parseElementReferences(EPElement pTargetElement,
			Element pElement) throws IOException {

		List<Element> choices = findElements(pElement, "choice");
		List<Element> sequences = findElements(pElement, "sequence");

		List<Element> elements = new ArrayList<Element>();
		elements.addAll(choices);
		elements.addAll(sequences);

		for (Element element : elements) {
			List<Element> refs = findElements(element, "element");
			for (Element ref : refs) {
				int minOccurs = findOccurParam(ref, "minOccurs", 1);
				int maxOccurs = findOccurParam(ref, "maxOccurs", 1);
				String refName = ref.getAttribute("ref");
				buildElementRef(pTargetElement, refName, minOccurs, maxOccurs);
			}
		}
	}

	private void buildElementRef(EPElement pElement, String pRefName,
			int pMinOccurs, int pMaxOccurs) {
		EPRef ref = EPModelFactory.eINSTANCE.createEPRef();
		pElement.getRefs().add(ref);

		ref.setMinOccurrences(pMinOccurs);
		ref.setMaxOccurrences(pMaxOccurs);

		EPElement refElement = fMapName2Element.get(pRefName);
		Assert.isNotNull(refElement);
		ref.setElement(refElement);
	}

	private int findOccurParam(Element pElement, String pName, int pDefaultValue) {
		String rawValue = pElement.getAttribute(pName);
		if (rawValue.isEmpty()) {
			return pDefaultValue;
		} else if ("unbounded".equals(rawValue)) {
			return -1;
		} else {
			return Integer.parseInt(rawValue);
		}
	}

	/**
	 * Parses an attribute of an extension point element.
	 * 
	 * @param pElement
	 *            element to parse
	 * @return the pares element, never <code>null</code>.
	 * @throws IOException
	 *             if there was an error parsing the attribute
	 */
	private static EPAttribute parseAttribute(Element pElement)
			throws IOException {
		EPAttribute attribute = EPModelFactory.eINSTANCE.createEPAttribute();
		String name = pElement.getAttribute("name");
		String type = pElement.getAttribute("type");

		String defaultValue = null;
		boolean deprecated = false;

		// use
		Use use = Use.OPTIONAL;
		String rawUse = pElement.getAttribute("use");
		if ("required".equals(rawUse)) {
			use = Use.REQUIRED;
		} else if ("default".equals(rawUse)) {
			use = Use.DEFAULT;
			defaultValue = pElement.getAttribute("value");
		}

		String className = null;

		Element annotation = findSingleChild(pElement, "annotation", true);
		Element appInfo = findSingleChild(annotation, "appInfo", false);
		if (appInfo != null) {
			Element metaAttr = findSingleChild(appInfo, "meta.attribute", true);
			if (metaAttr.hasAttribute("kind")) {
				type = metaAttr.getAttribute("kind");
				if ("java".equals(type)) {
					className = metaAttr.getAttribute("basedOn");
					if (className.startsWith(":")) { // colon indicates
														// interface
						className = className.substring(1);
					} else if (className.endsWith(":")) {
						className = className.substring(0,
								className.length() - 1);
					}
				}
			}
			if (metaAttr.hasAttribute("deprecated")) {
				deprecated = Boolean.parseBoolean(metaAttr
						.getAttribute("deprecated"));
			}
		}

		Element docElement = findSingleChild(annotation, "documentation", false);
		if (docElement != null) {
			String doc = docElement.getTextContent();
			attribute.setDescription(doc);
		}

		Type attributeType;
		if ("string".equals(type)) {
			attributeType = Type.STRING;
		} else if ("java".equals(type)) {
			attributeType = Type.JAVA;
		} else if ("resource".equals(type)) {
			attributeType = Type.RESOURCE;
		} else if ("identifier".equals(type)) {
			attributeType = Type.IDENTIFIER;
		} else if ("boolean".equals(type)) {
			attributeType = Type.BOOLEAN;
		} else {
			// unsupported types are represented by simple strings
			attributeType = Type.STRING;
		}

		attribute.setName(name);
		attribute.setType(attributeType);
		attribute.setClassName(className);
		attribute.setUse(use);
		attribute.setDefaultValue(defaultValue);
		attribute.setDeprecated(deprecated);

		return attribute;
	}

	/**
	 * Finds a single element with a given name.
	 * 
	 * <p>
	 * The case of the name will be ignored since it seems to be
	 * non-determinicstic.
	 * </p>
	 * 
	 * @param pElement
	 *            parent element
	 * @param pName
	 *            name of the child element to find
	 * @param pRequired
	 *            set <code>true</code> to throw an exception when there's no
	 *            child with the given name.
	 * @return element, <code>null</code> if not found (if "required" is not
	 *         set).
	 * @throws IOException
	 *             if there are more than 1 child with the given name - or if
	 *             "required" is set and there's no child element with the given
	 *             name.
	 */
	private static Element findSingleChild(Element pElement, String pName,
			boolean pRequired) throws IOException {
		List<Element> elements = findElements(pElement, pName);
		int size = elements.size();

		if ((size == 0 && pRequired) || size > 1) {
			String message = "Unexpected number of nodes for element \""
					+ pName + "\": " + size;
			throw new IOException(message);
		}

		if (size > 0) {
			Element elmt = elements.get(0);
			return elmt;
		}

		return null;
	}

	/**
	 * Finds all direct children elments with the given name.
	 * <p>
	 * Note: Case of the name is ignored. This is because the case in the dom
	 * elements seems to be non-deterministic (esp. for "appinfo" vs "appInfo").
	 * </p>
	 * 
	 * @param pElement
	 *            Element to find the children for.
	 * @param pName
	 *            Name of the elements to find
	 * @return elements, never <code>null</code> but possibly empty
	 */
	private static List<Element> findElements(Element pElement, String pName) {
		List<Element> elements = new ArrayList<Element>();

		if (pElement != null && pName != null) {
			// FIXME: need to ignore case. Really dom bug? Fix or replace this
			// parser (maybe by apache xerces).
			pName = pName.toLowerCase();
			NodeList nodes = pElement.getChildNodes();
			for (int i = 0; i < nodes.getLength(); ++i) {
				String nodeName = nodes.item(i).getNodeName().toLowerCase();
				if (pName.equals(nodeName)) {
					elements.add((Element) nodes.item(i));
				}
			}
		}

		return elements;
	}

}
