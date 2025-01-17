/**
 */
package it.univaq.disim.mde.assignment.ecommerce;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.PaymentMethod#getType <em>Type</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.PaymentMethod#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getPaymentMethod()
 * @model
 * @generated
 */
public interface PaymentMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.univaq.disim.mde.assignment.ecommerce.PaymentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see it.univaq.disim.mde.assignment.ecommerce.PaymentType
	 * @see #setType(PaymentType)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getPaymentMethod_Type()
	 * @model
	 * @generated
	 */
	PaymentType getType();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.PaymentMethod#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see it.univaq.disim.mde.assignment.ecommerce.PaymentType
	 * @see #getType()
	 * @generated
	 */
	void setType(PaymentType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getPaymentMethod_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.PaymentMethod#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // PaymentMethod
