/**
 */
package it.univaq.disim.mde.assignment.ecommerce;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Customer#getName <em>Name</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Customer#getEmail <em>Email</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Customer#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Customer#getCart <em>Cart</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Customer#getOrder <em>Order</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Customer#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends ID_Element {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getCustomer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.Customer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getCustomer_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.Customer#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(String)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getCustomer_PhoneNumber()
	 * @model
	 * @generated
	 */
	String getPhoneNumber();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.Customer#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(String value);

	/**
	 * Returns the value of the '<em><b>Cart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cart</em>' containment reference.
	 * @see #setCart(Cart)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getCustomer_Cart()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cart getCart();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.Customer#getCart <em>Cart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cart</em>' containment reference.
	 * @see #getCart()
	 * @generated
	 */
	void setCart(Cart value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.disim.mde.assignment.ecommerce.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' containment reference list.
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getCustomer_Order()
	 * @model containment="true"
	 * @generated
	 */
	EList<Order> getOrder();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Address)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getCustomer_Address()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.Customer#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

} // Customer
