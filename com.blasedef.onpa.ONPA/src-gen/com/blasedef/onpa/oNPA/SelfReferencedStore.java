/**
 */
package com.blasedef.onpa.oNPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Self Referenced Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.SelfReferencedStore#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blasedef.onpa.oNPA.ONPAPackage#getSelfReferencedStore()
 * @model
 * @generated
 */
public interface SelfReferencedStore extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(Store)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getSelfReferencedStore_Value()
   * @model
   * @generated
   */
  Store getValue();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.SelfReferencedStore#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Store value);

} // SelfReferencedStore
