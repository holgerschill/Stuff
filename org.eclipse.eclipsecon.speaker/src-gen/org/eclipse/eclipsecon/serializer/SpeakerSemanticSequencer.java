package org.eclipse.eclipsecon.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.eclipsecon.services.SpeakerGrammarAccess;
import org.eclipse.eclipsecon.speaker.Speaker;
import org.eclipse.eclipsecon.speaker.SpeakerPackage;
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
public class SpeakerSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SpeakerGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SpeakerPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SpeakerPackage.PACKAGE:
				if(context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (org.eclipse.eclipsecon.speaker.Package) semanticObject); 
					return; 
				}
				else break;
			case SpeakerPackage.SPEAKER:
				if(context == grammarAccess.getSpeakerRule()) {
					sequence_Speaker(context, (Speaker) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=FQN speakers+=Speaker*)
	 */
	protected void sequence_Package(EObject context, org.eclipse.eclipsecon.speaker.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Speaker(EObject context, Speaker semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpeakerPackage.Literals.SPEAKER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpeakerPackage.Literals.SPEAKER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSpeakerAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
