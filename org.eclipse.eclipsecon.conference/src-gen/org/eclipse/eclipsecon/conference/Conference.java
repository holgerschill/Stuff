/**
 */
package org.eclipse.eclipsecon.conference;

import org.eclipse.eclipsecon.location.Location;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.eclipsecon.conference.Conference#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.eclipsecon.conference.Conference#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.eclipsecon.conference.Conference#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.eclipsecon.conference.Conference#getTalks <em>Talks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eclipsecon.conference.ConferencePackage#getConference()
 * @model
 * @generated
 */
public interface Conference extends EObject
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
   * @see org.eclipse.eclipsecon.conference.ConferencePackage#getConference_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.eclipsecon.conference.Conference#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.eclipsecon.conference.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.eclipse.eclipsecon.conference.ConferencePackage#getConference_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Location</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' reference.
   * @see #setLocation(Location)
   * @see org.eclipse.eclipsecon.conference.ConferencePackage#getConference_Location()
   * @model
   * @generated
   */
  Location getLocation();

  /**
   * Sets the value of the '{@link org.eclipse.eclipsecon.conference.Conference#getLocation <em>Location</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(Location value);

  /**
   * Returns the value of the '<em><b>Talks</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.eclipsecon.conference.Talk}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Talks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Talks</em>' containment reference list.
   * @see org.eclipse.eclipsecon.conference.ConferencePackage#getConference_Talks()
   * @model containment="true"
   * @generated
   */
  EList<Talk> getTalks();

} // Conference
