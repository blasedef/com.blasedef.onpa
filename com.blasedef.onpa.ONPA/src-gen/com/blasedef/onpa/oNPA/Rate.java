/**
 */
package com.blasedef.onpa.oNPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.Rate#getName <em>Name</em>}</li>
 *   <li>{@link com.blasedef.onpa.oNPA.Rate#getValue <em>Value</em>}</li>
 *   <li>{@link com.blasedef.onpa.oNPA.Rate#getRate <em>Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blasedef.onpa.oNPA.ONPAPackage#getRate()
 * @model
 * @generated
 */
public interface Rate extends Expression
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
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getRate_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.Rate#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getRate_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.Rate#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

  /**
   * Returns the value of the '<em><b>Rate</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rate</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rate</em>' reference.
   * @see #setRate(Rate)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getRate_Rate()
   * @model
   * @generated
   */
  Rate getRate();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.Rate#getRate <em>Rate</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rate</em>' reference.
   * @see #getRate()
   * @generated
   */
  void setRate(Rate value);

} // Rate
