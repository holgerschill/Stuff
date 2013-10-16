/*
* generated by Xtext
*/
package org.eclipse.eclipsecon.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.eclipsecon.services.ConferenceGrammarAccess;

public class ConferenceParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ConferenceGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.eclipsecon.parser.antlr.internal.InternalConferenceParser createParser(XtextTokenStream stream) {
		return new org.eclipse.eclipsecon.parser.antlr.internal.InternalConferenceParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Conference";
	}
	
	public ConferenceGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ConferenceGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}