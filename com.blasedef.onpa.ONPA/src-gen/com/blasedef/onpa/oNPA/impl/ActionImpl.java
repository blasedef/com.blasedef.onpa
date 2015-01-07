/**
 */
package com.blasedef.onpa.oNPA.impl;

import com.blasedef.onpa.oNPA.Action;
import com.blasedef.onpa.oNPA.ONPAPackage;
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
 *   <li>{@link com.blasedef.onpa.oNPA.impl.ActionImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link com.blasedef.onpa.oNPA.impl.ActionImpl#getUpdate <em>Update</em>}</li>
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
   * The default value of the '{@link #getPredicate() <em>Predicate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicate()
   * @generated
   * @ordered
   */
  protected static final String PREDICATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicate()
   * @generated
   * @ordered
   */
  protected String predicate = PREDICATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getUpdate() <em>Update</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdate()
   * @generated
   * @ordered
   */
  protected Updates update;

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
  public String getPredicate()
  {
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredicate(String newPredicate)
  {
    String oldPredicate = predicate;
    predicate = newPredicate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ONPAPackage.ACTION__PREDICATE, oldPredicate, predicate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Updates getUpdate()
  {
    return update;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpdate(Updates newUpdate, NotificationChain msgs)
  {
    Updates oldUpdate = update;
    update = newUpdate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ONPAPackage.ACTION__UPDATE, oldUpdate, newUpdate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdate(Updates newUpdate)
  {
    if (newUpdate != update)
    {
      NotificationChain msgs = null;
      if (update != null)
        msgs = ((InternalEObject)update).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ONPAPackage.ACTION__UPDATE, null, msgs);
      if (newUpdate != null)
        msgs = ((InternalEObject)newUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ONPAPackage.ACTION__UPDATE, null, msgs);
      msgs = basicSetUpdate(newUpdate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ONPAPackage.ACTION__UPDATE, newUpdate, newUpdate));
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
      case ONPAPackage.ACTION__UPDATE:
        return basicSetUpdate(null, msgs);
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
      case ONPAPackage.ACTION__PREDICATE:
        return getPredicate();
      case ONPAPackage.ACTION__UPDATE:
        return getUpdate();
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
      case ONPAPackage.ACTION__PREDICATE:
        setPredicate((String)newValue);
        return;
      case ONPAPackage.ACTION__UPDATE:
        setUpdate((Updates)newValue);
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
      case ONPAPackage.ACTION__PREDICATE:
        setPredicate(PREDICATE_EDEFAULT);
        return;
      case ONPAPackage.ACTION__UPDATE:
        setUpdate((Updates)null);
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
      case ONPAPackage.ACTION__PREDICATE:
        return PREDICATE_EDEFAULT == null ? predicate != null : !PREDICATE_EDEFAULT.equals(predicate);
      case ONPAPackage.ACTION__UPDATE:
        return update != null;
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
    result.append(", predicate: ");
    result.append(predicate);
    result.append(')');
    return result.toString();
  }

} //ActionImpl
