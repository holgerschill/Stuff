/*
* generated by Xtext
*/
package org.eclipse.eclipsecon.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SpeakerAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.tokens");
	}
}