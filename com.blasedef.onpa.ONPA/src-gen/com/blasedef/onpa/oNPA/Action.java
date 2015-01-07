/**
 */
package com.blasedef.onpa.oNPA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.Action#getName <em>Name</em>}</li>
 *   <li>{@link com.blasedef.onpa.oNPA.Action#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link com.blasedef.onpa.oNPA.Action#getUpdate <em>Update</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blasedef.onpa.oNPA.ONPAPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getAction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.Action#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Predicate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' attribute.
   * @see #setPredicate(String)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getAction_Predicate()
   * @model
   * @generated
   */
  String getPredicate();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.Action#getPredicate <em>Predicate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' attribute.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(String value);

  /**
   * Returns the value of the '<em><b>Update</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update</em>' containment reference.
   * @see #setUpdate(Updates)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getAction_Update()
   * @model containment="true"
   * @generated
   */
  Updates getUpdate();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.Action#getUpdate <em>Update</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update</em>' containment reference.
   * @see #getUpdate()
   * @generated
   */
  void setUpdate(Updates value);

} // Action
