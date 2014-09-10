/*******************************************************************************
 * Copyright (c) 2011, 2012 www.ustok.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.ustok.extgen.core.codegen.util;

import java.util.Calendar;
import java.util.Locale;

import org.ustok.extgen.core.model.epmodel.EPAttribute;
import org.ustok.extgen.core.model.epmodel.EPElement;
import org.ustok.extgen.core.model.epmodel.EPModel;
import org.ustok.extgen.core.model.epmodel.EPRef;
import org.ustok.extgen.core.model.epmodel.Type;

/**
 * Util class to be used by *.mtl templates.
 * 
 * @author Ingo Mohr
 * @created 03.01.2012
 */
public final class CodeGenUtil {

	/**
	 * Hidden constructor.
	 */
	public CodeGenUtil() {
	}

	/**
	 * Returns a string to represent the current date (by month, day and year).
	 * 
	 * @return current date string.
	 */
	public String currentDate() {
		String month = Calendar.getInstance().getDisplayName(Calendar.MONTH,
				Calendar.SHORT, Locale.US);
		int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		int year = Calendar.getInstance().get(Calendar.YEAR);

		return month + " " + day + " " + year;
	}

	/**
	 * Returns the type for the given attribute to be placed into the target
	 * Java class.
	 * 
	 * @param pAttribute
	 *            the attribute. Cannot be <code>null</code>.
	 * @return Java type representation for given attribute.
	 */
	public String toJavaType(EPAttribute pAttribute) {
		switch (pAttribute.getType().getValue()) {
		case Type.BOOLEAN_VALUE:
			return "boolean";
		case Type.JAVA_VALUE:
			return pAttribute.getClassName();
		default:
			return "String";
		}
	}

	/**
	 * Returns a field-setter assignment for variable "rawAttribute" from an
	 * element for a given attribute.
	 * 
	 * @param pAttribute
	 *            the attribute to return the instruction for.
	 * @return instruction.
	 */
	public String toFieldAssignment(EPAttribute pAttribute) {
		switch (pAttribute.getType().getValue()) {
		case Type.BOOLEAN_VALUE:
			return "Boolean.parseBoolean(rawAttribute)";
		default:
			return "rawAttribute";
		}
	}

	/**
	 * Returns the Java class name for the given element.
	 * 
	 * @param pElement
	 *            the element. Cannot be <code>null</code>.
	 * @return java class name for given element.
	 */
	public String toJavaClassName(EPElement pElement) {
		String name = pElement.getName();
		if (name != null) {
			name = name.replaceAll(" ", "");
			if (name.length() > 0) {
				name = name.substring(0, 1).toUpperCase() + name.substring(1);
			}
		}

		if ("extension".equals(pElement.getName())) {
			String pref = toJavaClassPrefix(pElement.getParent());
			if (pref.length() > 0) {
				pref = pref.substring(0, 1).toUpperCase() + pref.substring(1);
			}

			return pref + name;
		}

		return name;
	}

	/**
	 * Returns <code>null</code> if the given element's to-be-created Java class
	 * requires an import of List.
	 * 
	 * @param pElement
	 *            the element to check for.
	 * @return <code>true</code> if list import is required.
	 */
	public boolean requiresListImport(EPElement pElement) {
		for (EPRef ref : pElement.getRefs()) {
			int max = ref.getMaxOccurrences();
			if (max == -1 || max > 1) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns <code>null</code> if the given element's to-be-created Java class
	 * requires an import of CoreException.
	 * 
	 * @param pElement
	 *            the element to check for.
	 * @return <code>true</code> if exception import is required.
	 */
	public boolean requiresCoreExceptionImport(EPElement pElement) {
		for (EPAttribute attr : pElement.getAttributes()) {
			if (attr.getType() == Type.JAVA) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns the name of the given model usable to serve as prefix of a java
	 * class name.
	 * 
	 * @param pModel
	 *            the model for which to return the name.
	 * @return name usable as java class prefix.
	 */
	public String toJavaClassPrefix(EPModel pModel) {
		String name = pModel.getName();
		if (name != null) {
			name = name.replaceAll(" ", "");
			if (name.length() > 0) {
				name = name.substring(0, 1).toUpperCase() + name.substring(1);
			}
		}
		return name;
	}

}
