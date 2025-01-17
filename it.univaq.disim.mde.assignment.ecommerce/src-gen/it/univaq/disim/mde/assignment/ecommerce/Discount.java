/**
 */
package it.univaq.disim.mde.assignment.ecommerce;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Discount#getType <em>Type</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Discount#getAmmount <em>Ammount</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Discount#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getDiscount()
 * @model
 * @generated
 */
public interface Discount extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getDiscount_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.Discount#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Ammount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ammount</em>' attribute.
	 * @see #setAmmount(int)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getDiscount_Ammount()
	 * @model required="true"
	 * @generated
	 */
	int getAmmount();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.Discount#getAmmount <em>Ammount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ammount</em>' attribute.
	 * @see #getAmmount()
	 * @generated
	 */
	void setAmmount(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getDiscount_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.Discount#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Discount
