/**
 */
package org.eclipse.eclipsecon.conference;

import org.eclipse.eclipsecon.location.Room;
import org.eclipse.eclipsecon.location.Tool;

import org.eclipse.eclipsecon.speaker.Speaker;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Talk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.eclipsecon.conference.Talk#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.eclipsecon.conference.Talk#getSpeakers <em>Speakers</em>}</li>
 *   <li>{@link org.eclipse.eclipsecon.conference.Talk#getRoom <em>Room</em>}</li>
 *   <li>{@link org.eclipse.eclipsecon.conference.Talk#getTools <em>Tools</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eclipsecon.conference.ConferencePackage#getTalk()
 * @model
 * @generated
 */
public interface Talk extends EObject
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
   * @see org.eclipse.eclipsecon.conference.ConferencePackage#getTalk_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.eclipsecon.conference.Talk#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Speakers</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.eclipsecon.speaker.Speaker}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Speakers</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Speakers</em>' reference list.
   * @see org.eclipse.eclipsecon.conference.ConferencePackage#getTalk_Speakers()
   * @model
   * @generated
   */
  EList<Speaker> getSpeakers();

  /**
   * Returns the value of the '<em><b>Room</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Room</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Room</em>' reference.
   * @see #setRoom(Room)
   * @see org.eclipse.eclipsecon.conference.ConferencePackage#getTalk_Room()
   * @model
   * @generated
   */
  Room getRoom();

  /**
   * Sets the value of the '{@link org.eclipse.eclipsecon.conference.Talk#getRoom <em>Room</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Room</em>' reference.
   * @see #getRoom()
   * @generated
   */
  void setRoom(Room value);

  /**
   * Returns the value of the '<em><b>Tools</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.eclipsecon.location.Tool}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tools</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tools</em>' reference list.
   * @see org.eclipse.eclipsecon.conference.ConferencePackage#getTalk_Tools()
   * @model
   * @generated
   */
  EList<Tool> getTools();

} // Talk
