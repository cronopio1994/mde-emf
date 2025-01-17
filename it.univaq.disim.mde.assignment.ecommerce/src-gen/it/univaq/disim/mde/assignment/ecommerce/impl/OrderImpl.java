/**
 */
package it.univaq.disim.mde.assignment.ecommerce.impl;

import it.univaq.disim.mde.assignment.ecommerce.Discount;
import it.univaq.disim.mde.assignment.ecommerce.EcommercePackage;
import it.univaq.disim.mde.assignment.ecommerce.Order;
import it.univaq.disim.mde.assignment.ecommerce.OrderItem;
import it.univaq.disim.mde.assignment.ecommerce.OrderStatus;
import it.univaq.disim.mde.assignment.ecommerce.Payment;
import it.univaq.disim.mde.assignment.ecommerce.ShippingMethod;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.RealValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.OrderImpl#getDate <em>Date</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.OrderImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.OrderImpl#getTotalAmmount <em>Total Ammount</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.OrderImpl#getTaxAmmount <em>Tax Ammount</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.OrderImpl#getShippingmethod <em>Shippingmethod</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.OrderImpl#getDiscount <em>Discount</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.OrderImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.OrderImpl#getOrderitem <em>Orderitem</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.OrderImpl#getTotalQuantity <em>Total Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends ID_ElementImpl implements Order {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final OrderStatus STATUS_EDEFAULT = OrderStatus.PENDING;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected OrderStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalAmmount() <em>Total Ammount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAmmount()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_AMMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalAmmount() <em>Total Ammount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAmmount()
	 * @generated
	 * @ordered
	 */
	protected float totalAmmount = TOTAL_AMMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxAmmount() <em>Tax Ammount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAmmount()
	 * @generated
	 * @ordered
	 */
	protected static final float TAX_AMMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTaxAmmount() <em>Tax Ammount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAmmount()
	 * @generated
	 * @ordered
	 */
	protected float taxAmmount = TAX_AMMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShippingmethod() <em>Shippingmethod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingmethod()
	 * @generated
	 * @ordered
	 */
	protected ShippingMethod shippingmethod;

	/**
	 * The cached value of the '{@link #getDiscount() <em>Discount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected Discount discount;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected EList<Payment> payment;

	/**
	 * The cached value of the '{@link #getOrderitem() <em>Orderitem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderitem()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderItem> orderitem;

	/**
	 * The default value of the '{@link #getTotalQuantity() <em>Total Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalQuantity() <em>Total Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalQuantity()
	 * @generated
	 * @ordered
	 */
	protected int totalQuantity = TOTAL_QUANTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ORDER__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(OrderStatus newStatus) {
		OrderStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ORDER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getTotalAmmount() {
		return totalAmmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalAmmount(float newTotalAmmount) {
		float oldTotalAmmount = totalAmmount;
		totalAmmount = newTotalAmmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ORDER__TOTAL_AMMOUNT,
					oldTotalAmmount, totalAmmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getTaxAmmount() {
		return taxAmmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAmmount(float newTaxAmmount) {
		float oldTaxAmmount = taxAmmount;
		taxAmmount = newTaxAmmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ORDER__TAX_AMMOUNT, oldTaxAmmount,
					taxAmmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShippingMethod getShippingmethod() {
		return shippingmethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShippingmethod(ShippingMethod newShippingmethod, NotificationChain msgs) {
		ShippingMethod oldShippingmethod = shippingmethod;
		shippingmethod = newShippingmethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EcommercePackage.ORDER__SHIPPINGMETHOD, oldShippingmethod, newShippingmethod);
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
	public void setShippingmethod(ShippingMethod newShippingmethod) {
		if (newShippingmethod != shippingmethod) {
			NotificationChain msgs = null;
			if (shippingmethod != null)
				msgs = ((InternalEObject) shippingmethod).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EcommercePackage.ORDER__SHIPPINGMETHOD, null, msgs);
			if (newShippingmethod != null)
				msgs = ((InternalEObject) newShippingmethod).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EcommercePackage.ORDER__SHIPPINGMETHOD, null, msgs);
			msgs = basicSetShippingmethod(newShippingmethod, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ORDER__SHIPPINGMETHOD,
					newShippingmethod, newShippingmethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Discount getDiscount() {
		if (discount != null && discount.eIsProxy()) {
			InternalEObject oldDiscount = (InternalEObject) discount;
			discount = (Discount) eResolveProxy(oldDiscount);
			if (discount != oldDiscount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcommercePackage.ORDER__DISCOUNT,
							oldDiscount, discount));
			}
		}
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discount basicGetDiscount() {
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscount(Discount newDiscount) {
		Discount oldDiscount = discount;
		discount = newDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ORDER__DISCOUNT, oldDiscount,
					discount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Payment> getPayment() {
		if (payment == null) {
			payment = new EObjectContainmentEList<Payment>(Payment.class, this, EcommercePackage.ORDER__PAYMENT);
		}
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrderItem> getOrderitem() {
		if (orderitem == null) {
			orderitem = new EObjectContainmentEList<OrderItem>(OrderItem.class, this,
					EcommercePackage.ORDER__ORDERITEM);
		}
		return orderitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalQuantity() {
		return totalQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalQuantity(int newTotalQuantity) {
		int oldTotalQuantity = totalQuantity;
		totalQuantity = newTotalQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ORDER__TOTAL_QUANTITY,
					oldTotalQuantity, totalQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float discountedTotal() {
		/**
		 *
		 * if self.discount.oclIsUndefined()
		 * then self.totalAmmount
		 * else self.totalAmmount - self.discount.ammount
		 * endif
		 */
		final /*@NonInvalid*/ Discount discount = this.getDiscount();
		final /*@NonInvalid*/ float totalAmmount = this.getTotalAmmount();
		final /*@NonInvalid*/ RealValue BOXED_totalAmmount = ValueUtil.realValueOf(totalAmmount);
		final /*@NonInvalid*/ boolean oclIsUndefined = discount == null;
		/*@Thrown*/ RealValue IF_oclIsUndefined;
		if (oclIsUndefined) {
			IF_oclIsUndefined = BOXED_totalAmmount;
		} else {
			if (discount == null) {
				throw new InvalidValueException(
						"Null source for \'\'http://www.example.org/ecommerce\'::Discount::ammount\'");
			}
			final /*@Thrown*/ int ammount = discount.getAmmount();
			final /*@Thrown*/ IntegerValue BOXED_ammount = ValueUtil.integerValueOf(ammount);
			if (BOXED_ammount instanceof InvalidValueException) {
				throw (InvalidValueException) BOXED_ammount;
			}
			final /*@Thrown*/ RealValue diff = NumericMinusOperation.INSTANCE.evaluate(BOXED_totalAmmount,
					BOXED_ammount);
			IF_oclIsUndefined = diff;
		}
		final /*@Thrown*/ float ECORE_IF_oclIsUndefined = ValueUtil.floatValueOf(IF_oclIsUndefined);
		return ECORE_IF_oclIsUndefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcommercePackage.ORDER__SHIPPINGMETHOD:
			return basicSetShippingmethod(null, msgs);
		case EcommercePackage.ORDER__PAYMENT:
			return ((InternalEList<?>) getPayment()).basicRemove(otherEnd, msgs);
		case EcommercePackage.ORDER__ORDERITEM:
			return ((InternalEList<?>) getOrderitem()).basicRemove(otherEnd, msgs);
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
		case EcommercePackage.ORDER__DATE:
			return getDate();
		case EcommercePackage.ORDER__STATUS:
			return getStatus();
		case EcommercePackage.ORDER__TOTAL_AMMOUNT:
			return getTotalAmmount();
		case EcommercePackage.ORDER__TAX_AMMOUNT:
			return getTaxAmmount();
		case EcommercePackage.ORDER__SHIPPINGMETHOD:
			return getShippingmethod();
		case EcommercePackage.ORDER__DISCOUNT:
			if (resolve)
				return getDiscount();
			return basicGetDiscount();
		case EcommercePackage.ORDER__PAYMENT:
			return getPayment();
		case EcommercePackage.ORDER__ORDERITEM:
			return getOrderitem();
		case EcommercePackage.ORDER__TOTAL_QUANTITY:
			return getTotalQuantity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EcommercePackage.ORDER__DATE:
			setDate((Date) newValue);
			return;
		case EcommercePackage.ORDER__STATUS:
			setStatus((OrderStatus) newValue);
			return;
		case EcommercePackage.ORDER__TOTAL_AMMOUNT:
			setTotalAmmount((Float) newValue);
			return;
		case EcommercePackage.ORDER__TAX_AMMOUNT:
			setTaxAmmount((Float) newValue);
			return;
		case EcommercePackage.ORDER__SHIPPINGMETHOD:
			setShippingmethod((ShippingMethod) newValue);
			return;
		case EcommercePackage.ORDER__DISCOUNT:
			setDiscount((Discount) newValue);
			return;
		case EcommercePackage.ORDER__PAYMENT:
			getPayment().clear();
			getPayment().addAll((Collection<? extends Payment>) newValue);
			return;
		case EcommercePackage.ORDER__ORDERITEM:
			getOrderitem().clear();
			getOrderitem().addAll((Collection<? extends OrderItem>) newValue);
			return;
		case EcommercePackage.ORDER__TOTAL_QUANTITY:
			setTotalQuantity((Integer) newValue);
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
		case EcommercePackage.ORDER__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case EcommercePackage.ORDER__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case EcommercePackage.ORDER__TOTAL_AMMOUNT:
			setTotalAmmount(TOTAL_AMMOUNT_EDEFAULT);
			return;
		case EcommercePackage.ORDER__TAX_AMMOUNT:
			setTaxAmmount(TAX_AMMOUNT_EDEFAULT);
			return;
		case EcommercePackage.ORDER__SHIPPINGMETHOD:
			setShippingmethod((ShippingMethod) null);
			return;
		case EcommercePackage.ORDER__DISCOUNT:
			setDiscount((Discount) null);
			return;
		case EcommercePackage.ORDER__PAYMENT:
			getPayment().clear();
			return;
		case EcommercePackage.ORDER__ORDERITEM:
			getOrderitem().clear();
			return;
		case EcommercePackage.ORDER__TOTAL_QUANTITY:
			setTotalQuantity(TOTAL_QUANTITY_EDEFAULT);
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
		case EcommercePackage.ORDER__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case EcommercePackage.ORDER__STATUS:
			return status != STATUS_EDEFAULT;
		case EcommercePackage.ORDER__TOTAL_AMMOUNT:
			return totalAmmount != TOTAL_AMMOUNT_EDEFAULT;
		case EcommercePackage.ORDER__TAX_AMMOUNT:
			return taxAmmount != TAX_AMMOUNT_EDEFAULT;
		case EcommercePackage.ORDER__SHIPPINGMETHOD:
			return shippingmethod != null;
		case EcommercePackage.ORDER__DISCOUNT:
			return discount != null;
		case EcommercePackage.ORDER__PAYMENT:
			return payment != null && !payment.isEmpty();
		case EcommercePackage.ORDER__ORDERITEM:
			return orderitem != null && !orderitem.isEmpty();
		case EcommercePackage.ORDER__TOTAL_QUANTITY:
			return totalQuantity != TOTAL_QUANTITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case EcommercePackage.ORDER___DISCOUNTED_TOTAL:
			return discountedTotal();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (date: ");
		result.append(date);
		result.append(", status: ");
		result.append(status);
		result.append(", totalAmmount: ");
		result.append(totalAmmount);
		result.append(", taxAmmount: ");
		result.append(taxAmmount);
		result.append(", totalQuantity: ");
		result.append(totalQuantity);
		result.append(')');
		return result.toString();
	}

} //OrderImpl
