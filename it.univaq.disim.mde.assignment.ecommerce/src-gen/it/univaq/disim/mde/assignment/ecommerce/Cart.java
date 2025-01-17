/**
 */
package it.univaq.disim.mde.assignment.ecommerce;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.univaq.disim.mde.assignment.ecommerce.Cart#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getCart()
 * @model
 * @generated
 */
public interface Cart extends ID_Element {
	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.disim.mde.assignment.ecommerce.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' reference list.
	 * @see it.univaq.disim.mde.assignment.ecommerce.EcommercePackage#getCart_Products()
	 * @model
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.products-&gt;size()'"
	 * @generated
	 */
	int totalProducts();

} // Cart
