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
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Broadcast Out</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Broadcast Out</em>'.
   * @generated
   */
  BroadcastOut createBroadcastOut();

  /**
   * Returns a new object of class '<em>Broadcast In</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Broadcast In</em>'.
   * @generated
   */
  BroadcastIn createBroadcastIn();

  /**
   * Returns a new object of class '<em>Unicast Out</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unicast Out</em>'.
   * @generated
   */
  UnicastOut createUnicastOut();

  /**
   * Returns a new object of class '<em>Unicast In</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unicast In</em>'.
   * @generated
   */
  UnicastIn createUnicastIn();

  /**
   * Returns a new object of class '<em>Updates</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Updates</em>'.
   * @generated
   */
  Updates createUpdates();

  /**
   * Returns a new object of class '<em>Update Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Expression</em>'.
   * @generated
   */
  UpdateExpression createUpdateExpression();

  /**
   * Returns a new object of class '<em>Values</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Values</em>'.
   * @generated
   */
  Values createValues();

  /**
   * Returns a new object of class '<em>Value Primary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Primary</em>'.
   * @generated
   */
  ValuePrimary createValuePrimary();

  /**
   * Returns a new object of class '<em>Evaluations</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evaluations</em>'.
   * @generated
   */
  Evaluations createEvaluations();

  /**
   * Returns a new object of class '<em>Evaluation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evaluation</em>'.
   * @generated
   */
  Evaluation createEvaluation();

  /**
   * Returns a new object of class '<em>Store</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Store</em>'.
   * @generated
   */
  Store createStore();

  /**
   * Returns a new object of class '<em>Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Value</em>'.
   * @generated
   */
  AttributeValue createAttributeValue();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or</em>'.
   * @generated
   */
  Or createOr();

  /**
   * Returns a new object of class '<em>And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And</em>'.
   * @generated
   */
  And createAnd();

  /**
   * Returns a new object of class '<em>Equality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equality</em>'.
   * @generated
   */
  Equality createEquality();

  /**
   * Returns a new object of class '<em>Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparison</em>'.
   * @generated
   */
  Comparison createComparison();

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
   * Returns a new object of class '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not</em>'.
   * @generated
   */
  Not createNot();

  /**
   * Returns a new object of class '<em>Double Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Double Constant</em>'.
   * @generated
   */
  DoubleConstant createDoubleConstant();

  /**
   * Returns a new object of class '<em>Bool Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Constant</em>'.
   * @generated
   */
  BoolConstant createBoolConstant();

  /**
   * Returns a new object of class '<em>Referenced Rate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Referenced Rate</em>'.
   * @generated
   */
  ReferencedRate createReferencedRate();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ONPAPackage getONPAPackage();

} //ONPAFactory
