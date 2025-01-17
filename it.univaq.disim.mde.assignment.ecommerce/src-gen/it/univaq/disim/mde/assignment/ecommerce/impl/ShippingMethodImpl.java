/**
 */
package it.univaq.disim.mde.assignment.ecommerce.impl;

import it.univaq.disim.mde.assignment.ecommerce.EcommercePackage;
import it.univaq.disim.mde.assignment.ecommerce.ShippingMethod;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipping Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.ShippingMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.ShippingMethodImpl#getDeliveryTime <em>Delivery Time</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.ShippingMethodImpl#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShippingMethodImpl extends MinimalEObjectImpl.Container implements ShippingMethod {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryTime() <em>Delivery Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DELIVERY_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryTime() <em>Delivery Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryTime()
	 * @generated
	 * @ordered
	 */
	protected Date deliveryTime = DELIVERY_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected float cost = COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShippingMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.SHIPPING_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.SHIPPING_METHOD__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDeliveryTime() {
		return deliveryTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryTime(Date newDeliveryTime) {
		Date oldDeliveryTime = deliveryTime;
		deliveryTime = newDeliveryTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.SHIPPING_METHOD__DELIVERY_TIME,
					oldDeliveryTime, deliveryTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCost(float newCost) {
		float oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.SHIPPING_METHOD__COST, oldCost,
					cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcommercePackage.SHIPPING_METHOD__NAME:
			return getName();
		case EcommercePackage.SHIPPING_METHOD__DELIVERY_TIME:
			return getDeliveryTime();
		case EcommercePackage.SHIPPING_METHOD__COST:
			return getCost();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EcommercePackage.SHIPPING_METHOD__NAME:
			setName((String) newValue);
			return;
		case EcommercePackage.SHIPPING_METHOD__DELIVERY_TIME:
			setDeliveryTime((Date) newValue);
			return;
		case EcommercePackage.SHIPPING_METHOD__COST:
			setCost((Float) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EcommercePackage.SHIPPING_METHOD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EcommercePackage.SHIPPING_METHOD__DELIVERY_TIME:
			setDeliveryTime(DELIVERY_TIME_EDEFAULT);
			return;
		case EcommercePackage.SHIPPING_METHOD__COST:
			setCost(COST_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EcommercePackage.SHIPPING_METHOD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EcommercePackage.SHIPPING_METHOD__DELIVERY_TIME:
			return DELIVERY_TIME_EDEFAULT == null ? deliveryTime != null : !DELIVERY_TIME_EDEFAULT.equals(deliveryTime);
		case EcommercePackage.SHIPPING_METHOD__COST:
			return cost != COST_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", deliveryTime: ");
		result.append(deliveryTime);
		result.append(", cost: ");
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //ShippingMethodImpl
