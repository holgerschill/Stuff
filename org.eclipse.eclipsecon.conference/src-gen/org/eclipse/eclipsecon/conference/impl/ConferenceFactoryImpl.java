/**
 */
package org.eclipse.eclipsecon.conference.impl;

import org.eclipse.eclipsecon.conference.*;

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
public class ConferenceFactoryImpl extends EFactoryImpl implements ConferenceFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConferenceFactory init()
  {
    try
    {
      ConferenceFactory theConferenceFactory = (ConferenceFactory)EPackage.Registry.INSTANCE.getEFactory(ConferencePackage.eNS_URI);
      if (theConferenceFactory != null)
      {
        return theConferenceFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ConferenceFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConferenceFactoryImpl()
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
      case ConferencePackage.CONFERENCE: return createConference();
      case ConferencePackage.IMPORT: return createImport();
      case ConferencePackage.TALK: return createTalk();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conference createConference()
  {
    ConferenceImpl conference = new ConferenceImpl();
    return conference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Talk createTalk()
  {
    TalkImpl talk = new TalkImpl();
    return talk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConferencePackage getConferencePackage()
  {
    return (ConferencePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ConferencePackage getPackage()
  {
    return ConferencePackage.eINSTANCE;
  }

} //ConferenceFactoryImpl
