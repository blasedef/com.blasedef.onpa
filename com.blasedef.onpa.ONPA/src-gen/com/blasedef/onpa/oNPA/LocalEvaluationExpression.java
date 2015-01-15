/**
 */
package com.blasedef.onpa.oNPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Evaluation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.LocalEvaluationExpression#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blasedef.onpa.oNPA.ONPAPackage#getLocalEvaluationExpression()
 * @model
 * @generated
 */
public interface LocalEvaluationExpression extends EvaluationExpressionIn
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(SelfReferencedStore)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getLocalEvaluationExpression_Name()
   * @model containment="true"
   * @generated
   */
  SelfReferencedStore getName();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.LocalEvaluationExpression#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(SelfReferencedStore value);

} // LocalEvaluationExpression
