/**
 */
package com.blasedef.onpa.oNPA.impl;

import com.blasedef.onpa.oNPA.Evaluations;
import com.blasedef.onpa.oNPA.ONPAPackage;
import com.blasedef.onpa.oNPA.UnicastOut;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unicast Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.impl.UnicastOutImpl#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnicastOutImpl extends ActionImpl implements UnicastOut
{
  /**
   * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluation()
   * @generated
   * @ordered
   */
  protected Evaluations evaluation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnicastOutImpl()
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
    return ONPAPackage.Literals.UNICAST_OUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Evaluations getEvaluation()
  {
    return evaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEvaluation(Evaluations newEvaluation, NotificationChain msgs)
  {
    Evaluations oldEvaluation = evaluation;
    evaluation = newEvaluation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ONPAPackage.UNICAST_OUT__EVALUATION, oldEvaluation, newEvaluation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvaluation(Evaluations newEvaluation)
  {
    if (newEvaluation != evaluation)
    {
      NotificationChain msgs = null;
      if (evaluation != null)
        msgs = ((InternalEObject)evaluation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ONPAPackage.UNICAST_OUT__EVALUATION, null, msgs);
      if (newEvaluation != null)
        msgs = ((InternalEObject)newEvaluation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ONPAPackage.UNICAST_OUT__EVALUATION, null, msgs);
      msgs = basicSetEvaluation(newEvaluation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ONPAPackage.UNICAST_OUT__EVALUATION, newEvaluation, newEvaluation));
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
      case ONPAPackage.UNICAST_OUT__EVALUATION:
        return basicSetEvaluation(null, msgs);
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
      case ONPAPackage.UNICAST_OUT__EVALUATION:
        return getEvaluation();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ONPAPackage.UNICAST_OUT__EVALUATION:
        setEvaluation((Evaluations)newValue);
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
      case ONPAPackage.UNICAST_OUT__EVALUATION:
        setEvaluation((Evaluations)null);
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
      case ONPAPackage.UNICAST_OUT__EVALUATION:
        return evaluation != null;
    }
    return super.eIsSet(featureID);
  }

} //UnicastOutImpl
