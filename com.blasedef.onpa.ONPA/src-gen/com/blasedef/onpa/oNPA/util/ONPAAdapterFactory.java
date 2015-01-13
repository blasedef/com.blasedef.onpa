/**
 */
package com.blasedef.onpa.oNPA.util;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.blasedef.onpa.oNPA.ONPAPackage
 * @generated
 */
public class ONPAAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ONPAPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ONPAAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ONPAPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ONPASwitch<Adapter> modelSwitch =
    new ONPASwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
      }
      @Override
      public Adapter caseProcess(com.blasedef.onpa.oNPA.Process object)
      {
        return createProcessAdapter();
      }
      @Override
      public Adapter caseProcessExpression(ProcessExpression object)
      {
        return createProcessExpressionAdapter();
      }
      @Override
      public Adapter casePredicateProcess(PredicateProcess object)
      {
        return createPredicateProcessAdapter();
      }
      @Override
      public Adapter caseActionProcess(ActionProcess object)
      {
        return createActionProcessAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter casePredicate(Predicate object)
      {
        return createPredicateAdapter();
      }
      @Override
      public Adapter caseEvaluations(Evaluations object)
      {
        return createEvaluationsAdapter();
      }
      @Override
      public Adapter caseUpdates(Updates object)
      {
        return createUpdatesAdapter();
      }
      @Override
      public Adapter casePredicateExpression(PredicateExpression object)
      {
        return createPredicateExpressionAdapter();
      }
      @Override
      public Adapter caseEvaluationExpression(EvaluationExpression object)
      {
        return createEvaluationExpressionAdapter();
      }
      @Override
      public Adapter caseUpdateExpression(UpdateExpression object)
      {
        return createUpdateExpressionAdapter();
      }
      @Override
      public Adapter caseActionExpression(ActionExpression object)
      {
        return createActionExpressionAdapter();
      }
      @Override
      public Adapter caseStore(Store object)
      {
        return createStoreAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseParallel(Parallel object)
      {
        return createParallelAdapter();
      }
      @Override
      public Adapter caseChoice(Choice object)
      {
        return createChoiceAdapter();
      }
      @Override
      public Adapter caseLeaf(Leaf object)
      {
        return createLeafAdapter();
      }
      @Override
      public Adapter caseProcessReference(ProcessReference object)
      {
        return createProcessReferenceAdapter();
      }
      @Override
      public Adapter caseBroadcast(Broadcast object)
      {
        return createBroadcastAdapter();
      }
      @Override
      public Adapter caseUnicast(Unicast object)
      {
        return createUnicastAdapter();
      }
      @Override
      public Adapter caseIn(In object)
      {
        return createInAdapter();
      }
      @Override
      public Adapter caseOut(Out object)
      {
        return createOutAdapter();
      }
      @Override
      public Adapter caseLocalUpdateExpression(LocalUpdateExpression object)
      {
        return createLocalUpdateExpressionAdapter();
      }
      @Override
      public Adapter caseActionOr(ActionOr object)
      {
        return createActionOrAdapter();
      }
      @Override
      public Adapter caseActionAnd(ActionAnd object)
      {
        return createActionAndAdapter();
      }
      @Override
      public Adapter caseActionEquality(ActionEquality object)
      {
        return createActionEqualityAdapter();
      }
      @Override
      public Adapter caseActionComparison(ActionComparison object)
      {
        return createActionComparisonAdapter();
      }
      @Override
      public Adapter caseActionSub(ActionSub object)
      {
        return createActionSubAdapter();
      }
      @Override
      public Adapter caseActionPlu(ActionPlu object)
      {
        return createActionPluAdapter();
      }
      @Override
      public Adapter caseActionMul(ActionMul object)
      {
        return createActionMulAdapter();
      }
      @Override
      public Adapter caseActionDiv(ActionDiv object)
      {
        return createActionDivAdapter();
      }
      @Override
      public Adapter caseActionNot(ActionNot object)
      {
        return createActionNotAdapter();
      }
      @Override
      public Adapter caseDoubleConstant(DoubleConstant object)
      {
        return createDoubleConstantAdapter();
      }
      @Override
      public Adapter caseFreeVariable(FreeVariable object)
      {
        return createFreeVariableAdapter();
      }
      @Override
      public Adapter caseBoolConstant(BoolConstant object)
      {
        return createBoolConstantAdapter();
      }
      @Override
      public Adapter caseReferencedStore(ReferencedStore object)
      {
        return createReferencedStoreAdapter();
      }
      @Override
      public Adapter caseSelfReferencedStore(SelfReferencedStore object)
      {
        return createSelfReferencedStoreAdapter();
      }
      @Override
      public Adapter caseOr(Or object)
      {
        return createOrAdapter();
      }
      @Override
      public Adapter caseAnd(And object)
      {
        return createAndAdapter();
      }
      @Override
      public Adapter caseEquality(Equality object)
      {
        return createEqualityAdapter();
      }
      @Override
      public Adapter caseComparison(Comparison object)
      {
        return createComparisonAdapter();
      }
      @Override
      public Adapter caseSub(Sub object)
      {
        return createSubAdapter();
      }
      @Override
      public Adapter casePlu(Plu object)
      {
        return createPluAdapter();
      }
      @Override
      public Adapter caseMul(Mul object)
      {
        return createMulAdapter();
      }
      @Override
      public Adapter caseDiv(Div object)
      {
        return createDivAdapter();
      }
      @Override
      public Adapter caseNot(Not object)
      {
        return createNotAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Term
   * @generated
   */
  public Adapter createTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Process
   * @generated
   */
  public Adapter createProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.ProcessExpression <em>Process Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.ProcessExpression
   * @generated
   */
  public Adapter createProcessExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.PredicateProcess <em>Predicate Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.PredicateProcess
   * @generated
   */
  public Adapter createPredicateProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.ActionProcess <em>Action Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.ActionProcess
   * @generated
   */
  public Adapter createActionProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Predicate
   * @generated
   */
  public Adapter createPredicateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Evaluations <em>Evaluations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Evaluations
   * @generated
   */
  public Adapter createEvaluationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Updates <em>Updates</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Updates
   * @generated
   */
  public Adapter createUpdatesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.PredicateExpression <em>Predicate Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.PredicateExpression
   * @generated
   */
  public Adapter createPredicateExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.EvaluationExpression <em>Evaluation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.EvaluationExpression
   * @generated
   */
  public Adapter createEvaluationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.UpdateExpression <em>Update Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.UpdateExpression
   * @generated
   */
  public Adapter createUpdateExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.ActionExpression <em>Action Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.ActionExpression
   * @generated
   */
  public Adapter createActionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Store <em>Store</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Store
   * @generated
   */
  public Adapter createStoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Parallel <em>Parallel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Parallel
   * @generated
   */
  public Adapter createParallelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Choice <em>Choice</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Choice
   * @generated
   */
  public Adapter createChoiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Leaf <em>Leaf</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Leaf
   * @generated
   */
  public Adapter createLeafAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.ProcessReference <em>Process Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.ProcessReference
   * @generated
   */
  public Adapter createProcessReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Broadcast <em>Broadcast</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Broadcast
   * @generated
   */
  public Adapter createBroadcastAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Unicast <em>Unicast</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Unicast
   * @generated
   */
  public Adapter createUnicastAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.In <em>In</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.In
   * @generated
   */
  public Adapter createInAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Out <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Out
   * @generated
   */
  public Adapter createOutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.LocalUpdateExpression <em>Local Update Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.LocalUpdateExpression
   * @generated
   */
  public Adapter createLocalUpdateExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.ActionOr <em>Action Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.ActionOr
   * @generated
   */
  public Adapter createActionOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.ActionAnd <em>Action And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.ActionAnd
   * @generated
   */
  public Adapter createActionAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.ActionEquality <em>Action Equality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.ActionEquality
   * @generated
   */
  public Adapter createActionEqualityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.ActionComparison <em>Action Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.ActionComparison
   * @generated
   */
  public Adapter createActionComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.ActionSub <em>Action Sub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.ActionSub
   * @generated
   */
  public Adapter createActionSubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.ActionPlu <em>Action Plu</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.ActionPlu
   * @generated
   */
  public Adapter createActionPluAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.ActionMul <em>Action Mul</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.ActionMul
   * @generated
   */
  public Adapter createActionMulAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.ActionDiv <em>Action Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.ActionDiv
   * @generated
   */
  public Adapter createActionDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.ActionNot <em>Action Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.ActionNot
   * @generated
   */
  public Adapter createActionNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.DoubleConstant <em>Double Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.DoubleConstant
   * @generated
   */
  public Adapter createDoubleConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.FreeVariable <em>Free Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.FreeVariable
   * @generated
   */
  public Adapter createFreeVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.BoolConstant <em>Bool Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.BoolConstant
   * @generated
   */
  public Adapter createBoolConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.ReferencedStore <em>Referenced Store</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.ReferencedStore
   * @generated
   */
  public Adapter createReferencedStoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.SelfReferencedStore <em>Self Referenced Store</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.SelfReferencedStore
   * @generated
   */
  public Adapter createSelfReferencedStoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Or
   * @generated
   */
  public Adapter createOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.And
   * @generated
   */
  public Adapter createAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Equality <em>Equality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Equality
   * @generated
   */
  public Adapter createEqualityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Comparison
   * @generated
   */
  public Adapter createComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Sub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Sub
   * @generated
   */
  public Adapter createSubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Plu <em>Plu</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Plu
   * @generated
   */
  public Adapter createPluAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Mul <em>Mul</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Mul
   * @generated
   */
  public Adapter createMulAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Div
   * @generated
   */
  public Adapter createDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Not
   * @generated
   */
  public Adapter createNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ONPAAdapterFactory
