/**
 */
package org.eclipse.eclipsecon.scoping.scoping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.eclipsecon.scoping.scoping.Model#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link org.eclipse.eclipsecon.scoping.scoping.Model#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eclipsecon.scoping.scoping.ScopingPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import URI</em>' attribute.
   * @see #setImportURI(String)
   * @see org.eclipse.eclipsecon.scoping.scoping.ScopingPackage#getModel_ImportURI()
   * @model
   * @generated
   */
  String getImportURI();

  /**
   * Sets the value of the '{@link org.eclipse.eclipsecon.scoping.scoping.Model#getImportURI <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import URI</em>' attribute.
   * @see #getImportURI()
   * @generated
   */
  void setImportURI(String value);

  /**
   * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.eclipsecon.scoping.scoping.Package}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packages</em>' containment reference list.
   * @see org.eclipse.eclipsecon.scoping.scoping.ScopingPackage#getModel_Packages()
   * @model containment="true"
   * @generated
   */
  EList<org.eclipse.eclipsecon.scoping.scoping.Package> getPackages();

} // Model
