// CHECKSTYLE:OFF
package org.something.personmanager.core.extension.exporters;

import org.eclipse.core.runtime.IConfigurationElement;


/**
 *
 * @generated
 */
public class WorkspaceTarget {

	private final IConfigurationElement fConfigurationElement;
	
	private String fPath;
	
	private String fFile;
	
	
	protected WorkspaceTarget(IConfigurationElement pConfigurationElement) {
		fConfigurationElement = pConfigurationElement;
	}
	
	/**
	 * Returns the configuration element.
	 *
	 * @return configuration element.
	 */
	public IConfigurationElement getConfigurationElement() {
		return fConfigurationElement;
	}
	
	/**
	 * Returns the path.
	 * <p>
	 * Description: the path of the target.
	 * </p>
	 *
	 * @return path.
	 */
	public String getPath() {
		return fPath;
	}
	
	/**
	 * Sets the path.
	 * <p>
	 * Description: the path of the target.
	 * </p>
	 *
	 * @param pPath the path to set.
	 */
	protected void setPath(String pPath) {
		fPath = pPath;
	}
	
	/**
	 * Returns the file.
	 * <p>
	 * Description: the file to write to.
	 * </p>
	 *
	 * @return file.
	 */
	@Deprecated
	public String getFile() {
		return fFile;
	}
	
	/**
	 * Sets the file.
	 * <p>
	 * Description: the file to write to.
	 * </p>
	 *
	 * @param pFile the file to set.
	 */
	@Deprecated
	protected void setFile(String pFile) {
		fFile = pFile;
	}
	
	
}

