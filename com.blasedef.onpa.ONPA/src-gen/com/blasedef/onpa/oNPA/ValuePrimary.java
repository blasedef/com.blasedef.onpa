/**
 */
package com.blasedef.onpa.oNPA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Primary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.ValuePrimary#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blasedef.onpa.oNPA.ONPAPackage#getValuePrimary()
 * @model
 * @generated
 */
public interface ValuePrimary extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(Store)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getValuePrimary_Name()
   * @model
   * @generated
   */
  Store getName();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.ValuePrimary#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Store value);

} // ValuePrimary
