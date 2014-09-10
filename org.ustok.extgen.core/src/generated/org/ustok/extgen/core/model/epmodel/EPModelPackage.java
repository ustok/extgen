/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ustok.extgen.core.model.epmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ustok.extgen.core.model.epmodel.EPModelFactory
 * @model kind="package"
 * @generated
 */
public interface EPModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "epmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ustok.org/extgen/model/epmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "epmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EPModelPackage eINSTANCE = org.ustok.extgen.core.model.epmodel.impl.EPModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ustok.extgen.core.model.epmodel.impl.EPModelImpl <em>EP Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ustok.extgen.core.model.epmodel.impl.EPModelImpl
	 * @see org.ustok.extgen.core.model.epmodel.impl.EPModelPackageImpl#getEPModel()
	 * @generated
	 */
	int EP_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_MODEL__ID = 1;

	/**
	 * The feature id for the '<em><b>Plugin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_MODEL__PLUGIN_NAME = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_MODEL__ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_MODEL__BASE_PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_MODEL__ROOT_ELEMENT = 5;

	/**
	 * The number of structural features of the '<em>EP Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_MODEL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.ustok.extgen.core.model.epmodel.impl.EPElementImpl <em>EP Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ustok.extgen.core.model.epmodel.impl.EPElementImpl
	 * @see org.ustok.extgen.core.model.epmodel.impl.EPModelPackageImpl#getEPElement()
	 * @generated
	 */
	int EP_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ELEMENT__DEPRECATED = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ELEMENT__ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ELEMENT__PARENT = 4;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ELEMENT__REFS = 5;

	/**
	 * The number of structural features of the '<em>EP Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.ustok.extgen.core.model.epmodel.impl.EPAttributeImpl <em>EP Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ustok.extgen.core.model.epmodel.impl.EPAttributeImpl
	 * @see org.ustok.extgen.core.model.epmodel.impl.EPModelPackageImpl#getEPAttribute()
	 * @generated
	 */
	int EP_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ATTRIBUTE__CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ATTRIBUTE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ATTRIBUTE__DEPRECATED = 3;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ATTRIBUTE__DEFAULT_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ATTRIBUTE__USE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ATTRIBUTE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ATTRIBUTE__PARENT = 7;

	/**
	 * The number of structural features of the '<em>EP Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ATTRIBUTE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.ustok.extgen.core.model.epmodel.impl.EPRefImpl <em>EP Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ustok.extgen.core.model.epmodel.impl.EPRefImpl
	 * @see org.ustok.extgen.core.model.epmodel.impl.EPModelPackageImpl#getEPRef()
	 * @generated
	 */
	int EP_REF = 3;

	/**
	 * The feature id for the '<em><b>Min Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_REF__MIN_OCCURRENCES = 0;

	/**
	 * The feature id for the '<em><b>Max Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_REF__MAX_OCCURRENCES = 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_REF__ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>EP Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_REF_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ustok.extgen.core.model.epmodel.Use <em>Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ustok.extgen.core.model.epmodel.Use
	 * @see org.ustok.extgen.core.model.epmodel.impl.EPModelPackageImpl#getUse()
	 * @generated
	 */
	int USE = 4;

	/**
	 * The meta object id for the '{@link org.ustok.extgen.core.model.epmodel.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ustok.extgen.core.model.epmodel.Type
	 * @see org.ustok.extgen.core.model.epmodel.impl.EPModelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 5;


	/**
	 * Returns the meta object for class '{@link org.ustok.extgen.core.model.epmodel.EPModel <em>EP Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EP Model</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPModel
	 * @generated
	 */
	EClass getEPModel();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.extgen.core.model.epmodel.EPModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPModel#getName()
	 * @see #getEPModel()
	 * @generated
	 */
	EAttribute getEPModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.extgen.core.model.epmodel.EPModel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPModel#getId()
	 * @see #getEPModel()
	 * @generated
	 */
	EAttribute getEPModel_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.extgen.core.model.epmodel.EPModel#getPluginName <em>Plugin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Name</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPModel#getPluginName()
	 * @see #getEPModel()
	 * @generated
	 */
	EAttribute getEPModel_PluginName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ustok.extgen.core.model.epmodel.EPModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPModel#getElements()
	 * @see #getEPModel()
	 * @generated
	 */
	EReference getEPModel_Elements();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.extgen.core.model.epmodel.EPModel#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPModel#getBasePackage()
	 * @see #getEPModel()
	 * @generated
	 */
	EAttribute getEPModel_BasePackage();

	/**
	 * Returns the meta object for the reference '{@link org.ustok.extgen.core.model.epmodel.EPModel#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Element</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPModel#getRootElement()
	 * @see #getEPModel()
	 * @generated
	 */
	EReference getEPModel_RootElement();

	/**
	 * Returns the meta object for class '{@link org.ustok.extgen.core.model.epmodel.EPElement <em>EP Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EP Element</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPElement
	 * @generated
	 */
	EClass getEPElement();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.extgen.core.model.epmodel.EPElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPElement#getName()
	 * @see #getEPElement()
	 * @generated
	 */
	EAttribute getEPElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.extgen.core.model.epmodel.EPElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPElement#getDescription()
	 * @see #getEPElement()
	 * @generated
	 */
	EAttribute getEPElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.extgen.core.model.epmodel.EPElement#isDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deprecated</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPElement#isDeprecated()
	 * @see #getEPElement()
	 * @generated
	 */
	EAttribute getEPElement_Deprecated();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ustok.extgen.core.model.epmodel.EPElement#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPElement#getAttributes()
	 * @see #getEPElement()
	 * @generated
	 */
	EReference getEPElement_Attributes();

	/**
	 * Returns the meta object for the container reference '{@link org.ustok.extgen.core.model.epmodel.EPElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPElement#getParent()
	 * @see #getEPElement()
	 * @generated
	 */
	EReference getEPElement_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ustok.extgen.core.model.epmodel.EPElement#getRefs <em>Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refs</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPElement#getRefs()
	 * @see #getEPElement()
	 * @generated
	 */
	EReference getEPElement_Refs();

	/**
	 * Returns the meta object for class '{@link org.ustok.extgen.core.model.epmodel.EPAttribute <em>EP Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EP Attribute</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPAttribute
	 * @generated
	 */
	EClass getEPAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPAttribute#getName()
	 * @see #getEPAttribute()
	 * @generated
	 */
	EAttribute getEPAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPAttribute#getClassName()
	 * @see #getEPAttribute()
	 * @generated
	 */
	EAttribute getEPAttribute_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPAttribute#getDescription()
	 * @see #getEPAttribute()
	 * @generated
	 */
	EAttribute getEPAttribute_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.extgen.core.model.epmodel.EPAttribute#isDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deprecated</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPAttribute#isDeprecated()
	 * @see #getEPAttribute()
	 * @generated
	 */
	EAttribute getEPAttribute_Deprecated();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPAttribute#getDefaultValue()
	 * @see #getEPAttribute()
	 * @generated
	 */
	EAttribute getEPAttribute_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPAttribute#getUse()
	 * @see #getEPAttribute()
	 * @generated
	 */
	EAttribute getEPAttribute_Use();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPAttribute#getType()
	 * @see #getEPAttribute()
	 * @generated
	 */
	EAttribute getEPAttribute_Type();

	/**
	 * Returns the meta object for the container reference '{@link org.ustok.extgen.core.model.epmodel.EPAttribute#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPAttribute#getParent()
	 * @see #getEPAttribute()
	 * @generated
	 */
	EReference getEPAttribute_Parent();

	/**
	 * Returns the meta object for class '{@link org.ustok.extgen.core.model.epmodel.EPRef <em>EP Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EP Ref</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPRef
	 * @generated
	 */
	EClass getEPRef();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.extgen.core.model.epmodel.EPRef#getMinOccurrences <em>Min Occurrences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurrences</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPRef#getMinOccurrences()
	 * @see #getEPRef()
	 * @generated
	 */
	EAttribute getEPRef_MinOccurrences();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.extgen.core.model.epmodel.EPRef#getMaxOccurrences <em>Max Occurrences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurrences</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPRef#getMaxOccurrences()
	 * @see #getEPRef()
	 * @generated
	 */
	EAttribute getEPRef_MaxOccurrences();

	/**
	 * Returns the meta object for the reference '{@link org.ustok.extgen.core.model.epmodel.EPRef#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.EPRef#getElement()
	 * @see #getEPRef()
	 * @generated
	 */
	EReference getEPRef_Element();

	/**
	 * Returns the meta object for enum '{@link org.ustok.extgen.core.model.epmodel.Use <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Use</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.Use
	 * @generated
	 */
	EEnum getUse();

	/**
	 * Returns the meta object for enum '{@link org.ustok.extgen.core.model.epmodel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see org.ustok.extgen.core.model.epmodel.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EPModelFactory getEPModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ustok.extgen.core.model.epmodel.impl.EPModelImpl <em>EP Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ustok.extgen.core.model.epmodel.impl.EPModelImpl
		 * @see org.ustok.extgen.core.model.epmodel.impl.EPModelPackageImpl#getEPModel()
		 * @generated
		 */
		EClass EP_MODEL = eINSTANCE.getEPModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_MODEL__NAME = eINSTANCE.getEPModel_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_MODEL__ID = eINSTANCE.getEPModel_Id();

		/**
		 * The meta object literal for the '<em><b>Plugin Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_MODEL__PLUGIN_NAME = eINSTANCE.getEPModel_PluginName();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_MODEL__ELEMENTS = eINSTANCE.getEPModel_Elements();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_MODEL__BASE_PACKAGE = eINSTANCE.getEPModel_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Root Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_MODEL__ROOT_ELEMENT = eINSTANCE.getEPModel_RootElement();

		/**
		 * The meta object literal for the '{@link org.ustok.extgen.core.model.epmodel.impl.EPElementImpl <em>EP Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ustok.extgen.core.model.epmodel.impl.EPElementImpl
		 * @see org.ustok.extgen.core.model.epmodel.impl.EPModelPackageImpl#getEPElement()
		 * @generated
		 */
		EClass EP_ELEMENT = eINSTANCE.getEPElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_ELEMENT__NAME = eINSTANCE.getEPElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_ELEMENT__DESCRIPTION = eINSTANCE.getEPElement_Description();

		/**
		 * The meta object literal for the '<em><b>Deprecated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_ELEMENT__DEPRECATED = eINSTANCE.getEPElement_Deprecated();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_ELEMENT__ATTRIBUTES = eINSTANCE.getEPElement_Attributes();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_ELEMENT__PARENT = eINSTANCE.getEPElement_Parent();

		/**
		 * The meta object literal for the '<em><b>Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_ELEMENT__REFS = eINSTANCE.getEPElement_Refs();

		/**
		 * The meta object literal for the '{@link org.ustok.extgen.core.model.epmodel.impl.EPAttributeImpl <em>EP Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ustok.extgen.core.model.epmodel.impl.EPAttributeImpl
		 * @see org.ustok.extgen.core.model.epmodel.impl.EPModelPackageImpl#getEPAttribute()
		 * @generated
		 */
		EClass EP_ATTRIBUTE = eINSTANCE.getEPAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_ATTRIBUTE__NAME = eINSTANCE.getEPAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_ATTRIBUTE__CLASS_NAME = eINSTANCE.getEPAttribute_ClassName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_ATTRIBUTE__DESCRIPTION = eINSTANCE.getEPAttribute_Description();

		/**
		 * The meta object literal for the '<em><b>Deprecated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_ATTRIBUTE__DEPRECATED = eINSTANCE.getEPAttribute_Deprecated();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getEPAttribute_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_ATTRIBUTE__USE = eINSTANCE.getEPAttribute_Use();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_ATTRIBUTE__TYPE = eINSTANCE.getEPAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_ATTRIBUTE__PARENT = eINSTANCE.getEPAttribute_Parent();

		/**
		 * The meta object literal for the '{@link org.ustok.extgen.core.model.epmodel.impl.EPRefImpl <em>EP Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ustok.extgen.core.model.epmodel.impl.EPRefImpl
		 * @see org.ustok.extgen.core.model.epmodel.impl.EPModelPackageImpl#getEPRef()
		 * @generated
		 */
		EClass EP_REF = eINSTANCE.getEPRef();

		/**
		 * The meta object literal for the '<em><b>Min Occurrences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_REF__MIN_OCCURRENCES = eINSTANCE.getEPRef_MinOccurrences();

		/**
		 * The meta object literal for the '<em><b>Max Occurrences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_REF__MAX_OCCURRENCES = eINSTANCE.getEPRef_MaxOccurrences();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_REF__ELEMENT = eINSTANCE.getEPRef_Element();

		/**
		 * The meta object literal for the '{@link org.ustok.extgen.core.model.epmodel.Use <em>Use</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ustok.extgen.core.model.epmodel.Use
		 * @see org.ustok.extgen.core.model.epmodel.impl.EPModelPackageImpl#getUse()
		 * @generated
		 */
		EEnum USE = eINSTANCE.getUse();

		/**
		 * The meta object literal for the '{@link org.ustok.extgen.core.model.epmodel.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ustok.extgen.core.model.epmodel.Type
		 * @see org.ustok.extgen.core.model.epmodel.impl.EPModelPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //EPModelPackage
