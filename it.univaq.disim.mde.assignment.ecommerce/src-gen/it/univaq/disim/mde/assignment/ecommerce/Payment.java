/**
 */
package it.univaq.disim.mde.assignment.ecommerce;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Payment#getAmmount <em>Ammount</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Payment#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Payment#getPaymentmethod <em>Paymentmethod</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Payment#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getPayment()
 * @model
 * @generated
 */
public interface Payment extends ID_Element {
	/**
	 * Returns the value of the '<em><b>Ammount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ammount</em>' attribute.
	 * @see #setAmmount(float)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getPayment_Ammount()
	 * @model required="true"
	 * @generated
	 */
	float getAmmount();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.Payment#getAmmount <em>Ammount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ammount</em>' attribute.
	 * @see #getAmmount()
	 * @generated
	 */
	void setAmmount(float value);

	/**
	 * Returns the value of the '<em><b>Payment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Date</em>' attribute.
	 * @see #setPaymentDate(Date)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getPayment_PaymentDate()
	 * @model
	 * @generated
	 */
	Date getPaymentDate();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.Payment#getPaymentDate <em>Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Date</em>' attribute.
	 * @see #getPaymentDate()
	 * @generated
	 */
	void setPaymentDate(Date value);

	/**
	 * Returns the value of the '<em><b>Paymentmethod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paymentmethod</em>' containment reference.
	 * @see #setPaymentmethod(PaymentMethod)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getPayment_Paymentmethod()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PaymentMethod getPaymentmethod();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.Payment#getPaymentmethod <em>Paymentmethod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paymentmethod</em>' containment reference.
	 * @see #getPaymentmethod()
	 * @generated
	 */
	void setPaymentmethod(PaymentMethod value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference.
	 * @see #setOrder(Order)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getPayment_Order()
	 * @model required="true"
	 * @generated
	 */
	Order getOrder();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.Payment#getOrder <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Order value);

} // Payment
