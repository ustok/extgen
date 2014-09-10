/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ustok.extgen.core.model.epmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.ustok.extgen.core.model.epmodel.EPAttribute;
import org.ustok.extgen.core.model.epmodel.EPElement;
import org.ustok.extgen.core.model.epmodel.EPModelPackage;
import org.ustok.extgen.core.model.epmodel.Type;
import org.ustok.extgen.core.model.epmodel.Use;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EP Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.impl.EPAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.impl.EPAttributeImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.impl.EPAttributeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.impl.EPAttributeImpl#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.impl.EPAttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.impl.EPAttributeImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.impl.EPAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.impl.EPAttributeImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EPAttributeImpl extends EObjectImpl implements EPAttribute {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeprecated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEPRECATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeprecated()
	 * @generated
	 * @ordered
	 */
	protected boolean deprecated = DEPRECATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected static final Use USE_EDEFAULT = Use.DEFAULT;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Use use = USE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EPModelPackage.Literals.EP_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPModelPackage.EP_ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPModelPackage.EP_ATTRIBUTE__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPModelPackage.EP_ATTRIBUTE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeprecated() {
		return deprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeprecated(boolean newDeprecated) {
		boolean oldDeprecated = deprecated;
		deprecated = newDeprecated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPModelPackage.EP_ATTRIBUTE__DEPRECATED, oldDeprecated, deprecated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPModelPackage.EP_ATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Use getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(Use newUse) {
		Use oldUse = use;
		use = newUse == null ? USE_EDEFAULT : newUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPModelPackage.EP_ATTRIBUTE__USE, oldUse, use));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPModelPackage.EP_ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPElement getParent() {
		if (eContainerFeatureID() != EPModelPackage.EP_ATTRIBUTE__PARENT) return null;
		return (EPElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(EPElement newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, EPModelPackage.EP_ATTRIBUTE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(EPElement newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != EPModelPackage.EP_ATTRIBUTE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EPModelPackage.EP_ELEMENT__ATTRIBUTES, EPElement.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPModelPackage.EP_ATTRIBUTE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EPModelPackage.EP_ATTRIBUTE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((EPElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EPModelPackage.EP_ATTRIBUTE__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EPModelPackage.EP_ATTRIBUTE__PARENT:
				return eInternalContainer().eInverseRemove(this, EPModelPackage.EP_ELEMENT__ATTRIBUTES, EPElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EPModelPackage.EP_ATTRIBUTE__NAME:
				return getName();
			case EPModelPackage.EP_ATTRIBUTE__CLASS_NAME:
				return getClassName();
			case EPModelPackage.EP_ATTRIBUTE__DESCRIPTION:
				return getDescription();
			case EPModelPackage.EP_ATTRIBUTE__DEPRECATED:
				return isDeprecated();
			case EPModelPackage.EP_ATTRIBUTE__DEFAULT_VALUE:
				return getDefaultValue();
			case EPModelPackage.EP_ATTRIBUTE__USE:
				return getUse();
			case EPModelPackage.EP_ATTRIBUTE__TYPE:
				return getType();
			case EPModelPackage.EP_ATTRIBUTE__PARENT:
				return getParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EPModelPackage.EP_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case EPModelPackage.EP_ATTRIBUTE__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case EPModelPackage.EP_ATTRIBUTE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EPModelPackage.EP_ATTRIBUTE__DEPRECATED:
				setDeprecated((Boolean)newValue);
				return;
			case EPModelPackage.EP_ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case EPModelPackage.EP_ATTRIBUTE__USE:
				setUse((Use)newValue);
				return;
			case EPModelPackage.EP_ATTRIBUTE__TYPE:
				setType((Type)newValue);
				return;
			case EPModelPackage.EP_ATTRIBUTE__PARENT:
				setParent((EPElement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EPModelPackage.EP_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EPModelPackage.EP_ATTRIBUTE__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case EPModelPackage.EP_ATTRIBUTE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EPModelPackage.EP_ATTRIBUTE__DEPRECATED:
				setDeprecated(DEPRECATED_EDEFAULT);
				return;
			case EPModelPackage.EP_ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case EPModelPackage.EP_ATTRIBUTE__USE:
				setUse(USE_EDEFAULT);
				return;
			case EPModelPackage.EP_ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EPModelPackage.EP_ATTRIBUTE__PARENT:
				setParent((EPElement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EPModelPackage.EP_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EPModelPackage.EP_ATTRIBUTE__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case EPModelPackage.EP_ATTRIBUTE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EPModelPackage.EP_ATTRIBUTE__DEPRECATED:
				return deprecated != DEPRECATED_EDEFAULT;
			case EPModelPackage.EP_ATTRIBUTE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case EPModelPackage.EP_ATTRIBUTE__USE:
				return use != USE_EDEFAULT;
			case EPModelPackage.EP_ATTRIBUTE__TYPE:
				return type != TYPE_EDEFAULT;
			case EPModelPackage.EP_ATTRIBUTE__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", className: ");
		result.append(className);
		result.append(", description: ");
		result.append(description);
		result.append(", deprecated: ");
		result.append(deprecated);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", use: ");
		result.append(use);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //EPAttributeImpl
