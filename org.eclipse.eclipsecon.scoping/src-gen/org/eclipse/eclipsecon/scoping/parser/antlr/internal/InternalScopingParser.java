package org.eclipse.eclipsecon.scoping.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.eclipsecon.scoping.services.ScopingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScopingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'importURI'", "'package'", "'import'", "'element'", "'refs'", "'.'", "'.*'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g"; }



     	private ScopingGrammarAccess grammarAccess;
     	
        public InternalScopingParser(TokenStream input, ScopingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ScopingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:76:1: ruleModel returns [EObject current=null] : ( (otherlv_0= 'importURI' ( (lv_importURI_1_0= RULE_STRING ) ) )? ( (lv_packages_2_0= rulePackage ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        EObject lv_packages_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:79:28: ( ( (otherlv_0= 'importURI' ( (lv_importURI_1_0= RULE_STRING ) ) )? ( (lv_packages_2_0= rulePackage ) )* ) )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:80:1: ( (otherlv_0= 'importURI' ( (lv_importURI_1_0= RULE_STRING ) ) )? ( (lv_packages_2_0= rulePackage ) )* )
            {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:80:1: ( (otherlv_0= 'importURI' ( (lv_importURI_1_0= RULE_STRING ) ) )? ( (lv_packages_2_0= rulePackage ) )* )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:80:2: (otherlv_0= 'importURI' ( (lv_importURI_1_0= RULE_STRING ) ) )? ( (lv_packages_2_0= rulePackage ) )*
            {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:80:2: (otherlv_0= 'importURI' ( (lv_importURI_1_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:80:4: otherlv_0= 'importURI' ( (lv_importURI_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel123); 

                        	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getImportURIKeyword_0_0());
                        
                    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:84:1: ( (lv_importURI_1_0= RULE_STRING ) )
                    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:85:1: (lv_importURI_1_0= RULE_STRING )
                    {
                    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:85:1: (lv_importURI_1_0= RULE_STRING )
                    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:86:3: lv_importURI_1_0= RULE_STRING
                    {
                    lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModel140); 

                    			newLeafNode(lv_importURI_1_0, grammarAccess.getModelAccess().getImportURISTRINGTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"importURI",
                            		lv_importURI_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:102:4: ( (lv_packages_2_0= rulePackage ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:103:1: (lv_packages_2_0= rulePackage )
            	    {
            	    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:103:1: (lv_packages_2_0= rulePackage )
            	    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:104:3: lv_packages_2_0= rulePackage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePackage_in_ruleModel168);
            	    lv_packages_2_0=rulePackage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"packages",
            	            		lv_packages_2_0, 
            	            		"Package");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackage"
    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:128:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:129:2: (iv_rulePackage= rulePackage EOF )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:130:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage205);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage215); 

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
    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:137:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_element_3_0= ruleElement ) )* ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_element_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:140:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_element_3_0= ruleElement ) )* ) )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:141:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_element_3_0= ruleElement ) )* )
            {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:141:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_element_3_0= ruleElement ) )* )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:141:3: otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_element_3_0= ruleElement ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePackage252); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:145:1: ( (lv_name_1_0= ruleFQN ) )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:146:1: (lv_name_1_0= ruleFQN )
            {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:146:1: (lv_name_1_0= ruleFQN )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:147:3: lv_name_1_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_rulePackage273);
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

            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:163:2: ( (lv_imports_2_0= ruleImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:164:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:164:1: (lv_imports_2_0= ruleImport )
            	    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:165:3: lv_imports_2_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getImportsImportParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_rulePackage294);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_2_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:181:3: ( (lv_element_3_0= ruleElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:182:1: (lv_element_3_0= ruleElement )
            	    {
            	    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:182:1: (lv_element_3_0= ruleElement )
            	    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:183:3: lv_element_3_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getElementElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_rulePackage316);
            	    lv_element_3_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"element",
            	            		lv_element_3_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleImport"
    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:207:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:208:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:209:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport353);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport363); 

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
    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:216:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQNWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:219:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQNWithWildcard ) ) ) )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:220:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQNWithWildcard ) ) )
            {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:220:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQNWithWildcard ) ) )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:220:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFQNWithWildcard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImport400); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:224:1: ( (lv_importedNamespace_1_0= ruleFQNWithWildcard ) )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:225:1: (lv_importedNamespace_1_0= ruleFQNWithWildcard )
            {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:225:1: (lv_importedNamespace_1_0= ruleFQNWithWildcard )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:226:3: lv_importedNamespace_1_0= ruleFQNWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFQNWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQNWithWildcard_in_ruleImport421);
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


    // $ANTLR start "entryRuleElement"
    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:250:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:251:2: (iv_ruleElement= ruleElement EOF )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:252:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement457);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement467); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:259:1: ruleElement returns [EObject current=null] : (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refs' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:262:28: ( (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refs' ( ( ruleFQN ) ) )? ) )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:263:1: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refs' ( ( ruleFQN ) ) )? )
            {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:263:1: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refs' ( ( ruleFQN ) ) )? )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:263:3: otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refs' ( ( ruleFQN ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleElement504); 

                	newLeafNode(otherlv_0, grammarAccess.getElementAccess().getElementKeyword_0());
                
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:267:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:268:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:268:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:269:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElement521); 

            			newLeafNode(lv_name_1_0, grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:285:2: (otherlv_2= 'refs' ( ( ruleFQN ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:285:4: otherlv_2= 'refs' ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleElement539); 

                        	newLeafNode(otherlv_2, grammarAccess.getElementAccess().getRefsKeyword_2_0());
                        
                    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:289:1: ( ( ruleFQN ) )
                    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:290:1: ( ruleFQN )
                    {
                    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:290:1: ( ruleFQN )
                    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:291:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getElementRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getElementAccess().getRefElementCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleElement562);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleFQN"
    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:312:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:313:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:314:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN601);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN612); 

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
    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:321:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:324:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:325:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:325:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:325:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN652); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:332:1: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:333:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleFQN671); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN686); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:353:1: entryRuleFQNWithWildcard returns [String current=null] : iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF ;
    public final String entryRuleFQNWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNWithWildcard = null;


        try {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:354:2: (iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:355:2: iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getFQNWithWildcardRule()); 
            pushFollow(FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard734);
            iv_ruleFQNWithWildcard=ruleFQNWithWildcard();

            state._fsp--;

             current =iv_ruleFQNWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQNWithWildcard745); 

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
    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:362:1: ruleFQNWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFQNWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:365:28: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:366:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:366:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:367:5: this_FQN_0= ruleFQN (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getFQNWithWildcardAccess().getFQNParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleFQNWithWildcard792);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:377:1: (kw= '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.eclipsecon.scoping/src-gen/org/eclipse/eclipsecon/scoping/parser/antlr/internal/InternalScoping.g:378:2: kw= '.*'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleFQNWithWildcard811); 

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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel140 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel168 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePackage252 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePackage273 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ruleImport_in_rulePackage294 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ruleElement_in_rulePackage316 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImport400 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_ruleImport421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleElement504 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElement521 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleElement539 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleElement562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN652 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleFQN671 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN686 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQNWithWildcard745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFQNWithWildcard792 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleFQNWithWildcard811 = new BitSet(new long[]{0x0000000000000002L});

}