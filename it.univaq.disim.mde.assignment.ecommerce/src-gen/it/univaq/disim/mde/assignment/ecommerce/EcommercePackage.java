/**
 */
package it.univaq.disim.mde.assignment.ecommerce;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.univaq.disim.mde.assignment.ecommerce.EcommerceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface EcommercePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecommerce";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ecommerce";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecommerce";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcommercePackage eINSTANCE = it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl.init();

	/**
	 * The meta object id for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.ID_ElementImpl <em>ID Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.ID_ElementImpl
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getID_Element()
	 * @generated
	 */
	int ID_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>ID Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ID Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.ItemImpl
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ID = ID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = ID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__PRICE = ID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = ID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Positive Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___POSITIVE_PRICE__DIAGNOSTICCHAIN_MAP = ID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = ID_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.ProductImpl
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = ITEM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRICE = ITEM__PRICE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CATEGORY = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Positive Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___POSITIVE_PRICE__DIAGNOSTICCHAIN_MAP = ITEM___POSITIVE_PRICE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.CartImpl <em>Cart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.CartImpl
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getCart()
	 * @generated
	 */
	int CART = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART__ID = ID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART__PRODUCTS = ID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_FEATURE_COUNT = ID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Total Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART___TOTAL_PRODUCTS = ID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_OPERATION_COUNT = ID_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.OrderItemImpl <em>Order Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.OrderItemImpl
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getOrderItem()
	 * @generated
	 */
	int ORDER_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__QUANTITY = 0;

	/**
	 * The feature id for the '<em><b>Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__UNIT_PRICE = 1;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__PRODUCT = 2;

	/**
	 * The number of structural features of the '<em>Order Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Order Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.OrderImpl
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 6;

	/**
	 * The meta object id for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.ShippingMethodImpl <em>Shipping Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.ShippingMethodImpl
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getShippingMethod()
	 * @generated
	 */
	int SHIPPING_METHOD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Delivery Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_METHOD__DELIVERY_TIME = 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_METHOD__COST = 2;

	/**
	 * The number of structural features of the '<em>Shipping Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_METHOD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Shipping Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_METHOD_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ID = ID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__DATE = ID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__STATUS = ID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Total Ammount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TOTAL_AMMOUNT = ID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tax Ammount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TAX_AMMOUNT = ID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Shippingmethod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__SHIPPINGMETHOD = ID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Discount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__DISCOUNT = ID_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PAYMENT = ID_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Orderitem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDERITEM = ID_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Total Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TOTAL_QUANTITY = ID_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = ID_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Discounted Total</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER___DISCOUNTED_TOTAL = ID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = ID_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.DiscountImpl <em>Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.DiscountImpl
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getDiscount()
	 * @generated
	 */
	int DISCOUNT = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Ammount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__AMMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.PaymentMethodImpl <em>Payment Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.PaymentMethodImpl
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getPaymentMethod()
	 * @generated
	 */
	int PAYMENT_METHOD = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Payment Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Payment Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.PaymentImpl
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__ID = ID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Ammount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__AMMOUNT = ID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Payment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_DATE = ID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Paymentmethod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENTMETHOD = ID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__ORDER = ID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = ID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = ID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.CustomerImpl
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ID = ID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = ID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EMAIL = ID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PHONE_NUMBER = ID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CART = ID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ORDER = ID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ADDRESS = ID_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = ID_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = ID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.AddressImpl
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 11;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET = 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STATE = 2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = 3;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.univaq.disim.mde.assignment.ecommerce.PaymentStatus <em>Payment Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.disim.mde.assignment.ecommerce.PaymentStatus
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getPaymentStatus()
	 * @generated
	 */
	int PAYMENT_STATUS = 12;

	/**
	 * The meta object id for the '{@link it.univaq.disim.mde.assignment.ecommerce.OrderStatus <em>Order Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.disim.mde.assignment.ecommerce.OrderStatus
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getOrderStatus()
	 * @generated
	 */
	int ORDER_STATUS = 13;

	/**
	 * The meta object id for the '{@link it.univaq.disim.mde.assignment.ecommerce.PaymentType <em>Payment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.disim.mde.assignment.ecommerce.PaymentType
	 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getPaymentType()
	 * @generated
	 */
	int PAYMENT_TYPE = 14;

	/**
	 * Returns the meta object for class '{@link it.univaq.disim.mde.assignment.ecommerce.ID_Element <em>ID Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Element</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.ID_Element
	 * @generated
	 */
	EClass getID_Element();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.ID_Element#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.ID_Element#getID()
	 * @see #getID_Element()
	 * @generated
	 */
	EAttribute getID_Element_ID();

	/**
	 * Returns the meta object for class '{@link it.univaq.disim.mde.assignment.ecommerce.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Item#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Item#getName()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Item#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Item#getPrice()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Price();

	/**
	 * Returns the meta object for the '{@link it.univaq.disim.mde.assignment.ecommerce.Item#positivePrice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Positive Price</em>' operation.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Item#positivePrice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getItem__PositivePrice__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link it.univaq.disim.mde.assignment.ecommerce.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Product#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Product#getCategory()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Category();

	/**
	 * Returns the meta object for class '{@link it.univaq.disim.mde.assignment.ecommerce.Cart <em>Cart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cart</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Cart
	 * @generated
	 */
	EClass getCart();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.disim.mde.assignment.ecommerce.Cart#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Products</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Cart#getProducts()
	 * @see #getCart()
	 * @generated
	 */
	EReference getCart_Products();

	/**
	 * Returns the meta object for the '{@link it.univaq.disim.mde.assignment.ecommerce.Cart#totalProducts() <em>Total Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Total Products</em>' operation.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Cart#totalProducts()
	 * @generated
	 */
	EOperation getCart__TotalProducts();

	/**
	 * Returns the meta object for class '{@link it.univaq.disim.mde.assignment.ecommerce.OrderItem <em>Order Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Item</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.OrderItem
	 * @generated
	 */
	EClass getOrderItem();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.OrderItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.OrderItem#getQuantity()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.OrderItem#getUnitPrice <em>Unit Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Price</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.OrderItem#getUnitPrice()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_UnitPrice();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.disim.mde.assignment.ecommerce.OrderItem#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.OrderItem#getProduct()
	 * @see #getOrderItem()
	 * @generated
	 */
	EReference getOrderItem_Product();

	/**
	 * Returns the meta object for class '{@link it.univaq.disim.mde.assignment.ecommerce.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Order#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Order#getDate()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Date();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Order#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Order#getStatus()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Status();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Order#getTotalAmmount <em>Total Ammount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Ammount</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Order#getTotalAmmount()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_TotalAmmount();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Order#getTaxAmmount <em>Tax Ammount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Ammount</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Order#getTaxAmmount()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_TaxAmmount();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.disim.mde.assignment.ecommerce.Order#getShippingmethod <em>Shippingmethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shippingmethod</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Order#getShippingmethod()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Shippingmethod();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.disim.mde.assignment.ecommerce.Order#getDiscount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discount</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Order#getDiscount()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Discount();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.disim.mde.assignment.ecommerce.Order#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Payment</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Order#getPayment()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Payment();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.disim.mde.assignment.ecommerce.Order#getOrderitem <em>Orderitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orderitem</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Order#getOrderitem()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Orderitem();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Order#getTotalQuantity <em>Total Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Quantity</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Order#getTotalQuantity()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_TotalQuantity();

	/**
	 * Returns the meta object for the '{@link it.univaq.disim.mde.assignment.ecommerce.Order#discountedTotal() <em>Discounted Total</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Discounted Total</em>' operation.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Order#discountedTotal()
	 * @generated
	 */
	EOperation getOrder__DiscountedTotal();

	/**
	 * Returns the meta object for class '{@link it.univaq.disim.mde.assignment.ecommerce.ShippingMethod <em>Shipping Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipping Method</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.ShippingMethod
	 * @generated
	 */
	EClass getShippingMethod();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.ShippingMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.ShippingMethod#getName()
	 * @see #getShippingMethod()
	 * @generated
	 */
	EAttribute getShippingMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.ShippingMethod#getDeliveryTime <em>Delivery Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Time</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.ShippingMethod#getDeliveryTime()
	 * @see #getShippingMethod()
	 * @generated
	 */
	EAttribute getShippingMethod_DeliveryTime();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.ShippingMethod#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.ShippingMethod#getCost()
	 * @see #getShippingMethod()
	 * @generated
	 */
	EAttribute getShippingMethod_Cost();

	/**
	 * Returns the meta object for class '{@link it.univaq.disim.mde.assignment.ecommerce.Discount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Discount
	 * @generated
	 */
	EClass getDiscount();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Discount#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Discount#getType()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_Type();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Discount#getAmmount <em>Ammount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ammount</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Discount#getAmmount()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_Ammount();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Discount#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Discount#getDescription()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_Description();

	/**
	 * Returns the meta object for class '{@link it.univaq.disim.mde.assignment.ecommerce.PaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Method</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.PaymentMethod
	 * @generated
	 */
	EClass getPaymentMethod();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.PaymentMethod#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.PaymentMethod#getType()
	 * @see #getPaymentMethod()
	 * @generated
	 */
	EAttribute getPaymentMethod_Type();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.PaymentMethod#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.PaymentMethod#getDescription()
	 * @see #getPaymentMethod()
	 * @generated
	 */
	EAttribute getPaymentMethod_Description();

	/**
	 * Returns the meta object for class '{@link it.univaq.disim.mde.assignment.ecommerce.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Payment#getAmmount <em>Ammount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ammount</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Payment#getAmmount()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Ammount();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Payment#getPaymentDate <em>Payment Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Date</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Payment#getPaymentDate()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_PaymentDate();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.disim.mde.assignment.ecommerce.Payment#getPaymentmethod <em>Paymentmethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Paymentmethod</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Payment#getPaymentmethod()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_Paymentmethod();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.disim.mde.assignment.ecommerce.Payment#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Payment#getOrder()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_Order();

	/**
	 * Returns the meta object for class '{@link it.univaq.disim.mde.assignment.ecommerce.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Customer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Customer#getName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Customer#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Customer#getEmail()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Email();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Customer#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Customer#getPhoneNumber()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_PhoneNumber();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.disim.mde.assignment.ecommerce.Customer#getCart <em>Cart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cart</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Customer#getCart()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Cart();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.disim.mde.assignment.ecommerce.Customer#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Customer#getOrder()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Order();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.disim.mde.assignment.ecommerce.Customer#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Customer#getAddress()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Address();

	/**
	 * Returns the meta object for class '{@link it.univaq.disim.mde.assignment.ecommerce.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Address#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Address#getStreet()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Street();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Address#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Address#getState()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_State();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.disim.mde.assignment.ecommerce.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Country();

	/**
	 * Returns the meta object for enum '{@link it.univaq.disim.mde.assignment.ecommerce.PaymentStatus <em>Payment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Status</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.PaymentStatus
	 * @generated
	 */
	EEnum getPaymentStatus();

	/**
	 * Returns the meta object for enum '{@link it.univaq.disim.mde.assignment.ecommerce.OrderStatus <em>Order Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Status</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.OrderStatus
	 * @generated
	 */
	EEnum getOrderStatus();

	/**
	 * Returns the meta object for enum '{@link it.univaq.disim.mde.assignment.ecommerce.PaymentType <em>Payment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Type</em>'.
	 * @see it.univaq.disim.mde.assignment.ecommerce.PaymentType
	 * @generated
	 */
	EEnum getPaymentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcommerceFactory getEcommerceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.ID_ElementImpl <em>ID Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.ID_ElementImpl
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getID_Element()
		 * @generated
		 */
		EClass ID_ELEMENT = eINSTANCE.getID_Element();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ELEMENT__ID = eINSTANCE.getID_Element_ID();

		/**
		 * The meta object literal for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.ItemImpl
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__NAME = eINSTANCE.getItem_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__PRICE = eINSTANCE.getItem_Price();

		/**
		 * The meta object literal for the '<em><b>Positive Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___POSITIVE_PRICE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getItem__PositivePrice__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.ProductImpl
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__CATEGORY = eINSTANCE.getProduct_Category();

		/**
		 * The meta object literal for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.CartImpl <em>Cart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.CartImpl
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getCart()
		 * @generated
		 */
		EClass CART = eINSTANCE.getCart();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CART__PRODUCTS = eINSTANCE.getCart_Products();

		/**
		 * The meta object literal for the '<em><b>Total Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CART___TOTAL_PRODUCTS = eINSTANCE.getCart__TotalProducts();

		/**
		 * The meta object literal for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.OrderItemImpl <em>Order Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.OrderItemImpl
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getOrderItem()
		 * @generated
		 */
		EClass ORDER_ITEM = eINSTANCE.getOrderItem();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__QUANTITY = eINSTANCE.getOrderItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Unit Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__UNIT_PRICE = eINSTANCE.getOrderItem_UnitPrice();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM__PRODUCT = eINSTANCE.getOrderItem_Product();

		/**
		 * The meta object literal for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.OrderImpl
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__DATE = eINSTANCE.getOrder_Date();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__STATUS = eINSTANCE.getOrder_Status();

		/**
		 * The meta object literal for the '<em><b>Total Ammount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__TOTAL_AMMOUNT = eINSTANCE.getOrder_TotalAmmount();

		/**
		 * The meta object literal for the '<em><b>Tax Ammount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__TAX_AMMOUNT = eINSTANCE.getOrder_TaxAmmount();

		/**
		 * The meta object literal for the '<em><b>Shippingmethod</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__SHIPPINGMETHOD = eINSTANCE.getOrder_Shippingmethod();

		/**
		 * The meta object literal for the '<em><b>Discount</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__DISCOUNT = eINSTANCE.getOrder_Discount();

		/**
		 * The meta object literal for the '<em><b>Payment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__PAYMENT = eINSTANCE.getOrder_Payment();

		/**
		 * The meta object literal for the '<em><b>Orderitem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__ORDERITEM = eINSTANCE.getOrder_Orderitem();

		/**
		 * The meta object literal for the '<em><b>Total Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__TOTAL_QUANTITY = eINSTANCE.getOrder_TotalQuantity();

		/**
		 * The meta object literal for the '<em><b>Discounted Total</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORDER___DISCOUNTED_TOTAL = eINSTANCE.getOrder__DiscountedTotal();

		/**
		 * The meta object literal for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.ShippingMethodImpl <em>Shipping Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.ShippingMethodImpl
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getShippingMethod()
		 * @generated
		 */
		EClass SHIPPING_METHOD = eINSTANCE.getShippingMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPPING_METHOD__NAME = eINSTANCE.getShippingMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Delivery Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPPING_METHOD__DELIVERY_TIME = eINSTANCE.getShippingMethod_DeliveryTime();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPPING_METHOD__COST = eINSTANCE.getShippingMethod_Cost();

		/**
		 * The meta object literal for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.DiscountImpl <em>Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.DiscountImpl
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getDiscount()
		 * @generated
		 */
		EClass DISCOUNT = eINSTANCE.getDiscount();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__TYPE = eINSTANCE.getDiscount_Type();

		/**
		 * The meta object literal for the '<em><b>Ammount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__AMMOUNT = eINSTANCE.getDiscount_Ammount();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__DESCRIPTION = eINSTANCE.getDiscount_Description();

		/**
		 * The meta object literal for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.PaymentMethodImpl <em>Payment Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.PaymentMethodImpl
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getPaymentMethod()
		 * @generated
		 */
		EClass PAYMENT_METHOD = eINSTANCE.getPaymentMethod();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_METHOD__TYPE = eINSTANCE.getPaymentMethod_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_METHOD__DESCRIPTION = eINSTANCE.getPaymentMethod_Description();

		/**
		 * The meta object literal for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.PaymentImpl
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Ammount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__AMMOUNT = eINSTANCE.getPayment_Ammount();

		/**
		 * The meta object literal for the '<em><b>Payment Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_DATE = eINSTANCE.getPayment_PaymentDate();

		/**
		 * The meta object literal for the '<em><b>Paymentmethod</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__PAYMENTMETHOD = eINSTANCE.getPayment_Paymentmethod();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__ORDER = eINSTANCE.getPayment_Order();

		/**
		 * The meta object literal for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.CustomerImpl
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__NAME = eINSTANCE.getCustomer_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__EMAIL = eINSTANCE.getCustomer_Email();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__PHONE_NUMBER = eINSTANCE.getCustomer_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Cart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__CART = eINSTANCE.getCustomer_Cart();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__ORDER = eINSTANCE.getCustomer_Order();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__ADDRESS = eINSTANCE.getCustomer_Address();

		/**
		 * The meta object literal for the '{@link it.univaq.disim.mde.assignment.ecommerce.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.AddressImpl
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STREET = eINSTANCE.getAddress_Street();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STATE = eINSTANCE.getAddress_State();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '{@link it.univaq.disim.mde.assignment.ecommerce.PaymentStatus <em>Payment Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.disim.mde.assignment.ecommerce.PaymentStatus
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getPaymentStatus()
		 * @generated
		 */
		EEnum PAYMENT_STATUS = eINSTANCE.getPaymentStatus();

		/**
		 * The meta object literal for the '{@link it.univaq.disim.mde.assignment.ecommerce.OrderStatus <em>Order Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.disim.mde.assignment.ecommerce.OrderStatus
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getOrderStatus()
		 * @generated
		 */
		EEnum ORDER_STATUS = eINSTANCE.getOrderStatus();

		/**
		 * The meta object literal for the '{@link it.univaq.disim.mde.assignment.ecommerce.PaymentType <em>Payment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.disim.mde.assignment.ecommerce.PaymentType
		 * @see it.univaq.disim.mde.assignment.ecommerce.impl.EcommercePackageImpl#getPaymentType()
		 * @generated
		 */
		EEnum PAYMENT_TYPE = eINSTANCE.getPaymentType();

	}

} //EcommercePackage
