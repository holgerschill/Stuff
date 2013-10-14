/**
 */
package org.eclipse.eclipsecon.location.impl;

import org.eclipse.eclipsecon.location.Location;
import org.eclipse.eclipsecon.location.LocationElement;
import org.eclipse.eclipsecon.location.LocationFactory;
import org.eclipse.eclipsecon.location.LocationPackage;
import org.eclipse.eclipsecon.location.Room;
import org.eclipse.eclipsecon.location.Tool;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocationFactoryImpl extends EFactoryImpl implements LocationFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LocationFactory init()
  {
    try
    {
      LocationFactory theLocationFactory = (LocationFactory)EPackage.Registry.INSTANCE.getEFactory(LocationPackage.eNS_URI);
      if (theLocationFactory != null)
      {
        return theLocationFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LocationFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LocationPackage.PACKAGE: return createPackage();
      case LocationPackage.LOCATION: return createLocation();
      case LocationPackage.LOCATION_ELEMENT: return createLocationElement();
      case LocationPackage.ROOM: return createRoom();
      case LocationPackage.TOOL: return createTool();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.eclipse.eclipsecon.location.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Location createLocation()
  {
    LocationImpl location = new LocationImpl();
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationElement createLocationElement()
  {
    LocationElementImpl locationElement = new LocationElementImpl();
    return locationElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Room createRoom()
  {
    RoomImpl room = new RoomImpl();
    return room;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tool createTool()
  {
    ToolImpl tool = new ToolImpl();
    return tool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationPackage getLocationPackage()
  {
    return (LocationPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LocationPackage getPackage()
  {
    return LocationPackage.eINSTANCE;
  }

} //LocationFactoryImpl
