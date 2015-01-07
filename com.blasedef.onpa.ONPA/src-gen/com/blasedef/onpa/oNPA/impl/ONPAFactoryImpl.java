/**
 */
package com.blasedef.onpa.oNPA.impl;

import com.blasedef.onpa.oNPA.*;

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
      case ONPAPackage.ACTION: return createAction();
      case ONPAPackage.BROADCAST_OUT: return createBroadcastOut();
      case ONPAPackage.BROADCAST_IN: return createBroadcastIn();
      case ONPAPackage.UNICAST_OUT: return createUnicastOut();
      case ONPAPackage.UNICAST_IN: return createUnicastIn();
      case ONPAPackage.UPDATES: return createUpdates();
      case ONPAPackage.UPDATE_EXPRESSION: return createUpdateExpression();
      case ONPAPackage.VALUES: return createValues();
      case ONPAPackage.VALUE_PRIMARY: return createValuePrimary();
      case ONPAPackage.EVALUATIONS: return createEvaluations();
      case ONPAPackage.EVALUATION: return createEvaluation();
      case ONPAPackage.STORE: return createStore();
      case ONPAPackage.ATTRIBUTE_VALUE: return createAttributeValue();
      case ONPAPackage.EXPRESSION: return createExpression();
      case ONPAPackage.OR: return createOr();
      case ONPAPackage.AND: return createAnd();
      case ONPAPackage.EQUALITY: return createEquality();
      case ONPAPackage.COMPARISON: return createComparison();
      case ONPAPackage.SUB: return createSub();
      case ONPAPackage.PLU: return createPlu();
      case ONPAPackage.MUL: return createMul();
      case ONPAPackage.DIV: return createDiv();
      case ONPAPackage.NOT: return createNot();
      case ONPAPackage.DOUBLE_CONSTANT: return createDoubleConstant();
      case ONPAPackage.BOOL_CONSTANT: return createBoolConstant();
      case ONPAPackage.REFERENCED_RATE: return createReferencedRate();
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
  public BroadcastOut createBroadcastOut()
  {
    BroadcastOutImpl broadcastOut = new BroadcastOutImpl();
    return broadcastOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BroadcastIn createBroadcastIn()
  {
    BroadcastInImpl broadcastIn = new BroadcastInImpl();
    return broadcastIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnicastOut createUnicastOut()
  {
    UnicastOutImpl unicastOut = new UnicastOutImpl();
    return unicastOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnicastIn createUnicastIn()
  {
    UnicastInImpl unicastIn = new UnicastInImpl();
    return unicastIn;
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
  public Values createValues()
  {
    ValuesImpl values = new ValuesImpl();
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuePrimary createValuePrimary()
  {
    ValuePrimaryImpl valuePrimary = new ValuePrimaryImpl();
    return valuePrimary;
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
  public Evaluation createEvaluation()
  {
    EvaluationImpl evaluation = new EvaluationImpl();
    return evaluation;
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
  public AttributeValue createAttributeValue()
  {
    AttributeValueImpl attributeValue = new AttributeValueImpl();
    return attributeValue;
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
  public ReferencedRate createReferencedRate()
  {
    ReferencedRateImpl referencedRate = new ReferencedRateImpl();
    return referencedRate;
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
