/**
 */
package it.univaq.disim.mde.assignment.ecommerce.impl;

import it.univaq.disim.mde.assignment.ecommerce.Address;
import it.univaq.disim.mde.assignment.ecommerce.Cart;
import it.univaq.disim.mde.assignment.ecommerce.Customer;
import it.univaq.disim.mde.assignment.ecommerce.EcommercePackage;
import it.univaq.disim.mde.assignment.ecommerce.Order;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.CustomerImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.CustomerImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.CustomerImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.CustomerImpl#getCart <em>Cart</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.CustomerImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.CustomerImpl#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends ID_ElementImpl implements Customer {
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
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected String phoneNumber = PHONE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCart() <em>Cart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCart()
	 * @generated
	 * @ordered
	 */
	protected Cart cart;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> order;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Address address;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.CUSTOMER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CUSTOMER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CUSTOMER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhoneNumber(String newPhoneNumber) {
		String oldPhoneNumber = phoneNumber;
		phoneNumber = newPhoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CUSTOMER__PHONE_NUMBER,
					oldPhoneNumber, phoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cart getCart() {
		return cart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCart(Cart newCart, NotificationChain msgs) {
		Cart oldCart = cart;
		cart = newCart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EcommercePackage.CUSTOMER__CART, oldCart, newCart);
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
	public void setCart(Cart newCart) {
		if (newCart != cart) {
			NotificationChain msgs = null;
			if (cart != null)
				msgs = ((InternalEObject) cart).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EcommercePackage.CUSTOMER__CART, null, msgs);
			if (newCart != null)
				msgs = ((InternalEObject) newCart).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EcommercePackage.CUSTOMER__CART, null, msgs);
			msgs = basicSetCart(newCart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CUSTOMER__CART, newCart, newCart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Order> getOrder() {
		if (order == null) {
			order = new EObjectContainmentEList<Order>(Order.class, this, EcommercePackage.CUSTOMER__ORDER);
		}
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Address getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(Address newAddress, NotificationChain msgs) {
		Address oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EcommercePackage.CUSTOMER__ADDRESS, oldAddress, newAddress);
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
	public void setAddress(Address newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject) address).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EcommercePackage.CUSTOMER__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject) newAddress).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EcommercePackage.CUSTOMER__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CUSTOMER__ADDRESS, newAddress,
					newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcommercePackage.CUSTOMER__CART:
			return basicSetCart(null, msgs);
		case EcommercePackage.CUSTOMER__ORDER:
			return ((InternalEList<?>) getOrder()).basicRemove(otherEnd, msgs);
		case EcommercePackage.CUSTOMER__ADDRESS:
			return basicSetAddress(null, msgs);
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
		case EcommercePackage.CUSTOMER__NAME:
			return getName();
		case EcommercePackage.CUSTOMER__EMAIL:
			return getEmail();
		case EcommercePackage.CUSTOMER__PHONE_NUMBER:
			return getPhoneNumber();
		case EcommercePackage.CUSTOMER__CART:
			return getCart();
		case EcommercePackage.CUSTOMER__ORDER:
			return getOrder();
		case EcommercePackage.CUSTOMER__ADDRESS:
			return getAddress();
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
		case EcommercePackage.CUSTOMER__NAME:
			setName((String) newValue);
			return;
		case EcommercePackage.CUSTOMER__EMAIL:
			setEmail((String) newValue);
			return;
		case EcommercePackage.CUSTOMER__PHONE_NUMBER:
			setPhoneNumber((String) newValue);
			return;
		case EcommercePackage.CUSTOMER__CART:
			setCart((Cart) newValue);
			return;
		case EcommercePackage.CUSTOMER__ORDER:
			getOrder().clear();
			getOrder().addAll((Collection<? extends Order>) newValue);
			return;
		case EcommercePackage.CUSTOMER__ADDRESS:
			setAddress((Address) newValue);
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
		case EcommercePackage.CUSTOMER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EcommercePackage.CUSTOMER__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case EcommercePackage.CUSTOMER__PHONE_NUMBER:
			setPhoneNumber(PHONE_NUMBER_EDEFAULT);
			return;
		case EcommercePackage.CUSTOMER__CART:
			setCart((Cart) null);
			return;
		case EcommercePackage.CUSTOMER__ORDER:
			getOrder().clear();
			return;
		case EcommercePackage.CUSTOMER__ADDRESS:
			setAddress((Address) null);
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
		case EcommercePackage.CUSTOMER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EcommercePackage.CUSTOMER__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case EcommercePackage.CUSTOMER__PHONE_NUMBER:
			return PHONE_NUMBER_EDEFAULT == null ? phoneNumber != null : !PHONE_NUMBER_EDEFAULT.equals(phoneNumber);
		case EcommercePackage.CUSTOMER__CART:
			return cart != null;
		case EcommercePackage.CUSTOMER__ORDER:
			return order != null && !order.isEmpty();
		case EcommercePackage.CUSTOMER__ADDRESS:
			return address != null;
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
		result.append(", email: ");
		result.append(email);
		result.append(", phoneNumber: ");
		result.append(phoneNumber);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
