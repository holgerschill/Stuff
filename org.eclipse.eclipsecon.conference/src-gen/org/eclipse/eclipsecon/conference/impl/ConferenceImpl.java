/**
 */
package org.eclipse.eclipsecon.conference.impl;

import java.util.Collection;

import org.eclipse.eclipsecon.conference.Conference;
import org.eclipse.eclipsecon.conference.ConferencePackage;
import org.eclipse.eclipsecon.conference.Import;
import org.eclipse.eclipsecon.conference.Talk;

import org.eclipse.eclipsecon.location.Location;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.eclipsecon.conference.impl.ConferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.eclipsecon.conference.impl.ConferenceImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.eclipsecon.conference.impl.ConferenceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.eclipsecon.conference.impl.ConferenceImpl#getTalks <em>Talks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConferenceImpl extends MinimalEObjectImpl.Container implements Conference
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
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected Location location;

  /**
   * The cached value of the '{@link #getTalks() <em>Talks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTalks()
   * @generated
   * @ordered
   */
  protected EList<Talk> talks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConferenceImpl()
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
    return ConferencePackage.Literals.CONFERENCE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.CONFERENCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, ConferencePackage.CONFERENCE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Location getLocation()
  {
    if (location != null && location.eIsProxy())
    {
      InternalEObject oldLocation = (InternalEObject)location;
      location = (Location)eResolveProxy(oldLocation);
      if (location != oldLocation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConferencePackage.CONFERENCE__LOCATION, oldLocation, location));
      }
    }
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Location basicGetLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation(Location newLocation)
  {
    Location oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.CONFERENCE__LOCATION, oldLocation, location));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Talk> getTalks()
  {
    if (talks == null)
    {
      talks = new EObjectContainmentEList<Talk>(Talk.class, this, ConferencePackage.CONFERENCE__TALKS);
    }
    return talks;
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
      case ConferencePackage.CONFERENCE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case ConferencePackage.CONFERENCE__TALKS:
        return ((InternalEList<?>)getTalks()).basicRemove(otherEnd, msgs);
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
      case ConferencePackage.CONFERENCE__NAME:
        return getName();
      case ConferencePackage.CONFERENCE__IMPORTS:
        return getImports();
      case ConferencePackage.CONFERENCE__LOCATION:
        if (resolve) return getLocation();
        return basicGetLocation();
      case ConferencePackage.CONFERENCE__TALKS:
        return getTalks();
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
      case ConferencePackage.CONFERENCE__NAME:
        setName((String)newValue);
        return;
      case ConferencePackage.CONFERENCE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case ConferencePackage.CONFERENCE__LOCATION:
        setLocation((Location)newValue);
        return;
      case ConferencePackage.CONFERENCE__TALKS:
        getTalks().clear();
        getTalks().addAll((Collection<? extends Talk>)newValue);
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
      case ConferencePackage.CONFERENCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ConferencePackage.CONFERENCE__IMPORTS:
        getImports().clear();
        return;
      case ConferencePackage.CONFERENCE__LOCATION:
        setLocation((Location)null);
        return;
      case ConferencePackage.CONFERENCE__TALKS:
        getTalks().clear();
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
      case ConferencePackage.CONFERENCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ConferencePackage.CONFERENCE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case ConferencePackage.CONFERENCE__LOCATION:
        return location != null;
      case ConferencePackage.CONFERENCE__TALKS:
        return talks != null && !talks.isEmpty();
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

} //ConferenceImpl
