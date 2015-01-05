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
      case ONPAPackage.RATE: return createRate();
      case ONPAPackage.EXPRESSION: return createExpression();
      case ONPAPackage.SUB: return createSub();
      case ONPAPackage.PLU: return createPlu();
      case ONPAPackage.MUL: return createMul();
      case ONPAPackage.DIV: return createDiv();
      case ONPAPackage.CONSTANT: return createConstant();
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
  public Rate createRate()
  {
    RateImpl rate = new RateImpl();
    return rate;
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
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
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
