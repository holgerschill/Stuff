/**
 */
package org.eclipse.eclipsecon.conference;

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
 * @see org.eclipse.eclipsecon.conference.ConferenceFactory
 * @model kind="package"
 * @generated
 */
public interface ConferencePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "conference";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/eclipsecon/Conference";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "conference";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ConferencePackage eINSTANCE = org.eclipse.eclipsecon.conference.impl.ConferencePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.eclipsecon.conference.impl.ConferenceImpl <em>Conference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.eclipsecon.conference.impl.ConferenceImpl
   * @see org.eclipse.eclipsecon.conference.impl.ConferencePackageImpl#getConference()
   * @generated
   */
  int CONFERENCE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFERENCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFERENCE__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Location</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFERENCE__LOCATION = 2;

  /**
   * The feature id for the '<em><b>Talks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFERENCE__TALKS = 3;

  /**
   * The number of structural features of the '<em>Conference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFERENCE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.eclipsecon.conference.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.eclipsecon.conference.impl.ImportImpl
   * @see org.eclipse.eclipsecon.conference.impl.ConferencePackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.eclipsecon.conference.impl.TalkImpl <em>Talk</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.eclipsecon.conference.impl.TalkImpl
   * @see org.eclipse.eclipsecon.conference.impl.ConferencePackageImpl#getTalk()
   * @generated
   */
  int TALK = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TALK__NAME = 0;

  /**
   * The feature id for the '<em><b>Speakers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TALK__SPEAKERS = 1;

  /**
   * The feature id for the '<em><b>Room</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TALK__ROOM = 2;

  /**
   * The feature id for the '<em><b>Tools</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TALK__TOOLS = 3;

  /**
   * The number of structural features of the '<em>Talk</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TALK_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link org.eclipse.eclipsecon.conference.Conference <em>Conference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conference</em>'.
   * @see org.eclipse.eclipsecon.conference.Conference
   * @generated
   */
  EClass getConference();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.eclipsecon.conference.Conference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.eclipsecon.conference.Conference#getName()
   * @see #getConference()
   * @generated
   */
  EAttribute getConference_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.eclipsecon.conference.Conference#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.eclipse.eclipsecon.conference.Conference#getImports()
   * @see #getConference()
   * @generated
   */
  EReference getConference_Imports();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.eclipsecon.conference.Conference#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Location</em>'.
   * @see org.eclipse.eclipsecon.conference.Conference#getLocation()
   * @see #getConference()
   * @generated
   */
  EReference getConference_Location();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.eclipsecon.conference.Conference#getTalks <em>Talks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Talks</em>'.
   * @see org.eclipse.eclipsecon.conference.Conference#getTalks()
   * @see #getConference()
   * @generated
   */
  EReference getConference_Talks();

  /**
   * Returns the meta object for class '{@link org.eclipse.eclipsecon.conference.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.eclipse.eclipsecon.conference.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.eclipsecon.conference.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.eclipse.eclipsecon.conference.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.eclipse.eclipsecon.conference.Talk <em>Talk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Talk</em>'.
   * @see org.eclipse.eclipsecon.conference.Talk
   * @generated
   */
  EClass getTalk();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.eclipsecon.conference.Talk#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.eclipsecon.conference.Talk#getName()
   * @see #getTalk()
   * @generated
   */
  EAttribute getTalk_Name();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.eclipsecon.conference.Talk#getSpeakers <em>Speakers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Speakers</em>'.
   * @see org.eclipse.eclipsecon.conference.Talk#getSpeakers()
   * @see #getTalk()
   * @generated
   */
  EReference getTalk_Speakers();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.eclipsecon.conference.Talk#getRoom <em>Room</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Room</em>'.
   * @see org.eclipse.eclipsecon.conference.Talk#getRoom()
   * @see #getTalk()
   * @generated
   */
  EReference getTalk_Room();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.eclipsecon.conference.Talk#getTools <em>Tools</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Tools</em>'.
   * @see org.eclipse.eclipsecon.conference.Talk#getTools()
   * @see #getTalk()
   * @generated
   */
  EReference getTalk_Tools();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ConferenceFactory getConferenceFactory();

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
     * The meta object literal for the '{@link org.eclipse.eclipsecon.conference.impl.ConferenceImpl <em>Conference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.eclipsecon.conference.impl.ConferenceImpl
     * @see org.eclipse.eclipsecon.conference.impl.ConferencePackageImpl#getConference()
     * @generated
     */
    EClass CONFERENCE = eINSTANCE.getConference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFERENCE__NAME = eINSTANCE.getConference_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFERENCE__IMPORTS = eINSTANCE.getConference_Imports();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFERENCE__LOCATION = eINSTANCE.getConference_Location();

    /**
     * The meta object literal for the '<em><b>Talks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFERENCE__TALKS = eINSTANCE.getConference_Talks();

    /**
     * The meta object literal for the '{@link org.eclipse.eclipsecon.conference.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.eclipsecon.conference.impl.ImportImpl
     * @see org.eclipse.eclipsecon.conference.impl.ConferencePackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.eclipse.eclipsecon.conference.impl.TalkImpl <em>Talk</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.eclipsecon.conference.impl.TalkImpl
     * @see org.eclipse.eclipsecon.conference.impl.ConferencePackageImpl#getTalk()
     * @generated
     */
    EClass TALK = eINSTANCE.getTalk();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TALK__NAME = eINSTANCE.getTalk_Name();

    /**
     * The meta object literal for the '<em><b>Speakers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TALK__SPEAKERS = eINSTANCE.getTalk_Speakers();

    /**
     * The meta object literal for the '<em><b>Room</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TALK__ROOM = eINSTANCE.getTalk_Room();

    /**
     * The meta object literal for the '<em><b>Tools</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TALK__TOOLS = eINSTANCE.getTalk_Tools();

  }

} //ConferencePackage
