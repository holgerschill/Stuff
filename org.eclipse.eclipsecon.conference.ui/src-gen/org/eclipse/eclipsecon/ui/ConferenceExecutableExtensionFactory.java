/*
 * generated by Xtext
 */
package org.eclipse.eclipsecon.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.eclipse.eclipsecon.ui.internal.ConferenceActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ConferenceExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ConferenceActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ConferenceActivator.getInstance().getInjector(ConferenceActivator.ORG_ECLIPSE_ECLIPSECON_CONFERENCE);
	}
	
}