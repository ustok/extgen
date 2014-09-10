/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ustok.extgen.core.model.epmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EP Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getName <em>Name</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getDescription <em>Description</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPAttribute#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getUse <em>Use</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getType <em>Type</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPAttribute()
 * @model
 * @generated
 */
public interface EPAttribute extends EObject {
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
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPAttribute_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

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
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPAttribute_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getDescription <em>Description</em>}' attribute.
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
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPAttribute_Deprecated()
	 * @model
	 * @generated
	 */
	boolean isDeprecated();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPAttribute#isDeprecated <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' attribute.
	 * @see #isDeprecated()
	 * @generated
	 */
	void setDeprecated(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPAttribute_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ustok.extgen.core.model.epmodel.Use}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' attribute.
	 * @see org.ustok.extgen.core.model.epmodel.Use
	 * @see #setUse(Use)
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPAttribute_Use()
	 * @model
	 * @generated
	 */
	Use getUse();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getUse <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' attribute.
	 * @see org.ustok.extgen.core.model.epmodel.Use
	 * @see #getUse()
	 * @generated
	 */
	void setUse(Use value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ustok.extgen.core.model.epmodel.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.ustok.extgen.core.model.epmodel.Type
	 * @see #setType(Type)
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPAttribute_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.ustok.extgen.core.model.epmodel.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ustok.extgen.core.model.epmodel.EPElement#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(EPElement)
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPAttribute_Parent()
	 * @see org.ustok.extgen.core.model.epmodel.EPElement#getAttributes
	 * @model opposite="attributes" transient="false"
	 * @generated
	 */
	EPElement getParent();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(EPElement value);

} // EPAttribute
