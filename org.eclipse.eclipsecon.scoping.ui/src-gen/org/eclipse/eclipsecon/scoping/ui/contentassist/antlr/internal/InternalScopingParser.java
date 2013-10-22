package org.eclipse.eclipsecon.scoping.ui.contentassist.antlr.internal; 

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
import org.eclipse.eclipsecon.scoping.services.ScopingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScopingParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'importURI'", "'package'", "'import'", "'element'", "'refs'", "'.'", "'.*'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalScopingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalScopingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalScopingParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g"; }


     
     	private ScopingGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ScopingGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:61:1: ( ruleModel EOF )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:76:1: ( rule__Model__Group__0 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackage"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:88:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:89:1: ( rulePackage EOF )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:90:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage121);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage128); 

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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:97:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:101:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:102:1: ( ( rule__Package__Group__0 ) )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:102:1: ( ( rule__Package__Group__0 ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:103:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:104:1: ( rule__Package__Group__0 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:104:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage154);
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


    // $ANTLR start "entryRuleImport"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:116:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:117:1: ( ruleImport EOF )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:118:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport181);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport188); 

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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:125:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:129:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:130:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:130:1: ( ( rule__Import__Group__0 ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:131:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:132:1: ( rule__Import__Group__0 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:132:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport214);
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


    // $ANTLR start "entryRuleElement"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:144:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:145:1: ( ruleElement EOF )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:146:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement241);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement248); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:153:1: ruleElement : ( ( rule__Element__Group__0 ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:157:2: ( ( ( rule__Element__Group__0 ) ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:158:1: ( ( rule__Element__Group__0 ) )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:158:1: ( ( rule__Element__Group__0 ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:159:1: ( rule__Element__Group__0 )
            {
             before(grammarAccess.getElementAccess().getGroup()); 
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:160:1: ( rule__Element__Group__0 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:160:2: rule__Element__Group__0
            {
            pushFollow(FOLLOW_rule__Element__Group__0_in_ruleElement274);
            rule__Element__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getGroup()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleFQN"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:172:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:173:1: ( ruleFQN EOF )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:174:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN301);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN308); 

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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:181:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:185:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:186:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:186:1: ( ( rule__FQN__Group__0 ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:187:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:188:1: ( rule__FQN__Group__0 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:188:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN334);
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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:200:1: entryRuleFQNWithWildcard : ruleFQNWithWildcard EOF ;
    public final void entryRuleFQNWithWildcard() throws RecognitionException {
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:201:1: ( ruleFQNWithWildcard EOF )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:202:1: ruleFQNWithWildcard EOF
            {
             before(grammarAccess.getFQNWithWildcardRule()); 
            pushFollow(FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard361);
            ruleFQNWithWildcard();

            state._fsp--;

             after(grammarAccess.getFQNWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQNWithWildcard368); 

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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:209:1: ruleFQNWithWildcard : ( ( rule__FQNWithWildcard__Group__0 ) ) ;
    public final void ruleFQNWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:213:2: ( ( ( rule__FQNWithWildcard__Group__0 ) ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:214:1: ( ( rule__FQNWithWildcard__Group__0 ) )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:214:1: ( ( rule__FQNWithWildcard__Group__0 ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:215:1: ( rule__FQNWithWildcard__Group__0 )
            {
             before(grammarAccess.getFQNWithWildcardAccess().getGroup()); 
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:216:1: ( rule__FQNWithWildcard__Group__0 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:216:2: rule__FQNWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__0_in_ruleFQNWithWildcard394);
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


    // $ANTLR start "rule__Model__Group__0"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:230:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:234:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:235:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0428);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0431);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:242:1: rule__Model__Group__0__Impl : ( ( rule__Model__Group_0__0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:246:1: ( ( ( rule__Model__Group_0__0 )? ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:247:1: ( ( rule__Model__Group_0__0 )? )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:247:1: ( ( rule__Model__Group_0__0 )? )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:248:1: ( rule__Model__Group_0__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_0()); 
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:249:1: ( rule__Model__Group_0__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:249:2: rule__Model__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_0__0_in_rule__Model__Group__0__Impl458);
                    rule__Model__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:259:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:263:1: ( rule__Model__Group__1__Impl )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:264:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1489);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:270:1: rule__Model__Group__1__Impl : ( ( rule__Model__PackagesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:274:1: ( ( ( rule__Model__PackagesAssignment_1 )* ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:275:1: ( ( rule__Model__PackagesAssignment_1 )* )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:275:1: ( ( rule__Model__PackagesAssignment_1 )* )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:276:1: ( rule__Model__PackagesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getPackagesAssignment_1()); 
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:277:1: ( rule__Model__PackagesAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:277:2: rule__Model__PackagesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__PackagesAssignment_1_in_rule__Model__Group__1__Impl516);
            	    rule__Model__PackagesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPackagesAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group_0__0"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:291:1: rule__Model__Group_0__0 : rule__Model__Group_0__0__Impl rule__Model__Group_0__1 ;
    public final void rule__Model__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:295:1: ( rule__Model__Group_0__0__Impl rule__Model__Group_0__1 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:296:2: rule__Model__Group_0__0__Impl rule__Model__Group_0__1
            {
            pushFollow(FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__0551);
            rule__Model__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__0554);
            rule__Model__Group_0__1();

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
    // $ANTLR end "rule__Model__Group_0__0"


    // $ANTLR start "rule__Model__Group_0__0__Impl"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:303:1: rule__Model__Group_0__0__Impl : ( 'importURI' ) ;
    public final void rule__Model__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:307:1: ( ( 'importURI' ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:308:1: ( 'importURI' )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:308:1: ( 'importURI' )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:309:1: 'importURI'
            {
             before(grammarAccess.getModelAccess().getImportURIKeyword_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Model__Group_0__0__Impl582); 
             after(grammarAccess.getModelAccess().getImportURIKeyword_0_0()); 

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
    // $ANTLR end "rule__Model__Group_0__0__Impl"


    // $ANTLR start "rule__Model__Group_0__1"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:322:1: rule__Model__Group_0__1 : rule__Model__Group_0__1__Impl ;
    public final void rule__Model__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:326:1: ( rule__Model__Group_0__1__Impl )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:327:2: rule__Model__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__1613);
            rule__Model__Group_0__1__Impl();

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
    // $ANTLR end "rule__Model__Group_0__1"


    // $ANTLR start "rule__Model__Group_0__1__Impl"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:333:1: rule__Model__Group_0__1__Impl : ( ( rule__Model__ImportURIAssignment_0_1 ) ) ;
    public final void rule__Model__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:337:1: ( ( ( rule__Model__ImportURIAssignment_0_1 ) ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:338:1: ( ( rule__Model__ImportURIAssignment_0_1 ) )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:338:1: ( ( rule__Model__ImportURIAssignment_0_1 ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:339:1: ( rule__Model__ImportURIAssignment_0_1 )
            {
             before(grammarAccess.getModelAccess().getImportURIAssignment_0_1()); 
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:340:1: ( rule__Model__ImportURIAssignment_0_1 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:340:2: rule__Model__ImportURIAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Model__ImportURIAssignment_0_1_in_rule__Model__Group_0__1__Impl640);
            rule__Model__ImportURIAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getImportURIAssignment_0_1()); 

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
    // $ANTLR end "rule__Model__Group_0__1__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:354:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:358:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:359:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0674);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0677);
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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:366:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:370:1: ( ( 'package' ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:371:1: ( 'package' )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:371:1: ( 'package' )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:372:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Package__Group__0__Impl705); 
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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:385:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:389:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:390:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1736);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1739);
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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:397:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:401:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:402:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:402:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:403:1: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:404:1: ( rule__Package__NameAssignment_1 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:404:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl766);
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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:414:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:418:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:419:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2796);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2799);
            rule__Package__Group__3();

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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:426:1: rule__Package__Group__2__Impl : ( ( rule__Package__ImportsAssignment_2 )* ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:430:1: ( ( ( rule__Package__ImportsAssignment_2 )* ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:431:1: ( ( rule__Package__ImportsAssignment_2 )* )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:431:1: ( ( rule__Package__ImportsAssignment_2 )* )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:432:1: ( rule__Package__ImportsAssignment_2 )*
            {
             before(grammarAccess.getPackageAccess().getImportsAssignment_2()); 
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:433:1: ( rule__Package__ImportsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:433:2: rule__Package__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Package__ImportsAssignment_2_in_rule__Package__Group__2__Impl826);
            	    rule__Package__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getImportsAssignment_2()); 

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


    // $ANTLR start "rule__Package__Group__3"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:443:1: rule__Package__Group__3 : rule__Package__Group__3__Impl ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:447:1: ( rule__Package__Group__3__Impl )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:448:2: rule__Package__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__3857);
            rule__Package__Group__3__Impl();

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
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:454:1: rule__Package__Group__3__Impl : ( ( rule__Package__ElementAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:458:1: ( ( ( rule__Package__ElementAssignment_3 )* ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:459:1: ( ( rule__Package__ElementAssignment_3 )* )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:459:1: ( ( rule__Package__ElementAssignment_3 )* )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:460:1: ( rule__Package__ElementAssignment_3 )*
            {
             before(grammarAccess.getPackageAccess().getElementAssignment_3()); 
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:461:1: ( rule__Package__ElementAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:461:2: rule__Package__ElementAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Package__ElementAssignment_3_in_rule__Package__Group__3__Impl884);
            	    rule__Package__ElementAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getElementAssignment_3()); 

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
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:479:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:483:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:484:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0923);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0926);
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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:491:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:495:1: ( ( 'import' ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:496:1: ( 'import' )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:496:1: ( 'import' )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:497:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Import__Group__0__Impl954); 
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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:510:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:514:1: ( rule__Import__Group__1__Impl )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:515:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1985);
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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:521:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:525:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:526:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:526:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:527:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:528:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:528:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1012);
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


    // $ANTLR start "rule__Element__Group__0"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:542:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:546:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:547:2: rule__Element__Group__0__Impl rule__Element__Group__1
            {
            pushFollow(FOLLOW_rule__Element__Group__0__Impl_in_rule__Element__Group__01046);
            rule__Element__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Element__Group__1_in_rule__Element__Group__01049);
            rule__Element__Group__1();

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
    // $ANTLR end "rule__Element__Group__0"


    // $ANTLR start "rule__Element__Group__0__Impl"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:554:1: rule__Element__Group__0__Impl : ( 'element' ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:558:1: ( ( 'element' ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:559:1: ( 'element' )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:559:1: ( 'element' )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:560:1: 'element'
            {
             before(grammarAccess.getElementAccess().getElementKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Element__Group__0__Impl1077); 
             after(grammarAccess.getElementAccess().getElementKeyword_0()); 

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
    // $ANTLR end "rule__Element__Group__0__Impl"


    // $ANTLR start "rule__Element__Group__1"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:573:1: rule__Element__Group__1 : rule__Element__Group__1__Impl rule__Element__Group__2 ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:577:1: ( rule__Element__Group__1__Impl rule__Element__Group__2 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:578:2: rule__Element__Group__1__Impl rule__Element__Group__2
            {
            pushFollow(FOLLOW_rule__Element__Group__1__Impl_in_rule__Element__Group__11108);
            rule__Element__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Element__Group__2_in_rule__Element__Group__11111);
            rule__Element__Group__2();

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
    // $ANTLR end "rule__Element__Group__1"


    // $ANTLR start "rule__Element__Group__1__Impl"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:585:1: rule__Element__Group__1__Impl : ( ( rule__Element__NameAssignment_1 ) ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:589:1: ( ( ( rule__Element__NameAssignment_1 ) ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:590:1: ( ( rule__Element__NameAssignment_1 ) )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:590:1: ( ( rule__Element__NameAssignment_1 ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:591:1: ( rule__Element__NameAssignment_1 )
            {
             before(grammarAccess.getElementAccess().getNameAssignment_1()); 
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:592:1: ( rule__Element__NameAssignment_1 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:592:2: rule__Element__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Element__NameAssignment_1_in_rule__Element__Group__1__Impl1138);
            rule__Element__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Element__Group__1__Impl"


    // $ANTLR start "rule__Element__Group__2"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:602:1: rule__Element__Group__2 : rule__Element__Group__2__Impl ;
    public final void rule__Element__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:606:1: ( rule__Element__Group__2__Impl )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:607:2: rule__Element__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Element__Group__2__Impl_in_rule__Element__Group__21168);
            rule__Element__Group__2__Impl();

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
    // $ANTLR end "rule__Element__Group__2"


    // $ANTLR start "rule__Element__Group__2__Impl"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:613:1: rule__Element__Group__2__Impl : ( ( rule__Element__Group_2__0 )? ) ;
    public final void rule__Element__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:617:1: ( ( ( rule__Element__Group_2__0 )? ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:618:1: ( ( rule__Element__Group_2__0 )? )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:618:1: ( ( rule__Element__Group_2__0 )? )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:619:1: ( rule__Element__Group_2__0 )?
            {
             before(grammarAccess.getElementAccess().getGroup_2()); 
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:620:1: ( rule__Element__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:620:2: rule__Element__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Element__Group_2__0_in_rule__Element__Group__2__Impl1195);
                    rule__Element__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Element__Group__2__Impl"


    // $ANTLR start "rule__Element__Group_2__0"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:636:1: rule__Element__Group_2__0 : rule__Element__Group_2__0__Impl rule__Element__Group_2__1 ;
    public final void rule__Element__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:640:1: ( rule__Element__Group_2__0__Impl rule__Element__Group_2__1 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:641:2: rule__Element__Group_2__0__Impl rule__Element__Group_2__1
            {
            pushFollow(FOLLOW_rule__Element__Group_2__0__Impl_in_rule__Element__Group_2__01232);
            rule__Element__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Element__Group_2__1_in_rule__Element__Group_2__01235);
            rule__Element__Group_2__1();

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
    // $ANTLR end "rule__Element__Group_2__0"


    // $ANTLR start "rule__Element__Group_2__0__Impl"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:648:1: rule__Element__Group_2__0__Impl : ( 'refs' ) ;
    public final void rule__Element__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:652:1: ( ( 'refs' ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:653:1: ( 'refs' )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:653:1: ( 'refs' )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:654:1: 'refs'
            {
             before(grammarAccess.getElementAccess().getRefsKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__Element__Group_2__0__Impl1263); 
             after(grammarAccess.getElementAccess().getRefsKeyword_2_0()); 

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
    // $ANTLR end "rule__Element__Group_2__0__Impl"


    // $ANTLR start "rule__Element__Group_2__1"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:667:1: rule__Element__Group_2__1 : rule__Element__Group_2__1__Impl ;
    public final void rule__Element__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:671:1: ( rule__Element__Group_2__1__Impl )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:672:2: rule__Element__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Element__Group_2__1__Impl_in_rule__Element__Group_2__11294);
            rule__Element__Group_2__1__Impl();

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
    // $ANTLR end "rule__Element__Group_2__1"


    // $ANTLR start "rule__Element__Group_2__1__Impl"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:678:1: rule__Element__Group_2__1__Impl : ( ( rule__Element__RefAssignment_2_1 ) ) ;
    public final void rule__Element__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:682:1: ( ( ( rule__Element__RefAssignment_2_1 ) ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:683:1: ( ( rule__Element__RefAssignment_2_1 ) )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:683:1: ( ( rule__Element__RefAssignment_2_1 ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:684:1: ( rule__Element__RefAssignment_2_1 )
            {
             before(grammarAccess.getElementAccess().getRefAssignment_2_1()); 
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:685:1: ( rule__Element__RefAssignment_2_1 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:685:2: rule__Element__RefAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Element__RefAssignment_2_1_in_rule__Element__Group_2__1__Impl1321);
            rule__Element__RefAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getRefAssignment_2_1()); 

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
    // $ANTLR end "rule__Element__Group_2__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:699:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:703:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:704:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01355);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01358);
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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:711:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:715:1: ( ( RULE_ID ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:716:1: ( RULE_ID )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:716:1: ( RULE_ID )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:717:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1385); 
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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:728:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:732:1: ( rule__FQN__Group__1__Impl )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:733:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11414);
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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:739:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:743:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:744:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:744:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:745:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:746:1: ( rule__FQN__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:746:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1441);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:760:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:764:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:765:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01476);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01479);
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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:772:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:776:1: ( ( '.' ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:777:1: ( '.' )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:777:1: ( '.' )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:778:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__FQN__Group_1__0__Impl1507); 
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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:791:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:795:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:796:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11538);
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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:802:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:806:1: ( ( RULE_ID ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:807:1: ( RULE_ID )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:807:1: ( RULE_ID )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:808:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1565); 
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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:823:1: rule__FQNWithWildcard__Group__0 : rule__FQNWithWildcard__Group__0__Impl rule__FQNWithWildcard__Group__1 ;
    public final void rule__FQNWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:827:1: ( rule__FQNWithWildcard__Group__0__Impl rule__FQNWithWildcard__Group__1 )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:828:2: rule__FQNWithWildcard__Group__0__Impl rule__FQNWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__0__Impl_in_rule__FQNWithWildcard__Group__01598);
            rule__FQNWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__1_in_rule__FQNWithWildcard__Group__01601);
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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:835:1: rule__FQNWithWildcard__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FQNWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:839:1: ( ( ruleFQN ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:840:1: ( ruleFQN )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:840:1: ( ruleFQN )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:841:1: ruleFQN
            {
             before(grammarAccess.getFQNWithWildcardAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__FQNWithWildcard__Group__0__Impl1628);
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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:852:1: rule__FQNWithWildcard__Group__1 : rule__FQNWithWildcard__Group__1__Impl ;
    public final void rule__FQNWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:856:1: ( rule__FQNWithWildcard__Group__1__Impl )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:857:2: rule__FQNWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__1__Impl_in_rule__FQNWithWildcard__Group__11657);
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
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:863:1: rule__FQNWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FQNWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:867:1: ( ( ( '.*' )? ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:868:1: ( ( '.*' )? )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:868:1: ( ( '.*' )? )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:869:1: ( '.*' )?
            {
             before(grammarAccess.getFQNWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:870:1: ( '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:871:2: '.*'
                    {
                    match(input,17,FOLLOW_17_in_rule__FQNWithWildcard__Group__1__Impl1686); 

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


    // $ANTLR start "rule__Model__ImportURIAssignment_0_1"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:887:1: rule__Model__ImportURIAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Model__ImportURIAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:891:1: ( ( RULE_STRING ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:892:1: ( RULE_STRING )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:892:1: ( RULE_STRING )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:893:1: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getImportURISTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Model__ImportURIAssignment_0_11728); 
             after(grammarAccess.getModelAccess().getImportURISTRINGTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Model__ImportURIAssignment_0_1"


    // $ANTLR start "rule__Model__PackagesAssignment_1"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:902:1: rule__Model__PackagesAssignment_1 : ( rulePackage ) ;
    public final void rule__Model__PackagesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:906:1: ( ( rulePackage ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:907:1: ( rulePackage )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:907:1: ( rulePackage )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:908:1: rulePackage
            {
             before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_11759);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__PackagesAssignment_1"


    // $ANTLR start "rule__Package__NameAssignment_1"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:917:1: rule__Package__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:921:1: ( ( ruleFQN ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:922:1: ( ruleFQN )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:922:1: ( ruleFQN )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:923:1: ruleFQN
            {
             before(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Package__NameAssignment_11790);
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


    // $ANTLR start "rule__Package__ImportsAssignment_2"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:932:1: rule__Package__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Package__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:936:1: ( ( ruleImport ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:937:1: ( ruleImport )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:937:1: ( ruleImport )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:938:1: ruleImport
            {
             before(grammarAccess.getPackageAccess().getImportsImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Package__ImportsAssignment_21821);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getImportsImportParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Package__ImportsAssignment_2"


    // $ANTLR start "rule__Package__ElementAssignment_3"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:947:1: rule__Package__ElementAssignment_3 : ( ruleElement ) ;
    public final void rule__Package__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:951:1: ( ( ruleElement ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:952:1: ( ruleElement )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:952:1: ( ruleElement )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:953:1: ruleElement
            {
             before(grammarAccess.getPackageAccess().getElementElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Package__ElementAssignment_31852);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getElementElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Package__ElementAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:962:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleFQNWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:966:1: ( ( ruleFQNWithWildcard ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:967:1: ( ruleFQNWithWildcard )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:967:1: ( ruleFQNWithWildcard )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:968:1: ruleFQNWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceFQNWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQNWithWildcard_in_rule__Import__ImportedNamespaceAssignment_11883);
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


    // $ANTLR start "rule__Element__NameAssignment_1"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:977:1: rule__Element__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Element__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:981:1: ( ( RULE_ID ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:982:1: ( RULE_ID )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:982:1: ( RULE_ID )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:983:1: RULE_ID
            {
             before(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Element__NameAssignment_11914); 
             after(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Element__NameAssignment_1"


    // $ANTLR start "rule__Element__RefAssignment_2_1"
    // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:992:1: rule__Element__RefAssignment_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__Element__RefAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:996:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:997:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:997:1: ( ( ruleFQN ) )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:998:1: ( ruleFQN )
            {
             before(grammarAccess.getElementAccess().getRefElementCrossReference_2_1_0()); 
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:999:1: ( ruleFQN )
            // ../org.eclipse.eclipsecon.scoping.ui/src-gen/org/eclipse/eclipsecon/scoping/ui/contentassist/antlr/internal/InternalScoping.g:1000:1: ruleFQN
            {
             before(grammarAccess.getElementAccess().getRefElementFQNParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Element__RefAssignment_2_11949);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getElementAccess().getRefElementFQNParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getElementAccess().getRefElementCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Element__RefAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group__0_in_ruleElement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQNWithWildcard368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__0_in_ruleFQNWithWildcard394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0428 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0_in_rule__Model__Group__0__Impl458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackagesAssignment_1_in_rule__Model__Group__1__Impl516 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__0551 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__0554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Model__Group_0__0__Impl582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportURIAssignment_0_1_in_rule__Model__Group_0__1__Impl640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Package__Group__0__Impl705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1736 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2796 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__ImportsAssignment_2_in_rule__Package__Group__2__Impl826 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__ElementAssignment_3_in_rule__Package__Group__3__Impl884 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Import__Group__0__Impl954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group__0__Impl_in_rule__Element__Group__01046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Element__Group__1_in_rule__Element__Group__01049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Element__Group__0__Impl1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group__1__Impl_in_rule__Element__Group__11108 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Element__Group__2_in_rule__Element__Group__11111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__NameAssignment_1_in_rule__Element__Group__1__Impl1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group__2__Impl_in_rule__Element__Group__21168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_2__0_in_rule__Element__Group__2__Impl1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_2__0__Impl_in_rule__Element__Group_2__01232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Element__Group_2__1_in_rule__Element__Group_2__01235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Element__Group_2__0__Impl1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_2__1__Impl_in_rule__Element__Group_2__11294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__RefAssignment_2_1_in_rule__Element__Group_2__1__Impl1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01355 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1441 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FQN__Group_1__0__Impl1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__0__Impl_in_rule__FQNWithWildcard__Group__01598 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__1_in_rule__FQNWithWildcard__Group__01601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__FQNWithWildcard__Group__0__Impl1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__1__Impl_in_rule__FQNWithWildcard__Group__11657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FQNWithWildcard__Group__1__Impl1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Model__ImportURIAssignment_0_11728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_11759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Package__NameAssignment_11790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Package__ImportsAssignment_21821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Package__ElementAssignment_31852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_rule__Import__ImportedNamespaceAssignment_11883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Element__NameAssignment_11914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Element__RefAssignment_2_11949 = new BitSet(new long[]{0x0000000000000002L});

}