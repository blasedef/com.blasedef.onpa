/**
 */
package com.blasedef.onpa.oNPA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.Term#getName <em>Name</em>}</li>
 *   <li>{@link com.blasedef.onpa.oNPA.Term#getStores <em>Stores</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blasedef.onpa.oNPA.ONPAPackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends EObject
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
   * @see #setName(com.blasedef.onpa.oNPA.Process)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getTerm_Name()
   * @model
   * @generated
   */
  com.blasedef.onpa.oNPA.Process getName();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.Term#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(com.blasedef.onpa.oNPA.Process value);

  /**
   * Returns the value of the '<em><b>Stores</b></em>' reference list.
   * The list contents are of type {@link com.blasedef.onpa.oNPA.Store}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stores</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stores</em>' reference list.
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getTerm_Stores()
   * @model
   * @generated
   */
  EList<Store> getStores();

} // Term
