/**
 */
package com.blasedef.onpa.oNPA.util;

import com.blasedef.onpa.oNPA.*;

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
      public Adapter caseRate(Rate object)
      {
        return createRateAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
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
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
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
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Rate <em>Rate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Rate
   * @generated
   */
  public Adapter createRateAdapter()
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
   * Creates a new adapter for an object of class '{@link com.blasedef.onpa.oNPA.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.blasedef.onpa.oNPA.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
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
