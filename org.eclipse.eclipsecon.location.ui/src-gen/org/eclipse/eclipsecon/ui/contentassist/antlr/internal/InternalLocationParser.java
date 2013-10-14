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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLocationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'location'", "'{'", "'}'", "'room'", "'tool'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalLocationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLocationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLocationParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g"; }


     
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




    // $ANTLR start "entryRulePackage"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:60:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:61:1: ( rulePackage EOF )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:62:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage61);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:69:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:73:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:74:1: ( ( rule__Package__Group__0 ) )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:74:1: ( ( rule__Package__Group__0 ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:75:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:76:1: ( rule__Package__Group__0 )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:76:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage94);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleLocation"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:88:1: entryRuleLocation : ruleLocation EOF ;
    public final void entryRuleLocation() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:89:1: ( ruleLocation EOF )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:90:1: ruleLocation EOF
            {
             before(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_ruleLocation_in_entryRuleLocation121);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getLocationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocation128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:97:1: ruleLocation : ( ( rule__Location__Group__0 ) ) ;
    public final void ruleLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:101:2: ( ( ( rule__Location__Group__0 ) ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:102:1: ( ( rule__Location__Group__0 ) )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:102:1: ( ( rule__Location__Group__0 ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:103:1: ( rule__Location__Group__0 )
            {
             before(grammarAccess.getLocationAccess().getGroup()); 
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:104:1: ( rule__Location__Group__0 )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:104:2: rule__Location__Group__0
            {
            pushFollow(FOLLOW_rule__Location__Group__0_in_ruleLocation154);
            rule__Location__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleLocationElement"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:116:1: entryRuleLocationElement : ruleLocationElement EOF ;
    public final void entryRuleLocationElement() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:117:1: ( ruleLocationElement EOF )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:118:1: ruleLocationElement EOF
            {
             before(grammarAccess.getLocationElementRule()); 
            pushFollow(FOLLOW_ruleLocationElement_in_entryRuleLocationElement181);
            ruleLocationElement();

            state._fsp--;

             after(grammarAccess.getLocationElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocationElement188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocationElement"


    // $ANTLR start "ruleLocationElement"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:125:1: ruleLocationElement : ( ( rule__LocationElement__Alternatives ) ) ;
    public final void ruleLocationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:129:2: ( ( ( rule__LocationElement__Alternatives ) ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:130:1: ( ( rule__LocationElement__Alternatives ) )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:130:1: ( ( rule__LocationElement__Alternatives ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:131:1: ( rule__LocationElement__Alternatives )
            {
             before(grammarAccess.getLocationElementAccess().getAlternatives()); 
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:132:1: ( rule__LocationElement__Alternatives )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:132:2: rule__LocationElement__Alternatives
            {
            pushFollow(FOLLOW_rule__LocationElement__Alternatives_in_ruleLocationElement214);
            rule__LocationElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLocationElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocationElement"


    // $ANTLR start "entryRuleRoom"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:144:1: entryRuleRoom : ruleRoom EOF ;
    public final void entryRuleRoom() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:145:1: ( ruleRoom EOF )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:146:1: ruleRoom EOF
            {
             before(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_ruleRoom_in_entryRuleRoom241);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getRoomRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoom248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:153:1: ruleRoom : ( ( rule__Room__Group__0 ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:157:2: ( ( ( rule__Room__Group__0 ) ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:158:1: ( ( rule__Room__Group__0 ) )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:158:1: ( ( rule__Room__Group__0 ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:159:1: ( rule__Room__Group__0 )
            {
             before(grammarAccess.getRoomAccess().getGroup()); 
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:160:1: ( rule__Room__Group__0 )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:160:2: rule__Room__Group__0
            {
            pushFollow(FOLLOW_rule__Room__Group__0_in_ruleRoom274);
            rule__Room__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleTool"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:172:1: entryRuleTool : ruleTool EOF ;
    public final void entryRuleTool() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:173:1: ( ruleTool EOF )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:174:1: ruleTool EOF
            {
             before(grammarAccess.getToolRule()); 
            pushFollow(FOLLOW_ruleTool_in_entryRuleTool301);
            ruleTool();

            state._fsp--;

             after(grammarAccess.getToolRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTool308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTool"


    // $ANTLR start "ruleTool"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:181:1: ruleTool : ( ( rule__Tool__Group__0 ) ) ;
    public final void ruleTool() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:185:2: ( ( ( rule__Tool__Group__0 ) ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:186:1: ( ( rule__Tool__Group__0 ) )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:186:1: ( ( rule__Tool__Group__0 ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:187:1: ( rule__Tool__Group__0 )
            {
             before(grammarAccess.getToolAccess().getGroup()); 
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:188:1: ( rule__Tool__Group__0 )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:188:2: rule__Tool__Group__0
            {
            pushFollow(FOLLOW_rule__Tool__Group__0_in_ruleTool334);
            rule__Tool__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getToolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTool"


    // $ANTLR start "entryRuleFQN"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:200:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:201:1: ( ruleFQN EOF )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:202:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN361);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:209:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:213:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:214:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:214:1: ( ( rule__FQN__Group__0 ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:215:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:216:1: ( rule__FQN__Group__0 )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:216:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN394);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "rule__LocationElement__Alternatives"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:228:1: rule__LocationElement__Alternatives : ( ( ruleRoom ) | ( ruleTool ) );
    public final void rule__LocationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:232:1: ( ( ruleRoom ) | ( ruleTool ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:233:1: ( ruleRoom )
                    {
                    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:233:1: ( ruleRoom )
                    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:234:1: ruleRoom
                    {
                     before(grammarAccess.getLocationElementAccess().getRoomParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRoom_in_rule__LocationElement__Alternatives430);
                    ruleRoom();

                    state._fsp--;

                     after(grammarAccess.getLocationElementAccess().getRoomParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:239:6: ( ruleTool )
                    {
                    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:239:6: ( ruleTool )
                    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:240:1: ruleTool
                    {
                     before(grammarAccess.getLocationElementAccess().getToolParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTool_in_rule__LocationElement__Alternatives447);
                    ruleTool();

                    state._fsp--;

                     after(grammarAccess.getLocationElementAccess().getToolParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationElement__Alternatives"


    // $ANTLR start "rule__Package__Group__0"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:252:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:256:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:257:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0477);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0480);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:264:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:268:1: ( ( 'package' ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:269:1: ( 'package' )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:269:1: ( 'package' )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:270:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Package__Group__0__Impl508); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:283:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:287:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:288:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1539);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1542);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:295:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:299:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:300:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:300:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:301:1: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:302:1: ( rule__Package__NameAssignment_1 )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:302:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl569);
            rule__Package__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:312:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:316:1: ( rule__Package__Group__2__Impl )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:317:2: rule__Package__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2599);
            rule__Package__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:323:1: rule__Package__Group__2__Impl : ( ( rule__Package__LocationsAssignment_2 )* ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:327:1: ( ( ( rule__Package__LocationsAssignment_2 )* ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:328:1: ( ( rule__Package__LocationsAssignment_2 )* )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:328:1: ( ( rule__Package__LocationsAssignment_2 )* )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:329:1: ( rule__Package__LocationsAssignment_2 )*
            {
             before(grammarAccess.getPackageAccess().getLocationsAssignment_2()); 
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:330:1: ( rule__Package__LocationsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:330:2: rule__Package__LocationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Package__LocationsAssignment_2_in_rule__Package__Group__2__Impl626);
            	    rule__Package__LocationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getLocationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Location__Group__0"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:346:1: rule__Location__Group__0 : rule__Location__Group__0__Impl rule__Location__Group__1 ;
    public final void rule__Location__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:350:1: ( rule__Location__Group__0__Impl rule__Location__Group__1 )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:351:2: rule__Location__Group__0__Impl rule__Location__Group__1
            {
            pushFollow(FOLLOW_rule__Location__Group__0__Impl_in_rule__Location__Group__0663);
            rule__Location__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Location__Group__1_in_rule__Location__Group__0666);
            rule__Location__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__0"


    // $ANTLR start "rule__Location__Group__0__Impl"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:358:1: rule__Location__Group__0__Impl : ( 'location' ) ;
    public final void rule__Location__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:362:1: ( ( 'location' ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:363:1: ( 'location' )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:363:1: ( 'location' )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:364:1: 'location'
            {
             before(grammarAccess.getLocationAccess().getLocationKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Location__Group__0__Impl694); 
             after(grammarAccess.getLocationAccess().getLocationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__0__Impl"


    // $ANTLR start "rule__Location__Group__1"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:377:1: rule__Location__Group__1 : rule__Location__Group__1__Impl rule__Location__Group__2 ;
    public final void rule__Location__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:381:1: ( rule__Location__Group__1__Impl rule__Location__Group__2 )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:382:2: rule__Location__Group__1__Impl rule__Location__Group__2
            {
            pushFollow(FOLLOW_rule__Location__Group__1__Impl_in_rule__Location__Group__1725);
            rule__Location__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Location__Group__2_in_rule__Location__Group__1728);
            rule__Location__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__1"


    // $ANTLR start "rule__Location__Group__1__Impl"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:389:1: rule__Location__Group__1__Impl : ( ( rule__Location__NameAssignment_1 ) ) ;
    public final void rule__Location__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:393:1: ( ( ( rule__Location__NameAssignment_1 ) ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:394:1: ( ( rule__Location__NameAssignment_1 ) )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:394:1: ( ( rule__Location__NameAssignment_1 ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:395:1: ( rule__Location__NameAssignment_1 )
            {
             before(grammarAccess.getLocationAccess().getNameAssignment_1()); 
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:396:1: ( rule__Location__NameAssignment_1 )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:396:2: rule__Location__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Location__NameAssignment_1_in_rule__Location__Group__1__Impl755);
            rule__Location__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__1__Impl"


    // $ANTLR start "rule__Location__Group__2"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:406:1: rule__Location__Group__2 : rule__Location__Group__2__Impl rule__Location__Group__3 ;
    public final void rule__Location__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:410:1: ( rule__Location__Group__2__Impl rule__Location__Group__3 )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:411:2: rule__Location__Group__2__Impl rule__Location__Group__3
            {
            pushFollow(FOLLOW_rule__Location__Group__2__Impl_in_rule__Location__Group__2785);
            rule__Location__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Location__Group__3_in_rule__Location__Group__2788);
            rule__Location__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__2"


    // $ANTLR start "rule__Location__Group__2__Impl"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:418:1: rule__Location__Group__2__Impl : ( '{' ) ;
    public final void rule__Location__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:422:1: ( ( '{' ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:423:1: ( '{' )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:423:1: ( '{' )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:424:1: '{'
            {
             before(grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Location__Group__2__Impl816); 
             after(grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__2__Impl"


    // $ANTLR start "rule__Location__Group__3"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:437:1: rule__Location__Group__3 : rule__Location__Group__3__Impl rule__Location__Group__4 ;
    public final void rule__Location__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:441:1: ( rule__Location__Group__3__Impl rule__Location__Group__4 )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:442:2: rule__Location__Group__3__Impl rule__Location__Group__4
            {
            pushFollow(FOLLOW_rule__Location__Group__3__Impl_in_rule__Location__Group__3847);
            rule__Location__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Location__Group__4_in_rule__Location__Group__3850);
            rule__Location__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__3"


    // $ANTLR start "rule__Location__Group__3__Impl"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:449:1: rule__Location__Group__3__Impl : ( ( rule__Location__ElementsAssignment_3 )* ) ;
    public final void rule__Location__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:453:1: ( ( ( rule__Location__ElementsAssignment_3 )* ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:454:1: ( ( rule__Location__ElementsAssignment_3 )* )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:454:1: ( ( rule__Location__ElementsAssignment_3 )* )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:455:1: ( rule__Location__ElementsAssignment_3 )*
            {
             before(grammarAccess.getLocationAccess().getElementsAssignment_3()); 
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:456:1: ( rule__Location__ElementsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=16)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:456:2: rule__Location__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Location__ElementsAssignment_3_in_rule__Location__Group__3__Impl877);
            	    rule__Location__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getLocationAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__3__Impl"


    // $ANTLR start "rule__Location__Group__4"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:466:1: rule__Location__Group__4 : rule__Location__Group__4__Impl ;
    public final void rule__Location__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:470:1: ( rule__Location__Group__4__Impl )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:471:2: rule__Location__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Location__Group__4__Impl_in_rule__Location__Group__4908);
            rule__Location__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__4"


    // $ANTLR start "rule__Location__Group__4__Impl"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:477:1: rule__Location__Group__4__Impl : ( '}' ) ;
    public final void rule__Location__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:481:1: ( ( '}' ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:482:1: ( '}' )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:482:1: ( '}' )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:483:1: '}'
            {
             before(grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Location__Group__4__Impl936); 
             after(grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__4__Impl"


    // $ANTLR start "rule__Room__Group__0"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:506:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:510:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:511:2: rule__Room__Group__0__Impl rule__Room__Group__1
            {
            pushFollow(FOLLOW_rule__Room__Group__0__Impl_in_rule__Room__Group__0977);
            rule__Room__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Room__Group__1_in_rule__Room__Group__0980);
            rule__Room__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__0"


    // $ANTLR start "rule__Room__Group__0__Impl"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:518:1: rule__Room__Group__0__Impl : ( 'room' ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:522:1: ( ( 'room' ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:523:1: ( 'room' )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:523:1: ( 'room' )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:524:1: 'room'
            {
             before(grammarAccess.getRoomAccess().getRoomKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Room__Group__0__Impl1008); 
             after(grammarAccess.getRoomAccess().getRoomKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__0__Impl"


    // $ANTLR start "rule__Room__Group__1"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:537:1: rule__Room__Group__1 : rule__Room__Group__1__Impl ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:541:1: ( rule__Room__Group__1__Impl )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:542:2: rule__Room__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Room__Group__1__Impl_in_rule__Room__Group__11039);
            rule__Room__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__1"


    // $ANTLR start "rule__Room__Group__1__Impl"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:548:1: rule__Room__Group__1__Impl : ( ( rule__Room__NameAssignment_1 ) ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:552:1: ( ( ( rule__Room__NameAssignment_1 ) ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:553:1: ( ( rule__Room__NameAssignment_1 ) )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:553:1: ( ( rule__Room__NameAssignment_1 ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:554:1: ( rule__Room__NameAssignment_1 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_1()); 
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:555:1: ( rule__Room__NameAssignment_1 )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:555:2: rule__Room__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Room__NameAssignment_1_in_rule__Room__Group__1__Impl1066);
            rule__Room__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__1__Impl"


    // $ANTLR start "rule__Tool__Group__0"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:569:1: rule__Tool__Group__0 : rule__Tool__Group__0__Impl rule__Tool__Group__1 ;
    public final void rule__Tool__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:573:1: ( rule__Tool__Group__0__Impl rule__Tool__Group__1 )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:574:2: rule__Tool__Group__0__Impl rule__Tool__Group__1
            {
            pushFollow(FOLLOW_rule__Tool__Group__0__Impl_in_rule__Tool__Group__01100);
            rule__Tool__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tool__Group__1_in_rule__Tool__Group__01103);
            rule__Tool__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tool__Group__0"


    // $ANTLR start "rule__Tool__Group__0__Impl"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:581:1: rule__Tool__Group__0__Impl : ( 'tool' ) ;
    public final void rule__Tool__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:585:1: ( ( 'tool' ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:586:1: ( 'tool' )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:586:1: ( 'tool' )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:587:1: 'tool'
            {
             before(grammarAccess.getToolAccess().getToolKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Tool__Group__0__Impl1131); 
             after(grammarAccess.getToolAccess().getToolKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tool__Group__0__Impl"


    // $ANTLR start "rule__Tool__Group__1"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:600:1: rule__Tool__Group__1 : rule__Tool__Group__1__Impl ;
    public final void rule__Tool__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:604:1: ( rule__Tool__Group__1__Impl )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:605:2: rule__Tool__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Tool__Group__1__Impl_in_rule__Tool__Group__11162);
            rule__Tool__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tool__Group__1"


    // $ANTLR start "rule__Tool__Group__1__Impl"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:611:1: rule__Tool__Group__1__Impl : ( ( rule__Tool__NameAssignment_1 ) ) ;
    public final void rule__Tool__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:615:1: ( ( ( rule__Tool__NameAssignment_1 ) ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:616:1: ( ( rule__Tool__NameAssignment_1 ) )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:616:1: ( ( rule__Tool__NameAssignment_1 ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:617:1: ( rule__Tool__NameAssignment_1 )
            {
             before(grammarAccess.getToolAccess().getNameAssignment_1()); 
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:618:1: ( rule__Tool__NameAssignment_1 )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:618:2: rule__Tool__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Tool__NameAssignment_1_in_rule__Tool__Group__1__Impl1189);
            rule__Tool__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getToolAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tool__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:632:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:636:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:637:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01223);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01226);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:644:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:648:1: ( ( RULE_ID ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:649:1: ( RULE_ID )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:649:1: ( RULE_ID )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:650:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1253); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:661:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:665:1: ( rule__FQN__Group__1__Impl )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:666:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11282);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:672:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:676:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:677:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:677:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:678:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:679:1: ( rule__FQN__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:679:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1309);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:693:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:697:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:698:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01344);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01347);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:705:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:709:1: ( ( '.' ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:710:1: ( '.' )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:710:1: ( '.' )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:711:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__FQN__Group_1__0__Impl1375); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:724:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:728:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:729:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11406);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:735:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:739:1: ( ( RULE_ID ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:740:1: ( RULE_ID )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:740:1: ( RULE_ID )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:741:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1433); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Package__NameAssignment_1"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:757:1: rule__Package__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:761:1: ( ( ruleFQN ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:762:1: ( ruleFQN )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:762:1: ( ruleFQN )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:763:1: ruleFQN
            {
             before(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Package__NameAssignment_11471);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__Package__LocationsAssignment_2"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:772:1: rule__Package__LocationsAssignment_2 : ( ruleLocation ) ;
    public final void rule__Package__LocationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:776:1: ( ( ruleLocation ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:777:1: ( ruleLocation )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:777:1: ( ruleLocation )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:778:1: ruleLocation
            {
             before(grammarAccess.getPackageAccess().getLocationsLocationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLocation_in_rule__Package__LocationsAssignment_21502);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getLocationsLocationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__LocationsAssignment_2"


    // $ANTLR start "rule__Location__NameAssignment_1"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:787:1: rule__Location__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Location__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:791:1: ( ( RULE_ID ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:792:1: ( RULE_ID )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:792:1: ( RULE_ID )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:793:1: RULE_ID
            {
             before(grammarAccess.getLocationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Location__NameAssignment_11533); 
             after(grammarAccess.getLocationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__NameAssignment_1"


    // $ANTLR start "rule__Location__ElementsAssignment_3"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:802:1: rule__Location__ElementsAssignment_3 : ( ruleLocationElement ) ;
    public final void rule__Location__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:806:1: ( ( ruleLocationElement ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:807:1: ( ruleLocationElement )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:807:1: ( ruleLocationElement )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:808:1: ruleLocationElement
            {
             before(grammarAccess.getLocationAccess().getElementsLocationElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLocationElement_in_rule__Location__ElementsAssignment_31564);
            ruleLocationElement();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getElementsLocationElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__ElementsAssignment_3"


    // $ANTLR start "rule__Room__NameAssignment_1"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:817:1: rule__Room__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Room__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:821:1: ( ( RULE_ID ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:822:1: ( RULE_ID )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:822:1: ( RULE_ID )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:823:1: RULE_ID
            {
             before(grammarAccess.getRoomAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Room__NameAssignment_11595); 
             after(grammarAccess.getRoomAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__NameAssignment_1"


    // $ANTLR start "rule__Tool__NameAssignment_1"
    // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:832:1: rule__Tool__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Tool__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:836:1: ( ( RULE_ID ) )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:837:1: ( RULE_ID )
            {
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:837:1: ( RULE_ID )
            // ../org.eclipse.eclipsecon.location.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalLocation.g:838:1: RULE_ID
            {
             before(grammarAccess.getToolAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Tool__NameAssignment_11626); 
             after(grammarAccess.getToolAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tool__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocation_in_entryRuleLocation121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocation128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group__0_in_ruleLocation154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationElement_in_entryRuleLocationElement181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocationElement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationElement__Alternatives_in_ruleLocationElement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoom_in_entryRuleRoom241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoom248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Room__Group__0_in_ruleRoom274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTool_in_entryRuleTool301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTool308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tool__Group__0_in_ruleTool334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoom_in_rule__LocationElement__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTool_in_rule__LocationElement__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Package__Group__0__Impl508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1539 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__LocationsAssignment_2_in_rule__Package__Group__2__Impl626 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Location__Group__0__Impl_in_rule__Location__Group__0663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Location__Group__1_in_rule__Location__Group__0666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Location__Group__0__Impl694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group__1__Impl_in_rule__Location__Group__1725 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Location__Group__2_in_rule__Location__Group__1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__NameAssignment_1_in_rule__Location__Group__1__Impl755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group__2__Impl_in_rule__Location__Group__2785 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_rule__Location__Group__3_in_rule__Location__Group__2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Location__Group__2__Impl816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group__3__Impl_in_rule__Location__Group__3847 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_rule__Location__Group__4_in_rule__Location__Group__3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__ElementsAssignment_3_in_rule__Location__Group__3__Impl877 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__Location__Group__4__Impl_in_rule__Location__Group__4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Location__Group__4__Impl936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Room__Group__0__Impl_in_rule__Room__Group__0977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Room__Group__1_in_rule__Room__Group__0980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Room__Group__0__Impl1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Room__Group__1__Impl_in_rule__Room__Group__11039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Room__NameAssignment_1_in_rule__Room__Group__1__Impl1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tool__Group__0__Impl_in_rule__Tool__Group__01100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Tool__Group__1_in_rule__Tool__Group__01103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Tool__Group__0__Impl1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tool__Group__1__Impl_in_rule__Tool__Group__11162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tool__NameAssignment_1_in_rule__Tool__Group__1__Impl1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01223 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1309 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FQN__Group_1__0__Impl1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Package__NameAssignment_11471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocation_in_rule__Package__LocationsAssignment_21502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Location__NameAssignment_11533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationElement_in_rule__Location__ElementsAssignment_31564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Room__NameAssignment_11595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Tool__NameAssignment_11626 = new BitSet(new long[]{0x0000000000000002L});

}