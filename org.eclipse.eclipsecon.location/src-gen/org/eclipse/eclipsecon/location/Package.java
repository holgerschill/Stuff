/**
 */
package org.eclipse.eclipsecon.location;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.eclipsecon.location.Package#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.eclipsecon.location.Package#getLocations <em>Locations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eclipsecon.location.LocationPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.eclipsecon.location.LocationPackage#getPackage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.eclipsecon.location.Package#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.eclipsecon.location.Location}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locations</em>' containment reference list.
   * @see org.eclipse.eclipsecon.location.LocationPackage#getPackage_Locations()
   * @model containment="true"
   * @generated
   */
  EList<Location> getLocations();

} // Package
