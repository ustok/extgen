/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ustok.extgen.core.model.epmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage
 * @generated
 */
public interface EPModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EPModelFactory eINSTANCE = org.ustok.extgen.core.model.epmodel.impl.EPModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EP Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EP Model</em>'.
	 * @generated
	 */
	EPModel createEPModel();

	/**
	 * Returns a new object of class '<em>EP Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EP Element</em>'.
	 * @generated
	 */
	EPElement createEPElement();

	/**
	 * Returns a new object of class '<em>EP Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EP Attribute</em>'.
	 * @generated
	 */
	EPAttribute createEPAttribute();

	/**
	 * Returns a new object of class '<em>EP Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EP Ref</em>'.
	 * @generated
	 */
	EPRef createEPRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EPModelPackage getEPModelPackage();

} //EPModelFactory
