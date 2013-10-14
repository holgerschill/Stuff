package org.eclipse.eclipsecon.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.eclipsecon.services.ConferenceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConferenceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'conference'", "'{'", "'}'", "'import'", "'talk'", "'speaker'", "','", "'room'", "'tools'", "'.'", "'.*'"
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
    public String getGrammarFileName() { return "../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g"; }



     	private ConferenceGrammarAccess grammarAccess;
     	
        public InternalConferenceParser(TokenStream input, ConferenceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Conference";	
       	}
       	
       	@Override
       	protected ConferenceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleConference"
    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:67:1: entryRuleConference returns [EObject current=null] : iv_ruleConference= ruleConference EOF ;
    public final EObject entryRuleConference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConference = null;


        try {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:68:2: (iv_ruleConference= ruleConference EOF )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:69:2: iv_ruleConference= ruleConference EOF
            {
             newCompositeNode(grammarAccess.getConferenceRule()); 
            pushFollow(FOLLOW_ruleConference_in_entryRuleConference75);
            iv_ruleConference=ruleConference();

            state._fsp--;

             current =iv_ruleConference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConference85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConference"


    // $ANTLR start "ruleConference"
    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:76:1: ruleConference returns [EObject current=null] : (otherlv_0= 'conference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( ( ruleFQN ) ) ( (lv_talks_5_0= ruleTalk ) )* otherlv_6= '}' ) ;
    public final EObject ruleConference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_imports_3_0 = null;

        EObject lv_talks_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:79:28: ( (otherlv_0= 'conference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( ( ruleFQN ) ) ( (lv_talks_5_0= ruleTalk ) )* otherlv_6= '}' ) )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:80:1: (otherlv_0= 'conference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( ( ruleFQN ) ) ( (lv_talks_5_0= ruleTalk ) )* otherlv_6= '}' )
            {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:80:1: (otherlv_0= 'conference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( ( ruleFQN ) ) ( (lv_talks_5_0= ruleTalk ) )* otherlv_6= '}' )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:80:3: otherlv_0= 'conference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( ( ruleFQN ) ) ( (lv_talks_5_0= ruleTalk ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleConference122); 

                	newLeafNode(otherlv_0, grammarAccess.getConferenceAccess().getConferenceKeyword_0());
                
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConference139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConference156); 

                	newLeafNode(otherlv_2, grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:106:1: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:107:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:107:1: (lv_imports_3_0= ruleImport )
            	    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:108:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConferenceAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleConference177);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConferenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_3_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:124:3: ( ( ruleFQN ) )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:125:1: ( ruleFQN )
            {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:125:1: ( ruleFQN )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:126:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConferenceAccess().getLocationLocationCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleConference201);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:139:2: ( (lv_talks_5_0= ruleTalk ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:140:1: (lv_talks_5_0= ruleTalk )
            	    {
            	    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:140:1: (lv_talks_5_0= ruleTalk )
            	    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:141:3: lv_talks_5_0= ruleTalk
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConferenceAccess().getTalksTalkParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTalk_in_ruleConference222);
            	    lv_talks_5_0=ruleTalk();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConferenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"talks",
            	            		lv_talks_5_0, 
            	            		"Talk");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleConference235); 

                	newLeafNode(otherlv_6, grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConference"


    // $ANTLR start "entryRuleImport"
    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:169:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:170:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:171:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport271);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport281); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:178:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQNWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:181:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQNWithWildcard ) ) ) )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:182:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQNWithWildcard ) ) )
            {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:182:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQNWithWildcard ) ) )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:182:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQNWithWildcard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport318); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:186:1: ( (lv_importedNamespace_1_0= ruleFQNWithWildcard ) )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:187:1: (lv_importedNamespace_1_0= ruleFQNWithWildcard )
            {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:187:1: (lv_importedNamespace_1_0= ruleFQNWithWildcard )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:188:3: lv_importedNamespace_1_0= ruleFQNWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFQNWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQNWithWildcard_in_ruleImport339);
            lv_importedNamespace_1_0=ruleFQNWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"FQNWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleTalk"
    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:212:1: entryRuleTalk returns [EObject current=null] : iv_ruleTalk= ruleTalk EOF ;
    public final EObject entryRuleTalk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTalk = null;


        try {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:213:2: (iv_ruleTalk= ruleTalk EOF )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:214:2: iv_ruleTalk= ruleTalk EOF
            {
             newCompositeNode(grammarAccess.getTalkRule()); 
            pushFollow(FOLLOW_ruleTalk_in_entryRuleTalk375);
            iv_ruleTalk=ruleTalk();

            state._fsp--;

             current =iv_ruleTalk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTalk385); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTalk"


    // $ANTLR start "ruleTalk"
    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:221:1: ruleTalk returns [EObject current=null] : (otherlv_0= 'talk' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speaker' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= 'room' ( ( ruleFQN ) ) otherlv_9= 'tools' ( ( ruleFQN ) ) (otherlv_11= ',' ( ( ruleFQN ) ) )* otherlv_13= '}' ) ;
    public final EObject ruleTalk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:224:28: ( (otherlv_0= 'talk' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speaker' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= 'room' ( ( ruleFQN ) ) otherlv_9= 'tools' ( ( ruleFQN ) ) (otherlv_11= ',' ( ( ruleFQN ) ) )* otherlv_13= '}' ) )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:225:1: (otherlv_0= 'talk' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speaker' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= 'room' ( ( ruleFQN ) ) otherlv_9= 'tools' ( ( ruleFQN ) ) (otherlv_11= ',' ( ( ruleFQN ) ) )* otherlv_13= '}' )
            {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:225:1: (otherlv_0= 'talk' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speaker' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= 'room' ( ( ruleFQN ) ) otherlv_9= 'tools' ( ( ruleFQN ) ) (otherlv_11= ',' ( ( ruleFQN ) ) )* otherlv_13= '}' )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:225:3: otherlv_0= 'talk' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speaker' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= 'room' ( ( ruleFQN ) ) otherlv_9= 'tools' ( ( ruleFQN ) ) (otherlv_11= ',' ( ( ruleFQN ) ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleTalk422); 

                	newLeafNode(otherlv_0, grammarAccess.getTalkAccess().getTalkKeyword_0());
                
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:229:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:230:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:230:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:231:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTalk439); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTalkAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTalkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTalk456); 

                	newLeafNode(otherlv_2, grammarAccess.getTalkAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleTalk468); 

                	newLeafNode(otherlv_3, grammarAccess.getTalkAccess().getSpeakerKeyword_3());
                
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:255:1: ( ( ruleFQN ) )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:256:1: ( ruleFQN )
            {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:256:1: ( ruleFQN )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:257:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTalkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTalkAccess().getSpeakersSpeakerCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleTalk491);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:270:2: (otherlv_5= ',' ( ( ruleFQN ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:270:4: otherlv_5= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleTalk504); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTalkAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:274:1: ( ( ruleFQN ) )
            	    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:275:1: ( ruleFQN )
            	    {
            	    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:275:1: ( ruleFQN )
            	    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:276:3: ruleFQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTalkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getTalkAccess().getSpeakersSpeakerCrossReference_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFQN_in_ruleTalk527);
            	    ruleFQN();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleTalk541); 

                	newLeafNode(otherlv_7, grammarAccess.getTalkAccess().getRoomKeyword_6());
                
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:293:1: ( ( ruleFQN ) )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:294:1: ( ruleFQN )
            {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:294:1: ( ruleFQN )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:295:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTalkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTalkAccess().getRoomRoomCrossReference_7_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleTalk564);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleTalk576); 

                	newLeafNode(otherlv_9, grammarAccess.getTalkAccess().getToolsKeyword_8());
                
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:312:1: ( ( ruleFQN ) )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:313:1: ( ruleFQN )
            {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:313:1: ( ruleFQN )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:314:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTalkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTalkAccess().getToolsToolCrossReference_9_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleTalk599);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:327:2: (otherlv_11= ',' ( ( ruleFQN ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:327:4: otherlv_11= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleTalk612); 

            	        	newLeafNode(otherlv_11, grammarAccess.getTalkAccess().getCommaKeyword_10_0());
            	        
            	    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:331:1: ( ( ruleFQN ) )
            	    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:332:1: ( ruleFQN )
            	    {
            	    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:332:1: ( ruleFQN )
            	    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:333:3: ruleFQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTalkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getTalkAccess().getToolsToolCrossReference_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFQN_in_ruleTalk635);
            	    ruleFQN();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleTalk649); 

                	newLeafNode(otherlv_13, grammarAccess.getTalkAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTalk"


    // $ANTLR start "entryRuleFQN"
    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:358:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:359:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:360:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN686);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN697); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:367:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:370:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:371:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:371:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:371:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN737); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:378:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:379:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleFQN756); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN771); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleFQNWithWildcard"
    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:399:1: entryRuleFQNWithWildcard returns [String current=null] : iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF ;
    public final String entryRuleFQNWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNWithWildcard = null;


        try {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:400:2: (iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:401:2: iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getFQNWithWildcardRule()); 
            pushFollow(FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard819);
            iv_ruleFQNWithWildcard=ruleFQNWithWildcard();

            state._fsp--;

             current =iv_ruleFQNWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQNWithWildcard830); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQNWithWildcard"


    // $ANTLR start "ruleFQNWithWildcard"
    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:408:1: ruleFQNWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFQNWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:411:28: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:412:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:412:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:413:5: this_FQN_0= ruleFQN (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getFQNWithWildcardAccess().getFQNParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleFQNWithWildcard877);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:423:1: (kw= '.*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.eclipsecon.conference/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalConference.g:424:2: kw= '.*'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleFQNWithWildcard896); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFQNWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQNWithWildcard"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleConference_in_entryRuleConference75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConference85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleConference122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConference139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConference156 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleImport_in_ruleConference177 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleConference201 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_ruleTalk_in_ruleConference222 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleConference235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport318 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_ruleImport339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTalk_in_entryRuleTalk375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTalk385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTalk422 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTalk439 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTalk456 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTalk468 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleTalk491 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleTalk504 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleTalk527 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleTalk541 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleTalk564 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTalk576 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleTalk599 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleTalk612 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleTalk635 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleTalk649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN737 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleFQN756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN771 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQNWithWildcard830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFQNWithWildcard877 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleFQNWithWildcard896 = new BitSet(new long[]{0x0000000000000002L});

}