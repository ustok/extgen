/*
 * Generated using ExtGen.
 * www.ustok.org
 * -----------------------
 *
 * @created 
 */

package org.something.personmanager.core.extension.exporters;

import org.eclipse.core.runtime.IConfigurationElement;


/**
 * An external target
 *
 * @created 
 * @generated
 */
public class ExternalTarget {

	/** the configuration element */
	private final IConfigurationElement fConfigurationElement;
	
	/** the name */
	private String fName;
	
	
	/**
	 * Creates a new ExternalTarget.
	 *
	 * @param pConfigurationElement the configuration element to set.
	 */
	protected ExternalTarget(IConfigurationElement pConfigurationElement) {
		fConfigurationElement = pConfigurationElement;
	}
	
	/**
	 * Returns the configuration element.
	 *
	 * @return configuration element.
	 */
	protected IConfigurationElement getConfigurationElement() {
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

