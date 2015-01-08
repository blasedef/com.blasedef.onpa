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
 *   <li>{@link com.blasedef.onpa.oNPA.Model#getProcesses <em>Processes</em>}</li>
 *   <li>{@link com.blasedef.onpa.oNPA.Model#getTerms <em>Terms</em>}</li>
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
   * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
   * The list contents are of type {@link com.blasedef.onpa.oNPA.Process}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processes</em>' containment reference list.
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getModel_Processes()
   * @model containment="true"
   * @generated
   */
  EList<com.blasedef.onpa.oNPA.Process> getProcesses();

  /**
   * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
   * The list contents are of type {@link com.blasedef.onpa.oNPA.Term}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Terms</em>' containment reference list.
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getModel_Terms()
   * @model containment="true"
   * @generated
   */
  EList<Term> getTerms();

} // Model
