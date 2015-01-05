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
   * The feature id for the '<em><b>Rates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__RATES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ExpressionImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.RateImpl <em>Rate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.RateImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getRate()
   * @generated
   */
  int RATE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATE__NAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATE__VALUE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Rate</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATE__RATE = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Rate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.SubImpl <em>Sub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.SubImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getSub()
   * @generated
   */
  int SUB = 3;

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
  int PLU = 4;

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
  int MUL = 5;

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
  int DIV = 6;

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
   * The meta object id for the '{@link com.blasedef.onpa.oNPA.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.blasedef.onpa.oNPA.impl.ConstantImpl
   * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


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
   * Returns the meta object for the containment reference list '{@link com.blasedef.onpa.oNPA.Model#getRates <em>Rates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rates</em>'.
   * @see com.blasedef.onpa.oNPA.Model#getRates()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Rates();

  /**
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Rate <em>Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rate</em>'.
   * @see com.blasedef.onpa.oNPA.Rate
   * @generated
   */
  EClass getRate();

  /**
   * Returns the meta object for the attribute '{@link com.blasedef.onpa.oNPA.Rate#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.blasedef.onpa.oNPA.Rate#getName()
   * @see #getRate()
   * @generated
   */
  EAttribute getRate_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.blasedef.onpa.oNPA.Rate#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.blasedef.onpa.oNPA.Rate#getValue()
   * @see #getRate()
   * @generated
   */
  EReference getRate_Value();

  /**
   * Returns the meta object for the reference '{@link com.blasedef.onpa.oNPA.Rate#getRate <em>Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rate</em>'.
   * @see com.blasedef.onpa.oNPA.Rate#getRate()
   * @see #getRate()
   * @generated
   */
  EReference getRate_Rate();

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
   * Returns the meta object for class '{@link com.blasedef.onpa.oNPA.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see com.blasedef.onpa.oNPA.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the attribute '{@link com.blasedef.onpa.oNPA.Constant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.blasedef.onpa.oNPA.Constant#getValue()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Value();

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
     * The meta object literal for the '<em><b>Rates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__RATES = eINSTANCE.getModel_Rates();

    /**
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.RateImpl <em>Rate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.RateImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getRate()
     * @generated
     */
    EClass RATE = eINSTANCE.getRate();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RATE__NAME = eINSTANCE.getRate_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RATE__VALUE = eINSTANCE.getRate_Value();

    /**
     * The meta object literal for the '<em><b>Rate</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RATE__RATE = eINSTANCE.getRate_Rate();

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
     * The meta object literal for the '{@link com.blasedef.onpa.oNPA.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.blasedef.onpa.oNPA.impl.ConstantImpl
     * @see com.blasedef.onpa.oNPA.impl.ONPAPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

  }

} //ONPAPackage
