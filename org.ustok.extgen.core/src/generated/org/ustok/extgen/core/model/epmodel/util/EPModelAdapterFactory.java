/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ustok.extgen.core.model.epmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ustok.extgen.core.model.epmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage
 * @generated
 */
public class EPModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EPModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EPModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPModelSwitch<Adapter> modelSwitch =
		new EPModelSwitch<Adapter>() {
			@Override
			public Adapter caseEPModel(EPModel object) {
				return createEPModelAdapter();
			}
			@Override
			public Adapter caseEPElement(EPElement object) {
				return createEPElementAdapter();
			}
			@Override
			public Adapter caseEPAttribute(EPAttribute object) {
				return createEPAttributeAdapter();
			}
			@Override
			public Adapter caseEPRef(EPRef object) {
				return createEPRefAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.ustok.extgen.core.model.epmodel.EPModel <em>EP Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ustok.extgen.core.model.epmodel.EPModel
	 * @generated
	 */
	public Adapter createEPModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ustok.extgen.core.model.epmodel.EPElement <em>EP Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ustok.extgen.core.model.epmodel.EPElement
	 * @generated
	 */
	public Adapter createEPElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ustok.extgen.core.model.epmodel.EPAttribute <em>EP Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ustok.extgen.core.model.epmodel.EPAttribute
	 * @generated
	 */
	public Adapter createEPAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ustok.extgen.core.model.epmodel.EPRef <em>EP Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ustok.extgen.core.model.epmodel.EPRef
	 * @generated
	 */
	public Adapter createEPRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EPModelAdapterFactory
