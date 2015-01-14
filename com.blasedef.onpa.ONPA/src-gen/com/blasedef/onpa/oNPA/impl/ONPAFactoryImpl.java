/**
 */
package com.blasedef.onpa.oNPA.impl;

import com.blasedef.onpa.oNPA.Action;
import com.blasedef.onpa.oNPA.ActionAnd;
import com.blasedef.onpa.oNPA.ActionComparison;
import com.blasedef.onpa.oNPA.ActionDiv;
import com.blasedef.onpa.oNPA.ActionEquality;
import com.blasedef.onpa.oNPA.ActionExpression;
import com.blasedef.onpa.oNPA.ActionMul;
import com.blasedef.onpa.oNPA.ActionNot;
import com.blasedef.onpa.oNPA.ActionOr;
import com.blasedef.onpa.oNPA.ActionPlu;
import com.blasedef.onpa.oNPA.ActionProcess;
import com.blasedef.onpa.oNPA.ActionSub;
import com.blasedef.onpa.oNPA.And;
import com.blasedef.onpa.oNPA.BoolConstant;
import com.blasedef.onpa.oNPA.Broadcast;
import com.blasedef.onpa.oNPA.Choice;
import com.blasedef.onpa.oNPA.Comparison;
import com.blasedef.onpa.oNPA.Div;
import com.blasedef.onpa.oNPA.DoubleConstant;
import com.blasedef.onpa.oNPA.Equality;
import com.blasedef.onpa.oNPA.EvaluationExpression;
import com.blasedef.onpa.oNPA.Evaluations;
import com.blasedef.onpa.oNPA.Expression;
import com.blasedef.onpa.oNPA.FreeVariable;
import com.blasedef.onpa.oNPA.In;
import com.blasedef.onpa.oNPA.Leaf;
import com.blasedef.onpa.oNPA.LocalUpdateExpression;
import com.blasedef.onpa.oNPA.Model;
import com.blasedef.onpa.oNPA.Mul;
import com.blasedef.onpa.oNPA.Not;
import com.blasedef.onpa.oNPA.ONPAFactory;
import com.blasedef.onpa.oNPA.ONPAPackage;
import com.blasedef.onpa.oNPA.Or;
import com.blasedef.onpa.oNPA.Out;
import com.blasedef.onpa.oNPA.Parallel;
import com.blasedef.onpa.oNPA.Plu;
import com.blasedef.onpa.oNPA.Predicate;
import com.blasedef.onpa.oNPA.PredicateExpression;
import com.blasedef.onpa.oNPA.PredicateProcess;
import com.blasedef.onpa.oNPA.ProcessExpression;
import com.blasedef.onpa.oNPA.ProcessReference;
import com.blasedef.onpa.oNPA.ReferencedStore;
import com.blasedef.onpa.oNPA.SelfReferencedStore;
import com.blasedef.onpa.oNPA.Store;
import com.blasedef.onpa.oNPA.Sub;
import com.blasedef.onpa.oNPA.Term;
import com.blasedef.onpa.oNPA.Unicast;
import com.blasedef.onpa.oNPA.UpdateExpression;
import com.blasedef.onpa.oNPA.Updates;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ONPAFactoryImpl extends EFactoryImpl implements ONPAFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ONPAFactory init()
  {
    try
    {
      ONPAFactory theONPAFactory = (ONPAFactory)EPackage.Registry.INSTANCE.getEFactory(ONPAPackage.eNS_URI);
      if (theONPAFactory != null)
      {
        return theONPAFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ONPAFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ONPAFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ONPAPackage.MODEL: return createModel();
      case ONPAPackage.TERM: return createTerm();
      case ONPAPackage.PROCESS: return createProcess();
      case ONPAPackage.PROCESS_EXPRESSION: return createProcessExpression();
      case ONPAPackage.PREDICATE_PROCESS: return createPredicateProcess();
      case ONPAPackage.ACTION_PROCESS: return createActionProcess();
      case ONPAPackage.ACTION: return createAction();
      case ONPAPackage.PREDICATE: return createPredicate();
      case ONPAPackage.EVALUATIONS: return createEvaluations();
      case ONPAPackage.UPDATES: return createUpdates();
      case ONPAPackage.PREDICATE_EXPRESSION: return createPredicateExpression();
      case ONPAPackage.EVALUATION_EXPRESSION: return createEvaluationExpression();
      case ONPAPackage.UPDATE_EXPRESSION: return createUpdateExpression();
      case ONPAPackage.SELF_REFERENCED_STORE: return createSelfReferencedStore();
      case ONPAPackage.ACTION_EXPRESSION: return createActionExpression();
      case ONPAPackage.STORE: return createStore();
      case ONPAPackage.EXPRESSION: return createExpression();
      case ONPAPackage.PARALLEL: return createParallel();
      case ONPAPackage.CHOICE: return createChoice();
      case ONPAPackage.LEAF: return createLeaf();
      case ONPAPackage.PROCESS_REFERENCE: return createProcessReference();
      case ONPAPackage.BROADCAST: return createBroadcast();
      case ONPAPackage.UNICAST: return createUnicast();
      case ONPAPackage.IN: return createIn();
      case ONPAPackage.OUT: return createOut();
      case ONPAPackage.LOCAL_UPDATE_EXPRESSION: return createLocalUpdateExpression();
      case ONPAPackage.ACTION_OR: return createActionOr();
      case ONPAPackage.ACTION_AND: return createActionAnd();
      case ONPAPackage.ACTION_EQUALITY: return createActionEquality();
      case ONPAPackage.ACTION_COMPARISON: return createActionComparison();
      case ONPAPackage.ACTION_SUB: return createActionSub();
      case ONPAPackage.ACTION_PLU: return createActionPlu();
      case ONPAPackage.ACTION_MUL: return createActionMul();
      case ONPAPackage.ACTION_DIV: return createActionDiv();
      case ONPAPackage.ACTION_NOT: return createActionNot();
      case ONPAPackage.DOUBLE_CONSTANT: return createDoubleConstant();
      case ONPAPackage.FREE_VARIABLE: return createFreeVariable();
      case ONPAPackage.BOOL_CONSTANT: return createBoolConstant();
      case ONPAPackage.REFERENCED_STORE: return createReferencedStore();
      case ONPAPackage.OR: return createOr();
      case ONPAPackage.AND: return createAnd();
      case ONPAPackage.EQUALITY: return createEquality();
      case ONPAPackage.COMPARISON: return createComparison();
      case ONPAPackage.SUB: return createSub();
      case ONPAPackage.PLU: return createPlu();
      case ONPAPackage.MUL: return createMul();
      case ONPAPackage.DIV: return createDiv();
      case ONPAPackage.NOT: return createNot();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.blasedef.onpa.oNPA.Process createProcess()
  {
    ProcessImpl process = new ProcessImpl();
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessExpression createProcessExpression()
  {
    ProcessExpressionImpl processExpression = new ProcessExpressionImpl();
    return processExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateProcess createPredicateProcess()
  {
    PredicateProcessImpl predicateProcess = new PredicateProcessImpl();
    return predicateProcess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionProcess createActionProcess()
  {
    ActionProcessImpl actionProcess = new ActionProcessImpl();
    return actionProcess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Predicate createPredicate()
  {
    PredicateImpl predicate = new PredicateImpl();
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Evaluations createEvaluations()
  {
    EvaluationsImpl evaluations = new EvaluationsImpl();
    return evaluations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Updates createUpdates()
  {
    UpdatesImpl updates = new UpdatesImpl();
    return updates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateExpression createPredicateExpression()
  {
    PredicateExpressionImpl predicateExpression = new PredicateExpressionImpl();
    return predicateExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluationExpression createEvaluationExpression()
  {
    EvaluationExpressionImpl evaluationExpression = new EvaluationExpressionImpl();
    return evaluationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateExpression createUpdateExpression()
  {
    UpdateExpressionImpl updateExpression = new UpdateExpressionImpl();
    return updateExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelfReferencedStore createSelfReferencedStore()
  {
    SelfReferencedStoreImpl selfReferencedStore = new SelfReferencedStoreImpl();
    return selfReferencedStore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionExpression createActionExpression()
  {
    ActionExpressionImpl actionExpression = new ActionExpressionImpl();
    return actionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Store createStore()
  {
    StoreImpl store = new StoreImpl();
    return store;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parallel createParallel()
  {
    ParallelImpl parallel = new ParallelImpl();
    return parallel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Choice createChoice()
  {
    ChoiceImpl choice = new ChoiceImpl();
    return choice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Leaf createLeaf()
  {
    LeafImpl leaf = new LeafImpl();
    return leaf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessReference createProcessReference()
  {
    ProcessReferenceImpl processReference = new ProcessReferenceImpl();
    return processReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Broadcast createBroadcast()
  {
    BroadcastImpl broadcast = new BroadcastImpl();
    return broadcast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unicast createUnicast()
  {
    UnicastImpl unicast = new UnicastImpl();
    return unicast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public In createIn()
  {
    InImpl in = new InImpl();
    return in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Out createOut()
  {
    OutImpl out = new OutImpl();
    return out;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalUpdateExpression createLocalUpdateExpression()
  {
    LocalUpdateExpressionImpl localUpdateExpression = new LocalUpdateExpressionImpl();
    return localUpdateExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionOr createActionOr()
  {
    ActionOrImpl actionOr = new ActionOrImpl();
    return actionOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionAnd createActionAnd()
  {
    ActionAndImpl actionAnd = new ActionAndImpl();
    return actionAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionEquality createActionEquality()
  {
    ActionEqualityImpl actionEquality = new ActionEqualityImpl();
    return actionEquality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionComparison createActionComparison()
  {
    ActionComparisonImpl actionComparison = new ActionComparisonImpl();
    return actionComparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionSub createActionSub()
  {
    ActionSubImpl actionSub = new ActionSubImpl();
    return actionSub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionPlu createActionPlu()
  {
    ActionPluImpl actionPlu = new ActionPluImpl();
    return actionPlu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionMul createActionMul()
  {
    ActionMulImpl actionMul = new ActionMulImpl();
    return actionMul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionDiv createActionDiv()
  {
    ActionDivImpl actionDiv = new ActionDivImpl();
    return actionDiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionNot createActionNot()
  {
    ActionNotImpl actionNot = new ActionNotImpl();
    return actionNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleConstant createDoubleConstant()
  {
    DoubleConstantImpl doubleConstant = new DoubleConstantImpl();
    return doubleConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FreeVariable createFreeVariable()
  {
    FreeVariableImpl freeVariable = new FreeVariableImpl();
    return freeVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolConstant createBoolConstant()
  {
    BoolConstantImpl boolConstant = new BoolConstantImpl();
    return boolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencedStore createReferencedStore()
  {
    ReferencedStoreImpl referencedStore = new ReferencedStoreImpl();
    return referencedStore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equality createEquality()
  {
    EqualityImpl equality = new EqualityImpl();
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sub createSub()
  {
    SubImpl sub = new SubImpl();
    return sub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plu createPlu()
  {
    PluImpl plu = new PluImpl();
    return plu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mul createMul()
  {
    MulImpl mul = new MulImpl();
    return mul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ONPAPackage getONPAPackage()
  {
    return (ONPAPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ONPAPackage getPackage()
  {
    return ONPAPackage.eINSTANCE;
  }

} //ONPAFactoryImpl
