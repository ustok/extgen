// CHECKSTYLE:OFF
package org.something.personmanager.core.extension.exporters;

import org.eclipse.core.runtime.IConfigurationElement;


/**
 * An external target
 *
 * @generated
 */
public class ExternalTarget {

	private final IConfigurationElement fConfigurationElement;
	
	private String fName;
	
	
	protected ExternalTarget(IConfigurationElement pConfigurationElement) {
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
	 * Returns the name.
	 * <p>
	 * Description: name of the target.
	 * </p>
	 *
	 * @return name.
	 */
	public String getName() {
		return fName;
	}
	
	/**
	 * Sets the name.
	 * <p>
	 * Description: name of the target.
	 * </p>
	 *
	 * @param pName the name to set.
	 */
	protected void setName(String pName) {
		fName = pName;
	}
	
	
}

