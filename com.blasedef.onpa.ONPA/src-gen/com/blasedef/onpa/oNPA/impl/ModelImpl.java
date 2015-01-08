/**
 */
package com.blasedef.onpa.oNPA.impl;

import com.blasedef.onpa.oNPA.Model;
import com.blasedef.onpa.oNPA.ONPAPackage;
import com.blasedef.onpa.oNPA.Store;
import com.blasedef.onpa.oNPA.Term;

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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.impl.ModelImpl#getStores <em>Stores</em>}</li>
 *   <li>{@link com.blasedef.onpa.oNPA.impl.ModelImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link com.blasedef.onpa.oNPA.impl.ModelImpl#getTerms <em>Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getStores() <em>Stores</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStores()
   * @generated
   * @ordered
   */
  protected EList<Store> stores;

  /**
   * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcesses()
   * @generated
   * @ordered
   */
  protected EList<com.blasedef.onpa.oNPA.Process> processes;

  /**
   * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerms()
   * @generated
   * @ordered
   */
  protected EList<Term> terms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return ONPAPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Store> getStores()
  {
    if (stores == null)
    {
      stores = new EObjectContainmentEList<Store>(Store.class, this, ONPAPackage.MODEL__STORES);
    }
    return stores;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<com.blasedef.onpa.oNPA.Process> getProcesses()
  {
    if (processes == null)
    {
      processes = new EObjectContainmentEList<com.blasedef.onpa.oNPA.Process>(com.blasedef.onpa.oNPA.Process.class, this, ONPAPackage.MODEL__PROCESSES);
    }
    return processes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Term> getTerms()
  {
    if (terms == null)
    {
      terms = new EObjectContainmentEList<Term>(Term.class, this, ONPAPackage.MODEL__TERMS);
    }
    return terms;
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
      case ONPAPackage.MODEL__STORES:
        return ((InternalEList<?>)getStores()).basicRemove(otherEnd, msgs);
      case ONPAPackage.MODEL__PROCESSES:
        return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
      case ONPAPackage.MODEL__TERMS:
        return ((InternalEList<?>)getTerms()).basicRemove(otherEnd, msgs);
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
      case ONPAPackage.MODEL__STORES:
        return getStores();
      case ONPAPackage.MODEL__PROCESSES:
        return getProcesses();
      case ONPAPackage.MODEL__TERMS:
        return getTerms();
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
      case ONPAPackage.MODEL__STORES:
        getStores().clear();
        getStores().addAll((Collection<? extends Store>)newValue);
        return;
      case ONPAPackage.MODEL__PROCESSES:
        getProcesses().clear();
        getProcesses().addAll((Collection<? extends com.blasedef.onpa.oNPA.Process>)newValue);
        return;
      case ONPAPackage.MODEL__TERMS:
        getTerms().clear();
        getTerms().addAll((Collection<? extends Term>)newValue);
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
      case ONPAPackage.MODEL__STORES:
        getStores().clear();
        return;
      case ONPAPackage.MODEL__PROCESSES:
        getProcesses().clear();
        return;
      case ONPAPackage.MODEL__TERMS:
        getTerms().clear();
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
      case ONPAPackage.MODEL__STORES:
        return stores != null && !stores.isEmpty();
      case ONPAPackage.MODEL__PROCESSES:
        return processes != null && !processes.isEmpty();
      case ONPAPackage.MODEL__TERMS:
        return terms != null && !terms.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
