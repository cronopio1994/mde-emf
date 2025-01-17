/**
 */
package it.univaq.disim.mde.assignment.ecommerce;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipping Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.ShippingMethod#getName <em>Name</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.ShippingMethod#getDeliveryTime <em>Delivery Time</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.ShippingMethod#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getShippingMethod()
 * @model
 * @generated
 */
public interface ShippingMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getShippingMethod_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.ShippingMethod#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Delivery Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Time</em>' attribute.
	 * @see #setDeliveryTime(Date)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getShippingMethod_DeliveryTime()
	 * @model
	 * @generated
	 */
	Date getDeliveryTime();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.ShippingMethod#getDeliveryTime <em>Delivery Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Time</em>' attribute.
	 * @see #getDeliveryTime()
	 * @generated
	 */
	void setDeliveryTime(Date value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(float)
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getShippingMethod_Cost()
	 * @model required="true"
	 * @generated
	 */
	float getCost();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.assignment.ecommerce.ShippingMethod#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(float value);

} // ShippingMethod
