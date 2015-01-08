/**
 */
package com.blasedef.onpa.oNPA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Updates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.Updates#getUpdates <em>Updates</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blasedef.onpa.oNPA.ONPAPackage#getUpdates()
 * @model
 * @generated
 */
public interface Updates extends EObject
{
  /**
   * Returns the value of the '<em><b>Updates</b></em>' containment reference list.
   * The list contents are of type {@link com.blasedef.onpa.oNPA.UpdateExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Updates</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updates</em>' containment reference list.
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getUpdates_Updates()
   * @model containment="true"
   * @generated
   */
  EList<UpdateExpression> getUpdates();

} // Updates
