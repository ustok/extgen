/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ustok.extgen.core.model.epmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ustok.extgen.core.model.epmodel.EPAttribute;
import org.ustok.extgen.core.model.epmodel.EPElement;
import org.ustok.extgen.core.model.epmodel.EPModel;
import org.ustok.extgen.core.model.epmodel.EPModelFactory;
import org.ustok.extgen.core.model.epmodel.EPModelPackage;
import org.ustok.extgen.core.model.epmodel.EPRef;
import org.ustok.extgen.core.model.epmodel.Type;
import org.ustok.extgen.core.model.epmodel.Use;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EPModelPackageImpl extends EPackageImpl implements EPModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass epModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass epElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass epAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass epRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum useEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EPModelPackageImpl() {
		super(eNS_URI, EPModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EPModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EPModelPackage init() {
		if (isInited) return (EPModelPackage)EPackage.Registry.INSTANCE.getEPackage(EPModelPackage.eNS_URI);

		// Obtain or create and register package
		EPModelPackageImpl theEPModelPackage = (EPModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EPModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EPModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEPModelPackage.createPackageContents();

		// Initialize created meta-data
		theEPModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEPModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EPModelPackage.eNS_URI, theEPModelPackage);
		return theEPModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPModel() {
		return epModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPModel_Name() {
		return (EAttribute)epModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPModel_Id() {
		return (EAttribute)epModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPModel_PluginName() {
		return (EAttribute)epModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPModel_Elements() {
		return (EReference)epModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPModel_BasePackage() {
		return (EAttribute)epModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPModel_RootElement() {
		return (EReference)epModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPElement() {
		return epElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPElement_Name() {
		return (EAttribute)epElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPElement_Description() {
		return (EAttribute)epElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPElement_Deprecated() {
		return (EAttribute)epElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPElement_Attributes() {
		return (EReference)epElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPElement_Parent() {
		return (EReference)epElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPElement_Refs() {
		return (EReference)epElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPAttribute() {
		return epAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPAttribute_Name() {
		return (EAttribute)epAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPAttribute_ClassName() {
		return (EAttribute)epAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPAttribute_Description() {
		return (EAttribute)epAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPAttribute_Deprecated() {
		return (EAttribute)epAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPAttribute_DefaultValue() {
		return (EAttribute)epAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPAttribute_Use() {
		return (EAttribute)epAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPAttribute_Type() {
		return (EAttribute)epAttributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPAttribute_Parent() {
		return (EReference)epAttributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPRef() {
		return epRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPRef_MinOccurrences() {
		return (EAttribute)epRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPRef_MaxOccurrences() {
		return (EAttribute)epRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPRef_Element() {
		return (EReference)epRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUse() {
		return useEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPModelFactory getEPModelFactory() {
		return (EPModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		epModelEClass = createEClass(EP_MODEL);
		createEAttribute(epModelEClass, EP_MODEL__NAME);
		createEAttribute(epModelEClass, EP_MODEL__ID);
		createEAttribute(epModelEClass, EP_MODEL__PLUGIN_NAME);
		createEReference(epModelEClass, EP_MODEL__ELEMENTS);
		createEAttribute(epModelEClass, EP_MODEL__BASE_PACKAGE);
		createEReference(epModelEClass, EP_MODEL__ROOT_ELEMENT);

		epElementEClass = createEClass(EP_ELEMENT);
		createEAttribute(epElementEClass, EP_ELEMENT__NAME);
		createEAttribute(epElementEClass, EP_ELEMENT__DESCRIPTION);
		createEAttribute(epElementEClass, EP_ELEMENT__DEPRECATED);
		createEReference(epElementEClass, EP_ELEMENT__ATTRIBUTES);
		createEReference(epElementEClass, EP_ELEMENT__PARENT);
		createEReference(epElementEClass, EP_ELEMENT__REFS);

		epAttributeEClass = createEClass(EP_ATTRIBUTE);
		createEAttribute(epAttributeEClass, EP_ATTRIBUTE__NAME);
		createEAttribute(epAttributeEClass, EP_ATTRIBUTE__CLASS_NAME);
		createEAttribute(epAttributeEClass, EP_ATTRIBUTE__DESCRIPTION);
		createEAttribute(epAttributeEClass, EP_ATTRIBUTE__DEPRECATED);
		createEAttribute(epAttributeEClass, EP_ATTRIBUTE__DEFAULT_VALUE);
		createEAttribute(epAttributeEClass, EP_ATTRIBUTE__USE);
		createEAttribute(epAttributeEClass, EP_ATTRIBUTE__TYPE);
		createEReference(epAttributeEClass, EP_ATTRIBUTE__PARENT);

		epRefEClass = createEClass(EP_REF);
		createEAttribute(epRefEClass, EP_REF__MIN_OCCURRENCES);
		createEAttribute(epRefEClass, EP_REF__MAX_OCCURRENCES);
		createEReference(epRefEClass, EP_REF__ELEMENT);

		// Create enums
		useEEnum = createEEnum(USE);
		typeEEnum = createEEnum(TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(epModelEClass, EPModel.class, "EPModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEPModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, EPModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPModel_Id(), ecorePackage.getEString(), "id", null, 0, 1, EPModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPModel_PluginName(), ecorePackage.getEString(), "pluginName", null, 0, 1, EPModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPModel_Elements(), this.getEPElement(), this.getEPElement_Parent(), "elements", null, 0, -1, EPModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPModel_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, EPModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPModel_RootElement(), this.getEPElement(), null, "rootElement", null, 0, 1, EPModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(epElementEClass, EPElement.class, "EPElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEPElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, EPElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, EPElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPElement_Deprecated(), ecorePackage.getEBoolean(), "deprecated", null, 0, 1, EPElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPElement_Attributes(), this.getEPAttribute(), this.getEPAttribute_Parent(), "attributes", null, 0, -1, EPElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPElement_Parent(), this.getEPModel(), this.getEPModel_Elements(), "parent", null, 0, 1, EPElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPElement_Refs(), this.getEPRef(), null, "refs", null, 0, -1, EPElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(epAttributeEClass, EPAttribute.class, "EPAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEPAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, EPAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPAttribute_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, EPAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPAttribute_Description(), ecorePackage.getEString(), "description", null, 0, 1, EPAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPAttribute_Deprecated(), ecorePackage.getEBoolean(), "deprecated", null, 0, 1, EPAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPAttribute_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, EPAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPAttribute_Use(), this.getUse(), "use", null, 0, 1, EPAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPAttribute_Type(), this.getType(), "type", null, 0, 1, EPAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPAttribute_Parent(), this.getEPElement(), this.getEPElement_Attributes(), "parent", null, 0, 1, EPAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(epRefEClass, EPRef.class, "EPRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEPRef_MinOccurrences(), ecorePackage.getEInt(), "minOccurrences", null, 0, 1, EPRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPRef_MaxOccurrences(), ecorePackage.getEInt(), "maxOccurrences", null, 0, 1, EPRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPRef_Element(), this.getEPElement(), null, "element", null, 0, 1, EPRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(useEEnum, Use.class, "Use");
		addEEnumLiteral(useEEnum, Use.DEFAULT);
		addEEnumLiteral(useEEnum, Use.REQUIRED);
		addEEnumLiteral(useEEnum, Use.OPTIONAL);

		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.STRING);
		addEEnumLiteral(typeEEnum, Type.JAVA);
		addEEnumLiteral(typeEEnum, Type.RESOURCE);
		addEEnumLiteral(typeEEnum, Type.IDENTIFIER);
		addEEnumLiteral(typeEEnum, Type.BOOLEAN);

		// Create resource
		createResource(eNS_URI);
	}

} //EPModelPackageImpl
