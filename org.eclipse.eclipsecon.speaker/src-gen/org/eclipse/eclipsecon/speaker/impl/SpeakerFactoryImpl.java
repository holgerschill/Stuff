/**
 */
package org.eclipse.eclipsecon.speaker.impl;

import org.eclipse.eclipsecon.speaker.Speaker;
import org.eclipse.eclipsecon.speaker.SpeakerFactory;
import org.eclipse.eclipsecon.speaker.SpeakerPackage;

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
public class SpeakerFactoryImpl extends EFactoryImpl implements SpeakerFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SpeakerFactory init()
  {
    try
    {
      SpeakerFactory theSpeakerFactory = (SpeakerFactory)EPackage.Registry.INSTANCE.getEFactory(SpeakerPackage.eNS_URI);
      if (theSpeakerFactory != null)
      {
        return theSpeakerFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SpeakerFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpeakerFactoryImpl()
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
      case SpeakerPackage.PACKAGE: return createPackage();
      case SpeakerPackage.SPEAKER: return createSpeaker();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.eclipse.eclipsecon.speaker.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Speaker createSpeaker()
  {
    SpeakerImpl speaker = new SpeakerImpl();
    return speaker;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpeakerPackage getSpeakerPackage()
  {
    return (SpeakerPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SpeakerPackage getPackage()
  {
    return SpeakerPackage.eINSTANCE;
  }

} //SpeakerFactoryImpl
