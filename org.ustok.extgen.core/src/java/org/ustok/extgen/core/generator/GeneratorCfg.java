/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Feb 08, 2011
 * --------------------------------------------------------------------------
 */
package org.ustok.extgen.core.generator;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IProject;

/**
 * A generator configuration.
 * <p>
 * Contains all settings required to setup a generator.
 * </p>
 * 
 * @author Ingo Mohr
 * @created Feb 08, 2011
 */
public final class GeneratorCfg {

	/** project */
	private IProject fProject;

	/** extension points */
	private final List<String> fListExtensionPoints = new LinkedList<String>();

	/** package ID */
	private String fPackage;

	/** source folder */
	private String fSourceFolder;

	/**
	 * Returns the project to generate into.
	 * 
	 * @return the project to generate into.
	 */
	public IProject getProject() {
		return fProject;
	}

	/**
	 * Sets the project to generate into.
	 * 
	 * @param pProject
	 *        the project to set.
	 */
	public void setProject(IProject pProject) {
		fProject = pProject;
	}

	/**
	 * Returns the extension point IDs to generate the resolver for.
	 * 
	 * @return the extensionPoints. Never <code>null</code> but possibly empty.
	 */
	public List<String> getExtensionPoints() {
		return fListExtensionPoints;
	}

	/**
	 * Returns the package.
	 * 
	 * @return the package.
	 */
	public String getPackage() {
		return fPackage;
	}

	/**
	 * Sets the package.
	 * 
	 * @param pPackage
	 *        The package to set.
	 */
	public void setPackage(String pPackage) {
		fPackage = pPackage;
	}

	/**
	 * Returns the sourceFolder.
	 * 
	 * @return the sourceFolder.
	 */
	public String getSourceFolder() {
		return fSourceFolder;
	}

	/**
	 * Sets the sourceFolder.
	 * 
	 * @param pSourceFolder
	 *        The sourceFolder to set.
	 */
	public void setSourceFolder(String pSourceFolder) {
		fSourceFolder = pSourceFolder;
	}

}
