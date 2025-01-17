/**
 */
package it.univaq.disim.mde.assignment.ecommerce;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ID Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.ID_Element#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getID_Element()
 * @model abstract="true"
 * @generated
 */
public interface ID_Element extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getID_Element_ID()
	 * @model required="true"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.ID_Element#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

} // ID_Element
