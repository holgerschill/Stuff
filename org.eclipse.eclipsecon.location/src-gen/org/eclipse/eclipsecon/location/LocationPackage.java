/**
 */
package org.eclipse.eclipsecon.location;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.eclipsecon.location.LocationFactory
 * @model kind="package"
 * @generated
 */
public interface LocationPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "location";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/eclipsecon/Location";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "location";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LocationPackage eINSTANCE = org.eclipse.eclipsecon.location.impl.LocationPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.eclipsecon.location.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.eclipsecon.location.impl.PackageImpl
   * @see org.eclipse.eclipsecon.location.impl.LocationPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Locations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__LOCATIONS = 1;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.eclipsecon.location.impl.LocationImpl <em>Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.eclipsecon.location.impl.LocationImpl
   * @see org.eclipse.eclipsecon.location.impl.LocationPackageImpl#getLocation()
   * @generated
   */
  int LOCATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.eclipsecon.location.impl.LocationElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.eclipsecon.location.impl.LocationElementImpl
   * @see org.eclipse.eclipsecon.location.impl.LocationPackageImpl#getLocationElement()
   * @generated
   */
  int LOCATION_ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.eclipsecon.location.impl.RoomImpl <em>Room</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.eclipsecon.location.impl.RoomImpl
   * @see org.eclipse.eclipsecon.location.impl.LocationPackageImpl#getRoom()
   * @generated
   */
  int ROOM = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOM__NAME = LOCATION_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Room</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOM_FEATURE_COUNT = LOCATION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.eclipsecon.location.impl.ToolImpl <em>Tool</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.eclipsecon.location.impl.ToolImpl
   * @see org.eclipse.eclipsecon.location.impl.LocationPackageImpl#getTool()
   * @generated
   */
  int TOOL = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOOL__NAME = LOCATION_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Tool</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOOL_FEATURE_COUNT = LOCATION_ELEMENT_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.eclipse.eclipsecon.location.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see org.eclipse.eclipsecon.location.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.eclipsecon.location.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.eclipsecon.location.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.eclipsecon.location.Package#getLocations <em>Locations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Locations</em>'.
   * @see org.eclipse.eclipsecon.location.Package#getLocations()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Locations();

  /**
   * Returns the meta object for class '{@link org.eclipse.eclipsecon.location.Location <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Location</em>'.
   * @see org.eclipse.eclipsecon.location.Location
   * @generated
   */
  EClass getLocation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.eclipsecon.location.Location#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.eclipsecon.location.Location#getName()
   * @see #getLocation()
   * @generated
   */
  EAttribute getLocation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.eclipsecon.location.Location#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.eclipse.eclipsecon.location.Location#getElements()
   * @see #getLocation()
   * @generated
   */
  EReference getLocation_Elements();

  /**
   * Returns the meta object for class '{@link org.eclipse.eclipsecon.location.LocationElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.eclipse.eclipsecon.location.LocationElement
   * @generated
   */
  EClass getLocationElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.eclipsecon.location.LocationElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.eclipsecon.location.LocationElement#getName()
   * @see #getLocationElement()
   * @generated
   */
  EAttribute getLocationElement_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.eclipsecon.location.Room <em>Room</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Room</em>'.
   * @see org.eclipse.eclipsecon.location.Room
   * @generated
   */
  EClass getRoom();

  /**
   * Returns the meta object for class '{@link org.eclipse.eclipsecon.location.Tool <em>Tool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tool</em>'.
   * @see org.eclipse.eclipsecon.location.Tool
   * @generated
   */
  EClass getTool();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LocationFactory getLocationFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.eclipsecon.location.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.eclipsecon.location.impl.PackageImpl
     * @see org.eclipse.eclipsecon.location.impl.LocationPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__LOCATIONS = eINSTANCE.getPackage_Locations();

    /**
     * The meta object literal for the '{@link org.eclipse.eclipsecon.location.impl.LocationImpl <em>Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.eclipsecon.location.impl.LocationImpl
     * @see org.eclipse.eclipsecon.location.impl.LocationPackageImpl#getLocation()
     * @generated
     */
    EClass LOCATION = eINSTANCE.getLocation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCATION__ELEMENTS = eINSTANCE.getLocation_Elements();

    /**
     * The meta object literal for the '{@link org.eclipse.eclipsecon.location.impl.LocationElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.eclipsecon.location.impl.LocationElementImpl
     * @see org.eclipse.eclipsecon.location.impl.LocationPackageImpl#getLocationElement()
     * @generated
     */
    EClass LOCATION_ELEMENT = eINSTANCE.getLocationElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION_ELEMENT__NAME = eINSTANCE.getLocationElement_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.eclipsecon.location.impl.RoomImpl <em>Room</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.eclipsecon.location.impl.RoomImpl
     * @see org.eclipse.eclipsecon.location.impl.LocationPackageImpl#getRoom()
     * @generated
     */
    EClass ROOM = eINSTANCE.getRoom();

    /**
     * The meta object literal for the '{@link org.eclipse.eclipsecon.location.impl.ToolImpl <em>Tool</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.eclipsecon.location.impl.ToolImpl
     * @see org.eclipse.eclipsecon.location.impl.LocationPackageImpl#getTool()
     * @generated
     */
    EClass TOOL = eINSTANCE.getTool();

  }

} //LocationPackage
