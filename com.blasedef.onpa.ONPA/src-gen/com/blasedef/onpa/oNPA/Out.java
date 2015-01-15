/**
 */
package com.blasedef.onpa.oNPA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.Out#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blasedef.onpa.oNPA.ONPAPackage#getOut()
 * @model
 * @generated
 */
public interface Out extends Evaluations
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link com.blasedef.onpa.oNPA.EvaluationExpressionOut}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getOut_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<EvaluationExpressionOut> getExpressions();

} // Out
