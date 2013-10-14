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
import org.eclipse.eclipsecon.services.SpeakerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpeakerParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g"; }



     	private SpeakerGrammarAccess grammarAccess;
     	
        public InternalSpeakerParser(TokenStream input, SpeakerGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Package";	
       	}
       	
       	@Override
       	protected SpeakerGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePackage"
    // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:67:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:68:2: (iv_rulePackage= rulePackage EOF )
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:69:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage75);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage85); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:76:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_speakers_2_0= ruleSpeaker ) )* ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_speakers_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:79:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_speakers_2_0= ruleSpeaker ) )* ) )
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_speakers_2_0= ruleSpeaker ) )* )
            {
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_speakers_2_0= ruleSpeaker ) )* )
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:80:3: otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_speakers_2_0= ruleSpeaker ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePackage122); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:84:1: ( (lv_name_1_0= ruleFQN ) )
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:85:1: (lv_name_1_0= ruleFQN )
            {
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:85:1: (lv_name_1_0= ruleFQN )
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:86:3: lv_name_1_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_rulePackage143);
            lv_name_1_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:102:2: ( (lv_speakers_2_0= ruleSpeaker ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:103:1: (lv_speakers_2_0= ruleSpeaker )
            	    {
            	    // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:103:1: (lv_speakers_2_0= ruleSpeaker )
            	    // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:104:3: lv_speakers_2_0= ruleSpeaker
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getSpeakersSpeakerParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSpeaker_in_rulePackage164);
            	    lv_speakers_2_0=ruleSpeaker();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"speakers",
            	            		lv_speakers_2_0, 
            	            		"Speaker");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleSpeaker"
    // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:128:1: entryRuleSpeaker returns [EObject current=null] : iv_ruleSpeaker= ruleSpeaker EOF ;
    public final EObject entryRuleSpeaker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeaker = null;


        try {
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:129:2: (iv_ruleSpeaker= ruleSpeaker EOF )
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:130:2: iv_ruleSpeaker= ruleSpeaker EOF
            {
             newCompositeNode(grammarAccess.getSpeakerRule()); 
            pushFollow(FOLLOW_ruleSpeaker_in_entryRuleSpeaker201);
            iv_ruleSpeaker=ruleSpeaker();

            state._fsp--;

             current =iv_ruleSpeaker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpeaker211); 

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
    // $ANTLR end "entryRuleSpeaker"


    // $ANTLR start "ruleSpeaker"
    // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:137:1: ruleSpeaker returns [EObject current=null] : (otherlv_0= 'speaker' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSpeaker() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:140:28: ( (otherlv_0= 'speaker' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:141:1: (otherlv_0= 'speaker' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:141:1: (otherlv_0= 'speaker' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:141:3: otherlv_0= 'speaker' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleSpeaker248); 

                	newLeafNode(otherlv_0, grammarAccess.getSpeakerAccess().getSpeakerKeyword_0());
                
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:145:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:146:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:146:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:147:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpeaker265); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSpeakerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpeakerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleSpeaker"


    // $ANTLR start "entryRuleFQN"
    // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:171:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:172:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:173:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN307);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN318); 

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
    // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:180:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:183:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:184:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:184:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:184:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN358); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:191:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.speaker/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalSpeaker.g:192:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleFQN377); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN392); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePackage122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePackage143 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleSpeaker_in_rulePackage164 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleSpeaker_in_entryRuleSpeaker201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpeaker211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSpeaker248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpeaker265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN358 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleFQN377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN392 = new BitSet(new long[]{0x0000000000002002L});

}