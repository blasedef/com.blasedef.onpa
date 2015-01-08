/**
 */
package com.blasedef.onpa.oNPA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.Predicate#getPredicates <em>Predicates</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blasedef.onpa.oNPA.ONPAPackage#getPredicate()
 * @model
 * @generated
 */
public interface Predicate extends EObject
{
  /**
   * Returns the value of the '<em><b>Predicates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicates</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicates</em>' containment reference.
   * @see #setPredicates(PredicateExpression)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getPredicate_Predicates()
   * @model containment="true"
   * @generated
   */
  PredicateExpression getPredicates();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.Predicate#getPredicates <em>Predicates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicates</em>' containment reference.
   * @see #getPredicates()
   * @generated
   */
  void setPredicates(PredicateExpression value);

} // Predicate
