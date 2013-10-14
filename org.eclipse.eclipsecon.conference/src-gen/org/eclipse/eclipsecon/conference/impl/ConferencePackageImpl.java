/**
 */
package org.eclipse.eclipsecon.conference.impl;

import org.eclipse.eclipsecon.conference.Conference;
import org.eclipse.eclipsecon.conference.ConferenceFactory;
import org.eclipse.eclipsecon.conference.ConferencePackage;
import org.eclipse.eclipsecon.conference.Import;
import org.eclipse.eclipsecon.conference.Talk;

import org.eclipse.eclipsecon.location.LocationPackage;

import org.eclipse.eclipsecon.speaker.SpeakerPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConferencePackageImpl extends EPackageImpl implements ConferencePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass talkEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.eclipsecon.conference.ConferencePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ConferencePackageImpl()
  {
    super(eNS_URI, ConferenceFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ConferencePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ConferencePackage init()
  {
    if (isInited) return (ConferencePackage)EPackage.Registry.INSTANCE.getEPackage(ConferencePackage.eNS_URI);

    // Obtain or create and register package
    ConferencePackageImpl theConferencePackage = (ConferencePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConferencePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConferencePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    LocationPackage.eINSTANCE.eClass();
    SpeakerPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theConferencePackage.createPackageContents();

    // Initialize created meta-data
    theConferencePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theConferencePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ConferencePackage.eNS_URI, theConferencePackage);
    return theConferencePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConference()
  {
    return conferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConference_Name()
  {
    return (EAttribute)conferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConference_Imports()
  {
    return (EReference)conferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConference_Location()
  {
    return (EReference)conferenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConference_Talks()
  {
    return (EReference)conferenceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTalk()
  {
    return talkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTalk_Name()
  {
    return (EAttribute)talkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTalk_Speakers()
  {
    return (EReference)talkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTalk_Room()
  {
    return (EReference)talkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTalk_Tools()
  {
    return (EReference)talkEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConferenceFactory getConferenceFactory()
  {
    return (ConferenceFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    conferenceEClass = createEClass(CONFERENCE);
    createEAttribute(conferenceEClass, CONFERENCE__NAME);
    createEReference(conferenceEClass, CONFERENCE__IMPORTS);
    createEReference(conferenceEClass, CONFERENCE__LOCATION);
    createEReference(conferenceEClass, CONFERENCE__TALKS);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    talkEClass = createEClass(TALK);
    createEAttribute(talkEClass, TALK__NAME);
    createEReference(talkEClass, TALK__SPEAKERS);
    createEReference(talkEClass, TALK__ROOM);
    createEReference(talkEClass, TALK__TOOLS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    LocationPackage theLocationPackage = (LocationPackage)EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI);
    SpeakerPackage theSpeakerPackage = (SpeakerPackage)EPackage.Registry.INSTANCE.getEPackage(SpeakerPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(conferenceEClass, Conference.class, "Conference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConference_Name(), ecorePackage.getEString(), "name", null, 0, 1, Conference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConference_Imports(), this.getImport(), null, "imports", null, 0, -1, Conference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConference_Location(), theLocationPackage.getLocation(), null, "location", null, 0, 1, Conference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConference_Talks(), this.getTalk(), null, "talks", null, 0, -1, Conference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(talkEClass, Talk.class, "Talk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTalk_Name(), ecorePackage.getEString(), "name", null, 0, 1, Talk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTalk_Speakers(), theSpeakerPackage.getSpeaker(), null, "speakers", null, 0, -1, Talk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTalk_Room(), theLocationPackage.getRoom(), null, "room", null, 0, 1, Talk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTalk_Tools(), theLocationPackage.getTool(), null, "tools", null, 0, -1, Talk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ConferencePackageImpl
