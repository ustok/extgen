/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ustok.extgen.core.model.epmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.ustok.extgen.core.model.epmodel.EPElement;
import org.ustok.extgen.core.model.epmodel.EPModelPackage;
import org.ustok.extgen.core.model.epmodel.EPRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EP Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.impl.EPRefImpl#getMinOccurrences <em>Min Occurrences</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.impl.EPRefImpl#getMaxOccurrences <em>Max Occurrences</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.impl.EPRefImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EPRefImpl extends EObjectImpl implements EPRef {
	/**
	 * The default value of the '{@link #getMinOccurrences() <em>Min Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOccurrences()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_OCCURRENCES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinOccurrences() <em>Min Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOccurrences()
	 * @generated
	 * @ordered
	 */
	protected int minOccurrences = MIN_OCCURRENCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxOccurrences() <em>Max Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOccurrences()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_OCCURRENCES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxOccurrences() <em>Max Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOccurrences()
	 * @generated
	 * @ordered
	 */
	protected int maxOccurrences = MAX_OCCURRENCES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EPElement element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EPModelPackage.Literals.EP_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinOccurrences() {
		return minOccurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinOccurrences(int newMinOccurrences) {
		int oldMinOccurrences = minOccurrences;
		minOccurrences = newMinOccurrences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPModelPackage.EP_REF__MIN_OCCURRENCES, oldMinOccurrences, minOccurrences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxOccurrences() {
		return maxOccurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOccurrences(int newMaxOccurrences) {
		int oldMaxOccurrences = maxOccurrences;
		maxOccurrences = newMaxOccurrences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPModelPackage.EP_REF__MAX_OCCURRENCES, oldMaxOccurrences, maxOccurrences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPElement getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (EPElement)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EPModelPackage.EP_REF__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPElement basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(EPElement newElement) {
		EPElement oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPModelPackage.EP_REF__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EPModelPackage.EP_REF__MIN_OCCURRENCES:
				return getMinOccurrences();
			case EPModelPackage.EP_REF__MAX_OCCURRENCES:
				return getMaxOccurrences();
			case EPModelPackage.EP_REF__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
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
			case EPModelPackage.EP_REF__MIN_OCCURRENCES:
				setMinOccurrences((Integer)newValue);
				return;
			case EPModelPackage.EP_REF__MAX_OCCURRENCES:
				setMaxOccurrences((Integer)newValue);
				return;
			case EPModelPackage.EP_REF__ELEMENT:
				setElement((EPElement)newValue);
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
			case EPModelPackage.EP_REF__MIN_OCCURRENCES:
				setMinOccurrences(MIN_OCCURRENCES_EDEFAULT);
				return;
			case EPModelPackage.EP_REF__MAX_OCCURRENCES:
				setMaxOccurrences(MAX_OCCURRENCES_EDEFAULT);
				return;
			case EPModelPackage.EP_REF__ELEMENT:
				setElement((EPElement)null);
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
			case EPModelPackage.EP_REF__MIN_OCCURRENCES:
				return minOccurrences != MIN_OCCURRENCES_EDEFAULT;
			case EPModelPackage.EP_REF__MAX_OCCURRENCES:
				return maxOccurrences != MAX_OCCURRENCES_EDEFAULT;
			case EPModelPackage.EP_REF__ELEMENT:
				return element != null;
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
		result.append(" (minOccurrences: ");
		result.append(minOccurrences);
		result.append(", maxOccurrences: ");
		result.append(maxOccurrences);
		result.append(')');
		return result.toString();
	}

} //EPRefImpl
