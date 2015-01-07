/**
 */
package com.blasedef.onpa.oNPA;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.blasedef.onpa.oNPA.ONPAFactory
 * @model kind="package"
 * @generated
 */
public interface ONPAPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "oNPA";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.blasedef.com/onpa/ONPA";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "oNPA";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ONPAPackage eINSTANCE = com.blasedef.onpa.oNPA.impl.ONPAPackageImpl.init();

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ModelImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Stores</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STORES = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ACTIONS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ActionImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getAction()
   * @generated
   */
  int ACTION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Update</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__UPDATE = 1;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.BroadcastOutImpl <em>Broadcast Out</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.BroadcastOutImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getBroadcastOut()
   * @generated
   */
  int BROADCAST_OUT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST_OUT__NAME = ACTION__NAME;

  /**
   * The feature id for the '<em><b>Update</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST_OUT__UPDATE = ACTION__UPDATE;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST_OUT__PREDICATE = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Evaluation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST_OUT__EVALUATION = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Broadcast Out</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST_OUT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.BroadcastInImpl <em>Broadcast In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.BroadcastInImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getBroadcastIn()
   * @generated
   */
  int BROADCAST_IN = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST_IN__NAME = ACTION__NAME;

  /**
   * The feature id for the '<em><b>Update</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST_IN__UPDATE = ACTION__UPDATE;

  /**
   * The feature id for the '<em><b>Evaluation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST_IN__EVALUATION = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Broadcast In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST_IN_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.UnicastOutImpl <em>Unicast Out</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.UnicastOutImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getUnicastOut()
   * @generated
   */
  int UNICAST_OUT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST_OUT__NAME = ACTION__NAME;

  /**
   * The feature id for the '<em><b>Update</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST_OUT__UPDATE = ACTION__UPDATE;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST_OUT__PREDICATE = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Evaluation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST_OUT__EVALUATION = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unicast Out</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST_OUT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.UnicastInImpl <em>Unicast In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.UnicastInImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getUnicastIn()
   * @generated
   */
  int UNICAST_IN = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST_IN__NAME = ACTION__NAME;

  /**
   * The feature id for the '<em><b>Update</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST_IN__UPDATE = ACTION__UPDATE;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST_IN__VALUES = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unicast In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST_IN_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.UpdatesImpl <em>Updates</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.UpdatesImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getUpdates()
   * @generated
   */
  int UPDATES = 6;

  /**
   * The feature id for the '<em><b>Update Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATES__UPDATE_EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>Updates</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.UpdateExpressionImpl <em>Update Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.UpdateExpressionImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getUpdateExpression()
   * @generated
   */
  int UPDATE_EXPRESSION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_EXPRESSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_EXPRESSION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Update Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ValuesImpl <em>Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ValuesImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getValues()
   * @generated
   */
  int VALUES = 8;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES__VALUES = 0;

  /**
   * The number of structural features of the '<em>Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ValueExpressionImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getValueExpression()
   * @generated
   */
  int VALUE_EXPRESSION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_EXPRESSION__NAME = 0;

  /**
   * The number of structural features of the '<em>Value Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.EvaluationsImpl <em>Evaluations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.EvaluationsImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getEvaluations()
   * @generated
   */
  int EVALUATIONS = 10;

  /**
   * The feature id for the '<em><b>Evaluations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATIONS__EVALUATIONS = 0;

  /**
   * The number of structural features of the '<em>Evaluations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.EvaluationImpl <em>Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.EvaluationImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getEvaluation()
   * @generated
   */
  int EVALUATION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.PredicatesImpl <em>Predicates</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.PredicatesImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getPredicates()
   * @generated
   */
  int PREDICATES = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATES__VALUE = 0;

  /**
   * The number of structural features of the '<em>Predicates</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.StoreImpl <em>Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.StoreImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getStore()
   * @generated
   */
  int STORE = 13;

  /**
   * The number of structural features of the '<em>Store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.AttributeValueImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getAttributeValue()
   * @generated
   */
  int ATTRIBUTE_VALUE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE__NAME = STORE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE__VALUE = STORE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attribute Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE_FEATURE_COUNT = STORE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ExpressionImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 15;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.OrImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getOr()
   * @generated
   */
  int OR = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.AndImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getAnd()
   * @generated
   */
  int AND = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.EqualityImpl <em>Equality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.EqualityImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getEquality()
   * @generated
   */
  int EQUALITY = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Equality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ComparisonImpl <em>Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ComparisonImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getComparison()
   * @generated
   */
  int COMPARISON = 19;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.SubImpl <em>Sub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.SubImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getSub()
   * @generated
   */
  int SUB = 20;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.PluImpl <em>Plu</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.PluImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getPlu()
   * @generated
   */
  int PLU = 21;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLU__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLU__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plu</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLU_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.MulImpl <em>Mul</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.MulImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getMul()
   * @generated
   */
  int MUL = 22;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mul</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.DivImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getDiv()
   * @generated
   */
  int DIV = 23;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.NotImpl <em>Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.NotImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getNot()
   * @generated
   */
  int NOT = 24;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.DoubleConstantImpl <em>Double Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.DoubleConstantImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getDoubleConstant()
   * @generated
   */
  int DOUBLE_CONSTANT = 25;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Double Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.BoolConstantImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getBoolConstant()
   * @generated
   */
  int BOOL_CONSTANT = 26;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bool Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ReferencedRateImpl <em>Referenced Rate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ReferencedRateImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getReferencedRate()
   * @generated
   */
  int REFERENCED_RATE = 27;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_RATE__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Referenced Rate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_RATE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.blasedef.onpa.oNPA.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.blasedef.onpa.oNPA.Model#getStores <em>Stores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stores</em>'.
   * @see com.blasedef.onpa.oNPA.Model#getStores()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Stores();

  /**
   * Returns the meta object for the containment reference list '{@link com.blasedef.onpa.oNPA.Model#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see com.blasedef.onpa.oNPA.Model#getActions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Actions();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see com.blasedef.onpa.oNPA.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link com.blasedef.onpa.oNPA.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.blasedef.onpa.oNPA.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Action#getUpdate <em>Update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Update</em>'.
   * @see com.blasedef.onpa.oNPA.Action#getUpdate()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Update();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.BroadcastOut <em>Broadcast Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Broadcast Out</em>'.
   * @see com.blasedef.onpa.oNPA.BroadcastOut
   * @generated
   */
  EClass getBroadcastOut();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.BroadcastOut#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see com.blasedef.onpa.oNPA.BroadcastOut#getPredicate()
   * @see #getBroadcastOut()
   * @generated
   */
  EReference getBroadcastOut_Predicate();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.BroadcastOut#getEvaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Evaluation</em>'.
   * @see com.blasedef.onpa.oNPA.BroadcastOut#getEvaluation()
   * @see #getBroadcastOut()
   * @generated
   */
  EReference getBroadcastOut_Evaluation();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.BroadcastIn <em>Broadcast In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Broadcast In</em>'.
   * @see com.blasedef.onpa.oNPA.BroadcastIn
   * @generated
   */
  EClass getBroadcastIn();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.BroadcastIn#getEvaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Evaluation</em>'.
   * @see com.blasedef.onpa.oNPA.BroadcastIn#getEvaluation()
   * @see #getBroadcastIn()
   * @generated
   */
  EReference getBroadcastIn_Evaluation();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.UnicastOut <em>Unicast Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unicast Out</em>'.
   * @see com.blasedef.onpa.oNPA.UnicastOut
   * @generated
   */
  EClass getUnicastOut();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.UnicastOut#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see com.blasedef.onpa.oNPA.UnicastOut#getPredicate()
   * @see #getUnicastOut()
   * @generated
   */
  EReference getUnicastOut_Predicate();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.UnicastOut#getEvaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Evaluation</em>'.
   * @see com.blasedef.onpa.oNPA.UnicastOut#getEvaluation()
   * @see #getUnicastOut()
   * @generated
   */
  EReference getUnicastOut_Evaluation();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.UnicastIn <em>Unicast In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unicast In</em>'.
   * @see com.blasedef.onpa.oNPA.UnicastIn
   * @generated
   */
  EClass getUnicastIn();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.UnicastIn#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Values</em>'.
   * @see com.blasedef.onpa.oNPA.UnicastIn#getValues()
   * @see #getUnicastIn()
   * @generated
   */
  EReference getUnicastIn_Values();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Updates <em>Updates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Updates</em>'.
   * @see com.blasedef.onpa.oNPA.Updates
   * @generated
   */
  EClass getUpdates();

  /**
   * Returns the meta object for the containment reference list '{@link com.blasedef.onpa.oNPA.Updates#getUpdateExpressions <em>Update Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Update Expressions</em>'.
   * @see com.blasedef.onpa.oNPA.Updates#getUpdateExpressions()
   * @see #getUpdates()
   * @generated
   */
  EReference getUpdates_UpdateExpressions();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.UpdateExpression <em>Update Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Expression</em>'.
   * @see com.blasedef.onpa.oNPA.UpdateExpression
   * @generated
   */
  EClass getUpdateExpression();

  /**
   * Returns the meta object for the reference '{@link com.blasedef.onpa.oNPA.UpdateExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see com.blasedef.onpa.oNPA.UpdateExpression#getName()
   * @see #getUpdateExpression()
   * @generated
   */
  EReference getUpdateExpression_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.UpdateExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.blasedef.onpa.oNPA.UpdateExpression#getValue()
   * @see #getUpdateExpression()
   * @generated
   */
  EReference getUpdateExpression_Value();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Values <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Values</em>'.
   * @see com.blasedef.onpa.oNPA.Values
   * @generated
   */
  EClass getValues();

  /**
   * Returns the meta object for the containment reference list '{@link com.blasedef.onpa.oNPA.Values#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see com.blasedef.onpa.oNPA.Values#getValues()
   * @see #getValues()
   * @generated
   */
  EReference getValues_Values();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.ValueExpression <em>Value Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Expression</em>'.
   * @see com.blasedef.onpa.oNPA.ValueExpression
   * @generated
   */
  EClass getValueExpression();

  /**
   * Returns the meta object for the reference '{@link com.blasedef.onpa.oNPA.ValueExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see com.blasedef.onpa.oNPA.ValueExpression#getName()
   * @see #getValueExpression()
   * @generated
   */
  EReference getValueExpression_Name();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Evaluations <em>Evaluations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluations</em>'.
   * @see com.blasedef.onpa.oNPA.Evaluations
   * @generated
   */
  EClass getEvaluations();

  /**
   * Returns the meta object for the containment reference list '{@link com.blasedef.onpa.oNPA.Evaluations#getEvaluations <em>Evaluations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Evaluations</em>'.
   * @see com.blasedef.onpa.oNPA.Evaluations#getEvaluations()
   * @see #getEvaluations()
   * @generated
   */
  EReference getEvaluations_Evaluations();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Evaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluation</em>'.
   * @see com.blasedef.onpa.oNPA.Evaluation
   * @generated
   */
  EClass getEvaluation();

  /**
   * Returns the meta object for the reference '{@link com.blasedef.onpa.oNPA.Evaluation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see com.blasedef.onpa.oNPA.Evaluation#getName()
   * @see #getEvaluation()
   * @generated
   */
  EReference getEvaluation_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Evaluation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.blasedef.onpa.oNPA.Evaluation#getValue()
   * @see #getEvaluation()
   * @generated
   */
  EReference getEvaluation_Value();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Predicates <em>Predicates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicates</em>'.
   * @see com.blasedef.onpa.oNPA.Predicates
   * @generated
   */
  EClass getPredicates();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Predicates#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.blasedef.onpa.oNPA.Predicates#getValue()
   * @see #getPredicates()
   * @generated
   */
  EReference getPredicates_Value();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Store <em>Store</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Store</em>'.
   * @see com.blasedef.onpa.oNPA.Store
   * @generated
   */
  EClass getStore();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.AttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Value</em>'.
   * @see com.blasedef.onpa.oNPA.AttributeValue
   * @generated
   */
  EClass getAttributeValue();

  /**
   * Returns the meta object for the attribute '{@link com.blasedef.onpa.oNPA.AttributeValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.blasedef.onpa.oNPA.AttributeValue#getName()
   * @see #getAttributeValue()
   * @generated
   */
  EAttribute getAttributeValue_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.AttributeValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.blasedef.onpa.oNPA.AttributeValue#getValue()
   * @see #getAttributeValue()
   * @generated
   */
  EReference getAttributeValue_Value();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see com.blasedef.onpa.oNPA.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see com.blasedef.onpa.oNPA.Or
   * @generated
   */
  EClass getOr();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Or#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.blasedef.onpa.oNPA.Or#getLeft()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Or#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.blasedef.onpa.oNPA.Or#getRight()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Right();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see com.blasedef.onpa.oNPA.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.And#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.blasedef.onpa.oNPA.And#getLeft()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.And#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.blasedef.onpa.oNPA.And#getRight()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Right();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Equality <em>Equality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality</em>'.
   * @see com.blasedef.onpa.oNPA.Equality
   * @generated
   */
  EClass getEquality();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Equality#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.blasedef.onpa.oNPA.Equality#getLeft()
   * @see #getEquality()
   * @generated
   */
  EReference getEquality_Left();

  /**
   * Returns the meta object for the attribute '{@link com.blasedef.onpa.oNPA.Equality#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.blasedef.onpa.oNPA.Equality#getOp()
   * @see #getEquality()
   * @generated
   */
  EAttribute getEquality_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Equality#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.blasedef.onpa.oNPA.Equality#getRight()
   * @see #getEquality()
   * @generated
   */
  EReference getEquality_Right();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison</em>'.
   * @see com.blasedef.onpa.oNPA.Comparison
   * @generated
   */
  EClass getComparison();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Comparison#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.blasedef.onpa.oNPA.Comparison#getLeft()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Left();

  /**
   * Returns the meta object for the attribute '{@link com.blasedef.onpa.oNPA.Comparison#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.blasedef.onpa.oNPA.Comparison#getOp()
   * @see #getComparison()
   * @generated
   */
  EAttribute getComparison_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Comparison#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.blasedef.onpa.oNPA.Comparison#getRight()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Right();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Sub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub</em>'.
   * @see com.blasedef.onpa.oNPA.Sub
   * @generated
   */
  EClass getSub();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Sub#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.blasedef.onpa.oNPA.Sub#getLeft()
   * @see #getSub()
   * @generated
   */
  EReference getSub_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Sub#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.blasedef.onpa.oNPA.Sub#getRight()
   * @see #getSub()
   * @generated
   */
  EReference getSub_Right();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Plu <em>Plu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plu</em>'.
   * @see com.blasedef.onpa.oNPA.Plu
   * @generated
   */
  EClass getPlu();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Plu#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.blasedef.onpa.oNPA.Plu#getLeft()
   * @see #getPlu()
   * @generated
   */
  EReference getPlu_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Plu#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.blasedef.onpa.oNPA.Plu#getRight()
   * @see #getPlu()
   * @generated
   */
  EReference getPlu_Right();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Mul <em>Mul</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mul</em>'.
   * @see com.blasedef.onpa.oNPA.Mul
   * @generated
   */
  EClass getMul();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Mul#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.blasedef.onpa.oNPA.Mul#getLeft()
   * @see #getMul()
   * @generated
   */
  EReference getMul_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Mul#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.blasedef.onpa.oNPA.Mul#getRight()
   * @see #getMul()
   * @generated
   */
  EReference getMul_Right();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see com.blasedef.onpa.oNPA.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Div#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.blasedef.onpa.oNPA.Div#getLeft()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Div#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.blasedef.onpa.oNPA.Div#getRight()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Right();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not</em>'.
   * @see com.blasedef.onpa.oNPA.Not
   * @generated
   */
  EClass getNot();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Not#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.blasedef.onpa.oNPA.Not#getExpression()
   * @see #getNot()
   * @generated
   */
  EReference getNot_Expression();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.DoubleConstant <em>Double Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Constant</em>'.
   * @see com.blasedef.onpa.oNPA.DoubleConstant
   * @generated
   */
  EClass getDoubleConstant();

  /**
   * Returns the meta object for the attribute '{@link com.blasedef.onpa.oNPA.DoubleConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.blasedef.onpa.oNPA.DoubleConstant#getValue()
   * @see #getDoubleConstant()
   * @generated
   */
  EAttribute getDoubleConstant_Value();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.BoolConstant <em>Bool Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Constant</em>'.
   * @see com.blasedef.onpa.oNPA.BoolConstant
   * @generated
   */
  EClass getBoolConstant();

  /**
   * Returns the meta object for the attribute '{@link com.blasedef.onpa.oNPA.BoolConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.blasedef.onpa.oNPA.BoolConstant#getValue()
   * @see #getBoolConstant()
   * @generated
   */
  EAttribute getBoolConstant_Value();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.ReferencedRate <em>Referenced Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referenced Rate</em>'.
   * @see com.blasedef.onpa.oNPA.ReferencedRate
   * @generated
   */
  EClass getReferencedRate();

  /**
   * Returns the meta object for the reference '{@link com.blasedef.onpa.oNPA.ReferencedRate#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see com.blasedef.onpa.oNPA.ReferencedRate#getValue()
   * @see #getReferencedRate()
   * @generated
   */
  EReference getReferencedRate_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ONPAFactory getONPAFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ModelImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Stores</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STORES = eINSTANCE.getModel_Stores();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ACTIONS = eINSTANCE.getModel_Actions();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ActionImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

    /**
     * The meta object literal for the '<em><b>Update</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__UPDATE = eINSTANCE.getAction_Update();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.BroadcastOutImpl <em>Broadcast Out</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.BroadcastOutImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getBroadcastOut()
     * @generated
     */
    EClass BROADCAST_OUT = eINSTANCE.getBroadcastOut();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BROADCAST_OUT__PREDICATE = eINSTANCE.getBroadcastOut_Predicate();

    /**
     * The meta object literal for the '<em><b>Evaluation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BROADCAST_OUT__EVALUATION = eINSTANCE.getBroadcastOut_Evaluation();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.BroadcastInImpl <em>Broadcast In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.BroadcastInImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getBroadcastIn()
     * @generated
     */
    EClass BROADCAST_IN = eINSTANCE.getBroadcastIn();

    /**
     * The meta object literal for the '<em><b>Evaluation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BROADCAST_IN__EVALUATION = eINSTANCE.getBroadcastIn_Evaluation();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.UnicastOutImpl <em>Unicast Out</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.UnicastOutImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getUnicastOut()
     * @generated
     */
    EClass UNICAST_OUT = eINSTANCE.getUnicastOut();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNICAST_OUT__PREDICATE = eINSTANCE.getUnicastOut_Predicate();

    /**
     * The meta object literal for the '<em><b>Evaluation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNICAST_OUT__EVALUATION = eINSTANCE.getUnicastOut_Evaluation();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.UnicastInImpl <em>Unicast In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.UnicastInImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getUnicastIn()
     * @generated
     */
    EClass UNICAST_IN = eINSTANCE.getUnicastIn();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNICAST_IN__VALUES = eINSTANCE.getUnicastIn_Values();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.UpdatesImpl <em>Updates</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.UpdatesImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getUpdates()
     * @generated
     */
    EClass UPDATES = eINSTANCE.getUpdates();

    /**
     * The meta object literal for the '<em><b>Update Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATES__UPDATE_EXPRESSIONS = eINSTANCE.getUpdates_UpdateExpressions();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.UpdateExpressionImpl <em>Update Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.UpdateExpressionImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getUpdateExpression()
     * @generated
     */
    EClass UPDATE_EXPRESSION = eINSTANCE.getUpdateExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_EXPRESSION__NAME = eINSTANCE.getUpdateExpression_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_EXPRESSION__VALUE = eINSTANCE.getUpdateExpression_Value();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ValuesImpl <em>Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ValuesImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getValues()
     * @generated
     */
    EClass VALUES = eINSTANCE.getValues();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUES__VALUES = eINSTANCE.getValues_Values();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ValueExpressionImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getValueExpression()
     * @generated
     */
    EClass VALUE_EXPRESSION = eINSTANCE.getValueExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_EXPRESSION__NAME = eINSTANCE.getValueExpression_Name();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.EvaluationsImpl <em>Evaluations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.EvaluationsImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getEvaluations()
     * @generated
     */
    EClass EVALUATIONS = eINSTANCE.getEvaluations();

    /**
     * The meta object literal for the '<em><b>Evaluations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATIONS__EVALUATIONS = eINSTANCE.getEvaluations_Evaluations();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.EvaluationImpl <em>Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.EvaluationImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getEvaluation()
     * @generated
     */
    EClass EVALUATION = eINSTANCE.getEvaluation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION__NAME = eINSTANCE.getEvaluation_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION__VALUE = eINSTANCE.getEvaluation_Value();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.PredicatesImpl <em>Predicates</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.PredicatesImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getPredicates()
     * @generated
     */
    EClass PREDICATES = eINSTANCE.getPredicates();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATES__VALUE = eINSTANCE.getPredicates_Value();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.StoreImpl <em>Store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.StoreImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getStore()
     * @generated
     */
    EClass STORE = eINSTANCE.getStore();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.AttributeValueImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getAttributeValue()
     * @generated
     */
    EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_VALUE__NAME = eINSTANCE.getAttributeValue_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_VALUE__VALUE = eINSTANCE.getAttributeValue_Value();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ExpressionImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.OrImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getOr()
     * @generated
     */
    EClass OR = eINSTANCE.getOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__LEFT = eINSTANCE.getOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__RIGHT = eINSTANCE.getOr_Right();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.AndImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getAnd()
     * @generated
     */
    EClass AND = eINSTANCE.getAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__LEFT = eINSTANCE.getAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__RIGHT = eINSTANCE.getAnd_Right();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.EqualityImpl <em>Equality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.EqualityImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getEquality()
     * @generated
     */
    EClass EQUALITY = eINSTANCE.getEquality();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY__LEFT = eINSTANCE.getEquality_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUALITY__OP = eINSTANCE.getEquality_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY__RIGHT = eINSTANCE.getEquality_Right();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ComparisonImpl <em>Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ComparisonImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getComparison()
     * @generated
     */
    EClass COMPARISON = eINSTANCE.getComparison();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__LEFT = eINSTANCE.getComparison_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON__OP = eINSTANCE.getComparison_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__RIGHT = eINSTANCE.getComparison_Right();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.SubImpl <em>Sub</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.SubImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getSub()
     * @generated
     */
    EClass SUB = eINSTANCE.getSub();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB__LEFT = eINSTANCE.getSub_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB__RIGHT = eINSTANCE.getSub_Right();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.PluImpl <em>Plu</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.PluImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getPlu()
     * @generated
     */
    EClass PLU = eINSTANCE.getPlu();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLU__LEFT = eINSTANCE.getPlu_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLU__RIGHT = eINSTANCE.getPlu_Right();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.MulImpl <em>Mul</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.MulImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getMul()
     * @generated
     */
    EClass MUL = eINSTANCE.getMul();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL__LEFT = eINSTANCE.getMul_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL__RIGHT = eINSTANCE.getMul_Right();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.DivImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getDiv()
     * @generated
     */
    EClass DIV = eINSTANCE.getDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__LEFT = eINSTANCE.getDiv_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__RIGHT = eINSTANCE.getDiv_Right();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.NotImpl <em>Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.NotImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getNot()
     * @generated
     */
    EClass NOT = eINSTANCE.getNot();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT__EXPRESSION = eINSTANCE.getNot_Expression();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.DoubleConstantImpl <em>Double Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.DoubleConstantImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getDoubleConstant()
     * @generated
     */
    EClass DOUBLE_CONSTANT = eINSTANCE.getDoubleConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_CONSTANT__VALUE = eINSTANCE.getDoubleConstant_Value();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.BoolConstantImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getBoolConstant()
     * @generated
     */
    EClass BOOL_CONSTANT = eINSTANCE.getBoolConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOL_CONSTANT__VALUE = eINSTANCE.getBoolConstant_Value();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ReferencedRateImpl <em>Referenced Rate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ReferencedRateImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getReferencedRate()
     * @generated
     */
    EClass REFERENCED_RATE = eINSTANCE.getReferencedRate();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCED_RATE__VALUE = eINSTANCE.getReferencedRate_Value();

  }

} //ONPAPackage
