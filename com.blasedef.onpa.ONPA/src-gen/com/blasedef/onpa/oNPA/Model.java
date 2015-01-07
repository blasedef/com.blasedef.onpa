/**
 */
package com.blasedef.onpa.oNPA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.Model#getStores <em>Stores</em>}</li>
 *   <li>{@link com.blasedef.onpa.oNPA.Model#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blasedef.onpa.oNPA.ONPAPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Stores</b></em>' containment reference list.
   * The list contents are of type {@link com.blasedef.onpa.oNPA.Store}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stores</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stores</em>' containment reference list.
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getModel_Stores()
   * @model containment="true"
   * @generated
   */
  EList<Store> getStores();

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link com.blasedef.onpa.oNPA.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getModel_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

} // Model
