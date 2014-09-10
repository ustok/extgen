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
 * A representation of the model object '<em><b>EP Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPRef#getMinOccurrences <em>Min Occurrences</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPRef#getMaxOccurrences <em>Max Occurrences</em>}</li>
 *   <li>{@link org.ustok.extgen.core.model.epmodel.EPRef#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPRef()
 * @model
 * @generated
 */
public interface EPRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Min Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Occurrences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Occurrences</em>' attribute.
	 * @see #setMinOccurrences(int)
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPRef_MinOccurrences()
	 * @model
	 * @generated
	 */
	int getMinOccurrences();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPRef#getMinOccurrences <em>Min Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Occurrences</em>' attribute.
	 * @see #getMinOccurrences()
	 * @generated
	 */
	void setMinOccurrences(int value);

	/**
	 * Returns the value of the '<em><b>Max Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Occurrences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Occurrences</em>' attribute.
	 * @see #setMaxOccurrences(int)
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPRef_MaxOccurrences()
	 * @model
	 * @generated
	 */
	int getMaxOccurrences();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPRef#getMaxOccurrences <em>Max Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Occurrences</em>' attribute.
	 * @see #getMaxOccurrences()
	 * @generated
	 */
	void setMaxOccurrences(int value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(EPElement)
	 * @see org.ustok.extgen.core.model.epmodel.EPModelPackage#getEPRef_Element()
	 * @model
	 * @generated
	 */
	EPElement getElement();

	/**
	 * Sets the value of the '{@link org.ustok.extgen.core.model.epmodel.EPRef#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(EPElement value);

} // EPRef
