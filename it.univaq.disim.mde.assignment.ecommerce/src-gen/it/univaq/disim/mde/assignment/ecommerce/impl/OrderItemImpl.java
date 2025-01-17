/**
 */
package it.univaq.disim.mde.assignment.ecommerce.impl;

import it.univaq.disim.mde.assignment.ecommerce.EcommercePackage;
import it.univaq.disim.mde.assignment.ecommerce.OrderItem;
import it.univaq.disim.mde.assignment.ecommerce.Product;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.OrderItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.OrderItemImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.impl.OrderItemImpl#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderItemImpl extends MinimalEObjectImpl.Container implements OrderItem {
	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitPrice() <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float UNIT_PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected float unitPrice = UNIT_PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Product product;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.ORDER_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ORDER_ITEM__QUANTITY, oldQuantity,
					quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitPrice(float newUnitPrice) {
		float oldUnitPrice = unitPrice;
		unitPrice = newUnitPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ORDER_ITEM__UNIT_PRICE, oldUnitPrice,
					unitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(Product newProduct, NotificationChain msgs) {
		Product oldProduct = product;
		product = newProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EcommercePackage.ORDER_ITEM__PRODUCT, oldProduct, newProduct);
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
	public void setProduct(Product newProduct) {
		if (newProduct != product) {
			NotificationChain msgs = null;
			if (product != null)
				msgs = ((InternalEObject) product).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EcommercePackage.ORDER_ITEM__PRODUCT, null, msgs);
			if (newProduct != null)
				msgs = ((InternalEObject) newProduct).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EcommercePackage.ORDER_ITEM__PRODUCT, null, msgs);
			msgs = basicSetProduct(newProduct, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ORDER_ITEM__PRODUCT, newProduct,
					newProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcommercePackage.ORDER_ITEM__PRODUCT:
			return basicSetProduct(null, msgs);
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
		case EcommercePackage.ORDER_ITEM__QUANTITY:
			return getQuantity();
		case EcommercePackage.ORDER_ITEM__UNIT_PRICE:
			return getUnitPrice();
		case EcommercePackage.ORDER_ITEM__PRODUCT:
			return getProduct();
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
		case EcommercePackage.ORDER_ITEM__QUANTITY:
			setQuantity((Integer) newValue);
			return;
		case EcommercePackage.ORDER_ITEM__UNIT_PRICE:
			setUnitPrice((Float) newValue);
			return;
		case EcommercePackage.ORDER_ITEM__PRODUCT:
			setProduct((Product) newValue);
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
		case EcommercePackage.ORDER_ITEM__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
			return;
		case EcommercePackage.ORDER_ITEM__UNIT_PRICE:
			setUnitPrice(UNIT_PRICE_EDEFAULT);
			return;
		case EcommercePackage.ORDER_ITEM__PRODUCT:
			setProduct((Product) null);
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
		case EcommercePackage.ORDER_ITEM__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
		case EcommercePackage.ORDER_ITEM__UNIT_PRICE:
			return unitPrice != UNIT_PRICE_EDEFAULT;
		case EcommercePackage.ORDER_ITEM__PRODUCT:
			return product != null;
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
		result.append(" (quantity: ");
		result.append(quantity);
		result.append(", unitPrice: ");
		result.append(unitPrice);
		result.append(')');
		return result.toString();
	}

} //OrderItemImpl
