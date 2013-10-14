/**
 */
package org.eclipse.eclipsecon.conference.impl;

import java.util.Collection;

import org.eclipse.eclipsecon.conference.ConferencePackage;
import org.eclipse.eclipsecon.conference.Talk;

import org.eclipse.eclipsecon.location.Room;
import org.eclipse.eclipsecon.location.Tool;

import org.eclipse.eclipsecon.speaker.Speaker;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Talk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.eclipsecon.conference.impl.TalkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.eclipsecon.conference.impl.TalkImpl#getSpeakers <em>Speakers</em>}</li>
 *   <li>{@link org.eclipse.eclipsecon.conference.impl.TalkImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link org.eclipse.eclipsecon.conference.impl.TalkImpl#getTools <em>Tools</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TalkImpl extends MinimalEObjectImpl.Container implements Talk
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
   * The cached value of the '{@link #getSpeakers() <em>Speakers</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpeakers()
   * @generated
   * @ordered
   */
  protected EList<Speaker> speakers;

  /**
   * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoom()
   * @generated
   * @ordered
   */
  protected Room room;

  /**
   * The cached value of the '{@link #getTools() <em>Tools</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTools()
   * @generated
   * @ordered
   */
  protected EList<Tool> tools;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TalkImpl()
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
    return ConferencePackage.Literals.TALK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.TALK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Speaker> getSpeakers()
  {
    if (speakers == null)
    {
      speakers = new EObjectResolvingEList<Speaker>(Speaker.class, this, ConferencePackage.TALK__SPEAKERS);
    }
    return speakers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Room getRoom()
  {
    if (room != null && room.eIsProxy())
    {
      InternalEObject oldRoom = (InternalEObject)room;
      room = (Room)eResolveProxy(oldRoom);
      if (room != oldRoom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConferencePackage.TALK__ROOM, oldRoom, room));
      }
    }
    return room;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Room basicGetRoom()
  {
    return room;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoom(Room newRoom)
  {
    Room oldRoom = room;
    room = newRoom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.TALK__ROOM, oldRoom, room));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Tool> getTools()
  {
    if (tools == null)
    {
      tools = new EObjectResolvingEList<Tool>(Tool.class, this, ConferencePackage.TALK__TOOLS);
    }
    return tools;
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
      case ConferencePackage.TALK__NAME:
        return getName();
      case ConferencePackage.TALK__SPEAKERS:
        return getSpeakers();
      case ConferencePackage.TALK__ROOM:
        if (resolve) return getRoom();
        return basicGetRoom();
      case ConferencePackage.TALK__TOOLS:
        return getTools();
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
      case ConferencePackage.TALK__NAME:
        setName((String)newValue);
        return;
      case ConferencePackage.TALK__SPEAKERS:
        getSpeakers().clear();
        getSpeakers().addAll((Collection<? extends Speaker>)newValue);
        return;
      case ConferencePackage.TALK__ROOM:
        setRoom((Room)newValue);
        return;
      case ConferencePackage.TALK__TOOLS:
        getTools().clear();
        getTools().addAll((Collection<? extends Tool>)newValue);
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
      case ConferencePackage.TALK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ConferencePackage.TALK__SPEAKERS:
        getSpeakers().clear();
        return;
      case ConferencePackage.TALK__ROOM:
        setRoom((Room)null);
        return;
      case ConferencePackage.TALK__TOOLS:
        getTools().clear();
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
      case ConferencePackage.TALK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ConferencePackage.TALK__SPEAKERS:
        return speakers != null && !speakers.isEmpty();
      case ConferencePackage.TALK__ROOM:
        return room != null;
      case ConferencePackage.TALK__TOOLS:
        return tools != null && !tools.isEmpty();
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

} //TalkImpl
