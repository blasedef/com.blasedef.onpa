/**
 */
package com.blasedef.onpa.oNPA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Self Referenced Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.SelfReferencedStore#getStore <em>Store</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blasedef.onpa.oNPA.ONPAPackage#getSelfReferencedStore()
 * @model
 * @generated
 */
public interface SelfReferencedStore extends EObject
{
  /**
   * Returns the value of the '<em><b>Store</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Store</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Store</em>' reference.
   * @see #setStore(Store)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getSelfReferencedStore_Store()
   * @model
   * @generated
   */
  Store getStore();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.SelfReferencedStore#getStore <em>Store</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Store</em>' reference.
   * @see #getStore()
   * @generated
   */
  void setStore(Store value);

} // SelfReferencedStore
