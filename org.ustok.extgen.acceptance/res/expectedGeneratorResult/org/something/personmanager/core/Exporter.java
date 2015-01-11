/*
 * Generated using ExtGen.
 * www.ustok.org
 * -----------------------
 *
 * @created 
 */

package org.something.personmanager.core.extension.exporters;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.CoreException;
import java.util.List;


/**
 * An exporter to export a given Person Manager model to a certain target.
 *
 * @created 
 * @generated
 */
public class Exporter {

	/** the configuration element */
	private final IConfigurationElement fConfigurationElement;
	
	/** the name */
	private String fName;
	
	/** the description */
	private String fDescription;
	
	/** the favourite */
	private boolean fFavourite;
	
	/** the restrictedAttribute */
	private String fRestrictedAttribute;
	
	/** the ExternalTarget */
	private List<ExternalTarget> fExternalTargets;
	
	/** the WorkspaceTarget */
	private WorkspaceTarget fWorkspaceTarget;
	
	
	/**
	 * Creates a new Exporter.
	 *
	 * @param pConfigurationElement the configuration element to set.
	 */
	protected Exporter(IConfigurationElement pConfigurationElement) {
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
	 * Description: the name of the exporter.
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
	 * Description: the name of the exporter.
	 * </p>
	 *
	 * @param pName the name to set.
	 */
	protected void setName(String pName) {
		fName = pName;
	}
	
	/**
	 * Returns the description.
	 * <p>
	 * Description: the description of the exporter.
	 * </p>
	 *
	 * @return description.
	 */
	public String getDescription() {
		return fDescription;
	}
	
	/**
	 * Sets the description.
	 * <p>
	 * Description: the description of the exporter.
	 * </p>
	 *
	 * @param pDescription the description to set.
	 */
	protected void setDescription(String pDescription) {
		fDescription = pDescription;
	}
	
	/**
	 * Creates a new instance of the class.
	 * <p>
	 * Description: The actual exporter implementation.
	 * </p>
	 *
	 * @return new class.
	 * @throws CoreException if the instance cannot be created.
	 */
	public org.something.personmanager.core.export.AbstractExporter createClass() throws CoreException {
		Object newInstance = fConfigurationElement.createExecutableExtension("class");
		return (org.something.personmanager.core.export.AbstractExporter) newInstance;
	}
	
	/**
	 * Returns <code>true</code> if the class is specified.
	 * <p>
	 * Description: The actual exporter implementation.
	 * </p>
	 *
	 * @return <code>true</code> if class is specified. <code>false</code> otherwise.
	 */
	public boolean hasClass() {
		return fConfigurationElement.getAttribute("class") != null;
	}
	
	/**
	 * Returns the favourite.
	 * <p>
	 * Description: Favourite flag. Set true to indicate that the exporter should be listed as favourite.
	 * </p>
	 *
	 * @return favourite.
	 */
	public boolean getFavourite() {
		return fFavourite;
	}
	
	/**
	 * Sets the favourite.
	 * <p>
	 * Description: Favourite flag. Set true to indicate that the exporter should be listed as favourite.
	 * </p>
	 *
	 * @param pFavourite the favourite to set.
	 */
	protected void setFavourite(boolean pFavourite) {
		fFavourite = pFavourite;
	}
	
	/**
	 * Returns the restrictedAttribute.
	 * <p>
	 * Description: restricted attribute
	 * </p>
	 *
	 * @return restrictedAttribute.
	 */
	public String getRestrictedAttribute() {
		return fRestrictedAttribute;
	}
	
	/**
	 * Sets the restrictedAttribute.
	 * <p>
	 * Description: restricted attribute
	 * </p>
	 *
	 * @param pRestrictedAttribute the restrictedAttribute to set.
	 */
	protected void setRestrictedAttribute(String pRestrictedAttribute) {
		fRestrictedAttribute = pRestrictedAttribute;
	}
	
	/**
	 * Returns the ExternalTargets.
	 * <p>
	 * Description: An external target
	 * </p>
	 *
	 * @return ExternalTarget.
	 */
	public List<ExternalTarget> getExternalTargets() {
		return fExternalTargets;
	}
	
	/**
	 * Sets the ExternalTarget references.
	 * <p>
	 * Description: An external target
	 * </p>
	 *
	 * @param pExternalTargets the ExternalTargets to set.
	 */
	protected void setExternalTargets(List<ExternalTarget> pExternalTargets) {
		fExternalTargets = pExternalTargets;
	}
	
	/**
	 * Returns the WorkspaceTarget reference.
	 * <p>
	 * Description: invalid
	 * </p>
	 *
	 * @return WorkspaceTarget.
	 */
	public WorkspaceTarget getWorkspaceTarget() {
		return fWorkspaceTarget;
	}
	
	/**
	 * Sets the WorkspaceTarget reference.
	 * <p>
	 * Description: invalid
	 * </p>
	 *
	 * @param pWorkspaceTarget the WorkspaceTarget to set.
	 */
	protected void setWorkspaceTarget(WorkspaceTarget pWorkspaceTarget) {
		fWorkspaceTarget = pWorkspaceTarget;
	}
	
	
}

