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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.blasedef.onpa.oNPA.ONPAPackage
 * @generated
 */
public class ONPASwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ONPAPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ONPASwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ONPAPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ONPAPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.TERM:
      {
        Term term = (Term)theEObject;
        T result = caseTerm(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.PROCESS:
      {
        com.blasedef.onpa.oNPA.Process process = (com.blasedef.onpa.oNPA.Process)theEObject;
        T result = caseProcess(process);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.PROCESS_EXPRESSION:
      {
        ProcessExpression processExpression = (ProcessExpression)theEObject;
        T result = caseProcessExpression(processExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.PREDICATE_PROCESS:
      {
        PredicateProcess predicateProcess = (PredicateProcess)theEObject;
        T result = casePredicateProcess(predicateProcess);
        if (result == null) result = caseProcessExpression(predicateProcess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.ACTION_PROCESS:
      {
        ActionProcess actionProcess = (ActionProcess)theEObject;
        T result = caseActionProcess(actionProcess);
        if (result == null) result = caseProcessExpression(actionProcess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.PREDICATE:
      {
        Predicate predicate = (Predicate)theEObject;
        T result = casePredicate(predicate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.EVALUATIONS:
      {
        Evaluations evaluations = (Evaluations)theEObject;
        T result = caseEvaluations(evaluations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.UPDATES:
      {
        Updates updates = (Updates)theEObject;
        T result = caseUpdates(updates);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.PREDICATE_EXPRESSION:
      {
        PredicateExpression predicateExpression = (PredicateExpression)theEObject;
        T result = casePredicateExpression(predicateExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.EVALUATION_EXPRESSION:
      {
        EvaluationExpression evaluationExpression = (EvaluationExpression)theEObject;
        T result = caseEvaluationExpression(evaluationExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.UPDATE_EXPRESSION:
      {
        UpdateExpression updateExpression = (UpdateExpression)theEObject;
        T result = caseUpdateExpression(updateExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.SELF_REFERENCED_STORE:
      {
        SelfReferencedStore selfReferencedStore = (SelfReferencedStore)theEObject;
        T result = caseSelfReferencedStore(selfReferencedStore);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.ACTION_EXPRESSION:
      {
        ActionExpression actionExpression = (ActionExpression)theEObject;
        T result = caseActionExpression(actionExpression);
        if (result == null) result = caseEvaluationExpression(actionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.STORE:
      {
        Store store = (Store)theEObject;
        T result = caseStore(store);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.PARALLEL:
      {
        Parallel parallel = (Parallel)theEObject;
        T result = caseParallel(parallel);
        if (result == null) result = caseProcessExpression(parallel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.CHOICE:
      {
        Choice choice = (Choice)theEObject;
        T result = caseChoice(choice);
        if (result == null) result = caseProcessExpression(choice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.LEAF:
      {
        Leaf leaf = (Leaf)theEObject;
        T result = caseLeaf(leaf);
        if (result == null) result = caseProcessExpression(leaf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.PROCESS_REFERENCE:
      {
        ProcessReference processReference = (ProcessReference)theEObject;
        T result = caseProcessReference(processReference);
        if (result == null) result = caseProcessExpression(processReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.BROADCAST:
      {
        Broadcast broadcast = (Broadcast)theEObject;
        T result = caseBroadcast(broadcast);
        if (result == null) result = caseAction(broadcast);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.UNICAST:
      {
        Unicast unicast = (Unicast)theEObject;
        T result = caseUnicast(unicast);
        if (result == null) result = caseAction(unicast);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.IN:
      {
        In in = (In)theEObject;
        T result = caseIn(in);
        if (result == null) result = caseEvaluations(in);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.OUT:
      {
        Out out = (Out)theEObject;
        T result = caseOut(out);
        if (result == null) result = caseEvaluations(out);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.LOCAL_UPDATE_EXPRESSION:
      {
        LocalUpdateExpression localUpdateExpression = (LocalUpdateExpression)theEObject;
        T result = caseLocalUpdateExpression(localUpdateExpression);
        if (result == null) result = caseUpdateExpression(localUpdateExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.ACTION_OR:
      {
        ActionOr actionOr = (ActionOr)theEObject;
        T result = caseActionOr(actionOr);
        if (result == null) result = caseActionExpression(actionOr);
        if (result == null) result = caseEvaluationExpression(actionOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.ACTION_AND:
      {
        ActionAnd actionAnd = (ActionAnd)theEObject;
        T result = caseActionAnd(actionAnd);
        if (result == null) result = caseActionExpression(actionAnd);
        if (result == null) result = caseEvaluationExpression(actionAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.ACTION_EQUALITY:
      {
        ActionEquality actionEquality = (ActionEquality)theEObject;
        T result = caseActionEquality(actionEquality);
        if (result == null) result = caseActionExpression(actionEquality);
        if (result == null) result = caseEvaluationExpression(actionEquality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.ACTION_COMPARISON:
      {
        ActionComparison actionComparison = (ActionComparison)theEObject;
        T result = caseActionComparison(actionComparison);
        if (result == null) result = caseActionExpression(actionComparison);
        if (result == null) result = caseEvaluationExpression(actionComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.ACTION_SUB:
      {
        ActionSub actionSub = (ActionSub)theEObject;
        T result = caseActionSub(actionSub);
        if (result == null) result = caseActionExpression(actionSub);
        if (result == null) result = caseEvaluationExpression(actionSub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.ACTION_PLU:
      {
        ActionPlu actionPlu = (ActionPlu)theEObject;
        T result = caseActionPlu(actionPlu);
        if (result == null) result = caseActionExpression(actionPlu);
        if (result == null) result = caseEvaluationExpression(actionPlu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.ACTION_MUL:
      {
        ActionMul actionMul = (ActionMul)theEObject;
        T result = caseActionMul(actionMul);
        if (result == null) result = caseActionExpression(actionMul);
        if (result == null) result = caseEvaluationExpression(actionMul);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.ACTION_DIV:
      {
        ActionDiv actionDiv = (ActionDiv)theEObject;
        T result = caseActionDiv(actionDiv);
        if (result == null) result = caseActionExpression(actionDiv);
        if (result == null) result = caseEvaluationExpression(actionDiv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.ACTION_NOT:
      {
        ActionNot actionNot = (ActionNot)theEObject;
        T result = caseActionNot(actionNot);
        if (result == null) result = caseActionExpression(actionNot);
        if (result == null) result = caseEvaluationExpression(actionNot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.DOUBLE_CONSTANT:
      {
        DoubleConstant doubleConstant = (DoubleConstant)theEObject;
        T result = caseDoubleConstant(doubleConstant);
        if (result == null) result = caseActionExpression(doubleConstant);
        if (result == null) result = caseExpression(doubleConstant);
        if (result == null) result = caseEvaluationExpression(doubleConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.FREE_VARIABLE:
      {
        FreeVariable freeVariable = (FreeVariable)theEObject;
        T result = caseFreeVariable(freeVariable);
        if (result == null) result = caseActionExpression(freeVariable);
        if (result == null) result = caseEvaluationExpression(freeVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.BOOL_CONSTANT:
      {
        BoolConstant boolConstant = (BoolConstant)theEObject;
        T result = caseBoolConstant(boolConstant);
        if (result == null) result = caseActionExpression(boolConstant);
        if (result == null) result = caseExpression(boolConstant);
        if (result == null) result = caseEvaluationExpression(boolConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.REFERENCED_STORE:
      {
        ReferencedStore referencedStore = (ReferencedStore)theEObject;
        T result = caseReferencedStore(referencedStore);
        if (result == null) result = caseActionExpression(referencedStore);
        if (result == null) result = caseExpression(referencedStore);
        if (result == null) result = caseEvaluationExpression(referencedStore);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.OR:
      {
        Or or = (Or)theEObject;
        T result = caseOr(or);
        if (result == null) result = caseExpression(or);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.AND:
      {
        And and = (And)theEObject;
        T result = caseAnd(and);
        if (result == null) result = caseExpression(and);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.EQUALITY:
      {
        Equality equality = (Equality)theEObject;
        T result = caseEquality(equality);
        if (result == null) result = caseExpression(equality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.COMPARISON:
      {
        Comparison comparison = (Comparison)theEObject;
        T result = caseComparison(comparison);
        if (result == null) result = caseExpression(comparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.SUB:
      {
        Sub sub = (Sub)theEObject;
        T result = caseSub(sub);
        if (result == null) result = caseExpression(sub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.PLU:
      {
        Plu plu = (Plu)theEObject;
        T result = casePlu(plu);
        if (result == null) result = caseExpression(plu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.MUL:
      {
        Mul mul = (Mul)theEObject;
        T result = caseMul(mul);
        if (result == null) result = caseExpression(mul);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.DIV:
      {
        Div div = (Div)theEObject;
        T result = caseDiv(div);
        if (result == null) result = caseExpression(div);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ONPAPackage.NOT:
      {
        Not not = (Not)theEObject;
        T result = caseNot(not);
        if (result == null) result = caseExpression(not);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerm(Term object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcess(com.blasedef.onpa.oNPA.Process object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessExpression(ProcessExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateProcess(PredicateProcess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionProcess(ActionProcess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicate(Predicate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Evaluations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Evaluations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvaluations(Evaluations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Updates</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Updates</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdates(Updates object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateExpression(PredicateExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Evaluation Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Evaluation Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvaluationExpression(EvaluationExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateExpression(UpdateExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Self Referenced Store</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Self Referenced Store</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelfReferencedStore(SelfReferencedStore object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionExpression(ActionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Store</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStore(Store object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parallel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parallel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParallel(Parallel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChoice(Choice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Leaf</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Leaf</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeaf(Leaf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessReference(ProcessReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Broadcast</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Broadcast</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBroadcast(Broadcast object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unicast</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unicast</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnicast(Unicast object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIn(In object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Out</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Out</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOut(Out object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Update Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Update Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalUpdateExpression(LocalUpdateExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionOr(ActionOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionAnd(ActionAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Equality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Equality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionEquality(ActionEquality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionComparison(ActionComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Sub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Sub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionSub(ActionSub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Plu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Plu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionPlu(ActionPlu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Mul</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Mul</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionMul(ActionMul object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionDiv(ActionDiv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionNot(ActionNot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleConstant(DoubleConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Free Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Free Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFreeVariable(FreeVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolConstant(BoolConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Referenced Store</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Referenced Store</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferencedStore(ReferencedStore object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOr(Or object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnd(And object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquality(Equality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparison(Comparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSub(Sub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlu(Plu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mul</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mul</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMul(Mul object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiv(Div object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNot(Not object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ONPASwitch
