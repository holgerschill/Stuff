/*
* generated by Xtext
*/
package org.eclipse.eclipsecon;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SpeakerStandaloneSetup extends SpeakerStandaloneSetupGenerated{

	public static void doSetup() {
		new SpeakerStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

