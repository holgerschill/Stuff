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
import org.eclipse.eclipsecon.services.LocationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLocationParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g"; }



     	private LocationGrammarAccess grammarAccess;
     	
        public InternalLocationParser(TokenStream input, LocationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Package";	
       	}
       	
       	@Override
       	protected LocationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePackage"
    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:67:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:68:2: (iv_rulePackage= rulePackage EOF )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:69:2: iv_rulePackage= rulePackage EOF
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
    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:76:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_locations_2_0= ruleLocation ) )* ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_locations_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:79:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_locations_2_0= ruleLocation ) )* ) )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_locations_2_0= ruleLocation ) )* )
            {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_locations_2_0= ruleLocation ) )* )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:80:3: otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_locations_2_0= ruleLocation ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePackage122); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:84:1: ( (lv_name_1_0= ruleFQN ) )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:85:1: (lv_name_1_0= ruleFQN )
            {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:85:1: (lv_name_1_0= ruleFQN )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:86:3: lv_name_1_0= ruleFQN
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

            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:102:2: ( (lv_locations_2_0= ruleLocation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:103:1: (lv_locations_2_0= ruleLocation )
            	    {
            	    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:103:1: (lv_locations_2_0= ruleLocation )
            	    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:104:3: lv_locations_2_0= ruleLocation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getLocationsLocationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLocation_in_rulePackage164);
            	    lv_locations_2_0=ruleLocation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"locations",
            	            		lv_locations_2_0, 
            	            		"Location");
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


    // $ANTLR start "entryRuleLocation"
    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:128:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:129:2: (iv_ruleLocation= ruleLocation EOF )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:130:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_ruleLocation_in_entryRuleLocation201);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocation211); 

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
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:137:1: ruleLocation returns [EObject current=null] : (otherlv_0= 'location' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleLocationElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:140:28: ( (otherlv_0= 'location' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleLocationElement ) )* otherlv_4= '}' ) )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:141:1: (otherlv_0= 'location' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleLocationElement ) )* otherlv_4= '}' )
            {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:141:1: (otherlv_0= 'location' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleLocationElement ) )* otherlv_4= '}' )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:141:3: otherlv_0= 'location' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleLocationElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleLocation248); 

                	newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getLocationKeyword_0());
                
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:145:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:146:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:146:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:147:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocation265); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLocationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleLocation282); 

                	newLeafNode(otherlv_2, grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:167:1: ( (lv_elements_3_0= ruleLocationElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:168:1: (lv_elements_3_0= ruleLocationElement )
            	    {
            	    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:168:1: (lv_elements_3_0= ruleLocationElement )
            	    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:169:3: lv_elements_3_0= ruleLocationElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLocationAccess().getElementsLocationElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLocationElement_in_ruleLocation303);
            	    lv_elements_3_0=ruleLocationElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLocationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"LocationElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleLocation316); 

                	newLeafNode(otherlv_4, grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleLocationElement"
    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:197:1: entryRuleLocationElement returns [EObject current=null] : iv_ruleLocationElement= ruleLocationElement EOF ;
    public final EObject entryRuleLocationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationElement = null;


        try {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:198:2: (iv_ruleLocationElement= ruleLocationElement EOF )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:199:2: iv_ruleLocationElement= ruleLocationElement EOF
            {
             newCompositeNode(grammarAccess.getLocationElementRule()); 
            pushFollow(FOLLOW_ruleLocationElement_in_entryRuleLocationElement352);
            iv_ruleLocationElement=ruleLocationElement();

            state._fsp--;

             current =iv_ruleLocationElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocationElement362); 

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
    // $ANTLR end "entryRuleLocationElement"


    // $ANTLR start "ruleLocationElement"
    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:206:1: ruleLocationElement returns [EObject current=null] : (this_Room_0= ruleRoom | this_Tool_1= ruleTool ) ;
    public final EObject ruleLocationElement() throws RecognitionException {
        EObject current = null;

        EObject this_Room_0 = null;

        EObject this_Tool_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:209:28: ( (this_Room_0= ruleRoom | this_Tool_1= ruleTool ) )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:210:1: (this_Room_0= ruleRoom | this_Tool_1= ruleTool )
            {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:210:1: (this_Room_0= ruleRoom | this_Tool_1= ruleTool )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:211:5: this_Room_0= ruleRoom
                    {
                     
                            newCompositeNode(grammarAccess.getLocationElementAccess().getRoomParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRoom_in_ruleLocationElement409);
                    this_Room_0=ruleRoom();

                    state._fsp--;

                     
                            current = this_Room_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:221:5: this_Tool_1= ruleTool
                    {
                     
                            newCompositeNode(grammarAccess.getLocationElementAccess().getToolParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTool_in_ruleLocationElement436);
                    this_Tool_1=ruleTool();

                    state._fsp--;

                     
                            current = this_Tool_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleLocationElement"


    // $ANTLR start "entryRuleRoom"
    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:237:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:238:2: (iv_ruleRoom= ruleRoom EOF )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:239:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_ruleRoom_in_entryRuleRoom471);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoom481); 

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
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:246:1: ruleRoom returns [EObject current=null] : (otherlv_0= 'room' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:249:28: ( (otherlv_0= 'room' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:250:1: (otherlv_0= 'room' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:250:1: (otherlv_0= 'room' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:250:3: otherlv_0= 'room' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleRoom518); 

                	newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0());
                
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:254:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:255:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:255:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:256:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRoom535); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRoomAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoomRule());
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
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleTool"
    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:280:1: entryRuleTool returns [EObject current=null] : iv_ruleTool= ruleTool EOF ;
    public final EObject entryRuleTool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTool = null;


        try {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:281:2: (iv_ruleTool= ruleTool EOF )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:282:2: iv_ruleTool= ruleTool EOF
            {
             newCompositeNode(grammarAccess.getToolRule()); 
            pushFollow(FOLLOW_ruleTool_in_entryRuleTool576);
            iv_ruleTool=ruleTool();

            state._fsp--;

             current =iv_ruleTool; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTool586); 

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
    // $ANTLR end "entryRuleTool"


    // $ANTLR start "ruleTool"
    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:289:1: ruleTool returns [EObject current=null] : (otherlv_0= 'tool' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:292:28: ( (otherlv_0= 'tool' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:293:1: (otherlv_0= 'tool' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:293:1: (otherlv_0= 'tool' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:293:3: otherlv_0= 'tool' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleTool623); 

                	newLeafNode(otherlv_0, grammarAccess.getToolAccess().getToolKeyword_0());
                
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:297:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:298:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:298:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:299:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTool640); 

            			newLeafNode(lv_name_1_0, grammarAccess.getToolAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getToolRule());
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
    // $ANTLR end "ruleTool"


    // $ANTLR start "entryRuleFQN"
    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:323:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:324:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:325:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN682);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN693); 

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
    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:332:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:335:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:336:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:336:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:336:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN733); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:343:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.location/src-gen/org/eclipse/eclipsecon/parser/antlr/internal/InternalLocation.g:344:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_17_in_ruleFQN752); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN767); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
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
    public static final BitSet FOLLOW_ruleLocation_in_rulePackage164 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleLocation_in_entryRuleLocation201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocation211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleLocation248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocation265 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLocation282 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_ruleLocationElement_in_ruleLocation303 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_14_in_ruleLocation316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationElement_in_entryRuleLocationElement352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocationElement362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoom_in_ruleLocationElement409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTool_in_ruleLocationElement436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoom_in_entryRuleRoom471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoom481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleRoom518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRoom535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTool_in_entryRuleTool576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTool586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTool623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTool640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN733 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleFQN752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN767 = new BitSet(new long[]{0x0000000000020002L});

}