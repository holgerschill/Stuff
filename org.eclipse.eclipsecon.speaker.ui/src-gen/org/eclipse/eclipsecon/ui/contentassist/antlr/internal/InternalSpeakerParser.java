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
import org.eclipse.eclipsecon.services.SpeakerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpeakerParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'speaker'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalSpeakerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpeakerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpeakerParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g"; }


     
     	private SpeakerGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SpeakerGrammarAccess grammarAccess) {
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
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:60:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:61:1: ( rulePackage EOF )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:62:1: rulePackage EOF
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
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:69:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:73:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:74:1: ( ( rule__Package__Group__0 ) )
            {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:74:1: ( ( rule__Package__Group__0 ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:75:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:76:1: ( rule__Package__Group__0 )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:76:2: rule__Package__Group__0
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


    // $ANTLR start "entryRuleSpeaker"
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:88:1: entryRuleSpeaker : ruleSpeaker EOF ;
    public final void entryRuleSpeaker() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:89:1: ( ruleSpeaker EOF )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:90:1: ruleSpeaker EOF
            {
             before(grammarAccess.getSpeakerRule()); 
            pushFollow(FOLLOW_ruleSpeaker_in_entryRuleSpeaker121);
            ruleSpeaker();

            state._fsp--;

             after(grammarAccess.getSpeakerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpeaker128); 

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
    // $ANTLR end "entryRuleSpeaker"


    // $ANTLR start "ruleSpeaker"
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:97:1: ruleSpeaker : ( ( rule__Speaker__Group__0 ) ) ;
    public final void ruleSpeaker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:101:2: ( ( ( rule__Speaker__Group__0 ) ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:102:1: ( ( rule__Speaker__Group__0 ) )
            {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:102:1: ( ( rule__Speaker__Group__0 ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:103:1: ( rule__Speaker__Group__0 )
            {
             before(grammarAccess.getSpeakerAccess().getGroup()); 
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:104:1: ( rule__Speaker__Group__0 )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:104:2: rule__Speaker__Group__0
            {
            pushFollow(FOLLOW_rule__Speaker__Group__0_in_ruleSpeaker154);
            rule__Speaker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpeakerAccess().getGroup()); 

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
    // $ANTLR end "ruleSpeaker"


    // $ANTLR start "entryRuleFQN"
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:116:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:117:1: ( ruleFQN EOF )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:118:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN181);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN188); 

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
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:125:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:129:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:130:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:130:1: ( ( rule__FQN__Group__0 ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:131:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:132:1: ( rule__FQN__Group__0 )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:132:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN214);
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


    // $ANTLR start "rule__Package__Group__0"
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:146:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:150:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:151:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0248);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0251);
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
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:158:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:162:1: ( ( 'package' ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:163:1: ( 'package' )
            {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:163:1: ( 'package' )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:164:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Package__Group__0__Impl279); 
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
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:177:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:181:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:182:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1310);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1313);
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
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:189:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:193:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:194:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:194:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:195:1: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:196:1: ( rule__Package__NameAssignment_1 )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:196:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl340);
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
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:206:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:210:1: ( rule__Package__Group__2__Impl )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:211:2: rule__Package__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2370);
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
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:217:1: rule__Package__Group__2__Impl : ( ( rule__Package__SpeakersAssignment_2 )* ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:221:1: ( ( ( rule__Package__SpeakersAssignment_2 )* ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:222:1: ( ( rule__Package__SpeakersAssignment_2 )* )
            {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:222:1: ( ( rule__Package__SpeakersAssignment_2 )* )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:223:1: ( rule__Package__SpeakersAssignment_2 )*
            {
             before(grammarAccess.getPackageAccess().getSpeakersAssignment_2()); 
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:224:1: ( rule__Package__SpeakersAssignment_2 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:224:2: rule__Package__SpeakersAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Package__SpeakersAssignment_2_in_rule__Package__Group__2__Impl397);
            	    rule__Package__SpeakersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getSpeakersAssignment_2()); 

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


    // $ANTLR start "rule__Speaker__Group__0"
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:240:1: rule__Speaker__Group__0 : rule__Speaker__Group__0__Impl rule__Speaker__Group__1 ;
    public final void rule__Speaker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:244:1: ( rule__Speaker__Group__0__Impl rule__Speaker__Group__1 )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:245:2: rule__Speaker__Group__0__Impl rule__Speaker__Group__1
            {
            pushFollow(FOLLOW_rule__Speaker__Group__0__Impl_in_rule__Speaker__Group__0434);
            rule__Speaker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Speaker__Group__1_in_rule__Speaker__Group__0437);
            rule__Speaker__Group__1();

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
    // $ANTLR end "rule__Speaker__Group__0"


    // $ANTLR start "rule__Speaker__Group__0__Impl"
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:252:1: rule__Speaker__Group__0__Impl : ( 'speaker' ) ;
    public final void rule__Speaker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:256:1: ( ( 'speaker' ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:257:1: ( 'speaker' )
            {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:257:1: ( 'speaker' )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:258:1: 'speaker'
            {
             before(grammarAccess.getSpeakerAccess().getSpeakerKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Speaker__Group__0__Impl465); 
             after(grammarAccess.getSpeakerAccess().getSpeakerKeyword_0()); 

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
    // $ANTLR end "rule__Speaker__Group__0__Impl"


    // $ANTLR start "rule__Speaker__Group__1"
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:271:1: rule__Speaker__Group__1 : rule__Speaker__Group__1__Impl ;
    public final void rule__Speaker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:275:1: ( rule__Speaker__Group__1__Impl )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:276:2: rule__Speaker__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Speaker__Group__1__Impl_in_rule__Speaker__Group__1496);
            rule__Speaker__Group__1__Impl();

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
    // $ANTLR end "rule__Speaker__Group__1"


    // $ANTLR start "rule__Speaker__Group__1__Impl"
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:282:1: rule__Speaker__Group__1__Impl : ( ( rule__Speaker__NameAssignment_1 ) ) ;
    public final void rule__Speaker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:286:1: ( ( ( rule__Speaker__NameAssignment_1 ) ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:287:1: ( ( rule__Speaker__NameAssignment_1 ) )
            {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:287:1: ( ( rule__Speaker__NameAssignment_1 ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:288:1: ( rule__Speaker__NameAssignment_1 )
            {
             before(grammarAccess.getSpeakerAccess().getNameAssignment_1()); 
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:289:1: ( rule__Speaker__NameAssignment_1 )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:289:2: rule__Speaker__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Speaker__NameAssignment_1_in_rule__Speaker__Group__1__Impl523);
            rule__Speaker__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpeakerAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Speaker__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:303:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:307:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:308:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__0557);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__0560);
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
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:315:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:319:1: ( ( RULE_ID ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:320:1: ( RULE_ID )
            {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:320:1: ( RULE_ID )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:321:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl587); 
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
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:332:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:336:1: ( rule__FQN__Group__1__Impl )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:337:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__1616);
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
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:343:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:347:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:348:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:348:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:349:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:350:1: ( rule__FQN__Group_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:350:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl643);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:364:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:368:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:369:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__0678);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__0681);
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
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:376:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:380:1: ( ( '.' ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:381:1: ( '.' )
            {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:381:1: ( '.' )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:382:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__FQN__Group_1__0__Impl709); 
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
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:395:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:399:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:400:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__1740);
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
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:406:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:410:1: ( ( RULE_ID ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:411:1: ( RULE_ID )
            {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:411:1: ( RULE_ID )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:412:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl767); 
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
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:428:1: rule__Package__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:432:1: ( ( ruleFQN ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:433:1: ( ruleFQN )
            {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:433:1: ( ruleFQN )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:434:1: ruleFQN
            {
             before(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Package__NameAssignment_1805);
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


    // $ANTLR start "rule__Package__SpeakersAssignment_2"
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:443:1: rule__Package__SpeakersAssignment_2 : ( ruleSpeaker ) ;
    public final void rule__Package__SpeakersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:447:1: ( ( ruleSpeaker ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:448:1: ( ruleSpeaker )
            {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:448:1: ( ruleSpeaker )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:449:1: ruleSpeaker
            {
             before(grammarAccess.getPackageAccess().getSpeakersSpeakerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSpeaker_in_rule__Package__SpeakersAssignment_2836);
            ruleSpeaker();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getSpeakersSpeakerParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Package__SpeakersAssignment_2"


    // $ANTLR start "rule__Speaker__NameAssignment_1"
    // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:458:1: rule__Speaker__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Speaker__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:462:1: ( ( RULE_ID ) )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:463:1: ( RULE_ID )
            {
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:463:1: ( RULE_ID )
            // ../org.eclipse.eclipsecon.speaker.ui/src-gen/org/eclipse/eclipsecon/ui/contentassist/antlr/internal/InternalSpeaker.g:464:1: RULE_ID
            {
             before(grammarAccess.getSpeakerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Speaker__NameAssignment_1867); 
             after(grammarAccess.getSpeakerAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Speaker__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpeaker_in_entryRuleSpeaker121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpeaker128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Speaker__Group__0_in_ruleSpeaker154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Package__Group__0__Impl279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1310 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__SpeakersAssignment_2_in_rule__Package__Group__2__Impl397 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Speaker__Group__0__Impl_in_rule__Speaker__Group__0434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Speaker__Group__1_in_rule__Speaker__Group__0437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Speaker__Group__0__Impl465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Speaker__Group__1__Impl_in_rule__Speaker__Group__1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Speaker__NameAssignment_1_in_rule__Speaker__Group__1__Impl523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__0557 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__0560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl643 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__0678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__0681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__FQN__Group_1__0__Impl709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Package__NameAssignment_1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpeaker_in_rule__Package__SpeakersAssignment_2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Speaker__NameAssignment_1867 = new BitSet(new long[]{0x0000000000000002L});

}