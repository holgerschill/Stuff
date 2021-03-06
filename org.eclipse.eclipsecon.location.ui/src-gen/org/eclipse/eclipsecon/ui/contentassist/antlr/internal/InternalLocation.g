/*
* generated by Xtext
*/
grammar InternalLocation;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.eclipse.eclipsecon.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipse.eclipsecon.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.eclipsecon.services.LocationGrammarAccess;

}

@parser::members {
 
 	private LocationGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(LocationGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRulePackage
entryRulePackage 
:
{ before(grammarAccess.getPackageRule()); }
	 rulePackage
{ after(grammarAccess.getPackageRule()); } 
	 EOF 
;

// Rule Package
rulePackage
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPackageAccess().getGroup()); }
(rule__Package__Group__0)
{ after(grammarAccess.getPackageAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLocation
entryRuleLocation 
:
{ before(grammarAccess.getLocationRule()); }
	 ruleLocation
{ after(grammarAccess.getLocationRule()); } 
	 EOF 
;

// Rule Location
ruleLocation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLocationAccess().getGroup()); }
(rule__Location__Group__0)
{ after(grammarAccess.getLocationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLocationElement
entryRuleLocationElement 
:
{ before(grammarAccess.getLocationElementRule()); }
	 ruleLocationElement
{ after(grammarAccess.getLocationElementRule()); } 
	 EOF 
;

// Rule LocationElement
ruleLocationElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLocationElementAccess().getAlternatives()); }
(rule__LocationElement__Alternatives)
{ after(grammarAccess.getLocationElementAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRoom
entryRuleRoom 
:
{ before(grammarAccess.getRoomRule()); }
	 ruleRoom
{ after(grammarAccess.getRoomRule()); } 
	 EOF 
;

// Rule Room
ruleRoom
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRoomAccess().getGroup()); }
(rule__Room__Group__0)
{ after(grammarAccess.getRoomAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTool
entryRuleTool 
:
{ before(grammarAccess.getToolRule()); }
	 ruleTool
{ after(grammarAccess.getToolRule()); } 
	 EOF 
;

// Rule Tool
ruleTool
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getToolAccess().getGroup()); }
(rule__Tool__Group__0)
{ after(grammarAccess.getToolAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFQN
entryRuleFQN 
:
{ before(grammarAccess.getFQNRule()); }
	 ruleFQN
{ after(grammarAccess.getFQNRule()); } 
	 EOF 
;

// Rule FQN
ruleFQN
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFQNAccess().getGroup()); }
(rule__FQN__Group__0)
{ after(grammarAccess.getFQNAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__LocationElement__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocationElementAccess().getRoomParserRuleCall_0()); }
	ruleRoom
{ after(grammarAccess.getLocationElementAccess().getRoomParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getLocationElementAccess().getToolParserRuleCall_1()); }
	ruleTool
{ after(grammarAccess.getLocationElementAccess().getToolParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Package__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__0__Impl
	rule__Package__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getPackageKeyword_0()); }

	'package' 

{ after(grammarAccess.getPackageAccess().getPackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__1__Impl
	rule__Package__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getNameAssignment_1()); }
(rule__Package__NameAssignment_1)
{ after(grammarAccess.getPackageAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getLocationsAssignment_2()); }
(rule__Package__LocationsAssignment_2)*
{ after(grammarAccess.getPackageAccess().getLocationsAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Location__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Location__Group__0__Impl
	rule__Location__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Location__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocationAccess().getLocationKeyword_0()); }

	'location' 

{ after(grammarAccess.getLocationAccess().getLocationKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Location__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Location__Group__1__Impl
	rule__Location__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Location__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocationAccess().getNameAssignment_1()); }
(rule__Location__NameAssignment_1)
{ after(grammarAccess.getLocationAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Location__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Location__Group__2__Impl
	rule__Location__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Location__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Location__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Location__Group__3__Impl
	rule__Location__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Location__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocationAccess().getElementsAssignment_3()); }
(rule__Location__ElementsAssignment_3)*
{ after(grammarAccess.getLocationAccess().getElementsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Location__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Location__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Location__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Room__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Room__Group__0__Impl
	rule__Room__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRoomAccess().getRoomKeyword_0()); }

	'room' 

{ after(grammarAccess.getRoomAccess().getRoomKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Room__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Room__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRoomAccess().getNameAssignment_1()); }
(rule__Room__NameAssignment_1)
{ after(grammarAccess.getRoomAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Tool__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Tool__Group__0__Impl
	rule__Tool__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Tool__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getToolAccess().getToolKeyword_0()); }

	'tool' 

{ after(grammarAccess.getToolAccess().getToolKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Tool__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Tool__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Tool__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getToolAccess().getNameAssignment_1()); }
(rule__Tool__NameAssignment_1)
{ after(grammarAccess.getToolAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__FQN__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FQN__Group__0__Impl
	rule__FQN__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FQN__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FQN__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFQNAccess().getGroup_1()); }
(rule__FQN__Group_1__0)*
{ after(grammarAccess.getFQNAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__FQN__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FQN__Group_1__0__Impl
	rule__FQN__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FQN__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FQN__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Package__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_1_0()); }
	ruleFQN{ after(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Package__LocationsAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getLocationsLocationParserRuleCall_2_0()); }
	ruleLocation{ after(grammarAccess.getPackageAccess().getLocationsLocationParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Location__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocationAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getLocationAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Location__ElementsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLocationAccess().getElementsLocationElementParserRuleCall_3_0()); }
	ruleLocationElement{ after(grammarAccess.getLocationAccess().getElementsLocationElementParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Room__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRoomAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getRoomAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Tool__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getToolAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getToolAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


