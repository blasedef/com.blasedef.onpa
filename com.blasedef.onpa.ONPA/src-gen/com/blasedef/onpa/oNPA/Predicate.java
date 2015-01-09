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
 *   <li>{@link com.blasedef.onpa.oNPA.Predicate#getPredicate <em>Predicate</em>}</li>
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
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference.
   * @see #setPredicate(PredicateExpression)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getPredicate_Predicate()
   * @model containment="true"
   * @generated
   */
  PredicateExpression getPredicate();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.Predicate#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(PredicateExpression value);

} // Predicate
