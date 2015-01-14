/**
 */
package com.blasedef.onpa.oNPA.impl;

import com.blasedef.onpa.oNPA.ONPAPackage;
import com.blasedef.onpa.oNPA.SelfReferencedStore;
import com.blasedef.onpa.oNPA.Store;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self Referenced Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.impl.SelfReferencedStoreImpl#getStore <em>Store</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelfReferencedStoreImpl extends MinimalEObjectImpl.Container implements SelfReferencedStore
{
  /**
   * The cached value of the '{@link #getStore() <em>Store</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStore()
   * @generated
   * @ordered
   */
  protected Store store;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelfReferencedStoreImpl()
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
    return ONPAPackage.Literals.SELF_REFERENCED_STORE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Store getStore()
  {
    if (store != null && store.eIsProxy())
    {
      InternalEObject oldStore = (InternalEObject)store;
      store = (Store)eResolveProxy(oldStore);
      if (store != oldStore)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ONPAPackage.SELF_REFERENCED_STORE__STORE, oldStore, store));
      }
    }
    return store;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Store basicGetStore()
  {
    return store;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStore(Store newStore)
  {
    Store oldStore = store;
    store = newStore;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ONPAPackage.SELF_REFERENCED_STORE__STORE, oldStore, store));
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
      case ONPAPackage.SELF_REFERENCED_STORE__STORE:
        if (resolve) return getStore();
        return basicGetStore();
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
      case ONPAPackage.SELF_REFERENCED_STORE__STORE:
        setStore((Store)newValue);
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
      case ONPAPackage.SELF_REFERENCED_STORE__STORE:
        setStore((Store)null);
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
      case ONPAPackage.SELF_REFERENCED_STORE__STORE:
        return store != null;
    }
    return super.eIsSet(featureID);
  }

} //SelfReferencedStoreImpl
