/**
 */
package it.univaq.disim.mde.assignment.ecommerce.util;

import it.univaq.disim.mde.assignment.ecommerce.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage
 * @generated
 */
public class EcommerceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EcommerceValidator INSTANCE = new EcommerceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "it.univaq.disim.mde.assignment.ecommerce";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Positive Price' of 'Item'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITEM__POSITIVE_PRICE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcommerceValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return EcommercePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case EcommercePackage.ID_ELEMENT:
			return validateID_Element((ID_Element) value, diagnostics, context);
		case EcommercePackage.ITEM:
			return validateItem((Item) value, diagnostics, context);
		case EcommercePackage.PRODUCT:
			return validateProduct((Product) value, diagnostics, context);
		case EcommercePackage.CART:
			return validateCart((Cart) value, diagnostics, context);
		case EcommercePackage.ORDER_ITEM:
			return validateOrderItem((OrderItem) value, diagnostics, context);
		case EcommercePackage.SHIPPING_METHOD:
			return validateShippingMethod((ShippingMethod) value, diagnostics, context);
		case EcommercePackage.ORDER:
			return validateOrder((Order) value, diagnostics, context);
		case EcommercePackage.DISCOUNT:
			return validateDiscount((Discount) value, diagnostics, context);
		case EcommercePackage.PAYMENT_METHOD:
			return validatePaymentMethod((PaymentMethod) value, diagnostics, context);
		case EcommercePackage.PAYMENT:
			return validatePayment((Payment) value, diagnostics, context);
		case EcommercePackage.CUSTOMER:
			return validateCustomer((Customer) value, diagnostics, context);
		case EcommercePackage.ADDRESS:
			return validateAddress((Address) value, diagnostics, context);
		case EcommercePackage.PAYMENT_STATUS:
			return validatePaymentStatus((PaymentStatus) value, diagnostics, context);
		case EcommercePackage.ORDER_STATUS:
			return validateOrderStatus((OrderStatus) value, diagnostics, context);
		case EcommercePackage.PAYMENT_TYPE:
			return validatePaymentType((PaymentType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateID_Element(ID_Element iD_Element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iD_Element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(item, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(item, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(item, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(item, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(item, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(item, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(item, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(item, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(item, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateItem_positivePrice(item, diagnostics, context);
		return result;
	}

	/**
	 * Validates the positivePrice constraint of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem_positivePrice(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return item.positivePrice(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(product, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(product, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(product, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(product, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(product, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(product, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(product, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(product, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(product, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateItem_positivePrice(product, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCart(Cart cart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderItem(OrderItem orderItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShippingMethod(ShippingMethod shippingMethod, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shippingMethod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(order, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscount(Discount discount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discount, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentMethod(PaymentMethod paymentMethod, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentMethod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayment(Payment payment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(payment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomer(Customer customer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress(Address address, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(address, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentStatus(PaymentStatus paymentStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderStatus(OrderStatus orderStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentType(PaymentType paymentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EcommerceValidator
