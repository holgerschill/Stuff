/*
 * generated by Xtext
 */
package org.eclipse.eclipsecon.scoping.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractScopingValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.eclipse.eclipsecon.scoping.scoping.ScopingPackage.eINSTANCE);
		return result;
	}
}
