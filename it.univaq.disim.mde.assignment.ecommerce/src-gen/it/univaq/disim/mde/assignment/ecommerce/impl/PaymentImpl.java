/**
 */
package it.univaq.disim.mde.assignment.ecommerce.impl;

import it.univaq.disim.mde.assignment.ecommerce.EcommercePackage;
import it.univaq.disim.mde.assignment.ecommerce.Order;
import it.univaq.disim.mde.assignment.ecommerce.Payment;
import it.univaq.disim.mde.assignment.ecommerce.PaymentMethod;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.PaymentImpl#getAmmount <em>Ammount</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.PaymentImpl#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.PaymentImpl#getPaymentmethod <em>Paymentmethod</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.PaymentImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentImpl extends ID_ElementImpl implements Payment {
	/**
	 * The default value of the '{@link #getAmmount() <em>Ammount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmmount() <em>Ammount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmmount()
	 * @generated
	 * @ordered
	 */
	protected float ammount = AMMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentDate() <em>Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PAYMENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentDate() <em>Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDate()
	 * @generated
	 * @ordered
	 */
	protected Date paymentDate = PAYMENT_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaymentmethod() <em>Paymentmethod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentmethod()
	 * @generated
	 * @ordered
	 */
	protected PaymentMethod paymentmethod;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected Order order;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.PAYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAmmount() {
		return ammount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmmount(float newAmmount) {
		float oldAmmount = ammount;
		ammount = newAmmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PAYMENT__AMMOUNT, oldAmmount,
					ammount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPaymentDate() {
		return paymentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentDate(Date newPaymentDate) {
		Date oldPaymentDate = paymentDate;
		paymentDate = newPaymentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PAYMENT__PAYMENT_DATE,
					oldPaymentDate, paymentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod getPaymentmethod() {
		return paymentmethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentmethod(PaymentMethod newPaymentmethod, NotificationChain msgs) {
		PaymentMethod oldPaymentmethod = paymentmethod;
		paymentmethod = newPaymentmethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EcommercePackage.PAYMENT__PAYMENTMETHOD, oldPaymentmethod, newPaymentmethod);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentmethod(PaymentMethod newPaymentmethod) {
		if (newPaymentmethod != paymentmethod) {
			NotificationChain msgs = null;
			if (paymentmethod != null)
				msgs = ((InternalEObject) paymentmethod).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EcommercePackage.PAYMENT__PAYMENTMETHOD, null, msgs);
			if (newPaymentmethod != null)
				msgs = ((InternalEObject) newPaymentmethod).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EcommercePackage.PAYMENT__PAYMENTMETHOD, null, msgs);
			msgs = basicSetPaymentmethod(newPaymentmethod, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PAYMENT__PAYMENTMETHOD,
					newPaymentmethod, newPaymentmethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Order getOrder() {
		if (order != null && order.eIsProxy()) {
			InternalEObject oldOrder = (InternalEObject) order;
			order = (Order) eResolveProxy(oldOrder);
			if (order != oldOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcommercePackage.PAYMENT__ORDER, oldOrder,
							order));
			}
		}
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order basicGetOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(Order newOrder) {
		Order oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PAYMENT__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcommercePackage.PAYMENT__PAYMENTMETHOD:
			return basicSetPaymentmethod(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcommercePackage.PAYMENT__AMMOUNT:
			return getAmmount();
		case EcommercePackage.PAYMENT__PAYMENT_DATE:
			return getPaymentDate();
		case EcommercePackage.PAYMENT__PAYMENTMETHOD:
			return getPaymentmethod();
		case EcommercePackage.PAYMENT__ORDER:
			if (resolve)
				return getOrder();
			return basicGetOrder();
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
		case EcommercePackage.PAYMENT__AMMOUNT:
			setAmmount((Float) newValue);
			return;
		case EcommercePackage.PAYMENT__PAYMENT_DATE:
			setPaymentDate((Date) newValue);
			return;
		case EcommercePackage.PAYMENT__PAYMENTMETHOD:
			setPaymentmethod((PaymentMethod) newValue);
			return;
		case EcommercePackage.PAYMENT__ORDER:
			setOrder((Order) newValue);
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
		case EcommercePackage.PAYMENT__AMMOUNT:
			setAmmount(AMMOUNT_EDEFAULT);
			return;
		case EcommercePackage.PAYMENT__PAYMENT_DATE:
			setPaymentDate(PAYMENT_DATE_EDEFAULT);
			return;
		case EcommercePackage.PAYMENT__PAYMENTMETHOD:
			setPaymentmethod((PaymentMethod) null);
			return;
		case EcommercePackage.PAYMENT__ORDER:
			setOrder((Order) null);
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
		case EcommercePackage.PAYMENT__AMMOUNT:
			return ammount != AMMOUNT_EDEFAULT;
		case EcommercePackage.PAYMENT__PAYMENT_DATE:
			return PAYMENT_DATE_EDEFAULT == null ? paymentDate != null : !PAYMENT_DATE_EDEFAULT.equals(paymentDate);
		case EcommercePackage.PAYMENT__PAYMENTMETHOD:
			return paymentmethod != null;
		case EcommercePackage.PAYMENT__ORDER:
			return order != null;
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
		result.append(" (ammount: ");
		result.append(ammount);
		result.append(", paymentDate: ");
		result.append(paymentDate);
		result.append(')');
		return result.toString();
	}

} //PaymentImpl
