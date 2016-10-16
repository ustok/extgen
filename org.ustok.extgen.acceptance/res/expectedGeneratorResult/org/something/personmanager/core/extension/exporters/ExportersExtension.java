/*
 * Generated using ExtGen.
 * www.ustok.org
 * -----------------------
 *
 * @created 
 */

package org.something.personmanager.core.extension.exporters;

import org.eclipse.core.runtime.IConfigurationElement;
import java.util.List;


/**
 *
 * @created 
 * @generated
 */
public class ExportersExtension {

	/** the configuration element */
	private final IConfigurationElement fConfigurationElement;
	
	/** the point */
	private String fPoint;
	
	/** the id */
	private String fId;
	
	/** the name */
	private String fName;
	
	/** the contributor */
	private String fContributor;
	
	/** the exporter */
	private List<Exporter> fExporters;
	
	
	/**
	 * Creates a new ExportersExtension.
	 *
	 * @param pConfigurationElement the configuration element to set.
	 */
	protected ExportersExtension(IConfigurationElement pConfigurationElement) {
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
	 * Returns the point.
	 * <p>
	 * Description: 
	 * </p>
	 *
	 * @return point.
	 */
	public String getPoint() {
		return fPoint;
	}
	
	/**
	 * Sets the point.
	 * <p>
	 * Description: 
	 * </p>
	 *
	 * @param pPoint the point to set.
	 */
	protected void setPoint(String pPoint) {
		fPoint = pPoint;
	}
	
	/**
	 * Returns the id.
	 * <p>
	 * Description: 
	 * </p>
	 *
	 * @return id.
	 */
	public String getId() {
		return fId;
	}
	
	/**
	 * Sets the id.
	 * <p>
	 * Description: 
	 * </p>
	 *
	 * @param pId the id to set.
	 */
	protected void setId(String pId) {
		fId = pId;
	}
	
	/**
	 * Returns the name.
	 * <p>
	 * Description: 
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
	 * Description: 
	 * </p>
	 *
	 * @param pName the name to set.
	 */
	protected void setName(String pName) {
		fName = pName;
	}
	
	/**
	 * Returns the contributor.
	 *
	 * @return contributor.
	 */
	public String getContributor() {
		return fContributor;
	}
	
	/**
	 * Sets the contributor.
	 *
	 * @param pContributor the contributor to set.
	 */
	protected void setContributor(String pContributor) {
		fContributor = pContributor;
	}
	
	/**
	 * Returns the Exporters.
	 * <p>
	 * Description: An exporter to export a given Person Manager model to a certain target.
	 * </p>
	 *
	 * @return Exporter.
	 */
	public List<Exporter> getExporters() {
		return fExporters;
	}
	
	/**
	 * Sets the Exporter references.
	 * <p>
	 * Description: An exporter to export a given Person Manager model to a certain target.
	 * </p>
	 *
	 * @param pExporters the Exporters to set.
	 */
	protected void setExporters(List<Exporter> pExporters) {
		fExporters = pExporters;
	}
	
	
}

