/**
 */
package com.blasedef.onpa.oNPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Free Evaluation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.FreeEvaluationExpression#getName <em>Name</em>}</li>
 *   <li>{@link com.blasedef.onpa.oNPA.FreeEvaluationExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blasedef.onpa.oNPA.ONPAPackage#getFreeEvaluationExpression()
 * @model
 * @generated
 */
public interface FreeEvaluationExpression extends EvaluationExpressionOut
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
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getFreeEvaluationExpression_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.FreeEvaluationExpression#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(ActionExpression)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getFreeEvaluationExpression_Expression()
   * @model containment="true"
   * @generated
   */
  ActionExpression getExpression();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.FreeEvaluationExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(ActionExpression value);

} // FreeEvaluationExpression
