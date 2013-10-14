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
import org.eclipse.eclipsecon.services.ConferenceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConferenceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'conference'", "'{'", "'}'", "'import'", "'talk'", "'speaker'", "'room'", "'tools'", "','", "'.'", "'.*'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalConferenceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConferenceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConferenceParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g"; }


     
     	private ConferenceGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ConferenceGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleConference"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:60:1: entryRuleConference : ruleConference EOF ;
    public final void entryRuleConference() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:61:1: ( ruleConference EOF )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:62:1: ruleConference EOF
            {
             before(grammarAccess.getConferenceRule()); 
            pushFollow(FOLLOW_ruleConference_in_entryRuleConference61);
            ruleConference();

            state._fsp--;

             after(grammarAccess.getConferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConference68); 

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
    // $ANTLR end "entryRuleConference"


    // $ANTLR start "ruleConference"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:69:1: ruleConference : ( ( rule__Conference__Group__0 ) ) ;
    public final void ruleConference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:73:2: ( ( ( rule__Conference__Group__0 ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:74:1: ( ( rule__Conference__Group__0 ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:74:1: ( ( rule__Conference__Group__0 ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:75:1: ( rule__Conference__Group__0 )
            {
             before(grammarAccess.getConferenceAccess().getGroup()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:76:1: ( rule__Conference__Group__0 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:76:2: rule__Conference__Group__0
            {
            pushFollow(FOLLOW_rule__Conference__Group__0_in_ruleConference94);
            rule__Conference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleConference"


    // $ANTLR start "entryRuleImport"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:89:1: ( ruleImport EOF )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport128); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:102:1: ( ( rule__Import__Group__0 ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:104:1: ( rule__Import__Group__0 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:104:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleTalk"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:116:1: entryRuleTalk : ruleTalk EOF ;
    public final void entryRuleTalk() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:117:1: ( ruleTalk EOF )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:118:1: ruleTalk EOF
            {
             before(grammarAccess.getTalkRule()); 
            pushFollow(FOLLOW_ruleTalk_in_entryRuleTalk181);
            ruleTalk();

            state._fsp--;

             after(grammarAccess.getTalkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTalk188); 

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
    // $ANTLR end "entryRuleTalk"


    // $ANTLR start "ruleTalk"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:125:1: ruleTalk : ( ( rule__Talk__Group__0 ) ) ;
    public final void ruleTalk() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:129:2: ( ( ( rule__Talk__Group__0 ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:130:1: ( ( rule__Talk__Group__0 ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:130:1: ( ( rule__Talk__Group__0 ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:131:1: ( rule__Talk__Group__0 )
            {
             before(grammarAccess.getTalkAccess().getGroup()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:132:1: ( rule__Talk__Group__0 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:132:2: rule__Talk__Group__0
            {
            pushFollow(FOLLOW_rule__Talk__Group__0_in_ruleTalk214);
            rule__Talk__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getGroup()); 

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
    // $ANTLR end "ruleTalk"


    // $ANTLR start "entryRuleFQN"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:144:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:145:1: ( ruleFQN EOF )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:146:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN241);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN248); 

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
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:153:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:157:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:158:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:158:1: ( ( rule__FQN__Group__0 ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:159:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:160:1: ( rule__FQN__Group__0 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:160:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN274);
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


    // $ANTLR start "entryRuleFQNWithWildcard"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:172:1: entryRuleFQNWithWildcard : ruleFQNWithWildcard EOF ;
    public final void entryRuleFQNWithWildcard() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:173:1: ( ruleFQNWithWildcard EOF )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:174:1: ruleFQNWithWildcard EOF
            {
             before(grammarAccess.getFQNWithWildcardRule()); 
            pushFollow(FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard301);
            ruleFQNWithWildcard();

            state._fsp--;

             after(grammarAccess.getFQNWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQNWithWildcard308); 

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
    // $ANTLR end "entryRuleFQNWithWildcard"


    // $ANTLR start "ruleFQNWithWildcard"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:181:1: ruleFQNWithWildcard : ( ( rule__FQNWithWildcard__Group__0 ) ) ;
    public final void ruleFQNWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:185:2: ( ( ( rule__FQNWithWildcard__Group__0 ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:186:1: ( ( rule__FQNWithWildcard__Group__0 ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:186:1: ( ( rule__FQNWithWildcard__Group__0 ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:187:1: ( rule__FQNWithWildcard__Group__0 )
            {
             before(grammarAccess.getFQNWithWildcardAccess().getGroup()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:188:1: ( rule__FQNWithWildcard__Group__0 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:188:2: rule__FQNWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__0_in_ruleFQNWithWildcard334);
            rule__FQNWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNWithWildcardAccess().getGroup()); 

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
    // $ANTLR end "ruleFQNWithWildcard"


    // $ANTLR start "rule__Conference__Group__0"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:202:1: rule__Conference__Group__0 : rule__Conference__Group__0__Impl rule__Conference__Group__1 ;
    public final void rule__Conference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:206:1: ( rule__Conference__Group__0__Impl rule__Conference__Group__1 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:207:2: rule__Conference__Group__0__Impl rule__Conference__Group__1
            {
            pushFollow(FOLLOW_rule__Conference__Group__0__Impl_in_rule__Conference__Group__0368);
            rule__Conference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conference__Group__1_in_rule__Conference__Group__0371);
            rule__Conference__Group__1();

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
    // $ANTLR end "rule__Conference__Group__0"


    // $ANTLR start "rule__Conference__Group__0__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:214:1: rule__Conference__Group__0__Impl : ( 'conference' ) ;
    public final void rule__Conference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:218:1: ( ( 'conference' ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:219:1: ( 'conference' )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:219:1: ( 'conference' )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:220:1: 'conference'
            {
             before(grammarAccess.getConferenceAccess().getConferenceKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Conference__Group__0__Impl399); 
             after(grammarAccess.getConferenceAccess().getConferenceKeyword_0()); 

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
    // $ANTLR end "rule__Conference__Group__0__Impl"


    // $ANTLR start "rule__Conference__Group__1"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:233:1: rule__Conference__Group__1 : rule__Conference__Group__1__Impl rule__Conference__Group__2 ;
    public final void rule__Conference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:237:1: ( rule__Conference__Group__1__Impl rule__Conference__Group__2 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:238:2: rule__Conference__Group__1__Impl rule__Conference__Group__2
            {
            pushFollow(FOLLOW_rule__Conference__Group__1__Impl_in_rule__Conference__Group__1430);
            rule__Conference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conference__Group__2_in_rule__Conference__Group__1433);
            rule__Conference__Group__2();

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
    // $ANTLR end "rule__Conference__Group__1"


    // $ANTLR start "rule__Conference__Group__1__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:245:1: rule__Conference__Group__1__Impl : ( ( rule__Conference__NameAssignment_1 ) ) ;
    public final void rule__Conference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:249:1: ( ( ( rule__Conference__NameAssignment_1 ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:250:1: ( ( rule__Conference__NameAssignment_1 ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:250:1: ( ( rule__Conference__NameAssignment_1 ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:251:1: ( rule__Conference__NameAssignment_1 )
            {
             before(grammarAccess.getConferenceAccess().getNameAssignment_1()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:252:1: ( rule__Conference__NameAssignment_1 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:252:2: rule__Conference__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Conference__NameAssignment_1_in_rule__Conference__Group__1__Impl460);
            rule__Conference__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Conference__Group__1__Impl"


    // $ANTLR start "rule__Conference__Group__2"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:262:1: rule__Conference__Group__2 : rule__Conference__Group__2__Impl rule__Conference__Group__3 ;
    public final void rule__Conference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:266:1: ( rule__Conference__Group__2__Impl rule__Conference__Group__3 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:267:2: rule__Conference__Group__2__Impl rule__Conference__Group__3
            {
            pushFollow(FOLLOW_rule__Conference__Group__2__Impl_in_rule__Conference__Group__2490);
            rule__Conference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conference__Group__3_in_rule__Conference__Group__2493);
            rule__Conference__Group__3();

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
    // $ANTLR end "rule__Conference__Group__2"


    // $ANTLR start "rule__Conference__Group__2__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:274:1: rule__Conference__Group__2__Impl : ( '{' ) ;
    public final void rule__Conference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:278:1: ( ( '{' ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:279:1: ( '{' )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:279:1: ( '{' )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:280:1: '{'
            {
             before(grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Conference__Group__2__Impl521); 
             after(grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Conference__Group__2__Impl"


    // $ANTLR start "rule__Conference__Group__3"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:293:1: rule__Conference__Group__3 : rule__Conference__Group__3__Impl rule__Conference__Group__4 ;
    public final void rule__Conference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:297:1: ( rule__Conference__Group__3__Impl rule__Conference__Group__4 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:298:2: rule__Conference__Group__3__Impl rule__Conference__Group__4
            {
            pushFollow(FOLLOW_rule__Conference__Group__3__Impl_in_rule__Conference__Group__3552);
            rule__Conference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conference__Group__4_in_rule__Conference__Group__3555);
            rule__Conference__Group__4();

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
    // $ANTLR end "rule__Conference__Group__3"


    // $ANTLR start "rule__Conference__Group__3__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:305:1: rule__Conference__Group__3__Impl : ( ( rule__Conference__ImportsAssignment_3 )* ) ;
    public final void rule__Conference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:309:1: ( ( ( rule__Conference__ImportsAssignment_3 )* ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:310:1: ( ( rule__Conference__ImportsAssignment_3 )* )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:310:1: ( ( rule__Conference__ImportsAssignment_3 )* )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:311:1: ( rule__Conference__ImportsAssignment_3 )*
            {
             before(grammarAccess.getConferenceAccess().getImportsAssignment_3()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:312:1: ( rule__Conference__ImportsAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:312:2: rule__Conference__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Conference__ImportsAssignment_3_in_rule__Conference__Group__3__Impl582);
            	    rule__Conference__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getConferenceAccess().getImportsAssignment_3()); 

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
    // $ANTLR end "rule__Conference__Group__3__Impl"


    // $ANTLR start "rule__Conference__Group__4"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:322:1: rule__Conference__Group__4 : rule__Conference__Group__4__Impl rule__Conference__Group__5 ;
    public final void rule__Conference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:326:1: ( rule__Conference__Group__4__Impl rule__Conference__Group__5 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:327:2: rule__Conference__Group__4__Impl rule__Conference__Group__5
            {
            pushFollow(FOLLOW_rule__Conference__Group__4__Impl_in_rule__Conference__Group__4613);
            rule__Conference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conference__Group__5_in_rule__Conference__Group__4616);
            rule__Conference__Group__5();

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
    // $ANTLR end "rule__Conference__Group__4"


    // $ANTLR start "rule__Conference__Group__4__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:334:1: rule__Conference__Group__4__Impl : ( ( rule__Conference__LocationAssignment_4 ) ) ;
    public final void rule__Conference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:338:1: ( ( ( rule__Conference__LocationAssignment_4 ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:339:1: ( ( rule__Conference__LocationAssignment_4 ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:339:1: ( ( rule__Conference__LocationAssignment_4 ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:340:1: ( rule__Conference__LocationAssignment_4 )
            {
             before(grammarAccess.getConferenceAccess().getLocationAssignment_4()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:341:1: ( rule__Conference__LocationAssignment_4 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:341:2: rule__Conference__LocationAssignment_4
            {
            pushFollow(FOLLOW_rule__Conference__LocationAssignment_4_in_rule__Conference__Group__4__Impl643);
            rule__Conference__LocationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getLocationAssignment_4()); 

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
    // $ANTLR end "rule__Conference__Group__4__Impl"


    // $ANTLR start "rule__Conference__Group__5"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:351:1: rule__Conference__Group__5 : rule__Conference__Group__5__Impl rule__Conference__Group__6 ;
    public final void rule__Conference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:355:1: ( rule__Conference__Group__5__Impl rule__Conference__Group__6 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:356:2: rule__Conference__Group__5__Impl rule__Conference__Group__6
            {
            pushFollow(FOLLOW_rule__Conference__Group__5__Impl_in_rule__Conference__Group__5673);
            rule__Conference__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conference__Group__6_in_rule__Conference__Group__5676);
            rule__Conference__Group__6();

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
    // $ANTLR end "rule__Conference__Group__5"


    // $ANTLR start "rule__Conference__Group__5__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:363:1: rule__Conference__Group__5__Impl : ( ( rule__Conference__TalksAssignment_5 )* ) ;
    public final void rule__Conference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:367:1: ( ( ( rule__Conference__TalksAssignment_5 )* ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:368:1: ( ( rule__Conference__TalksAssignment_5 )* )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:368:1: ( ( rule__Conference__TalksAssignment_5 )* )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:369:1: ( rule__Conference__TalksAssignment_5 )*
            {
             before(grammarAccess.getConferenceAccess().getTalksAssignment_5()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:370:1: ( rule__Conference__TalksAssignment_5 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:370:2: rule__Conference__TalksAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Conference__TalksAssignment_5_in_rule__Conference__Group__5__Impl703);
            	    rule__Conference__TalksAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getConferenceAccess().getTalksAssignment_5()); 

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
    // $ANTLR end "rule__Conference__Group__5__Impl"


    // $ANTLR start "rule__Conference__Group__6"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:380:1: rule__Conference__Group__6 : rule__Conference__Group__6__Impl ;
    public final void rule__Conference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:384:1: ( rule__Conference__Group__6__Impl )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:385:2: rule__Conference__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Conference__Group__6__Impl_in_rule__Conference__Group__6734);
            rule__Conference__Group__6__Impl();

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
    // $ANTLR end "rule__Conference__Group__6"


    // $ANTLR start "rule__Conference__Group__6__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:391:1: rule__Conference__Group__6__Impl : ( '}' ) ;
    public final void rule__Conference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:395:1: ( ( '}' ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:396:1: ( '}' )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:396:1: ( '}' )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:397:1: '}'
            {
             before(grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__Conference__Group__6__Impl762); 
             after(grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Conference__Group__6__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:424:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:428:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:429:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0807);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0810);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:436:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:440:1: ( ( 'import' ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:441:1: ( 'import' )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:441:1: ( 'import' )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:442:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Import__Group__0__Impl838); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:455:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:459:1: ( rule__Import__Group__1__Impl )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:460:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1869);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:466:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:470:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:471:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:471:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:472:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:473:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:473:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl896);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Talk__Group__0"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:487:1: rule__Talk__Group__0 : rule__Talk__Group__0__Impl rule__Talk__Group__1 ;
    public final void rule__Talk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:491:1: ( rule__Talk__Group__0__Impl rule__Talk__Group__1 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:492:2: rule__Talk__Group__0__Impl rule__Talk__Group__1
            {
            pushFollow(FOLLOW_rule__Talk__Group__0__Impl_in_rule__Talk__Group__0930);
            rule__Talk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__1_in_rule__Talk__Group__0933);
            rule__Talk__Group__1();

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
    // $ANTLR end "rule__Talk__Group__0"


    // $ANTLR start "rule__Talk__Group__0__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:499:1: rule__Talk__Group__0__Impl : ( 'talk' ) ;
    public final void rule__Talk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:503:1: ( ( 'talk' ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:504:1: ( 'talk' )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:504:1: ( 'talk' )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:505:1: 'talk'
            {
             before(grammarAccess.getTalkAccess().getTalkKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Talk__Group__0__Impl961); 
             after(grammarAccess.getTalkAccess().getTalkKeyword_0()); 

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
    // $ANTLR end "rule__Talk__Group__0__Impl"


    // $ANTLR start "rule__Talk__Group__1"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:518:1: rule__Talk__Group__1 : rule__Talk__Group__1__Impl rule__Talk__Group__2 ;
    public final void rule__Talk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:522:1: ( rule__Talk__Group__1__Impl rule__Talk__Group__2 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:523:2: rule__Talk__Group__1__Impl rule__Talk__Group__2
            {
            pushFollow(FOLLOW_rule__Talk__Group__1__Impl_in_rule__Talk__Group__1992);
            rule__Talk__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__2_in_rule__Talk__Group__1995);
            rule__Talk__Group__2();

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
    // $ANTLR end "rule__Talk__Group__1"


    // $ANTLR start "rule__Talk__Group__1__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:530:1: rule__Talk__Group__1__Impl : ( ( rule__Talk__NameAssignment_1 ) ) ;
    public final void rule__Talk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:534:1: ( ( ( rule__Talk__NameAssignment_1 ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:535:1: ( ( rule__Talk__NameAssignment_1 ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:535:1: ( ( rule__Talk__NameAssignment_1 ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:536:1: ( rule__Talk__NameAssignment_1 )
            {
             before(grammarAccess.getTalkAccess().getNameAssignment_1()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:537:1: ( rule__Talk__NameAssignment_1 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:537:2: rule__Talk__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Talk__NameAssignment_1_in_rule__Talk__Group__1__Impl1022);
            rule__Talk__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Talk__Group__1__Impl"


    // $ANTLR start "rule__Talk__Group__2"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:547:1: rule__Talk__Group__2 : rule__Talk__Group__2__Impl rule__Talk__Group__3 ;
    public final void rule__Talk__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:551:1: ( rule__Talk__Group__2__Impl rule__Talk__Group__3 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:552:2: rule__Talk__Group__2__Impl rule__Talk__Group__3
            {
            pushFollow(FOLLOW_rule__Talk__Group__2__Impl_in_rule__Talk__Group__21052);
            rule__Talk__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__3_in_rule__Talk__Group__21055);
            rule__Talk__Group__3();

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
    // $ANTLR end "rule__Talk__Group__2"


    // $ANTLR start "rule__Talk__Group__2__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:559:1: rule__Talk__Group__2__Impl : ( '{' ) ;
    public final void rule__Talk__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:563:1: ( ( '{' ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:564:1: ( '{' )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:564:1: ( '{' )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:565:1: '{'
            {
             before(grammarAccess.getTalkAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Talk__Group__2__Impl1083); 
             after(grammarAccess.getTalkAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Talk__Group__2__Impl"


    // $ANTLR start "rule__Talk__Group__3"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:578:1: rule__Talk__Group__3 : rule__Talk__Group__3__Impl rule__Talk__Group__4 ;
    public final void rule__Talk__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:582:1: ( rule__Talk__Group__3__Impl rule__Talk__Group__4 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:583:2: rule__Talk__Group__3__Impl rule__Talk__Group__4
            {
            pushFollow(FOLLOW_rule__Talk__Group__3__Impl_in_rule__Talk__Group__31114);
            rule__Talk__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__4_in_rule__Talk__Group__31117);
            rule__Talk__Group__4();

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
    // $ANTLR end "rule__Talk__Group__3"


    // $ANTLR start "rule__Talk__Group__3__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:590:1: rule__Talk__Group__3__Impl : ( 'speaker' ) ;
    public final void rule__Talk__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:594:1: ( ( 'speaker' ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:595:1: ( 'speaker' )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:595:1: ( 'speaker' )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:596:1: 'speaker'
            {
             before(grammarAccess.getTalkAccess().getSpeakerKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Talk__Group__3__Impl1145); 
             after(grammarAccess.getTalkAccess().getSpeakerKeyword_3()); 

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
    // $ANTLR end "rule__Talk__Group__3__Impl"


    // $ANTLR start "rule__Talk__Group__4"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:609:1: rule__Talk__Group__4 : rule__Talk__Group__4__Impl rule__Talk__Group__5 ;
    public final void rule__Talk__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:613:1: ( rule__Talk__Group__4__Impl rule__Talk__Group__5 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:614:2: rule__Talk__Group__4__Impl rule__Talk__Group__5
            {
            pushFollow(FOLLOW_rule__Talk__Group__4__Impl_in_rule__Talk__Group__41176);
            rule__Talk__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__5_in_rule__Talk__Group__41179);
            rule__Talk__Group__5();

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
    // $ANTLR end "rule__Talk__Group__4"


    // $ANTLR start "rule__Talk__Group__4__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:621:1: rule__Talk__Group__4__Impl : ( ( rule__Talk__SpeakersAssignment_4 ) ) ;
    public final void rule__Talk__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:625:1: ( ( ( rule__Talk__SpeakersAssignment_4 ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:626:1: ( ( rule__Talk__SpeakersAssignment_4 ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:626:1: ( ( rule__Talk__SpeakersAssignment_4 ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:627:1: ( rule__Talk__SpeakersAssignment_4 )
            {
             before(grammarAccess.getTalkAccess().getSpeakersAssignment_4()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:628:1: ( rule__Talk__SpeakersAssignment_4 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:628:2: rule__Talk__SpeakersAssignment_4
            {
            pushFollow(FOLLOW_rule__Talk__SpeakersAssignment_4_in_rule__Talk__Group__4__Impl1206);
            rule__Talk__SpeakersAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getSpeakersAssignment_4()); 

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
    // $ANTLR end "rule__Talk__Group__4__Impl"


    // $ANTLR start "rule__Talk__Group__5"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:638:1: rule__Talk__Group__5 : rule__Talk__Group__5__Impl rule__Talk__Group__6 ;
    public final void rule__Talk__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:642:1: ( rule__Talk__Group__5__Impl rule__Talk__Group__6 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:643:2: rule__Talk__Group__5__Impl rule__Talk__Group__6
            {
            pushFollow(FOLLOW_rule__Talk__Group__5__Impl_in_rule__Talk__Group__51236);
            rule__Talk__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__6_in_rule__Talk__Group__51239);
            rule__Talk__Group__6();

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
    // $ANTLR end "rule__Talk__Group__5"


    // $ANTLR start "rule__Talk__Group__5__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:650:1: rule__Talk__Group__5__Impl : ( ( rule__Talk__Group_5__0 )* ) ;
    public final void rule__Talk__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:654:1: ( ( ( rule__Talk__Group_5__0 )* ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:655:1: ( ( rule__Talk__Group_5__0 )* )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:655:1: ( ( rule__Talk__Group_5__0 )* )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:656:1: ( rule__Talk__Group_5__0 )*
            {
             before(grammarAccess.getTalkAccess().getGroup_5()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:657:1: ( rule__Talk__Group_5__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:657:2: rule__Talk__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Talk__Group_5__0_in_rule__Talk__Group__5__Impl1266);
            	    rule__Talk__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTalkAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Talk__Group__5__Impl"


    // $ANTLR start "rule__Talk__Group__6"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:667:1: rule__Talk__Group__6 : rule__Talk__Group__6__Impl rule__Talk__Group__7 ;
    public final void rule__Talk__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:671:1: ( rule__Talk__Group__6__Impl rule__Talk__Group__7 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:672:2: rule__Talk__Group__6__Impl rule__Talk__Group__7
            {
            pushFollow(FOLLOW_rule__Talk__Group__6__Impl_in_rule__Talk__Group__61297);
            rule__Talk__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__7_in_rule__Talk__Group__61300);
            rule__Talk__Group__7();

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
    // $ANTLR end "rule__Talk__Group__6"


    // $ANTLR start "rule__Talk__Group__6__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:679:1: rule__Talk__Group__6__Impl : ( 'room' ) ;
    public final void rule__Talk__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:683:1: ( ( 'room' ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:684:1: ( 'room' )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:684:1: ( 'room' )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:685:1: 'room'
            {
             before(grammarAccess.getTalkAccess().getRoomKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Talk__Group__6__Impl1328); 
             after(grammarAccess.getTalkAccess().getRoomKeyword_6()); 

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
    // $ANTLR end "rule__Talk__Group__6__Impl"


    // $ANTLR start "rule__Talk__Group__7"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:698:1: rule__Talk__Group__7 : rule__Talk__Group__7__Impl rule__Talk__Group__8 ;
    public final void rule__Talk__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:702:1: ( rule__Talk__Group__7__Impl rule__Talk__Group__8 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:703:2: rule__Talk__Group__7__Impl rule__Talk__Group__8
            {
            pushFollow(FOLLOW_rule__Talk__Group__7__Impl_in_rule__Talk__Group__71359);
            rule__Talk__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__8_in_rule__Talk__Group__71362);
            rule__Talk__Group__8();

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
    // $ANTLR end "rule__Talk__Group__7"


    // $ANTLR start "rule__Talk__Group__7__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:710:1: rule__Talk__Group__7__Impl : ( ( rule__Talk__RoomAssignment_7 ) ) ;
    public final void rule__Talk__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:714:1: ( ( ( rule__Talk__RoomAssignment_7 ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:715:1: ( ( rule__Talk__RoomAssignment_7 ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:715:1: ( ( rule__Talk__RoomAssignment_7 ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:716:1: ( rule__Talk__RoomAssignment_7 )
            {
             before(grammarAccess.getTalkAccess().getRoomAssignment_7()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:717:1: ( rule__Talk__RoomAssignment_7 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:717:2: rule__Talk__RoomAssignment_7
            {
            pushFollow(FOLLOW_rule__Talk__RoomAssignment_7_in_rule__Talk__Group__7__Impl1389);
            rule__Talk__RoomAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getRoomAssignment_7()); 

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
    // $ANTLR end "rule__Talk__Group__7__Impl"


    // $ANTLR start "rule__Talk__Group__8"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:727:1: rule__Talk__Group__8 : rule__Talk__Group__8__Impl rule__Talk__Group__9 ;
    public final void rule__Talk__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:731:1: ( rule__Talk__Group__8__Impl rule__Talk__Group__9 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:732:2: rule__Talk__Group__8__Impl rule__Talk__Group__9
            {
            pushFollow(FOLLOW_rule__Talk__Group__8__Impl_in_rule__Talk__Group__81419);
            rule__Talk__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__9_in_rule__Talk__Group__81422);
            rule__Talk__Group__9();

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
    // $ANTLR end "rule__Talk__Group__8"


    // $ANTLR start "rule__Talk__Group__8__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:739:1: rule__Talk__Group__8__Impl : ( 'tools' ) ;
    public final void rule__Talk__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:743:1: ( ( 'tools' ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:744:1: ( 'tools' )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:744:1: ( 'tools' )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:745:1: 'tools'
            {
             before(grammarAccess.getTalkAccess().getToolsKeyword_8()); 
            match(input,18,FOLLOW_18_in_rule__Talk__Group__8__Impl1450); 
             after(grammarAccess.getTalkAccess().getToolsKeyword_8()); 

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
    // $ANTLR end "rule__Talk__Group__8__Impl"


    // $ANTLR start "rule__Talk__Group__9"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:758:1: rule__Talk__Group__9 : rule__Talk__Group__9__Impl rule__Talk__Group__10 ;
    public final void rule__Talk__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:762:1: ( rule__Talk__Group__9__Impl rule__Talk__Group__10 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:763:2: rule__Talk__Group__9__Impl rule__Talk__Group__10
            {
            pushFollow(FOLLOW_rule__Talk__Group__9__Impl_in_rule__Talk__Group__91481);
            rule__Talk__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__10_in_rule__Talk__Group__91484);
            rule__Talk__Group__10();

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
    // $ANTLR end "rule__Talk__Group__9"


    // $ANTLR start "rule__Talk__Group__9__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:770:1: rule__Talk__Group__9__Impl : ( ( rule__Talk__ToolsAssignment_9 ) ) ;
    public final void rule__Talk__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:774:1: ( ( ( rule__Talk__ToolsAssignment_9 ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:775:1: ( ( rule__Talk__ToolsAssignment_9 ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:775:1: ( ( rule__Talk__ToolsAssignment_9 ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:776:1: ( rule__Talk__ToolsAssignment_9 )
            {
             before(grammarAccess.getTalkAccess().getToolsAssignment_9()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:777:1: ( rule__Talk__ToolsAssignment_9 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:777:2: rule__Talk__ToolsAssignment_9
            {
            pushFollow(FOLLOW_rule__Talk__ToolsAssignment_9_in_rule__Talk__Group__9__Impl1511);
            rule__Talk__ToolsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getToolsAssignment_9()); 

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
    // $ANTLR end "rule__Talk__Group__9__Impl"


    // $ANTLR start "rule__Talk__Group__10"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:787:1: rule__Talk__Group__10 : rule__Talk__Group__10__Impl rule__Talk__Group__11 ;
    public final void rule__Talk__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:791:1: ( rule__Talk__Group__10__Impl rule__Talk__Group__11 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:792:2: rule__Talk__Group__10__Impl rule__Talk__Group__11
            {
            pushFollow(FOLLOW_rule__Talk__Group__10__Impl_in_rule__Talk__Group__101541);
            rule__Talk__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__11_in_rule__Talk__Group__101544);
            rule__Talk__Group__11();

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
    // $ANTLR end "rule__Talk__Group__10"


    // $ANTLR start "rule__Talk__Group__10__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:799:1: rule__Talk__Group__10__Impl : ( ( rule__Talk__Group_10__0 )* ) ;
    public final void rule__Talk__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:803:1: ( ( ( rule__Talk__Group_10__0 )* ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:804:1: ( ( rule__Talk__Group_10__0 )* )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:804:1: ( ( rule__Talk__Group_10__0 )* )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:805:1: ( rule__Talk__Group_10__0 )*
            {
             before(grammarAccess.getTalkAccess().getGroup_10()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:806:1: ( rule__Talk__Group_10__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:806:2: rule__Talk__Group_10__0
            	    {
            	    pushFollow(FOLLOW_rule__Talk__Group_10__0_in_rule__Talk__Group__10__Impl1571);
            	    rule__Talk__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTalkAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Talk__Group__10__Impl"


    // $ANTLR start "rule__Talk__Group__11"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:816:1: rule__Talk__Group__11 : rule__Talk__Group__11__Impl ;
    public final void rule__Talk__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:820:1: ( rule__Talk__Group__11__Impl )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:821:2: rule__Talk__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Talk__Group__11__Impl_in_rule__Talk__Group__111602);
            rule__Talk__Group__11__Impl();

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
    // $ANTLR end "rule__Talk__Group__11"


    // $ANTLR start "rule__Talk__Group__11__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:827:1: rule__Talk__Group__11__Impl : ( '}' ) ;
    public final void rule__Talk__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:831:1: ( ( '}' ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:832:1: ( '}' )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:832:1: ( '}' )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:833:1: '}'
            {
             before(grammarAccess.getTalkAccess().getRightCurlyBracketKeyword_11()); 
            match(input,13,FOLLOW_13_in_rule__Talk__Group__11__Impl1630); 
             after(grammarAccess.getTalkAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Talk__Group__11__Impl"


    // $ANTLR start "rule__Talk__Group_5__0"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:870:1: rule__Talk__Group_5__0 : rule__Talk__Group_5__0__Impl rule__Talk__Group_5__1 ;
    public final void rule__Talk__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:874:1: ( rule__Talk__Group_5__0__Impl rule__Talk__Group_5__1 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:875:2: rule__Talk__Group_5__0__Impl rule__Talk__Group_5__1
            {
            pushFollow(FOLLOW_rule__Talk__Group_5__0__Impl_in_rule__Talk__Group_5__01685);
            rule__Talk__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group_5__1_in_rule__Talk__Group_5__01688);
            rule__Talk__Group_5__1();

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
    // $ANTLR end "rule__Talk__Group_5__0"


    // $ANTLR start "rule__Talk__Group_5__0__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:882:1: rule__Talk__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Talk__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:886:1: ( ( ',' ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:887:1: ( ',' )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:887:1: ( ',' )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:888:1: ','
            {
             before(grammarAccess.getTalkAccess().getCommaKeyword_5_0()); 
            match(input,19,FOLLOW_19_in_rule__Talk__Group_5__0__Impl1716); 
             after(grammarAccess.getTalkAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Talk__Group_5__0__Impl"


    // $ANTLR start "rule__Talk__Group_5__1"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:901:1: rule__Talk__Group_5__1 : rule__Talk__Group_5__1__Impl ;
    public final void rule__Talk__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:905:1: ( rule__Talk__Group_5__1__Impl )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:906:2: rule__Talk__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Talk__Group_5__1__Impl_in_rule__Talk__Group_5__11747);
            rule__Talk__Group_5__1__Impl();

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
    // $ANTLR end "rule__Talk__Group_5__1"


    // $ANTLR start "rule__Talk__Group_5__1__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:912:1: rule__Talk__Group_5__1__Impl : ( ( rule__Talk__SpeakersAssignment_5_1 ) ) ;
    public final void rule__Talk__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:916:1: ( ( ( rule__Talk__SpeakersAssignment_5_1 ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:917:1: ( ( rule__Talk__SpeakersAssignment_5_1 ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:917:1: ( ( rule__Talk__SpeakersAssignment_5_1 ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:918:1: ( rule__Talk__SpeakersAssignment_5_1 )
            {
             before(grammarAccess.getTalkAccess().getSpeakersAssignment_5_1()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:919:1: ( rule__Talk__SpeakersAssignment_5_1 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:919:2: rule__Talk__SpeakersAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Talk__SpeakersAssignment_5_1_in_rule__Talk__Group_5__1__Impl1774);
            rule__Talk__SpeakersAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getSpeakersAssignment_5_1()); 

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
    // $ANTLR end "rule__Talk__Group_5__1__Impl"


    // $ANTLR start "rule__Talk__Group_10__0"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:933:1: rule__Talk__Group_10__0 : rule__Talk__Group_10__0__Impl rule__Talk__Group_10__1 ;
    public final void rule__Talk__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:937:1: ( rule__Talk__Group_10__0__Impl rule__Talk__Group_10__1 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:938:2: rule__Talk__Group_10__0__Impl rule__Talk__Group_10__1
            {
            pushFollow(FOLLOW_rule__Talk__Group_10__0__Impl_in_rule__Talk__Group_10__01808);
            rule__Talk__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group_10__1_in_rule__Talk__Group_10__01811);
            rule__Talk__Group_10__1();

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
    // $ANTLR end "rule__Talk__Group_10__0"


    // $ANTLR start "rule__Talk__Group_10__0__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:945:1: rule__Talk__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Talk__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:949:1: ( ( ',' ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:950:1: ( ',' )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:950:1: ( ',' )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:951:1: ','
            {
             before(grammarAccess.getTalkAccess().getCommaKeyword_10_0()); 
            match(input,19,FOLLOW_19_in_rule__Talk__Group_10__0__Impl1839); 
             after(grammarAccess.getTalkAccess().getCommaKeyword_10_0()); 

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
    // $ANTLR end "rule__Talk__Group_10__0__Impl"


    // $ANTLR start "rule__Talk__Group_10__1"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:964:1: rule__Talk__Group_10__1 : rule__Talk__Group_10__1__Impl ;
    public final void rule__Talk__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:968:1: ( rule__Talk__Group_10__1__Impl )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:969:2: rule__Talk__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Talk__Group_10__1__Impl_in_rule__Talk__Group_10__11870);
            rule__Talk__Group_10__1__Impl();

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
    // $ANTLR end "rule__Talk__Group_10__1"


    // $ANTLR start "rule__Talk__Group_10__1__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:975:1: rule__Talk__Group_10__1__Impl : ( ( rule__Talk__ToolsAssignment_10_1 ) ) ;
    public final void rule__Talk__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:979:1: ( ( ( rule__Talk__ToolsAssignment_10_1 ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:980:1: ( ( rule__Talk__ToolsAssignment_10_1 ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:980:1: ( ( rule__Talk__ToolsAssignment_10_1 ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:981:1: ( rule__Talk__ToolsAssignment_10_1 )
            {
             before(grammarAccess.getTalkAccess().getToolsAssignment_10_1()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:982:1: ( rule__Talk__ToolsAssignment_10_1 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:982:2: rule__Talk__ToolsAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Talk__ToolsAssignment_10_1_in_rule__Talk__Group_10__1__Impl1897);
            rule__Talk__ToolsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getToolsAssignment_10_1()); 

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
    // $ANTLR end "rule__Talk__Group_10__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:996:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1000:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1001:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01931);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01934);
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
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1008:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1012:1: ( ( RULE_ID ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1013:1: ( RULE_ID )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1013:1: ( RULE_ID )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1014:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1961); 
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
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1025:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1029:1: ( rule__FQN__Group__1__Impl )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1030:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11990);
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
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1036:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1040:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1041:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1041:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1042:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1043:1: ( rule__FQN__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1043:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl2017);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1057:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1061:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1062:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__02052);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__02055);
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
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1069:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1073:1: ( ( '.' ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1074:1: ( '.' )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1074:1: ( '.' )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1075:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__FQN__Group_1__0__Impl2083); 
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
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1088:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1092:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1093:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__12114);
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
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1099:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1103:1: ( ( RULE_ID ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1104:1: ( RULE_ID )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1104:1: ( RULE_ID )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1105:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl2141); 
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


    // $ANTLR start "rule__FQNWithWildcard__Group__0"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1120:1: rule__FQNWithWildcard__Group__0 : rule__FQNWithWildcard__Group__0__Impl rule__FQNWithWildcard__Group__1 ;
    public final void rule__FQNWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1124:1: ( rule__FQNWithWildcard__Group__0__Impl rule__FQNWithWildcard__Group__1 )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1125:2: rule__FQNWithWildcard__Group__0__Impl rule__FQNWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__0__Impl_in_rule__FQNWithWildcard__Group__02174);
            rule__FQNWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__1_in_rule__FQNWithWildcard__Group__02177);
            rule__FQNWithWildcard__Group__1();

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
    // $ANTLR end "rule__FQNWithWildcard__Group__0"


    // $ANTLR start "rule__FQNWithWildcard__Group__0__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1132:1: rule__FQNWithWildcard__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FQNWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1136:1: ( ( ruleFQN ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1137:1: ( ruleFQN )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1137:1: ( ruleFQN )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1138:1: ruleFQN
            {
             before(grammarAccess.getFQNWithWildcardAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__FQNWithWildcard__Group__0__Impl2204);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNWithWildcardAccess().getFQNParserRuleCall_0()); 

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
    // $ANTLR end "rule__FQNWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__FQNWithWildcard__Group__1"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1149:1: rule__FQNWithWildcard__Group__1 : rule__FQNWithWildcard__Group__1__Impl ;
    public final void rule__FQNWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1153:1: ( rule__FQNWithWildcard__Group__1__Impl )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1154:2: rule__FQNWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__1__Impl_in_rule__FQNWithWildcard__Group__12233);
            rule__FQNWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__FQNWithWildcard__Group__1"


    // $ANTLR start "rule__FQNWithWildcard__Group__1__Impl"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1160:1: rule__FQNWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FQNWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1164:1: ( ( ( '.*' )? ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1165:1: ( ( '.*' )? )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1165:1: ( ( '.*' )? )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1166:1: ( '.*' )?
            {
             before(grammarAccess.getFQNWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1167:1: ( '.*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1168:2: '.*'
                    {
                    match(input,21,FOLLOW_21_in_rule__FQNWithWildcard__Group__1__Impl2262); 

                    }
                    break;

            }

             after(grammarAccess.getFQNWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__FQNWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__Conference__NameAssignment_1"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1184:1: rule__Conference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Conference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1188:1: ( ( RULE_ID ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1189:1: ( RULE_ID )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1189:1: ( RULE_ID )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1190:1: RULE_ID
            {
             before(grammarAccess.getConferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Conference__NameAssignment_12304); 
             after(grammarAccess.getConferenceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Conference__NameAssignment_1"


    // $ANTLR start "rule__Conference__ImportsAssignment_3"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1199:1: rule__Conference__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Conference__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1203:1: ( ( ruleImport ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1204:1: ( ruleImport )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1204:1: ( ruleImport )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1205:1: ruleImport
            {
             before(grammarAccess.getConferenceAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Conference__ImportsAssignment_32335);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getImportsImportParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Conference__ImportsAssignment_3"


    // $ANTLR start "rule__Conference__LocationAssignment_4"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1214:1: rule__Conference__LocationAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__Conference__LocationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1218:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1219:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1219:1: ( ( ruleFQN ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1220:1: ( ruleFQN )
            {
             before(grammarAccess.getConferenceAccess().getLocationLocationCrossReference_4_0()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1221:1: ( ruleFQN )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1222:1: ruleFQN
            {
             before(grammarAccess.getConferenceAccess().getLocationLocationFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Conference__LocationAssignment_42370);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getLocationLocationFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConferenceAccess().getLocationLocationCrossReference_4_0()); 

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
    // $ANTLR end "rule__Conference__LocationAssignment_4"


    // $ANTLR start "rule__Conference__TalksAssignment_5"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1233:1: rule__Conference__TalksAssignment_5 : ( ruleTalk ) ;
    public final void rule__Conference__TalksAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1237:1: ( ( ruleTalk ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1238:1: ( ruleTalk )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1238:1: ( ruleTalk )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1239:1: ruleTalk
            {
             before(grammarAccess.getConferenceAccess().getTalksTalkParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleTalk_in_rule__Conference__TalksAssignment_52405);
            ruleTalk();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getTalksTalkParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Conference__TalksAssignment_5"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1248:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleFQNWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1252:1: ( ( ruleFQNWithWildcard ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1253:1: ( ruleFQNWithWildcard )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1253:1: ( ruleFQNWithWildcard )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1254:1: ruleFQNWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceFQNWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQNWithWildcard_in_rule__Import__ImportedNamespaceAssignment_12436);
            ruleFQNWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceFQNWithWildcardParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Talk__NameAssignment_1"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1263:1: rule__Talk__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Talk__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1267:1: ( ( RULE_ID ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1268:1: ( RULE_ID )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1268:1: ( RULE_ID )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1269:1: RULE_ID
            {
             before(grammarAccess.getTalkAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Talk__NameAssignment_12467); 
             after(grammarAccess.getTalkAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Talk__NameAssignment_1"


    // $ANTLR start "rule__Talk__SpeakersAssignment_4"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1278:1: rule__Talk__SpeakersAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__Talk__SpeakersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1282:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1283:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1283:1: ( ( ruleFQN ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1284:1: ( ruleFQN )
            {
             before(grammarAccess.getTalkAccess().getSpeakersSpeakerCrossReference_4_0()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1285:1: ( ruleFQN )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1286:1: ruleFQN
            {
             before(grammarAccess.getTalkAccess().getSpeakersSpeakerFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Talk__SpeakersAssignment_42502);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getTalkAccess().getSpeakersSpeakerFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTalkAccess().getSpeakersSpeakerCrossReference_4_0()); 

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
    // $ANTLR end "rule__Talk__SpeakersAssignment_4"


    // $ANTLR start "rule__Talk__SpeakersAssignment_5_1"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1297:1: rule__Talk__SpeakersAssignment_5_1 : ( ( ruleFQN ) ) ;
    public final void rule__Talk__SpeakersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1301:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1302:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1302:1: ( ( ruleFQN ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1303:1: ( ruleFQN )
            {
             before(grammarAccess.getTalkAccess().getSpeakersSpeakerCrossReference_5_1_0()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1304:1: ( ruleFQN )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1305:1: ruleFQN
            {
             before(grammarAccess.getTalkAccess().getSpeakersSpeakerFQNParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Talk__SpeakersAssignment_5_12541);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getTalkAccess().getSpeakersSpeakerFQNParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getTalkAccess().getSpeakersSpeakerCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Talk__SpeakersAssignment_5_1"


    // $ANTLR start "rule__Talk__RoomAssignment_7"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1316:1: rule__Talk__RoomAssignment_7 : ( ( ruleFQN ) ) ;
    public final void rule__Talk__RoomAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1320:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1321:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1321:1: ( ( ruleFQN ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1322:1: ( ruleFQN )
            {
             before(grammarAccess.getTalkAccess().getRoomRoomCrossReference_7_0()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1323:1: ( ruleFQN )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1324:1: ruleFQN
            {
             before(grammarAccess.getTalkAccess().getRoomRoomFQNParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Talk__RoomAssignment_72580);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getTalkAccess().getRoomRoomFQNParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getTalkAccess().getRoomRoomCrossReference_7_0()); 

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
    // $ANTLR end "rule__Talk__RoomAssignment_7"


    // $ANTLR start "rule__Talk__ToolsAssignment_9"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1335:1: rule__Talk__ToolsAssignment_9 : ( ( ruleFQN ) ) ;
    public final void rule__Talk__ToolsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1339:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1340:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1340:1: ( ( ruleFQN ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1341:1: ( ruleFQN )
            {
             before(grammarAccess.getTalkAccess().getToolsToolCrossReference_9_0()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1342:1: ( ruleFQN )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1343:1: ruleFQN
            {
             before(grammarAccess.getTalkAccess().getToolsToolFQNParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Talk__ToolsAssignment_92619);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getTalkAccess().getToolsToolFQNParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getTalkAccess().getToolsToolCrossReference_9_0()); 

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
    // $ANTLR end "rule__Talk__ToolsAssignment_9"


    // $ANTLR start "rule__Talk__ToolsAssignment_10_1"
    // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1354:1: rule__Talk__ToolsAssignment_10_1 : ( ( ruleFQN ) ) ;
    public final void rule__Talk__ToolsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1358:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1359:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1359:1: ( ( ruleFQN ) )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1360:1: ( ruleFQN )
            {
             before(grammarAccess.getTalkAccess().getToolsToolCrossReference_10_1_0()); 
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1361:1: ( ruleFQN )
            // ../org.eclipse.eclipsecon.conference.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalConference.g:1362:1: ruleFQN
            {
             before(grammarAccess.getTalkAccess().getToolsToolFQNParserRuleCall_10_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Talk__ToolsAssignment_10_12658);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getTalkAccess().getToolsToolFQNParserRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getTalkAccess().getToolsToolCrossReference_10_1_0()); 

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
    // $ANTLR end "rule__Talk__ToolsAssignment_10_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleConference_in_entryRuleConference61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConference68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conference__Group__0_in_ruleConference94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTalk_in_entryRuleTalk181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTalk188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__0_in_ruleTalk214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQNWithWildcard308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__0_in_ruleFQNWithWildcard334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conference__Group__0__Impl_in_rule__Conference__Group__0368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Conference__Group__1_in_rule__Conference__Group__0371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Conference__Group__0__Impl399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conference__Group__1__Impl_in_rule__Conference__Group__1430 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Conference__Group__2_in_rule__Conference__Group__1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conference__NameAssignment_1_in_rule__Conference__Group__1__Impl460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conference__Group__2__Impl_in_rule__Conference__Group__2490 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Conference__Group__3_in_rule__Conference__Group__2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Conference__Group__2__Impl521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conference__Group__3__Impl_in_rule__Conference__Group__3552 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Conference__Group__4_in_rule__Conference__Group__3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conference__ImportsAssignment_3_in_rule__Conference__Group__3__Impl582 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Conference__Group__4__Impl_in_rule__Conference__Group__4613 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Conference__Group__5_in_rule__Conference__Group__4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conference__LocationAssignment_4_in_rule__Conference__Group__4__Impl643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conference__Group__5__Impl_in_rule__Conference__Group__5673 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Conference__Group__6_in_rule__Conference__Group__5676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conference__TalksAssignment_5_in_rule__Conference__Group__5__Impl703 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Conference__Group__6__Impl_in_rule__Conference__Group__6734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Conference__Group__6__Impl762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0807 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Import__Group__0__Impl838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__0__Impl_in_rule__Talk__Group__0930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Talk__Group__1_in_rule__Talk__Group__0933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Talk__Group__0__Impl961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__1__Impl_in_rule__Talk__Group__1992 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Talk__Group__2_in_rule__Talk__Group__1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__NameAssignment_1_in_rule__Talk__Group__1__Impl1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__2__Impl_in_rule__Talk__Group__21052 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Talk__Group__3_in_rule__Talk__Group__21055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Talk__Group__2__Impl1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__3__Impl_in_rule__Talk__Group__31114 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Talk__Group__4_in_rule__Talk__Group__31117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Talk__Group__3__Impl1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__4__Impl_in_rule__Talk__Group__41176 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__Talk__Group__5_in_rule__Talk__Group__41179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__SpeakersAssignment_4_in_rule__Talk__Group__4__Impl1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__5__Impl_in_rule__Talk__Group__51236 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__Talk__Group__6_in_rule__Talk__Group__51239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group_5__0_in_rule__Talk__Group__5__Impl1266 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Talk__Group__6__Impl_in_rule__Talk__Group__61297 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Talk__Group__7_in_rule__Talk__Group__61300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Talk__Group__6__Impl1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__7__Impl_in_rule__Talk__Group__71359 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Talk__Group__8_in_rule__Talk__Group__71362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__RoomAssignment_7_in_rule__Talk__Group__7__Impl1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__8__Impl_in_rule__Talk__Group__81419 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Talk__Group__9_in_rule__Talk__Group__81422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Talk__Group__8__Impl1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__9__Impl_in_rule__Talk__Group__91481 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_rule__Talk__Group__10_in_rule__Talk__Group__91484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__ToolsAssignment_9_in_rule__Talk__Group__9__Impl1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__10__Impl_in_rule__Talk__Group__101541 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_rule__Talk__Group__11_in_rule__Talk__Group__101544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group_10__0_in_rule__Talk__Group__10__Impl1571 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Talk__Group__11__Impl_in_rule__Talk__Group__111602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Talk__Group__11__Impl1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group_5__0__Impl_in_rule__Talk__Group_5__01685 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Talk__Group_5__1_in_rule__Talk__Group_5__01688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Talk__Group_5__0__Impl1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group_5__1__Impl_in_rule__Talk__Group_5__11747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__SpeakersAssignment_5_1_in_rule__Talk__Group_5__1__Impl1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group_10__0__Impl_in_rule__Talk__Group_10__01808 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Talk__Group_10__1_in_rule__Talk__Group_10__01811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Talk__Group_10__0__Impl1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group_10__1__Impl_in_rule__Talk__Group_10__11870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__ToolsAssignment_10_1_in_rule__Talk__Group_10__1__Impl1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01931 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl2017 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__02052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__02055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FQN__Group_1__0__Impl2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__12114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__0__Impl_in_rule__FQNWithWildcard__Group__02174 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__1_in_rule__FQNWithWildcard__Group__02177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__FQNWithWildcard__Group__0__Impl2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__1__Impl_in_rule__FQNWithWildcard__Group__12233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FQNWithWildcard__Group__1__Impl2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Conference__NameAssignment_12304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Conference__ImportsAssignment_32335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Conference__LocationAssignment_42370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTalk_in_rule__Conference__TalksAssignment_52405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_rule__Import__ImportedNamespaceAssignment_12436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Talk__NameAssignment_12467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Talk__SpeakersAssignment_42502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Talk__SpeakersAssignment_5_12541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Talk__RoomAssignment_72580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Talk__ToolsAssignment_92619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Talk__ToolsAssignment_10_12658 = new BitSet(new long[]{0x0000000000000002L});

}