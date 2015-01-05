/**
 */
package com.blasedef.onpa.oNPA;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.blasedef.onpa.oNPA.ONPAPackage
 * @generated
 */
public interface ONPAFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ONPAFactory eINSTANCE = com.blasedef.onpa.oNPA.impl.ONPAFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Rate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rate</em>'.
   * @generated
   */
  Rate createRate();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Sub</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub</em>'.
   * @generated
   */
  Sub createSub();

  /**
   * Returns a new object of class '<em>Plu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plu</em>'.
   * @generated
   */
  Plu createPlu();

  /**
   * Returns a new object of class '<em>Mul</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mul</em>'.
   * @generated
   */
  Mul createMul();

  /**
   * Returns a new object of class '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Div</em>'.
   * @generated
   */
  Div createDiv();

  /**
   * Returns a new object of class '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant</em>'.
   * @generated
   */
  Constant createConstant();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ONPAPackage getONPAPackage();

} //ONPAFactory
