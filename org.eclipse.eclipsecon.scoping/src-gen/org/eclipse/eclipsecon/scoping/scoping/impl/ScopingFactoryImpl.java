/**
 */
package org.eclipse.eclipsecon.scoping.scoping.impl;

import org.eclipse.eclipsecon.scoping.scoping.Element;
import org.eclipse.eclipsecon.scoping.scoping.Import;
import org.eclipse.eclipsecon.scoping.scoping.Model;
import org.eclipse.eclipsecon.scoping.scoping.ScopingFactory;
import org.eclipse.eclipsecon.scoping.scoping.ScopingPackage;

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
public class ScopingFactoryImpl extends EFactoryImpl implements ScopingFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ScopingFactory init()
  {
    try
    {
      ScopingFactory theScopingFactory = (ScopingFactory)EPackage.Registry.INSTANCE.getEFactory(ScopingPackage.eNS_URI);
      if (theScopingFactory != null)
      {
        return theScopingFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ScopingFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopingFactoryImpl()
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
      case ScopingPackage.MODEL: return createModel();
      case ScopingPackage.PACKAGE: return createPackage();
      case ScopingPackage.IMPORT: return createImport();
      case ScopingPackage.ELEMENT: return createElement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.eclipse.eclipsecon.scoping.scoping.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
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
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopingPackage getScopingPackage()
  {
    return (ScopingPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ScopingPackage getPackage()
  {
    return ScopingPackage.eINSTANCE;
  }

} //ScopingFactoryImpl
