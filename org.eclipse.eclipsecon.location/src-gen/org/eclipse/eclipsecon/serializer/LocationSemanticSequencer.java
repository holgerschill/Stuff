package org.eclipse.eclipsecon.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.eclipsecon.location.Location;
import org.eclipse.eclipsecon.location.LocationPackage;
import org.eclipse.eclipsecon.location.Room;
import org.eclipse.eclipsecon.location.Tool;
import org.eclipse.eclipsecon.services.LocationGrammarAccess;
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
public class LocationSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LocationGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LocationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LocationPackage.LOCATION:
				if(context == grammarAccess.getLocationRule()) {
					sequence_Location(context, (Location) semanticObject); 
					return; 
				}
				else break;
			case LocationPackage.PACKAGE:
				if(context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (org.eclipse.eclipsecon.location.Package) semanticObject); 
					return; 
				}
				else break;
			case LocationPackage.ROOM:
				if(context == grammarAccess.getLocationElementRule() ||
				   context == grammarAccess.getRoomRule()) {
					sequence_Room(context, (Room) semanticObject); 
					return; 
				}
				else break;
			case LocationPackage.TOOL:
				if(context == grammarAccess.getLocationElementRule() ||
				   context == grammarAccess.getToolRule()) {
					sequence_Tool(context, (Tool) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID elements+=LocationElement*)
	 */
	protected void sequence_Location(EObject context, Location semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=FQN locations+=Location*)
	 */
	protected void sequence_Package(EObject context, org.eclipse.eclipsecon.location.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Room(EObject context, Room semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LocationPackage.Literals.LOCATION_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LocationPackage.Literals.LOCATION_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRoomAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Tool(EObject context, Tool semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LocationPackage.Literals.LOCATION_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LocationPackage.Literals.LOCATION_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getToolAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
