/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /it.univaq.disim.mde.assignment.ecommerce/model/ecommerce.ecore
 * using:
 *   /it.univaq.disim.mde.assignment.ecommerce/model/ecommerce.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package it.univaq.disim.mde.assignment.ecommerce;

// import it.univaq.disim.mde.assignment.ecommerce.EcommercePackage;
// import it.univaq.disim.mde.assignment.ecommerce.EcommerceTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.RealValue;

/**
 * EcommerceTables provides the dispatch tables for the ecommerce for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class EcommerceTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(EcommercePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_ecommerce = IdManager.getNsURIPackageId("http://www.example.org/ecommerce", null, EcommercePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Address = EcommerceTables.PACKid_http_c_s_s_www_example_org_s_ecommerce.getClassId("Address", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Cart = EcommerceTables.PACKid_http_c_s_s_www_example_org_s_ecommerce.getClassId("Cart", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Customer = EcommerceTables.PACKid_http_c_s_s_www_example_org_s_ecommerce.getClassId("Customer", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Discount = EcommerceTables.PACKid_http_c_s_s_www_example_org_s_ecommerce.getClassId("Discount", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Item = EcommerceTables.PACKid_http_c_s_s_www_example_org_s_ecommerce.getClassId("Item", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Order = EcommerceTables.PACKid_http_c_s_s_www_example_org_s_ecommerce.getClassId("Order", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_OrderItem = EcommerceTables.PACKid_http_c_s_s_www_example_org_s_ecommerce.getClassId("OrderItem", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Payment = EcommerceTables.PACKid_http_c_s_s_www_example_org_s_ecommerce.getClassId("Payment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PaymentMethod = EcommerceTables.PACKid_http_c_s_s_www_example_org_s_ecommerce.getClassId("PaymentMethod", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Product = EcommerceTables.PACKid_http_c_s_s_www_example_org_s_ecommerce.getClassId("Product", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ShippingMethod = EcommerceTables.PACKid_http_c_s_s_www_example_org_s_ecommerce.getClassId("ShippingMethod", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = EcommerceTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = EcommerceTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = EcommerceTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_OrderStatus = EcommerceTables.PACKid_http_c_s_s_www_example_org_s_ecommerce.getEnumerationId("OrderStatus");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PaymentType = EcommerceTables.PACKid_http_c_s_s_www_example_org_s_ecommerce.getEnumerationId("PaymentType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ RealValue REA_0_1 = ValueUtil.realValueOf("0.1");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Cart = TypeId.BAG.getSpecializedId(EcommerceTables.CLSSid_Cart, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Order = TypeId.BAG.getSpecializedId(EcommerceTables.CLSSid_Order, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Payment = TypeId.BAG.getSpecializedId(EcommerceTables.CLSSid_Payment, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Order = TypeId.ORDERED_SET.getSpecializedId(EcommerceTables.CLSSid_Order, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_OrderItem = TypeId.ORDERED_SET.getSpecializedId(EcommerceTables.CLSSid_OrderItem, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Payment = TypeId.ORDERED_SET.getSpecializedId(EcommerceTables.CLSSid_Payment, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Product = TypeId.ORDERED_SET.getSpecializedId(EcommerceTables.CLSSid_Product, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			EcommerceTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Address = new EcoreExecutorType(EcommercePackage.Literals.ADDRESS, PACKAGE, 0);
		public static final EcoreExecutorType _Cart = new EcoreExecutorType(EcommercePackage.Literals.CART, PACKAGE, 0);
		public static final EcoreExecutorType _Customer = new EcoreExecutorType(EcommercePackage.Literals.CUSTOMER, PACKAGE, 0);
		public static final EcoreExecutorType _Discount = new EcoreExecutorType(EcommercePackage.Literals.DISCOUNT, PACKAGE, 0);
		public static final EcoreExecutorType _ID_Element = new EcoreExecutorType(EcommercePackage.Literals.ID_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Item = new EcoreExecutorType(EcommercePackage.Literals.ITEM, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Order = new EcoreExecutorType(EcommercePackage.Literals.ORDER, PACKAGE, 0);
		public static final EcoreExecutorType _OrderItem = new EcoreExecutorType(EcommercePackage.Literals.ORDER_ITEM, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _OrderStatus = new EcoreExecutorEnumeration(EcommercePackage.Literals.ORDER_STATUS, PACKAGE, 0);
		public static final EcoreExecutorType _Payment = new EcoreExecutorType(EcommercePackage.Literals.PAYMENT, PACKAGE, 0);
		public static final EcoreExecutorType _PaymentMethod = new EcoreExecutorType(EcommercePackage.Literals.PAYMENT_METHOD, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PaymentStatus = new EcoreExecutorEnumeration(EcommercePackage.Literals.PAYMENT_STATUS, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PaymentType = new EcoreExecutorEnumeration(EcommercePackage.Literals.PAYMENT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Product = new EcoreExecutorType(EcommercePackage.Literals.PRODUCT, PACKAGE, 0);
		public static final EcoreExecutorType _ShippingMethod = new EcoreExecutorType(EcommercePackage.Literals.SHIPPING_METHOD, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Address,
			_Cart,
			_Customer,
			_Discount,
			_ID_Element,
			_Item,
			_Order,
			_OrderItem,
			_OrderStatus,
			_Payment,
			_PaymentMethod,
			_PaymentStatus,
			_PaymentType,
			_Product,
			_ShippingMethod
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Address__Address = new ExecutorFragment(Types._Address, EcommerceTables.Types._Address);
		private static final ExecutorFragment _Address__OclAny = new ExecutorFragment(Types._Address, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Address__OclElement = new ExecutorFragment(Types._Address, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Cart__Cart = new ExecutorFragment(Types._Cart, EcommerceTables.Types._Cart);
		private static final ExecutorFragment _Cart__ID_Element = new ExecutorFragment(Types._Cart, EcommerceTables.Types._ID_Element);
		private static final ExecutorFragment _Cart__OclAny = new ExecutorFragment(Types._Cart, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Cart__OclElement = new ExecutorFragment(Types._Cart, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Customer__Customer = new ExecutorFragment(Types._Customer, EcommerceTables.Types._Customer);
		private static final ExecutorFragment _Customer__ID_Element = new ExecutorFragment(Types._Customer, EcommerceTables.Types._ID_Element);
		private static final ExecutorFragment _Customer__OclAny = new ExecutorFragment(Types._Customer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Customer__OclElement = new ExecutorFragment(Types._Customer, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Discount__Discount = new ExecutorFragment(Types._Discount, EcommerceTables.Types._Discount);
		private static final ExecutorFragment _Discount__OclAny = new ExecutorFragment(Types._Discount, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Discount__OclElement = new ExecutorFragment(Types._Discount, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ID_Element__ID_Element = new ExecutorFragment(Types._ID_Element, EcommerceTables.Types._ID_Element);
		private static final ExecutorFragment _ID_Element__OclAny = new ExecutorFragment(Types._ID_Element, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ID_Element__OclElement = new ExecutorFragment(Types._ID_Element, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Item__ID_Element = new ExecutorFragment(Types._Item, EcommerceTables.Types._ID_Element);
		private static final ExecutorFragment _Item__Item = new ExecutorFragment(Types._Item, EcommerceTables.Types._Item);
		private static final ExecutorFragment _Item__OclAny = new ExecutorFragment(Types._Item, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Item__OclElement = new ExecutorFragment(Types._Item, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Order__ID_Element = new ExecutorFragment(Types._Order, EcommerceTables.Types._ID_Element);
		private static final ExecutorFragment _Order__OclAny = new ExecutorFragment(Types._Order, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Order__OclElement = new ExecutorFragment(Types._Order, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Order__Order = new ExecutorFragment(Types._Order, EcommerceTables.Types._Order);

		private static final ExecutorFragment _OrderItem__OclAny = new ExecutorFragment(Types._OrderItem, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OrderItem__OclElement = new ExecutorFragment(Types._OrderItem, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OrderItem__OrderItem = new ExecutorFragment(Types._OrderItem, EcommerceTables.Types._OrderItem);

		private static final ExecutorFragment _OrderStatus__OclAny = new ExecutorFragment(Types._OrderStatus, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OrderStatus__OclElement = new ExecutorFragment(Types._OrderStatus, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OrderStatus__OclEnumeration = new ExecutorFragment(Types._OrderStatus, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _OrderStatus__OclType = new ExecutorFragment(Types._OrderStatus, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _OrderStatus__OrderStatus = new ExecutorFragment(Types._OrderStatus, EcommerceTables.Types._OrderStatus);

		private static final ExecutorFragment _Payment__ID_Element = new ExecutorFragment(Types._Payment, EcommerceTables.Types._ID_Element);
		private static final ExecutorFragment _Payment__OclAny = new ExecutorFragment(Types._Payment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Payment__OclElement = new ExecutorFragment(Types._Payment, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Payment__Payment = new ExecutorFragment(Types._Payment, EcommerceTables.Types._Payment);

		private static final ExecutorFragment _PaymentMethod__OclAny = new ExecutorFragment(Types._PaymentMethod, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PaymentMethod__OclElement = new ExecutorFragment(Types._PaymentMethod, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PaymentMethod__PaymentMethod = new ExecutorFragment(Types._PaymentMethod, EcommerceTables.Types._PaymentMethod);

		private static final ExecutorFragment _PaymentStatus__OclAny = new ExecutorFragment(Types._PaymentStatus, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PaymentStatus__OclElement = new ExecutorFragment(Types._PaymentStatus, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PaymentStatus__OclEnumeration = new ExecutorFragment(Types._PaymentStatus, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PaymentStatus__OclType = new ExecutorFragment(Types._PaymentStatus, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PaymentStatus__PaymentStatus = new ExecutorFragment(Types._PaymentStatus, EcommerceTables.Types._PaymentStatus);

		private static final ExecutorFragment _PaymentType__OclAny = new ExecutorFragment(Types._PaymentType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PaymentType__OclElement = new ExecutorFragment(Types._PaymentType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PaymentType__OclEnumeration = new ExecutorFragment(Types._PaymentType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PaymentType__OclType = new ExecutorFragment(Types._PaymentType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PaymentType__PaymentType = new ExecutorFragment(Types._PaymentType, EcommerceTables.Types._PaymentType);

		private static final ExecutorFragment _Product__ID_Element = new ExecutorFragment(Types._Product, EcommerceTables.Types._ID_Element);
		private static final ExecutorFragment _Product__Item = new ExecutorFragment(Types._Product, EcommerceTables.Types._Item);
		private static final ExecutorFragment _Product__OclAny = new ExecutorFragment(Types._Product, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Product__OclElement = new ExecutorFragment(Types._Product, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Product__Product = new ExecutorFragment(Types._Product, EcommerceTables.Types._Product);

		private static final ExecutorFragment _ShippingMethod__OclAny = new ExecutorFragment(Types._ShippingMethod, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ShippingMethod__OclElement = new ExecutorFragment(Types._ShippingMethod, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ShippingMethod__ShippingMethod = new ExecutorFragment(Types._ShippingMethod, EcommerceTables.Types._ShippingMethod);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Cart__totalProducts = new ExecutorOperation("totalProducts", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Cart,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Order__discountedTotal = new ExecutorOperation("discountedTotal", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Order,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Address__city = new EcoreExecutorProperty(EcommercePackage.Literals.ADDRESS__CITY, Types._Address, 0);
		public static final ExecutorProperty _Address__country = new EcoreExecutorProperty(EcommercePackage.Literals.ADDRESS__COUNTRY, Types._Address, 1);
		public static final ExecutorProperty _Address__state = new EcoreExecutorProperty(EcommercePackage.Literals.ADDRESS__STATE, Types._Address, 2);
		public static final ExecutorProperty _Address__street = new EcoreExecutorProperty(EcommercePackage.Literals.ADDRESS__STREET, Types._Address, 3);
		public static final ExecutorProperty _Address__Customer__address = new ExecutorPropertyWithImplementation("Customer", Types._Address, 4, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.CUSTOMER__ADDRESS));

		public static final ExecutorProperty _Cart__products = new EcoreExecutorProperty(EcommercePackage.Literals.CART__PRODUCTS, Types._Cart, 0);
		public static final ExecutorProperty _Cart__Customer__cart = new ExecutorPropertyWithImplementation("Customer", Types._Cart, 1, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.CUSTOMER__CART));

		public static final ExecutorProperty _Customer__address = new EcoreExecutorProperty(EcommercePackage.Literals.CUSTOMER__ADDRESS, Types._Customer, 0);
		public static final ExecutorProperty _Customer__cart = new EcoreExecutorProperty(EcommercePackage.Literals.CUSTOMER__CART, Types._Customer, 1);
		public static final ExecutorProperty _Customer__email = new EcoreExecutorProperty(EcommercePackage.Literals.CUSTOMER__EMAIL, Types._Customer, 2);
		public static final ExecutorProperty _Customer__name = new EcoreExecutorProperty(EcommercePackage.Literals.CUSTOMER__NAME, Types._Customer, 3);
		public static final ExecutorProperty _Customer__order = new EcoreExecutorProperty(EcommercePackage.Literals.CUSTOMER__ORDER, Types._Customer, 4);
		public static final ExecutorProperty _Customer__phoneNumber = new EcoreExecutorProperty(EcommercePackage.Literals.CUSTOMER__PHONE_NUMBER, Types._Customer, 5);

		public static final ExecutorProperty _Discount__ammount = new EcoreExecutorProperty(EcommercePackage.Literals.DISCOUNT__AMMOUNT, Types._Discount, 0);
		public static final ExecutorProperty _Discount__description = new EcoreExecutorProperty(EcommercePackage.Literals.DISCOUNT__DESCRIPTION, Types._Discount, 1);
		public static final ExecutorProperty _Discount__type = new EcoreExecutorProperty(EcommercePackage.Literals.DISCOUNT__TYPE, Types._Discount, 2);
		public static final ExecutorProperty _Discount__Order__discount = new ExecutorPropertyWithImplementation("Order", Types._Discount, 3, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.ORDER__DISCOUNT));

		public static final ExecutorProperty _ID_Element__ID = new EcoreExecutorProperty(EcommercePackage.Literals.ID_ELEMENT__ID, Types._ID_Element, 0);

		public static final ExecutorProperty _Item__name = new EcoreExecutorProperty(EcommercePackage.Literals.ITEM__NAME, Types._Item, 0);
		public static final ExecutorProperty _Item__price = new EcoreExecutorProperty(EcommercePackage.Literals.ITEM__PRICE, Types._Item, 1);

		public static final ExecutorProperty _Order__date = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER__DATE, Types._Order, 0);
		public static final ExecutorProperty _Order__discount = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER__DISCOUNT, Types._Order, 1);
		public static final ExecutorProperty _Order__orderitem = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER__ORDERITEM, Types._Order, 2);
		public static final ExecutorProperty _Order__payment = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER__PAYMENT, Types._Order, 3);
		public static final ExecutorProperty _Order__shippingmethod = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER__SHIPPINGMETHOD, Types._Order, 4);
		public static final ExecutorProperty _Order__status = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER__STATUS, Types._Order, 5);
		public static final ExecutorProperty _Order__taxAmmount = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER__TAX_AMMOUNT, Types._Order, 6);
		public static final ExecutorProperty _Order__totalAmmount = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER__TOTAL_AMMOUNT, Types._Order, 7);
		public static final ExecutorProperty _Order__totalQuantity = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER__TOTAL_QUANTITY, Types._Order, 8);
		public static final ExecutorProperty _Order__Customer__order = new ExecutorPropertyWithImplementation("Customer", Types._Order, 9, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.CUSTOMER__ORDER));
		public static final ExecutorProperty _Order__Payment__order = new ExecutorPropertyWithImplementation("Payment", Types._Order, 10, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.PAYMENT__ORDER));

		public static final ExecutorProperty _OrderItem__product = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER_ITEM__PRODUCT, Types._OrderItem, 0);
		public static final ExecutorProperty _OrderItem__quantity = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER_ITEM__QUANTITY, Types._OrderItem, 1);
		public static final ExecutorProperty _OrderItem__unitPrice = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER_ITEM__UNIT_PRICE, Types._OrderItem, 2);
		public static final ExecutorProperty _OrderItem__Order__orderitem = new ExecutorPropertyWithImplementation("Order", Types._OrderItem, 3, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.ORDER__ORDERITEM));

		public static final ExecutorProperty _Payment__ammount = new EcoreExecutorProperty(EcommercePackage.Literals.PAYMENT__AMMOUNT, Types._Payment, 0);
		public static final ExecutorProperty _Payment__order = new EcoreExecutorProperty(EcommercePackage.Literals.PAYMENT__ORDER, Types._Payment, 1);
		public static final ExecutorProperty _Payment__paymentDate = new EcoreExecutorProperty(EcommercePackage.Literals.PAYMENT__PAYMENT_DATE, Types._Payment, 2);
		public static final ExecutorProperty _Payment__paymentmethod = new EcoreExecutorProperty(EcommercePackage.Literals.PAYMENT__PAYMENTMETHOD, Types._Payment, 3);
		public static final ExecutorProperty _Payment__Order__payment = new ExecutorPropertyWithImplementation("Order", Types._Payment, 4, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.ORDER__PAYMENT));

		public static final ExecutorProperty _PaymentMethod__description = new EcoreExecutorProperty(EcommercePackage.Literals.PAYMENT_METHOD__DESCRIPTION, Types._PaymentMethod, 0);
		public static final ExecutorProperty _PaymentMethod__type = new EcoreExecutorProperty(EcommercePackage.Literals.PAYMENT_METHOD__TYPE, Types._PaymentMethod, 1);
		public static final ExecutorProperty _PaymentMethod__Payment__paymentmethod = new ExecutorPropertyWithImplementation("Payment", Types._PaymentMethod, 2, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.PAYMENT__PAYMENTMETHOD));

		public static final ExecutorProperty _Product__category = new EcoreExecutorProperty(EcommercePackage.Literals.PRODUCT__CATEGORY, Types._Product, 0);
		public static final ExecutorProperty _Product__Cart__products = new ExecutorPropertyWithImplementation("Cart", Types._Product, 1, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.CART__PRODUCTS));
		public static final ExecutorProperty _Product__OrderItem__product = new ExecutorPropertyWithImplementation("OrderItem", Types._Product, 2, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.ORDER_ITEM__PRODUCT));

		public static final ExecutorProperty _ShippingMethod__cost = new EcoreExecutorProperty(EcommercePackage.Literals.SHIPPING_METHOD__COST, Types._ShippingMethod, 0);
		public static final ExecutorProperty _ShippingMethod__deliveryTime = new EcoreExecutorProperty(EcommercePackage.Literals.SHIPPING_METHOD__DELIVERY_TIME, Types._ShippingMethod, 1);
		public static final ExecutorProperty _ShippingMethod__name = new EcoreExecutorProperty(EcommercePackage.Literals.SHIPPING_METHOD__NAME, Types._ShippingMethod, 2);
		public static final ExecutorProperty _ShippingMethod__Order__shippingmethod = new ExecutorPropertyWithImplementation("Order", Types._ShippingMethod, 3, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.ORDER__SHIPPINGMETHOD));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Address =
			{
				Fragments._Address__OclAny /* 0 */,
				Fragments._Address__OclElement /* 1 */,
				Fragments._Address__Address /* 2 */
			};
		private static final int /*@NonNull*/ [] __Address = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Cart =
			{
				Fragments._Cart__OclAny /* 0 */,
				Fragments._Cart__OclElement /* 1 */,
				Fragments._Cart__ID_Element /* 2 */,
				Fragments._Cart__Cart /* 3 */
			};
		private static final int /*@NonNull*/ [] __Cart = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Customer =
			{
				Fragments._Customer__OclAny /* 0 */,
				Fragments._Customer__OclElement /* 1 */,
				Fragments._Customer__ID_Element /* 2 */,
				Fragments._Customer__Customer /* 3 */
			};
		private static final int /*@NonNull*/ [] __Customer = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Discount =
			{
				Fragments._Discount__OclAny /* 0 */,
				Fragments._Discount__OclElement /* 1 */,
				Fragments._Discount__Discount /* 2 */
			};
		private static final int /*@NonNull*/ [] __Discount = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ID_Element =
			{
				Fragments._ID_Element__OclAny /* 0 */,
				Fragments._ID_Element__OclElement /* 1 */,
				Fragments._ID_Element__ID_Element /* 2 */
			};
		private static final int /*@NonNull*/ [] __ID_Element = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Item =
			{
				Fragments._Item__OclAny /* 0 */,
				Fragments._Item__OclElement /* 1 */,
				Fragments._Item__ID_Element /* 2 */,
				Fragments._Item__Item /* 3 */
			};
		private static final int /*@NonNull*/ [] __Item = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Order =
			{
				Fragments._Order__OclAny /* 0 */,
				Fragments._Order__OclElement /* 1 */,
				Fragments._Order__ID_Element /* 2 */,
				Fragments._Order__Order /* 3 */
			};
		private static final int /*@NonNull*/ [] __Order = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OrderItem =
			{
				Fragments._OrderItem__OclAny /* 0 */,
				Fragments._OrderItem__OclElement /* 1 */,
				Fragments._OrderItem__OrderItem /* 2 */
			};
		private static final int /*@NonNull*/ [] __OrderItem = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OrderStatus =
			{
				Fragments._OrderStatus__OclAny /* 0 */,
				Fragments._OrderStatus__OclElement /* 1 */,
				Fragments._OrderStatus__OclType /* 2 */,
				Fragments._OrderStatus__OclEnumeration /* 3 */,
				Fragments._OrderStatus__OrderStatus /* 4 */
			};
		private static final int /*@NonNull*/ [] __OrderStatus = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Payment =
			{
				Fragments._Payment__OclAny /* 0 */,
				Fragments._Payment__OclElement /* 1 */,
				Fragments._Payment__ID_Element /* 2 */,
				Fragments._Payment__Payment /* 3 */
			};
		private static final int /*@NonNull*/ [] __Payment = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PaymentMethod =
			{
				Fragments._PaymentMethod__OclAny /* 0 */,
				Fragments._PaymentMethod__OclElement /* 1 */,
				Fragments._PaymentMethod__PaymentMethod /* 2 */
			};
		private static final int /*@NonNull*/ [] __PaymentMethod = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PaymentStatus =
			{
				Fragments._PaymentStatus__OclAny /* 0 */,
				Fragments._PaymentStatus__OclElement /* 1 */,
				Fragments._PaymentStatus__OclType /* 2 */,
				Fragments._PaymentStatus__OclEnumeration /* 3 */,
				Fragments._PaymentStatus__PaymentStatus /* 4 */
			};
		private static final int /*@NonNull*/ [] __PaymentStatus = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PaymentType =
			{
				Fragments._PaymentType__OclAny /* 0 */,
				Fragments._PaymentType__OclElement /* 1 */,
				Fragments._PaymentType__OclType /* 2 */,
				Fragments._PaymentType__OclEnumeration /* 3 */,
				Fragments._PaymentType__PaymentType /* 4 */
			};
		private static final int /*@NonNull*/ [] __PaymentType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Product =
			{
				Fragments._Product__OclAny /* 0 */,
				Fragments._Product__OclElement /* 1 */,
				Fragments._Product__ID_Element /* 2 */,
				Fragments._Product__Item /* 3 */,
				Fragments._Product__Product /* 4 */
			};
		private static final int /*@NonNull*/ [] __Product = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ShippingMethod =
			{
				Fragments._ShippingMethod__OclAny /* 0 */,
				Fragments._ShippingMethod__OclElement /* 1 */,
				Fragments._ShippingMethod__ShippingMethod /* 2 */
			};
		private static final int /*@NonNull*/ [] __ShippingMethod = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Address.initFragments(_Address, __Address);
			Types._Cart.initFragments(_Cart, __Cart);
			Types._Customer.initFragments(_Customer, __Customer);
			Types._Discount.initFragments(_Discount, __Discount);
			Types._ID_Element.initFragments(_ID_Element, __ID_Element);
			Types._Item.initFragments(_Item, __Item);
			Types._Order.initFragments(_Order, __Order);
			Types._OrderItem.initFragments(_OrderItem, __OrderItem);
			Types._OrderStatus.initFragments(_OrderStatus, __OrderStatus);
			Types._Payment.initFragments(_Payment, __Payment);
			Types._PaymentMethod.initFragments(_PaymentMethod, __PaymentMethod);
			Types._PaymentStatus.initFragments(_PaymentStatus, __PaymentStatus);
			Types._PaymentType.initFragments(_PaymentType, __PaymentType);
			Types._Product.initFragments(_Product, __Product);
			Types._ShippingMethod.initFragments(_ShippingMethod, __ShippingMethod);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Address__Address = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Address__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Address__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Cart__Cart = {
			EcommerceTables.Operations._Cart__totalProducts /* totalProducts() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Cart__ID_Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Cart__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Cart__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Customer__Customer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Customer__ID_Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Customer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Customer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Discount__Discount = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Discount__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Discount__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ID_Element__ID_Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ID_Element__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ID_Element__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Item__Item = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Item__ID_Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Item__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Item__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Order__Order = {
			EcommerceTables.Operations._Order__discountedTotal /* discountedTotal() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Order__ID_Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Order__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Order__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _OrderItem__OrderItem = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderItem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderItem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _OrderStatus__OrderStatus = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderStatus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderStatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderStatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Payment__Payment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment__ID_Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PaymentMethod__PaymentMethod = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentMethod__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentMethod__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PaymentStatus__PaymentStatus = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentStatus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentStatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentStatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PaymentType__PaymentType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Product__Product = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Product__ID_Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Product__Item = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Product__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Product__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ShippingMethod__ShippingMethod = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ShippingMethod__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ShippingMethod__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Address__Address.initOperations(_Address__Address);
			Fragments._Address__OclAny.initOperations(_Address__OclAny);
			Fragments._Address__OclElement.initOperations(_Address__OclElement);

			Fragments._Cart__Cart.initOperations(_Cart__Cart);
			Fragments._Cart__ID_Element.initOperations(_Cart__ID_Element);
			Fragments._Cart__OclAny.initOperations(_Cart__OclAny);
			Fragments._Cart__OclElement.initOperations(_Cart__OclElement);

			Fragments._Customer__Customer.initOperations(_Customer__Customer);
			Fragments._Customer__ID_Element.initOperations(_Customer__ID_Element);
			Fragments._Customer__OclAny.initOperations(_Customer__OclAny);
			Fragments._Customer__OclElement.initOperations(_Customer__OclElement);

			Fragments._Discount__Discount.initOperations(_Discount__Discount);
			Fragments._Discount__OclAny.initOperations(_Discount__OclAny);
			Fragments._Discount__OclElement.initOperations(_Discount__OclElement);

			Fragments._ID_Element__ID_Element.initOperations(_ID_Element__ID_Element);
			Fragments._ID_Element__OclAny.initOperations(_ID_Element__OclAny);
			Fragments._ID_Element__OclElement.initOperations(_ID_Element__OclElement);

			Fragments._Item__ID_Element.initOperations(_Item__ID_Element);
			Fragments._Item__Item.initOperations(_Item__Item);
			Fragments._Item__OclAny.initOperations(_Item__OclAny);
			Fragments._Item__OclElement.initOperations(_Item__OclElement);

			Fragments._Order__ID_Element.initOperations(_Order__ID_Element);
			Fragments._Order__OclAny.initOperations(_Order__OclAny);
			Fragments._Order__OclElement.initOperations(_Order__OclElement);
			Fragments._Order__Order.initOperations(_Order__Order);

			Fragments._OrderItem__OclAny.initOperations(_OrderItem__OclAny);
			Fragments._OrderItem__OclElement.initOperations(_OrderItem__OclElement);
			Fragments._OrderItem__OrderItem.initOperations(_OrderItem__OrderItem);

			Fragments._OrderStatus__OclAny.initOperations(_OrderStatus__OclAny);
			Fragments._OrderStatus__OclElement.initOperations(_OrderStatus__OclElement);
			Fragments._OrderStatus__OclEnumeration.initOperations(_OrderStatus__OclEnumeration);
			Fragments._OrderStatus__OclType.initOperations(_OrderStatus__OclType);
			Fragments._OrderStatus__OrderStatus.initOperations(_OrderStatus__OrderStatus);

			Fragments._Payment__ID_Element.initOperations(_Payment__ID_Element);
			Fragments._Payment__OclAny.initOperations(_Payment__OclAny);
			Fragments._Payment__OclElement.initOperations(_Payment__OclElement);
			Fragments._Payment__Payment.initOperations(_Payment__Payment);

			Fragments._PaymentMethod__OclAny.initOperations(_PaymentMethod__OclAny);
			Fragments._PaymentMethod__OclElement.initOperations(_PaymentMethod__OclElement);
			Fragments._PaymentMethod__PaymentMethod.initOperations(_PaymentMethod__PaymentMethod);

			Fragments._PaymentStatus__OclAny.initOperations(_PaymentStatus__OclAny);
			Fragments._PaymentStatus__OclElement.initOperations(_PaymentStatus__OclElement);
			Fragments._PaymentStatus__OclEnumeration.initOperations(_PaymentStatus__OclEnumeration);
			Fragments._PaymentStatus__OclType.initOperations(_PaymentStatus__OclType);
			Fragments._PaymentStatus__PaymentStatus.initOperations(_PaymentStatus__PaymentStatus);

			Fragments._PaymentType__OclAny.initOperations(_PaymentType__OclAny);
			Fragments._PaymentType__OclElement.initOperations(_PaymentType__OclElement);
			Fragments._PaymentType__OclEnumeration.initOperations(_PaymentType__OclEnumeration);
			Fragments._PaymentType__OclType.initOperations(_PaymentType__OclType);
			Fragments._PaymentType__PaymentType.initOperations(_PaymentType__PaymentType);

			Fragments._Product__ID_Element.initOperations(_Product__ID_Element);
			Fragments._Product__Item.initOperations(_Product__Item);
			Fragments._Product__OclAny.initOperations(_Product__OclAny);
			Fragments._Product__OclElement.initOperations(_Product__OclElement);
			Fragments._Product__Product.initOperations(_Product__Product);

			Fragments._ShippingMethod__OclAny.initOperations(_ShippingMethod__OclAny);
			Fragments._ShippingMethod__OclElement.initOperations(_ShippingMethod__OclElement);
			Fragments._ShippingMethod__ShippingMethod.initOperations(_ShippingMethod__ShippingMethod);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Address = {
			EcommerceTables.Properties._Address__city,
			EcommerceTables.Properties._Address__country,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._Address__state,
			EcommerceTables.Properties._Address__street
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Cart = {
			EcommerceTables.Properties._ID_Element__ID,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._Cart__products
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Customer = {
			EcommerceTables.Properties._ID_Element__ID,
			EcommerceTables.Properties._Customer__address,
			EcommerceTables.Properties._Customer__cart,
			EcommerceTables.Properties._Customer__email,
			EcommerceTables.Properties._Customer__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._Customer__order,
			EcommerceTables.Properties._Customer__phoneNumber
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Discount = {
			EcommerceTables.Properties._Discount__ammount,
			EcommerceTables.Properties._Discount__description,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._Discount__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ID_Element = {
			EcommerceTables.Properties._ID_Element__ID,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Item = {
			EcommerceTables.Properties._ID_Element__ID,
			EcommerceTables.Properties._Item__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._Item__price
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Order = {
			EcommerceTables.Properties._ID_Element__ID,
			EcommerceTables.Properties._Order__date,
			EcommerceTables.Properties._Order__discount,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._Order__orderitem,
			EcommerceTables.Properties._Order__payment,
			EcommerceTables.Properties._Order__shippingmethod,
			EcommerceTables.Properties._Order__status,
			EcommerceTables.Properties._Order__taxAmmount,
			EcommerceTables.Properties._Order__totalAmmount,
			EcommerceTables.Properties._Order__totalQuantity
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OrderItem = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._OrderItem__product,
			EcommerceTables.Properties._OrderItem__quantity,
			EcommerceTables.Properties._OrderItem__unitPrice
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OrderStatus = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Payment = {
			EcommerceTables.Properties._ID_Element__ID,
			EcommerceTables.Properties._Payment__ammount,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._Payment__order,
			EcommerceTables.Properties._Payment__paymentDate,
			EcommerceTables.Properties._Payment__paymentmethod
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PaymentMethod = {
			EcommerceTables.Properties._PaymentMethod__description,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._PaymentMethod__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PaymentStatus = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PaymentType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Product = {
			EcommerceTables.Properties._ID_Element__ID,
			EcommerceTables.Properties._Product__category,
			EcommerceTables.Properties._Item__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._Item__price
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ShippingMethod = {
			EcommerceTables.Properties._ShippingMethod__cost,
			EcommerceTables.Properties._ShippingMethod__deliveryTime,
			EcommerceTables.Properties._ShippingMethod__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Address__Address.initProperties(_Address);
			Fragments._Cart__Cart.initProperties(_Cart);
			Fragments._Customer__Customer.initProperties(_Customer);
			Fragments._Discount__Discount.initProperties(_Discount);
			Fragments._ID_Element__ID_Element.initProperties(_ID_Element);
			Fragments._Item__Item.initProperties(_Item);
			Fragments._Order__Order.initProperties(_Order);
			Fragments._OrderItem__OrderItem.initProperties(_OrderItem);
			Fragments._OrderStatus__OrderStatus.initProperties(_OrderStatus);
			Fragments._Payment__Payment.initProperties(_Payment);
			Fragments._PaymentMethod__PaymentMethod.initProperties(_PaymentMethod);
			Fragments._PaymentStatus__PaymentStatus.initProperties(_PaymentStatus);
			Fragments._PaymentType__PaymentType.initProperties(_PaymentType);
			Fragments._Product__Product.initProperties(_Product);
			Fragments._ShippingMethod__ShippingMethod.initProperties(_ShippingMethod);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _OrderStatus__pending = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.ORDER_STATUS.getEEnumLiteral("pending"), Types._OrderStatus, 0);
		public static final EcoreExecutorEnumerationLiteral _OrderStatus__shipped = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.ORDER_STATUS.getEEnumLiteral("shipped"), Types._OrderStatus, 1);
		public static final EcoreExecutorEnumerationLiteral _OrderStatus__delivered = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.ORDER_STATUS.getEEnumLiteral("delivered"), Types._OrderStatus, 2);
		public static final EcoreExecutorEnumerationLiteral _OrderStatus__cancelled = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.ORDER_STATUS.getEEnumLiteral("cancelled"), Types._OrderStatus, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _OrderStatus = {
			_OrderStatus__pending,
			_OrderStatus__shipped,
			_OrderStatus__delivered,
			_OrderStatus__cancelled
		};

		public static final EcoreExecutorEnumerationLiteral _PaymentStatus__paid = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.PAYMENT_STATUS.getEEnumLiteral("paid"), Types._PaymentStatus, 0);
		public static final EcoreExecutorEnumerationLiteral _PaymentStatus__pending = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.PAYMENT_STATUS.getEEnumLiteral("pending"), Types._PaymentStatus, 1);
		public static final EcoreExecutorEnumerationLiteral _PaymentStatus__refunded = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.PAYMENT_STATUS.getEEnumLiteral("refunded"), Types._PaymentStatus, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PaymentStatus = {
			_PaymentStatus__paid,
			_PaymentStatus__pending,
			_PaymentStatus__refunded
		};

		public static final EcoreExecutorEnumerationLiteral _PaymentType__creditCard = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.PAYMENT_TYPE.getEEnumLiteral("creditCard"), Types._PaymentType, 0);
		public static final EcoreExecutorEnumerationLiteral _PaymentType__paypal = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.PAYMENT_TYPE.getEEnumLiteral("paypal"), Types._PaymentType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PaymentType = {
			_PaymentType__creditCard,
			_PaymentType__paypal
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._OrderStatus.initLiterals(_OrderStatus);
			Types._PaymentStatus.initLiterals(_PaymentStatus);
			Types._PaymentType.initLiterals(_PaymentType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new EcommerceTables();
	}

	private EcommerceTables() {
		super(EcommercePackage.eNS_URI);
	}
}
