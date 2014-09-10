/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ustok.extgen.core.model.epmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ustok.extgen.core.model.epmodel.EPElement;
import org.ustok.extgen.core.model.epmodel.EPModel;
import org.ustok.extgen.core.model.epmodel.EPModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EP Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.impl.EPModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.impl.EPModelImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.impl.EPModelImpl#getPluginName <em>Plugin Name</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.impl.EPModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.impl.EPModelImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.impl.EPModelImpl#getRootElement <em>Root Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EPModelImpl extends EObjectImpl implements EPModel {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPluginName() <em>Plugin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluginName() <em>Plugin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginName()
	 * @generated
	 * @ordered
	 */
	protected String pluginName = PLUGIN_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EPElement> elements;

	/**
	 * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String basePackage = BASE_PACKAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRootElement() <em>Root Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElement()
	 * @generated
	 * @ordered
	 */
	protected EPElement rootElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EPModelPackage.Literals.EP_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EPModelPackage.EP_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPModelPackage.EP_MODEL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluginName() {
		return pluginName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginName(String newPluginName) {
		String oldPluginName = pluginName;
		pluginName = newPluginName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPModelPackage.EP_MODEL__PLUGIN_NAME, oldPluginName, pluginName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<EPElement>(EPElement.class, this, EPModelPackage.EP_MODEL__ELEMENTS, EPModelPackage.EP_ELEMENT__PARENT);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePackage() {
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePackage(String newBasePackage) {
		String oldBasePackage = basePackage;
		basePackage = newBasePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPModelPackage.EP_MODEL__BASE_PACKAGE, oldBasePackage, basePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPElement getRootElement() {
		if (rootElement != null && rootElement.eIsProxy()) {
			InternalEObject oldRootElement = (InternalEObject)rootElement;
			rootElement = (EPElement)eResolveProxy(oldRootElement);
			if (rootElement != oldRootElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EPModelPackage.EP_MODEL__ROOT_ELEMENT, oldRootElement, rootElement));
			}
		}
		return rootElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPElement basicGetRootElement() {
		return rootElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootElement(EPElement newRootElement) {
		EPElement oldRootElement = rootElement;
		rootElement = newRootElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPModelPackage.EP_MODEL__ROOT_ELEMENT, oldRootElement, rootElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EPModelPackage.EP_MODEL__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
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
			case EPModelPackage.EP_MODEL__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EPModelPackage.EP_MODEL__NAME:
				return getName();
			case EPModelPackage.EP_MODEL__ID:
				return getId();
			case EPModelPackage.EP_MODEL__PLUGIN_NAME:
				return getPluginName();
			case EPModelPackage.EP_MODEL__ELEMENTS:
				return getElements();
			case EPModelPackage.EP_MODEL__BASE_PACKAGE:
				return getBasePackage();
			case EPModelPackage.EP_MODEL__ROOT_ELEMENT:
				if (resolve) return getRootElement();
				return basicGetRootElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EPModelPackage.EP_MODEL__NAME:
				setName((String)newValue);
				return;
			case EPModelPackage.EP_MODEL__ID:
				setId((String)newValue);
				return;
			case EPModelPackage.EP_MODEL__PLUGIN_NAME:
				setPluginName((String)newValue);
				return;
			case EPModelPackage.EP_MODEL__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends EPElement>)newValue);
				return;
			case EPModelPackage.EP_MODEL__BASE_PACKAGE:
				setBasePackage((String)newValue);
				return;
			case EPModelPackage.EP_MODEL__ROOT_ELEMENT:
				setRootElement((EPElement)newValue);
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
			case EPModelPackage.EP_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EPModelPackage.EP_MODEL__ID:
				setId(ID_EDEFAULT);
				return;
			case EPModelPackage.EP_MODEL__PLUGIN_NAME:
				setPluginName(PLUGIN_NAME_EDEFAULT);
				return;
			case EPModelPackage.EP_MODEL__ELEMENTS:
				getElements().clear();
				return;
			case EPModelPackage.EP_MODEL__BASE_PACKAGE:
				setBasePackage(BASE_PACKAGE_EDEFAULT);
				return;
			case EPModelPackage.EP_MODEL__ROOT_ELEMENT:
				setRootElement((EPElement)null);
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
			case EPModelPackage.EP_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EPModelPackage.EP_MODEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EPModelPackage.EP_MODEL__PLUGIN_NAME:
				return PLUGIN_NAME_EDEFAULT == null ? pluginName != null : !PLUGIN_NAME_EDEFAULT.equals(pluginName);
			case EPModelPackage.EP_MODEL__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case EPModelPackage.EP_MODEL__BASE_PACKAGE:
				return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
			case EPModelPackage.EP_MODEL__ROOT_ELEMENT:
				return rootElement != null;
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
		result.append(", id: ");
		result.append(id);
		result.append(", pluginName: ");
		result.append(pluginName);
		result.append(", basePackage: ");
		result.append(basePackage);
		result.append(')');
		return result.toString();
	}

} //EPModelImpl
