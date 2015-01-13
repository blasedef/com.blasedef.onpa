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
   * The feature id for the '<em><b>Processes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROCESSES = 1;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TERMS = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.TermImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getTerm()
   * @generated
   */
  int TERM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__NAME = 0;

  /**
   * The feature id for the '<em><b>Stores</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__STORES = 1;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ProcessImpl <em>Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ProcessImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getProcess()
   * @generated
   */
  int PROCESS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__VALUE = 1;

  /**
   * The number of structural features of the '<em>Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ProcessExpressionImpl <em>Process Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ProcessExpressionImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getProcessExpression()
   * @generated
   */
  int PROCESS_EXPRESSION = 3;

  /**
   * The number of structural features of the '<em>Process Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.PredicateProcessImpl <em>Predicate Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.PredicateProcessImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getPredicateProcess()
   * @generated
   */
  int PREDICATE_PROCESS = 4;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_PROCESS__PREDICATE = PROCESS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_PROCESS__VALUE = PROCESS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Predicate Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_PROCESS_FEATURE_COUNT = PROCESS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ActionProcessImpl <em>Action Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ActionProcessImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionProcess()
   * @generated
   */
  int ACTION_PROCESS = 5;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PROCESS__ACTION = PROCESS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PROCESS__VALUE = PROCESS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Action Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PROCESS_FEATURE_COUNT = PROCESS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ActionImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getAction()
   * @generated
   */
  int ACTION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__PREDICATE = 1;

  /**
   * The feature id for the '<em><b>Evaluations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__EVALUATIONS = 2;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__UPDATES = 3;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.PredicateImpl <em>Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.PredicateImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getPredicate()
   * @generated
   */
  int PREDICATE = 7;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__PREDICATE = 0;

  /**
   * The number of structural features of the '<em>Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.EvaluationsImpl <em>Evaluations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.EvaluationsImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getEvaluations()
   * @generated
   */
  int EVALUATIONS = 8;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATIONS__EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>Evaluations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.UpdatesImpl <em>Updates</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.UpdatesImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getUpdates()
   * @generated
   */
  int UPDATES = 9;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATES__UPDATES = 0;

  /**
   * The number of structural features of the '<em>Updates</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.PredicateExpressionImpl <em>Predicate Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.PredicateExpressionImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getPredicateExpression()
   * @generated
   */
  int PREDICATE_EXPRESSION = 10;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_EXPRESSION__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Predicate Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.EvaluationExpressionImpl <em>Evaluation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.EvaluationExpressionImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getEvaluationExpression()
   * @generated
   */
  int EVALUATION_EXPRESSION = 11;

  /**
   * The number of structural features of the '<em>Evaluation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.UpdateExpressionImpl <em>Update Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.UpdateExpressionImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getUpdateExpression()
   * @generated
   */
  int UPDATE_EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_EXPRESSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_EXPRESSION__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Update Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ActionExpressionImpl <em>Action Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ActionExpressionImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionExpression()
   * @generated
   */
  int ACTION_EXPRESSION = 13;

  /**
   * The number of structural features of the '<em>Action Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EXPRESSION_FEATURE_COUNT = EVALUATION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.StoreImpl <em>Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.StoreImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getStore()
   * @generated
   */
  int STORE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE_FEATURE_COUNT = 2;

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
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ParallelImpl <em>Parallel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ParallelImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getParallel()
   * @generated
   */
  int PARALLEL = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL__LEFT = PROCESS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL__RIGHT = PROCESS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parallel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL_FEATURE_COUNT = PROCESS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ChoiceImpl <em>Choice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ChoiceImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getChoice()
   * @generated
   */
  int CHOICE = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE__LEFT = PROCESS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE__RIGHT = PROCESS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Choice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_FEATURE_COUNT = PROCESS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.LeafImpl <em>Leaf</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.LeafImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getLeaf()
   * @generated
   */
  int LEAF = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF__VALUE = PROCESS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Leaf</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_FEATURE_COUNT = PROCESS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ProcessReferenceImpl <em>Process Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ProcessReferenceImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getProcessReference()
   * @generated
   */
  int PROCESS_REFERENCE = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_REFERENCE__VALUE = PROCESS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Process Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_REFERENCE_FEATURE_COUNT = PROCESS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.BroadcastImpl <em>Broadcast</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.BroadcastImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getBroadcast()
   * @generated
   */
  int BROADCAST = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST__NAME = ACTION__NAME;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST__PREDICATE = ACTION__PREDICATE;

  /**
   * The feature id for the '<em><b>Evaluations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST__EVALUATIONS = ACTION__EVALUATIONS;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST__UPDATES = ACTION__UPDATES;

  /**
   * The number of structural features of the '<em>Broadcast</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.UnicastImpl <em>Unicast</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.UnicastImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getUnicast()
   * @generated
   */
  int UNICAST = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST__NAME = ACTION__NAME;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST__PREDICATE = ACTION__PREDICATE;

  /**
   * The feature id for the '<em><b>Evaluations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST__EVALUATIONS = ACTION__EVALUATIONS;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST__UPDATES = ACTION__UPDATES;

  /**
   * The number of structural features of the '<em>Unicast</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.InImpl <em>In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.InImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getIn()
   * @generated
   */
  int IN = 22;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN__EXPRESSIONS = EVALUATIONS__EXPRESSIONS;

  /**
   * The number of structural features of the '<em>In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_FEATURE_COUNT = EVALUATIONS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.OutImpl <em>Out</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.OutImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getOut()
   * @generated
   */
  int OUT = 23;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT__EXPRESSIONS = EVALUATIONS__EXPRESSIONS;

  /**
   * The number of structural features of the '<em>Out</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_FEATURE_COUNT = EVALUATIONS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.LocalUpdateExpressionImpl <em>Local Update Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.LocalUpdateExpressionImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getLocalUpdateExpression()
   * @generated
   */
  int LOCAL_UPDATE_EXPRESSION = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_UPDATE_EXPRESSION__NAME = UPDATE_EXPRESSION__NAME;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_UPDATE_EXPRESSION__EXPRESSION = UPDATE_EXPRESSION__EXPRESSION;

  /**
   * The number of structural features of the '<em>Local Update Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_UPDATE_EXPRESSION_FEATURE_COUNT = UPDATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ActionOrImpl <em>Action Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ActionOrImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionOr()
   * @generated
   */
  int ACTION_OR = 25;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_OR__LEFT = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_OR__RIGHT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Action Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_OR_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ActionAndImpl <em>Action And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ActionAndImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionAnd()
   * @generated
   */
  int ACTION_AND = 26;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_AND__LEFT = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_AND__RIGHT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Action And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_AND_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ActionEqualityImpl <em>Action Equality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ActionEqualityImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionEquality()
   * @generated
   */
  int ACTION_EQUALITY = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EQUALITY__LEFT = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EQUALITY__OP = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EQUALITY__RIGHT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Action Equality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EQUALITY_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ActionComparisonImpl <em>Action Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ActionComparisonImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionComparison()
   * @generated
   */
  int ACTION_COMPARISON = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_COMPARISON__LEFT = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_COMPARISON__OP = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_COMPARISON__RIGHT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Action Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_COMPARISON_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ActionSubImpl <em>Action Sub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ActionSubImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionSub()
   * @generated
   */
  int ACTION_SUB = 29;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SUB__LEFT = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SUB__RIGHT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Action Sub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SUB_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ActionPluImpl <em>Action Plu</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ActionPluImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionPlu()
   * @generated
   */
  int ACTION_PLU = 30;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PLU__LEFT = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PLU__RIGHT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Action Plu</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PLU_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ActionMulImpl <em>Action Mul</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ActionMulImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionMul()
   * @generated
   */
  int ACTION_MUL = 31;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_MUL__LEFT = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_MUL__RIGHT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Action Mul</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_MUL_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ActionDivImpl <em>Action Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ActionDivImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionDiv()
   * @generated
   */
  int ACTION_DIV = 32;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DIV__LEFT = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DIV__RIGHT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Action Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DIV_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ActionNotImpl <em>Action Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ActionNotImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionNot()
   * @generated
   */
  int ACTION_NOT = 33;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_NOT__EXPRESSION = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Action Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_NOT_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.DoubleConstantImpl <em>Double Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.DoubleConstantImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getDoubleConstant()
   * @generated
   */
  int DOUBLE_CONSTANT = 34;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_CONSTANT__VALUE = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Double Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_CONSTANT_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.FreeVariableImpl <em>Free Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.FreeVariableImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getFreeVariable()
   * @generated
   */
  int FREE_VARIABLE = 35;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_VARIABLE__VALUE = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Free Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_VARIABLE_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.BoolConstantImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getBoolConstant()
   * @generated
   */
  int BOOL_CONSTANT = 36;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT__VALUE = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bool Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ReferencedStoreImpl <em>Referenced Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ReferencedStoreImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getReferencedStore()
   * @generated
   */
  int REFERENCED_STORE = 37;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_STORE__VALUE = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Referenced Store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_STORE_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.SelfReferencedStoreImpl <em>Self Referenced Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.SelfReferencedStoreImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getSelfReferencedStore()
   * @generated
   */
  int SELF_REFERENCED_STORE = 38;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_REFERENCED_STORE__VALUE = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Self Referenced Store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_REFERENCED_STORE_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.OrImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getOr()
   * @generated
   */
  int OR = 39;

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
  int AND = 40;

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
  int EQUALITY = 41;

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
  int COMPARISON = 42;

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
  int SUB = 43;

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
  int PLU = 44;

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
  int MUL = 45;

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
  int DIV = 46;

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
  int NOT = 47;

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
   * Returns the meta object for the containment reference list '{@link com.blasedef.onpa.oNPA.Model#getProcesses <em>Processes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Processes</em>'.
   * @see com.blasedef.onpa.oNPA.Model#getProcesses()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Processes();

  /**
   * Returns the meta object for the containment reference list '{@link com.blasedef.onpa.oNPA.Model#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Terms</em>'.
   * @see com.blasedef.onpa.oNPA.Model#getTerms()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Terms();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see com.blasedef.onpa.oNPA.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for the reference '{@link com.blasedef.onpa.oNPA.Term#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see com.blasedef.onpa.oNPA.Term#getName()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_Name();

  /**
   * Returns the meta object for the reference list '{@link com.blasedef.onpa.oNPA.Term#getStores <em>Stores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Stores</em>'.
   * @see com.blasedef.onpa.oNPA.Term#getStores()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_Stores();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process</em>'.
   * @see com.blasedef.onpa.oNPA.Process
   * @generated
   */
  EClass getProcess();

  /**
   * Returns the meta object for the attribute '{@link com.blasedef.onpa.oNPA.Process#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.blasedef.onpa.oNPA.Process#getName()
   * @see #getProcess()
   * @generated
   */
  EAttribute getProcess_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Process#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.blasedef.onpa.oNPA.Process#getValue()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_Value();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.ProcessExpression <em>Process Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Expression</em>'.
   * @see com.blasedef.onpa.oNPA.ProcessExpression
   * @generated
   */
  EClass getProcessExpression();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.PredicateProcess <em>Predicate Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Process</em>'.
   * @see com.blasedef.onpa.oNPA.PredicateProcess
   * @generated
   */
  EClass getPredicateProcess();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.PredicateProcess#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see com.blasedef.onpa.oNPA.PredicateProcess#getPredicate()
   * @see #getPredicateProcess()
   * @generated
   */
  EReference getPredicateProcess_Predicate();

  /**
   * Returns the meta object for the reference '{@link com.blasedef.onpa.oNPA.PredicateProcess#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see com.blasedef.onpa.oNPA.PredicateProcess#getValue()
   * @see #getPredicateProcess()
   * @generated
   */
  EReference getPredicateProcess_Value();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.ActionProcess <em>Action Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Process</em>'.
   * @see com.blasedef.onpa.oNPA.ActionProcess
   * @generated
   */
  EClass getActionProcess();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.ActionProcess#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see com.blasedef.onpa.oNPA.ActionProcess#getAction()
   * @see #getActionProcess()
   * @generated
   */
  EReference getActionProcess_Action();

  /**
   * Returns the meta object for the reference '{@link com.blasedef.onpa.oNPA.ActionProcess#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see com.blasedef.onpa.oNPA.ActionProcess#getValue()
   * @see #getActionProcess()
   * @generated
   */
  EReference getActionProcess_Value();

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
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Action#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see com.blasedef.onpa.oNPA.Action#getPredicate()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Predicate();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Action#getEvaluations <em>Evaluations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Evaluations</em>'.
   * @see com.blasedef.onpa.oNPA.Action#getEvaluations()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Evaluations();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Action#getUpdates <em>Updates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Updates</em>'.
   * @see com.blasedef.onpa.oNPA.Action#getUpdates()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Updates();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate</em>'.
   * @see com.blasedef.onpa.oNPA.Predicate
   * @generated
   */
  EClass getPredicate();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Predicate#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see com.blasedef.onpa.oNPA.Predicate#getPredicate()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_Predicate();

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
   * Returns the meta object for the containment reference list '{@link com.blasedef.onpa.oNPA.Evaluations#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see com.blasedef.onpa.oNPA.Evaluations#getExpressions()
   * @see #getEvaluations()
   * @generated
   */
  EReference getEvaluations_Expressions();

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
   * Returns the meta object for the containment reference list '{@link com.blasedef.onpa.oNPA.Updates#getUpdates <em>Updates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Updates</em>'.
   * @see com.blasedef.onpa.oNPA.Updates#getUpdates()
   * @see #getUpdates()
   * @generated
   */
  EReference getUpdates_Updates();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.PredicateExpression <em>Predicate Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Expression</em>'.
   * @see com.blasedef.onpa.oNPA.PredicateExpression
   * @generated
   */
  EClass getPredicateExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.PredicateExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.blasedef.onpa.oNPA.PredicateExpression#getExpression()
   * @see #getPredicateExpression()
   * @generated
   */
  EReference getPredicateExpression_Expression();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.EvaluationExpression <em>Evaluation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluation Expression</em>'.
   * @see com.blasedef.onpa.oNPA.EvaluationExpression
   * @generated
   */
  EClass getEvaluationExpression();

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
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.UpdateExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.blasedef.onpa.oNPA.UpdateExpression#getExpression()
   * @see #getUpdateExpression()
   * @generated
   */
  EReference getUpdateExpression_Expression();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.ActionExpression <em>Action Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Expression</em>'.
   * @see com.blasedef.onpa.oNPA.ActionExpression
   * @generated
   */
  EClass getActionExpression();

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
   * Returns the meta object for the attribute '{@link com.blasedef.onpa.oNPA.Store#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.blasedef.onpa.oNPA.Store#getName()
   * @see #getStore()
   * @generated
   */
  EAttribute getStore_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Store#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.blasedef.onpa.oNPA.Store#getValue()
   * @see #getStore()
   * @generated
   */
  EReference getStore_Value();

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
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Parallel <em>Parallel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parallel</em>'.
   * @see com.blasedef.onpa.oNPA.Parallel
   * @generated
   */
  EClass getParallel();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Parallel#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.blasedef.onpa.oNPA.Parallel#getLeft()
   * @see #getParallel()
   * @generated
   */
  EReference getParallel_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Parallel#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.blasedef.onpa.oNPA.Parallel#getRight()
   * @see #getParallel()
   * @generated
   */
  EReference getParallel_Right();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Choice <em>Choice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choice</em>'.
   * @see com.blasedef.onpa.oNPA.Choice
   * @generated
   */
  EClass getChoice();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Choice#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.blasedef.onpa.oNPA.Choice#getLeft()
   * @see #getChoice()
   * @generated
   */
  EReference getChoice_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Choice#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.blasedef.onpa.oNPA.Choice#getRight()
   * @see #getChoice()
   * @generated
   */
  EReference getChoice_Right();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Leaf <em>Leaf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leaf</em>'.
   * @see com.blasedef.onpa.oNPA.Leaf
   * @generated
   */
  EClass getLeaf();

  /**
   * Returns the meta object for the attribute '{@link com.blasedef.onpa.oNPA.Leaf#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.blasedef.onpa.oNPA.Leaf#getValue()
   * @see #getLeaf()
   * @generated
   */
  EAttribute getLeaf_Value();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.ProcessReference <em>Process Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Reference</em>'.
   * @see com.blasedef.onpa.oNPA.ProcessReference
   * @generated
   */
  EClass getProcessReference();

  /**
   * Returns the meta object for the reference '{@link com.blasedef.onpa.oNPA.ProcessReference#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see com.blasedef.onpa.oNPA.ProcessReference#getValue()
   * @see #getProcessReference()
   * @generated
   */
  EReference getProcessReference_Value();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Broadcast <em>Broadcast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Broadcast</em>'.
   * @see com.blasedef.onpa.oNPA.Broadcast
   * @generated
   */
  EClass getBroadcast();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Unicast <em>Unicast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unicast</em>'.
   * @see com.blasedef.onpa.oNPA.Unicast
   * @generated
   */
  EClass getUnicast();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.In <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In</em>'.
   * @see com.blasedef.onpa.oNPA.In
   * @generated
   */
  EClass getIn();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Out <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Out</em>'.
   * @see com.blasedef.onpa.oNPA.Out
   * @generated
   */
  EClass getOut();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.LocalUpdateExpression <em>Local Update Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Update Expression</em>'.
   * @see com.blasedef.onpa.oNPA.LocalUpdateExpression
   * @generated
   */
  EClass getLocalUpdateExpression();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.ActionOr <em>Action Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Or</em>'.
   * @see com.blasedef.onpa.oNPA.ActionOr
   * @generated
   */
  EClass getActionOr();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.ActionOr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.blasedef.onpa.oNPA.ActionOr#getLeft()
   * @see #getActionOr()
   * @generated
   */
  EReference getActionOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.ActionOr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.blasedef.onpa.oNPA.ActionOr#getRight()
   * @see #getActionOr()
   * @generated
   */
  EReference getActionOr_Right();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.ActionAnd <em>Action And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action And</em>'.
   * @see com.blasedef.onpa.oNPA.ActionAnd
   * @generated
   */
  EClass getActionAnd();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.ActionAnd#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.blasedef.onpa.oNPA.ActionAnd#getLeft()
   * @see #getActionAnd()
   * @generated
   */
  EReference getActionAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.ActionAnd#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.blasedef.onpa.oNPA.ActionAnd#getRight()
   * @see #getActionAnd()
   * @generated
   */
  EReference getActionAnd_Right();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.ActionEquality <em>Action Equality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Equality</em>'.
   * @see com.blasedef.onpa.oNPA.ActionEquality
   * @generated
   */
  EClass getActionEquality();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.ActionEquality#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.blasedef.onpa.oNPA.ActionEquality#getLeft()
   * @see #getActionEquality()
   * @generated
   */
  EReference getActionEquality_Left();

  /**
   * Returns the meta object for the attribute '{@link com.blasedef.onpa.oNPA.ActionEquality#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.blasedef.onpa.oNPA.ActionEquality#getOp()
   * @see #getActionEquality()
   * @generated
   */
  EAttribute getActionEquality_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.ActionEquality#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.blasedef.onpa.oNPA.ActionEquality#getRight()
   * @see #getActionEquality()
   * @generated
   */
  EReference getActionEquality_Right();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.ActionComparison <em>Action Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Comparison</em>'.
   * @see com.blasedef.onpa.oNPA.ActionComparison
   * @generated
   */
  EClass getActionComparison();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.ActionComparison#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.blasedef.onpa.oNPA.ActionComparison#getLeft()
   * @see #getActionComparison()
   * @generated
   */
  EReference getActionComparison_Left();

  /**
   * Returns the meta object for the attribute '{@link com.blasedef.onpa.oNPA.ActionComparison#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.blasedef.onpa.oNPA.ActionComparison#getOp()
   * @see #getActionComparison()
   * @generated
   */
  EAttribute getActionComparison_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.ActionComparison#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.blasedef.onpa.oNPA.ActionComparison#getRight()
   * @see #getActionComparison()
   * @generated
   */
  EReference getActionComparison_Right();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.ActionSub <em>Action Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Sub</em>'.
   * @see com.blasedef.onpa.oNPA.ActionSub
   * @generated
   */
  EClass getActionSub();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.ActionSub#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.blasedef.onpa.oNPA.ActionSub#getLeft()
   * @see #getActionSub()
   * @generated
   */
  EReference getActionSub_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.ActionSub#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.blasedef.onpa.oNPA.ActionSub#getRight()
   * @see #getActionSub()
   * @generated
   */
  EReference getActionSub_Right();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.ActionPlu <em>Action Plu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Plu</em>'.
   * @see com.blasedef.onpa.oNPA.ActionPlu
   * @generated
   */
  EClass getActionPlu();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.ActionPlu#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.blasedef.onpa.oNPA.ActionPlu#getLeft()
   * @see #getActionPlu()
   * @generated
   */
  EReference getActionPlu_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.ActionPlu#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.blasedef.onpa.oNPA.ActionPlu#getRight()
   * @see #getActionPlu()
   * @generated
   */
  EReference getActionPlu_Right();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.ActionMul <em>Action Mul</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Mul</em>'.
   * @see com.blasedef.onpa.oNPA.ActionMul
   * @generated
   */
  EClass getActionMul();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.ActionMul#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.blasedef.onpa.oNPA.ActionMul#getLeft()
   * @see #getActionMul()
   * @generated
   */
  EReference getActionMul_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.ActionMul#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.blasedef.onpa.oNPA.ActionMul#getRight()
   * @see #getActionMul()
   * @generated
   */
  EReference getActionMul_Right();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.ActionDiv <em>Action Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Div</em>'.
   * @see com.blasedef.onpa.oNPA.ActionDiv
   * @generated
   */
  EClass getActionDiv();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.ActionDiv#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.blasedef.onpa.oNPA.ActionDiv#getLeft()
   * @see #getActionDiv()
   * @generated
   */
  EReference getActionDiv_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.ActionDiv#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.blasedef.onpa.oNPA.ActionDiv#getRight()
   * @see #getActionDiv()
   * @generated
   */
  EReference getActionDiv_Right();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.ActionNot <em>Action Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Not</em>'.
   * @see com.blasedef.onpa.oNPA.ActionNot
   * @generated
   */
  EClass getActionNot();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.ActionNot#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.blasedef.onpa.oNPA.ActionNot#getExpression()
   * @see #getActionNot()
   * @generated
   */
  EReference getActionNot_Expression();

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
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.FreeVariable <em>Free Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Free Variable</em>'.
   * @see com.blasedef.onpa.oNPA.FreeVariable
   * @generated
   */
  EClass getFreeVariable();

  /**
   * Returns the meta object for the attribute '{@link com.blasedef.onpa.oNPA.FreeVariable#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.blasedef.onpa.oNPA.FreeVariable#getValue()
   * @see #getFreeVariable()
   * @generated
   */
  EAttribute getFreeVariable_Value();

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
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.ReferencedStore <em>Referenced Store</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referenced Store</em>'.
   * @see com.blasedef.onpa.oNPA.ReferencedStore
   * @generated
   */
  EClass getReferencedStore();

  /**
   * Returns the meta object for the reference '{@link com.blasedef.onpa.oNPA.ReferencedStore#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see com.blasedef.onpa.oNPA.ReferencedStore#getValue()
   * @see #getReferencedStore()
   * @generated
   */
  EReference getReferencedStore_Value();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.SelfReferencedStore <em>Self Referenced Store</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Self Referenced Store</em>'.
   * @see com.blasedef.onpa.oNPA.SelfReferencedStore
   * @generated
   */
  EClass getSelfReferencedStore();

  /**
   * Returns the meta object for the reference '{@link com.blasedef.onpa.oNPA.SelfReferencedStore#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see com.blasedef.onpa.oNPA.SelfReferencedStore#getValue()
   * @see #getSelfReferencedStore()
   * @generated
   */
  EReference getSelfReferencedStore_Value();

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
     * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROCESSES = eINSTANCE.getModel_Processes();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TERMS = eINSTANCE.getModel_Terms();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.TermImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__NAME = eINSTANCE.getTerm_Name();

    /**
     * The meta object literal for the '<em><b>Stores</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__STORES = eINSTANCE.getTerm_Stores();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ProcessImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getProcess()
     * @generated
     */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__VALUE = eINSTANCE.getProcess_Value();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ProcessExpressionImpl <em>Process Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ProcessExpressionImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getProcessExpression()
     * @generated
     */
    EClass PROCESS_EXPRESSION = eINSTANCE.getProcessExpression();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.PredicateProcessImpl <em>Predicate Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.PredicateProcessImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getPredicateProcess()
     * @generated
     */
    EClass PREDICATE_PROCESS = eINSTANCE.getPredicateProcess();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_PROCESS__PREDICATE = eINSTANCE.getPredicateProcess_Predicate();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_PROCESS__VALUE = eINSTANCE.getPredicateProcess_Value();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ActionProcessImpl <em>Action Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ActionProcessImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionProcess()
     * @generated
     */
    EClass ACTION_PROCESS = eINSTANCE.getActionProcess();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_PROCESS__ACTION = eINSTANCE.getActionProcess_Action();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_PROCESS__VALUE = eINSTANCE.getActionProcess_Value();

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
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__PREDICATE = eINSTANCE.getAction_Predicate();

    /**
     * The meta object literal for the '<em><b>Evaluations</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__EVALUATIONS = eINSTANCE.getAction_Evaluations();

    /**
     * The meta object literal for the '<em><b>Updates</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__UPDATES = eINSTANCE.getAction_Updates();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.PredicateImpl <em>Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.PredicateImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getPredicate()
     * @generated
     */
    EClass PREDICATE = eINSTANCE.getPredicate();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__PREDICATE = eINSTANCE.getPredicate_Predicate();

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
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATIONS__EXPRESSIONS = eINSTANCE.getEvaluations_Expressions();

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
     * The meta object literal for the '<em><b>Updates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATES__UPDATES = eINSTANCE.getUpdates_Updates();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.PredicateExpressionImpl <em>Predicate Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.PredicateExpressionImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getPredicateExpression()
     * @generated
     */
    EClass PREDICATE_EXPRESSION = eINSTANCE.getPredicateExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_EXPRESSION__EXPRESSION = eINSTANCE.getPredicateExpression_Expression();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.EvaluationExpressionImpl <em>Evaluation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.EvaluationExpressionImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getEvaluationExpression()
     * @generated
     */
    EClass EVALUATION_EXPRESSION = eINSTANCE.getEvaluationExpression();

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
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_EXPRESSION__EXPRESSION = eINSTANCE.getUpdateExpression_Expression();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ActionExpressionImpl <em>Action Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ActionExpressionImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionExpression()
     * @generated
     */
    EClass ACTION_EXPRESSION = eINSTANCE.getActionExpression();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STORE__NAME = eINSTANCE.getStore_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORE__VALUE = eINSTANCE.getStore_Value();

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
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ParallelImpl <em>Parallel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ParallelImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getParallel()
     * @generated
     */
    EClass PARALLEL = eINSTANCE.getParallel();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARALLEL__LEFT = eINSTANCE.getParallel_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARALLEL__RIGHT = eINSTANCE.getParallel_Right();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ChoiceImpl <em>Choice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ChoiceImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getChoice()
     * @generated
     */
    EClass CHOICE = eINSTANCE.getChoice();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHOICE__LEFT = eINSTANCE.getChoice_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHOICE__RIGHT = eINSTANCE.getChoice_Right();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.LeafImpl <em>Leaf</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.LeafImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getLeaf()
     * @generated
     */
    EClass LEAF = eINSTANCE.getLeaf();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEAF__VALUE = eINSTANCE.getLeaf_Value();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ProcessReferenceImpl <em>Process Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ProcessReferenceImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getProcessReference()
     * @generated
     */
    EClass PROCESS_REFERENCE = eINSTANCE.getProcessReference();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_REFERENCE__VALUE = eINSTANCE.getProcessReference_Value();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.BroadcastImpl <em>Broadcast</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.BroadcastImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getBroadcast()
     * @generated
     */
    EClass BROADCAST = eINSTANCE.getBroadcast();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.UnicastImpl <em>Unicast</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.UnicastImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getUnicast()
     * @generated
     */
    EClass UNICAST = eINSTANCE.getUnicast();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.InImpl <em>In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.InImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getIn()
     * @generated
     */
    EClass IN = eINSTANCE.getIn();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.OutImpl <em>Out</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.OutImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getOut()
     * @generated
     */
    EClass OUT = eINSTANCE.getOut();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.LocalUpdateExpressionImpl <em>Local Update Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.LocalUpdateExpressionImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getLocalUpdateExpression()
     * @generated
     */
    EClass LOCAL_UPDATE_EXPRESSION = eINSTANCE.getLocalUpdateExpression();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ActionOrImpl <em>Action Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ActionOrImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionOr()
     * @generated
     */
    EClass ACTION_OR = eINSTANCE.getActionOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_OR__LEFT = eINSTANCE.getActionOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_OR__RIGHT = eINSTANCE.getActionOr_Right();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ActionAndImpl <em>Action And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ActionAndImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionAnd()
     * @generated
     */
    EClass ACTION_AND = eINSTANCE.getActionAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_AND__LEFT = eINSTANCE.getActionAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_AND__RIGHT = eINSTANCE.getActionAnd_Right();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ActionEqualityImpl <em>Action Equality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ActionEqualityImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionEquality()
     * @generated
     */
    EClass ACTION_EQUALITY = eINSTANCE.getActionEquality();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_EQUALITY__LEFT = eINSTANCE.getActionEquality_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_EQUALITY__OP = eINSTANCE.getActionEquality_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_EQUALITY__RIGHT = eINSTANCE.getActionEquality_Right();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ActionComparisonImpl <em>Action Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ActionComparisonImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionComparison()
     * @generated
     */
    EClass ACTION_COMPARISON = eINSTANCE.getActionComparison();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_COMPARISON__LEFT = eINSTANCE.getActionComparison_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_COMPARISON__OP = eINSTANCE.getActionComparison_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_COMPARISON__RIGHT = eINSTANCE.getActionComparison_Right();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ActionSubImpl <em>Action Sub</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ActionSubImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionSub()
     * @generated
     */
    EClass ACTION_SUB = eINSTANCE.getActionSub();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_SUB__LEFT = eINSTANCE.getActionSub_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_SUB__RIGHT = eINSTANCE.getActionSub_Right();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ActionPluImpl <em>Action Plu</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ActionPluImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionPlu()
     * @generated
     */
    EClass ACTION_PLU = eINSTANCE.getActionPlu();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_PLU__LEFT = eINSTANCE.getActionPlu_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_PLU__RIGHT = eINSTANCE.getActionPlu_Right();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ActionMulImpl <em>Action Mul</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ActionMulImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionMul()
     * @generated
     */
    EClass ACTION_MUL = eINSTANCE.getActionMul();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_MUL__LEFT = eINSTANCE.getActionMul_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_MUL__RIGHT = eINSTANCE.getActionMul_Right();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ActionDivImpl <em>Action Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ActionDivImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionDiv()
     * @generated
     */
    EClass ACTION_DIV = eINSTANCE.getActionDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_DIV__LEFT = eINSTANCE.getActionDiv_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_DIV__RIGHT = eINSTANCE.getActionDiv_Right();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ActionNotImpl <em>Action Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ActionNotImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getActionNot()
     * @generated
     */
    EClass ACTION_NOT = eINSTANCE.getActionNot();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_NOT__EXPRESSION = eINSTANCE.getActionNot_Expression();

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
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.FreeVariableImpl <em>Free Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.FreeVariableImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getFreeVariable()
     * @generated
     */
    EClass FREE_VARIABLE = eINSTANCE.getFreeVariable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FREE_VARIABLE__VALUE = eINSTANCE.getFreeVariable_Value();

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
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ReferencedStoreImpl <em>Referenced Store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ReferencedStoreImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getReferencedStore()
     * @generated
     */
    EClass REFERENCED_STORE = eINSTANCE.getReferencedStore();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCED_STORE__VALUE = eINSTANCE.getReferencedStore_Value();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.SelfReferencedStoreImpl <em>Self Referenced Store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.SelfReferencedStoreImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getSelfReferencedStore()
     * @generated
     */
    EClass SELF_REFERENCED_STORE = eINSTANCE.getSelfReferencedStore();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELF_REFERENCED_STORE__VALUE = eINSTANCE.getSelfReferencedStore_Value();

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

  }

} //ONPAPackage
