package org.eclipse.eclipsecon.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.eclipsecon.conference.Conference;
import org.eclipse.eclipsecon.conference.ConferencePackage;
import org.eclipse.eclipsecon.conference.Import;
import org.eclipse.eclipsecon.conference.Talk;
import org.eclipse.eclipsecon.services.ConferenceGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ConferenceSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ConferenceGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ConferencePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ConferencePackage.CONFERENCE:
				if(context == grammarAccess.getConferenceRule()) {
					sequence_Conference(context, (Conference) semanticObject); 
					return; 
				}
				else break;
			case ConferencePackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case ConferencePackage.TALK:
				if(context == grammarAccess.getTalkRule()) {
					sequence_Talk(context, (Talk) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID imports+=Import* location=[Location|FQN] talks+=Talk*)
	 */
	protected void sequence_Conference(EObject context, Conference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=FQNWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConferencePackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConferencePackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceFQNWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         speakers+=[Speaker|FQN] 
	 *         speakers+=[Speaker|FQN]* 
	 *         room=[Room|FQN] 
	 *         tools+=[Tool|FQN] 
	 *         tools+=[Tool|FQN]*
	 *     )
	 */
	protected void sequence_Talk(EObject context, Talk semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
