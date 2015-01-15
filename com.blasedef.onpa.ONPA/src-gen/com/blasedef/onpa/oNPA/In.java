/**
 */
package com.blasedef.onpa.oNPA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.In#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blasedef.onpa.oNPA.ONPAPackage#getIn()
 * @model
 * @generated
 */
public interface In extends Evaluations
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link com.blasedef.onpa.oNPA.EvaluationExpressionIn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getIn_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<EvaluationExpressionIn> getExpressions();

} // In
