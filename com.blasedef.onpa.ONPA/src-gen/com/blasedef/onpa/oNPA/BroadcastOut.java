/**
 */
package com.blasedef.onpa.oNPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broadcast Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.BroadcastOut#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blasedef.onpa.oNPA.ONPAPackage#getBroadcastOut()
 * @model
 * @generated
 */
public interface BroadcastOut extends Action
{
  /**
   * Returns the value of the '<em><b>Evaluation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evaluation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evaluation</em>' containment reference.
   * @see #setEvaluation(Evaluations)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getBroadcastOut_Evaluation()
   * @model containment="true"
   * @generated
   */
  Evaluations getEvaluation();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.BroadcastOut#getEvaluation <em>Evaluation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evaluation</em>' containment reference.
   * @see #getEvaluation()
   * @generated
   */
  void setEvaluation(Evaluations value);

} // BroadcastOut
