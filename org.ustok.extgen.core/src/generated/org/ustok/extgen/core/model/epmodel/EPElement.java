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
 * A representation of the model object '<em><b>EP Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPElement#getName <em>Name</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPElement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPElement#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPElement#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPElement#getParent <em>Parent</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPElement#getRefs <em>Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPElement()
 * @model
 * @generated
 */
public interface EPElement extends EObject {
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
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deprecated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated</em>' attribute.
	 * @see #setDeprecated(boolean)
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPElement_Deprecated()
	 * @model
	 * @generated
	 */
	boolean isDeprecated();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPElement#isDeprecated <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' attribute.
	 * @see #isDeprecated()
	 * @generated
	 */
	void setDeprecated(boolean value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.ustok.extgen.core.model.epmodel.EPAttribute}.
	 * It is bidirectional and its opposite is '{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPElement_Attributes()
	 * @see org.ustok.extgen.core.model.epmodel.EPAttribute#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<EPAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ustok.extgen.core.model.epmodel.EPModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(EPModel)
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPElement_Parent()
	 * @see org.ustok.extgen.core.model.epmodel.EPModel#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	EPModel getParent();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPElement#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(EPModel value);

	/**
	 * Returns the value of the '<em><b>Refs</b></em>' containment reference list.
	 * The list contents are of type {@link org.ustok.extgen.core.model.epmodel.EPRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refs</em>' containment reference list.
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPElement_Refs()
	 * @model containment="true"
	 * @generated
	 */
	EList<EPRef> getRefs();

} // EPElement
