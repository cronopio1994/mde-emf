/**
 */
package it.univaq.disim.mde.assignment.ecommerce;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Order#getDate <em>Date</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Order#getStatus <em>Status</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Order#getTotalAmmount <em>Total Ammount</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Order#getTaxAmmount <em>Tax Ammount</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Order#getShippingmethod <em>Shippingmethod</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Order#getDiscount <em>Discount</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Order#getPayment <em>Payment</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Order#getOrderitem <em>Orderitem</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Order#getTotalQuantity <em>Total Quantity</em>}</li>
 * </ul>
 *
 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends ID_Element {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getOrder_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.Order#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link it.univaq.disim.mde.assignment.ecommerce.OrderStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see it.univaq.disim.mde.assignment.ecommerce.OrderStatus
	 * @see #setStatus(OrderStatus)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getOrder_Status()
	 * @model
	 * @generated
	 */
	OrderStatus getStatus();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.Order#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see it.univaq.disim.mde.assignment.ecommerce.OrderStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(OrderStatus value);

	/**
	 * Returns the value of the '<em><b>Total Ammount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Ammount</em>' attribute.
	 * @see #setTotalAmmount(float)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getOrder_TotalAmmount()
	 * @model required="true"
	 * @generated
	 */
	float getTotalAmmount();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.Order#getTotalAmmount <em>Total Ammount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Ammount</em>' attribute.
	 * @see #getTotalAmmount()
	 * @generated
	 */
	void setTotalAmmount(float value);

	/**
	 * Returns the value of the '<em><b>Tax Ammount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Ammount</em>' attribute.
	 * @see #setTaxAmmount(float)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getOrder_TaxAmmount()
	 * @model required="true"
	 * @generated
	 */
	float getTaxAmmount();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.Order#getTaxAmmount <em>Tax Ammount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Ammount</em>' attribute.
	 * @see #getTaxAmmount()
	 * @generated
	 */
	void setTaxAmmount(float value);

	/**
	 * Returns the value of the '<em><b>Shippingmethod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shippingmethod</em>' containment reference.
	 * @see #setShippingmethod(ShippingMethod)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getOrder_Shippingmethod()
	 * @model containment="true"
	 * @generated
	 */
	ShippingMethod getShippingmethod();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.Order#getShippingmethod <em>Shippingmethod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shippingmethod</em>' containment reference.
	 * @see #getShippingmethod()
	 * @generated
	 */
	void setShippingmethod(ShippingMethod value);

	/**
	 * Returns the value of the '<em><b>Discount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount</em>' reference.
	 * @see #setDiscount(Discount)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getOrder_Discount()
	 * @model
	 * @generated
	 */
	Discount getDiscount();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.Order#getDiscount <em>Discount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount</em>' reference.
	 * @see #getDiscount()
	 * @generated
	 */
	void setDiscount(Discount value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.disim.mde.assignment.ecommerce.Payment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' containment reference list.
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getOrder_Payment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Payment> getPayment();

	/**
	 * Returns the value of the '<em><b>Orderitem</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.disim.mde.assignment.ecommerce.OrderItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderitem</em>' containment reference list.
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getOrder_Orderitem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OrderItem> getOrderitem();

	/**
	 * Returns the value of the '<em><b>Total Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Quantity</em>' attribute.
	 * @see #setTotalQuantity(int)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getOrder_TotalQuantity()
	 * @model required="true"
	 * @generated
	 */
	int getTotalQuantity();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.Order#getTotalQuantity <em>Total Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Quantity</em>' attribute.
	 * @see #getTotalQuantity()
	 * @generated
	 */
	void setTotalQuantity(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.discount.oclIsUndefined() then\n                      self.totalAmmount\n                  else\n                      self.totalAmmount - self.discount.ammount\n                  endif'"
	 * @generated
	 */
	float discountedTotal();

} // Order
