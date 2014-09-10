/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ustok.extgen.core.model.epmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EP Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPModel#getName <em>Name</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPModel#getId <em>Id</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPModel#getPluginName <em>Plugin Name</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPModel#getElements <em>Elements</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPModel#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPModel#getRootElement <em>Root Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPModel()
 * @model
 * @generated
 */
public interface EPModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPModel_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPModel#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Plugin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Name</em>' attribute.
	 * @see #setPluginName(String)
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPModel_PluginName()
	 * @model
	 * @generated
	 */
	String getPluginName();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPModel#getPluginName <em>Plugin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Name</em>' attribute.
	 * @see #getPluginName()
	 * @generated
	 */
	void setPluginName(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.ustok.extgen.core.model.epmodel.EPElement}.
	 * It is bidirectional and its opposite is '{@link org.ustok.extgen.core.model.epmodel.EPElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPModel_Elements()
	 * @see org.ustok.extgen.core.model.epmodel.EPElement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<EPElement> getElements();

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPModel_BasePackage()
	 * @model
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPModel#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Root Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Element</em>' reference.
	 * @see #setRootElement(EPElement)
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPModel_RootElement()
	 * @model
	 * @generated
	 */
	EPElement getRootElement();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPModel#getRootElement <em>Root Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Element</em>' reference.
	 * @see #getRootElement()
	 * @generated
	 */
	void setRootElement(EPElement value);

} // EPModel
