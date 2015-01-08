/**
 */
package com.blasedef.onpa.oNPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.Parallel#getLeft <em>Left</em>}</li>
 *   <li>{@link com.blasedef.onpa.oNPA.Parallel#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blasedef.onpa.oNPA.ONPAPackage#getParallel()
 * @model
 * @generated
 */
public interface Parallel extends ProcessExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ProcessExpression)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getParallel_Left()
   * @model containment="true"
   * @generated
   */
  ProcessExpression getLeft();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.Parallel#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ProcessExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ProcessExpression)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getParallel_Right()
   * @model containment="true"
   * @generated
   */
  ProcessExpression getRight();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.Parallel#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ProcessExpression value);

} // Parallel
