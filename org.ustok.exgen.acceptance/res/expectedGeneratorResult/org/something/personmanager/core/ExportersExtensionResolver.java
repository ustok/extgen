/*
 * Generated using ExtGen.
 * www.ustok.org
 * -----------------------
 *
 * @created 
 */

package org.something.personmanager.core.extension.exporters;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

/**
 * The Extension resolver accesses the extension registry and fetches all extensions contributed to
 * the extension-points for which the resolver has been generated.
 *
 * @created 
 * @generated
 */
public class ExportersExtensionResolver {

   /**
    * Creates a new resolver.
    */
	public ExportersExtensionResolver() {
	} 

	/**
	 * Resolves all extensions for extension-point "exporters".
	 * 
	 * @return all extensions for point "exporters". Never <code>null</code> but possibly empty.
	 * @throws CoreException if the extension point cannot be accessed.
	 */
	public List<ExportersExtension> resolveExtensions() throws CoreException {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IExtensionPoint point = reg.getExtensionPoint("org.something.personmanager.core.exporters");
	
		if (point == null) {
			IStatus status = new Status(IStatus.ERROR, "org.something.personmanager.core", "Unknown extension-point: \"org.something.personmanager.core.exporters\"");
			throw new CoreException(status);
		}

		List<ExportersExtension> result = new ArrayList<ExportersExtension>();
		IExtension[] extensions = point.getExtensions();

		if (extensions != null) {
			for (IExtension ext : extensions) {
				ExportersExtension resolvedExtension = doResolveExtension(ext);
				result.add(resolvedExtension);
			}
		}

		return result;
	}


	/**
	 * Resolves the given extension with its attributes and contained elements.
	 *
	 * @param pExtension the extension to resolve.
	 * @return resolved extension element.
	 */
	private ExportersExtension doResolveExtension(IExtension pExtension) {
		ExportersExtension result = new ExportersExtension(null);
	
		List<IConfigurationElement> childrenExporter = findElements(pExtension, "exporter");
		List<Exporter> resolvedExporters = new ArrayList<Exporter>();
		for (IConfigurationElement child : childrenExporter) {
			Exporter resolvedChild = doResolveExporter(child);
			resolvedExporters.add(resolvedChild);
		}
		result.setExporters(resolvedExporters);
	
	
		String contributorName = pExtension.getContributor().getName();
		result.setContributor(contributorName);
	
		return result;
	}
	

	/**
	 * Resolves the given elements with its attributes and contained elements.
	 *
	 * @param pElement the configuration element to resolve.
	 * @return resolved element.
	 */
	private Exporter doResolveExporter(IConfigurationElement pElement) {
		Exporter result = new Exporter(pElement);
		
		// resolve attributes
		String rawAttribute;
		rawAttribute = pElement.getAttribute("name");
		if (rawAttribute != null) {
			result.setName(rawAttribute);
		}
		rawAttribute = pElement.getAttribute("description");
		if (rawAttribute != null) {
			result.setDescription(rawAttribute);
		}
		rawAttribute = pElement.getAttribute("favourite");
		if (rawAttribute != null) {
			result.setFavourite(Boolean.parseBoolean(rawAttribute));
		}
		rawAttribute = pElement.getAttribute("restrictedAttribute");
		if (rawAttribute != null) {
			result.setRestrictedAttribute(rawAttribute);
		}
	
		// resolve nested elements
		IConfigurationElement[] childrenExternalTarget = pElement.getChildren("ExternalTarget");
		List<ExternalTarget> resolvedExternalTargets = new ArrayList<ExternalTarget>();
		for (IConfigurationElement child : childrenExternalTarget) {
			ExternalTarget resolvedChild = doResolveExternalTarget(child);
			resolvedExternalTargets.add(resolvedChild);
		}
		result.setExternalTargets(resolvedExternalTargets);
	
		IConfigurationElement[] childrenWorkspaceTarget = pElement.getChildren("WorkspaceTarget");
		if (childrenWorkspaceTarget.length > 0) {
			WorkspaceTarget resolvedWorkspaceTarget = doResolveWorkspaceTarget(childrenWorkspaceTarget[0]);
			result.setWorkspaceTarget(resolvedWorkspaceTarget);
		}
	
		return result;
	}
	

	/**
	 * Resolves the given elements with its attributes and contained elements.
	 *
	 * @param pElement the configuration element to resolve.
	 * @return resolved element.
	 */
	private ExternalTarget doResolveExternalTarget(IConfigurationElement pElement) {
		ExternalTarget result = new ExternalTarget(pElement);
		
		// resolve attributes
		String rawAttribute;
		rawAttribute = pElement.getAttribute("name");
		if (rawAttribute != null) {
			result.setName(rawAttribute);
		}
	
		// resolve nested elements
		return result;
	}
	

	/**
	 * Resolves the given elements with its attributes and contained elements.
	 *
	 * @param pElement the configuration element to resolve.
	 * @return resolved element.
	 */
	private WorkspaceTarget doResolveWorkspaceTarget(IConfigurationElement pElement) {
		WorkspaceTarget result = new WorkspaceTarget(pElement);
		
		// resolve attributes
		String rawAttribute;
		rawAttribute = pElement.getAttribute("path");
		if (rawAttribute != null) {
			result.setPath(rawAttribute);
		}
		rawAttribute = pElement.getAttribute("file");
		if (rawAttribute != null) {
			result.setFile(rawAttribute);
		}
	
		// resolve nested elements
		return result;
	}
	

	/**
	 * Returns all configuration elements with the given name from the given extension.
	 *
	 * @param pExtension the extension to return the elements from.
	 * @param pName the name of the configuration elements to find. Cannot be <code>null</code>.
	 * @return all elements with given name.
	 */
	private static List<IConfigurationElement> findElements(IExtension pExtension, String pName) {
		List<IConfigurationElement> list = new ArrayList<IConfigurationElement>();
		for (IConfigurationElement element : pExtension.getConfigurationElements()) {
			if (pName.equals(element.getName())) {
				list.add(element);
			}
		}
		return list;
	}

}
