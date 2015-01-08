/**
 */
package com.blasedef.onpa.oNPA.impl;

import com.blasedef.onpa.oNPA.Action;
import com.blasedef.onpa.oNPA.Evaluations;
import com.blasedef.onpa.oNPA.ONPAPackage;
import com.blasedef.onpa.oNPA.Predicate;
import com.blasedef.onpa.oNPA.Updates;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.blasedef.onpa.oNPA.impl.ActionImpl#getPredicates <em>Predicates</em>}</li>
 *   <li>{@link com.blasedef.onpa.oNPA.impl.ActionImpl#getEvaluations <em>Evaluations</em>}</li>
 *   <li>{@link com.blasedef.onpa.oNPA.impl.ActionImpl#getUpdates <em>Updates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPredicates() <em>Predicates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicates()
   * @generated
   * @ordered
   */
  protected Predicate predicates;

  /**
   * The cached value of the '{@link #getEvaluations() <em>Evaluations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluations()
   * @generated
   * @ordered
   */
  protected Evaluations evaluations;

  /**
   * The cached value of the '{@link #getUpdates() <em>Updates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdates()
   * @generated
   * @ordered
   */
  protected Updates updates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return ONPAPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ONPAPackage.ACTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Predicate getPredicates()
  {
    return predicates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredicates(Predicate newPredicates, NotificationChain msgs)
  {
    Predicate oldPredicates = predicates;
    predicates = newPredicates;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ONPAPackage.ACTION__PREDICATES, oldPredicates, newPredicates);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredicates(Predicate newPredicates)
  {
    if (newPredicates != predicates)
    {
      NotificationChain msgs = null;
      if (predicates != null)
        msgs = ((InternalEObject)predicates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ONPAPackage.ACTION__PREDICATES, null, msgs);
      if (newPredicates != null)
        msgs = ((InternalEObject)newPredicates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ONPAPackage.ACTION__PREDICATES, null, msgs);
      msgs = basicSetPredicates(newPredicates, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ONPAPackage.ACTION__PREDICATES, newPredicates, newPredicates));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Evaluations getEvaluations()
  {
    return evaluations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEvaluations(Evaluations newEvaluations, NotificationChain msgs)
  {
    Evaluations oldEvaluations = evaluations;
    evaluations = newEvaluations;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ONPAPackage.ACTION__EVALUATIONS, oldEvaluations, newEvaluations);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvaluations(Evaluations newEvaluations)
  {
    if (newEvaluations != evaluations)
    {
      NotificationChain msgs = null;
      if (evaluations != null)
        msgs = ((InternalEObject)evaluations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ONPAPackage.ACTION__EVALUATIONS, null, msgs);
      if (newEvaluations != null)
        msgs = ((InternalEObject)newEvaluations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ONPAPackage.ACTION__EVALUATIONS, null, msgs);
      msgs = basicSetEvaluations(newEvaluations, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ONPAPackage.ACTION__EVALUATIONS, newEvaluations, newEvaluations));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Updates getUpdates()
  {
    return updates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpdates(Updates newUpdates, NotificationChain msgs)
  {
    Updates oldUpdates = updates;
    updates = newUpdates;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ONPAPackage.ACTION__UPDATES, oldUpdates, newUpdates);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdates(Updates newUpdates)
  {
    if (newUpdates != updates)
    {
      NotificationChain msgs = null;
      if (updates != null)
        msgs = ((InternalEObject)updates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ONPAPackage.ACTION__UPDATES, null, msgs);
      if (newUpdates != null)
        msgs = ((InternalEObject)newUpdates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ONPAPackage.ACTION__UPDATES, null, msgs);
      msgs = basicSetUpdates(newUpdates, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ONPAPackage.ACTION__UPDATES, newUpdates, newUpdates));
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
      case ONPAPackage.ACTION__PREDICATES:
        return basicSetPredicates(null, msgs);
      case ONPAPackage.ACTION__EVALUATIONS:
        return basicSetEvaluations(null, msgs);
      case ONPAPackage.ACTION__UPDATES:
        return basicSetUpdates(null, msgs);
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
      case ONPAPackage.ACTION__NAME:
        return getName();
      case ONPAPackage.ACTION__PREDICATES:
        return getPredicates();
      case ONPAPackage.ACTION__EVALUATIONS:
        return getEvaluations();
      case ONPAPackage.ACTION__UPDATES:
        return getUpdates();
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
      case ONPAPackage.ACTION__NAME:
        setName((String)newValue);
        return;
      case ONPAPackage.ACTION__PREDICATES:
        setPredicates((Predicate)newValue);
        return;
      case ONPAPackage.ACTION__EVALUATIONS:
        setEvaluations((Evaluations)newValue);
        return;
      case ONPAPackage.ACTION__UPDATES:
        setUpdates((Updates)newValue);
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
      case ONPAPackage.ACTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ONPAPackage.ACTION__PREDICATES:
        setPredicates((Predicate)null);
        return;
      case ONPAPackage.ACTION__EVALUATIONS:
        setEvaluations((Evaluations)null);
        return;
      case ONPAPackage.ACTION__UPDATES:
        setUpdates((Updates)null);
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
      case ONPAPackage.ACTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ONPAPackage.ACTION__PREDICATES:
        return predicates != null;
      case ONPAPackage.ACTION__EVALUATIONS:
        return evaluations != null;
      case ONPAPackage.ACTION__UPDATES:
        return updates != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ActionImpl
