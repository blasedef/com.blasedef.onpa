/**
 */
package com.blasedef.onpa.oNPA.impl;

import com.blasedef.onpa.oNPA.Evaluation;
import com.blasedef.onpa.oNPA.Evaluations;
import com.blasedef.onpa.oNPA.ONPAPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.impl.EvaluationsImpl#getEvaluations <em>Evaluations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaluationsImpl extends MinimalEObjectImpl.Container implements Evaluations
{
  /**
   * The cached value of the '{@link #getEvaluations() <em>Evaluations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluations()
   * @generated
   * @ordered
   */
  protected EList<Evaluation> evaluations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EvaluationsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ONPAPackage.Literals.EVALUATIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Evaluation> getEvaluations()
  {
    if (evaluations == null)
    {
      evaluations = new EObjectContainmentEList<Evaluation>(Evaluation.class, this, ONPAPackage.EVALUATIONS__EVALUATIONS);
    }
    return evaluations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ONPAPackage.EVALUATIONS__EVALUATIONS:
        return ((InternalEList<?>)getEvaluations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ONPAPackage.EVALUATIONS__EVALUATIONS:
        return getEvaluations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ONPAPackage.EVALUATIONS__EVALUATIONS:
        getEvaluations().clear();
        getEvaluations().addAll((Collection<? extends Evaluation>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ONPAPackage.EVALUATIONS__EVALUATIONS:
        getEvaluations().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ONPAPackage.EVALUATIONS__EVALUATIONS:
        return evaluations != null && !evaluations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EvaluationsImpl
