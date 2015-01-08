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
 *   <li>{@link com.blasedef.onpa.oNPA.Action#getPredicates <em>Predicates</em>}</li>
 *   <li>{@link com.blasedef.onpa.oNPA.Action#getEvaluations <em>Evaluations</em>}</li>
 *   <li>{@link com.blasedef.onpa.oNPA.Action#getUpdates <em>Updates</em>}</li>
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
   * Returns the value of the '<em><b>Predicates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicates</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicates</em>' containment reference.
   * @see #setPredicates(Predicate)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getAction_Predicates()
   * @model containment="true"
   * @generated
   */
  Predicate getPredicates();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.Action#getPredicates <em>Predicates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicates</em>' containment reference.
   * @see #getPredicates()
   * @generated
   */
  void setPredicates(Predicate value);

  /**
   * Returns the value of the '<em><b>Evaluations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evaluations</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evaluations</em>' containment reference.
   * @see #setEvaluations(Evaluations)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getAction_Evaluations()
   * @model containment="true"
   * @generated
   */
  Evaluations getEvaluations();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.Action#getEvaluations <em>Evaluations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evaluations</em>' containment reference.
   * @see #getEvaluations()
   * @generated
   */
  void setEvaluations(Evaluations value);

  /**
   * Returns the value of the '<em><b>Updates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Updates</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updates</em>' containment reference.
   * @see #setUpdates(Updates)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getAction_Updates()
   * @model containment="true"
   * @generated
   */
  Updates getUpdates();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.Action#getUpdates <em>Updates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Updates</em>' containment reference.
   * @see #getUpdates()
   * @generated
   */
  void setUpdates(Updates value);

} // Action
