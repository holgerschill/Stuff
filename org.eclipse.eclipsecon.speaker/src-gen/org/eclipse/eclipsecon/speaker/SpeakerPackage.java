/**
 */
package org.eclipse.eclipsecon.speaker;

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
 * @see org.eclipse.eclipsecon.speaker.SpeakerFactory
 * @model kind="package"
 * @generated
 */
public interface SpeakerPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "speaker";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/eclipsecon/Speaker";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "speaker";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpeakerPackage eINSTANCE = org.eclipse.eclipsecon.speaker.impl.SpeakerPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.eclipsecon.speaker.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.eclipsecon.speaker.impl.PackageImpl
   * @see org.eclipse.eclipsecon.speaker.impl.SpeakerPackageImpl#getPackage()
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
   * The feature id for the '<em><b>Speakers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__SPEAKERS = 1;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.eclipsecon.speaker.impl.SpeakerImpl <em>Speaker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.eclipsecon.speaker.impl.SpeakerImpl
   * @see org.eclipse.eclipsecon.speaker.impl.SpeakerPackageImpl#getSpeaker()
   * @generated
   */
  int SPEAKER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEAKER__NAME = 0;

  /**
   * The number of structural features of the '<em>Speaker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEAKER_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.eclipse.eclipsecon.speaker.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see org.eclipse.eclipsecon.speaker.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.eclipsecon.speaker.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.eclipsecon.speaker.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.eclipsecon.speaker.Package#getSpeakers <em>Speakers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Speakers</em>'.
   * @see org.eclipse.eclipsecon.speaker.Package#getSpeakers()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Speakers();

  /**
   * Returns the meta object for class '{@link org.eclipse.eclipsecon.speaker.Speaker <em>Speaker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Speaker</em>'.
   * @see org.eclipse.eclipsecon.speaker.Speaker
   * @generated
   */
  EClass getSpeaker();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.eclipsecon.speaker.Speaker#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.eclipsecon.speaker.Speaker#getName()
   * @see #getSpeaker()
   * @generated
   */
  EAttribute getSpeaker_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SpeakerFactory getSpeakerFactory();

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
     * The meta object literal for the '{@link org.eclipse.eclipsecon.speaker.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.eclipsecon.speaker.impl.PackageImpl
     * @see org.eclipse.eclipsecon.speaker.impl.SpeakerPackageImpl#getPackage()
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
     * The meta object literal for the '<em><b>Speakers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__SPEAKERS = eINSTANCE.getPackage_Speakers();

    /**
     * The meta object literal for the '{@link org.eclipse.eclipsecon.speaker.impl.SpeakerImpl <em>Speaker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.eclipsecon.speaker.impl.SpeakerImpl
     * @see org.eclipse.eclipsecon.speaker.impl.SpeakerPackageImpl#getSpeaker()
     * @generated
     */
    EClass SPEAKER = eINSTANCE.getSpeaker();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPEAKER__NAME = eINSTANCE.getSpeaker_Name();

  }

} //SpeakerPackage
