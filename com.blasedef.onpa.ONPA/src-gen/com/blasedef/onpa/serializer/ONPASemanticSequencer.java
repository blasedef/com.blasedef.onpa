package com.blasedef.onpa.serializer;

import com.blasedef.onpa.oNPA.Constant;
import com.blasedef.onpa.oNPA.Div;
import com.blasedef.onpa.oNPA.Model;
import com.blasedef.onpa.oNPA.Mul;
import com.blasedef.onpa.oNPA.ONPAPackage;
import com.blasedef.onpa.oNPA.Plu;
import com.blasedef.onpa.oNPA.Rate;
import com.blasedef.onpa.oNPA.Sub;
import com.blasedef.onpa.services.ONPAGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
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
public class ONPASemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ONPAGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ONPAPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ONPAPackage.CONSTANT:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getPluLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubLeftAction_1_0()) {
					sequence_PrimaryExpression(context, (Constant) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.DIV:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getPluLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubLeftAction_1_0()) {
					sequence_Division(context, (Div) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.MUL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getPluLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubLeftAction_1_0()) {
					sequence_Multiplication(context, (Mul) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.PLU:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getPluLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubLeftAction_1_0()) {
					sequence_Addition(context, (Plu) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.RATE:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getPluLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubLeftAction_1_0()) {
					sequence_PrimaryExpression(context, (Rate) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRateRule()) {
					sequence_Rate(context, (Rate) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.SUB:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getPluLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubLeftAction_1_0()) {
					sequence_Subtraction(context, (Sub) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=Addition_Plu_1_0 right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Plu semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.PLU__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.PLU__LEFT));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.PLU__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.PLU__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionAccess().getPluLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Division_Div_1_0 right=PrimaryExpression)
	 */
	protected void sequence_Division(EObject context, Div semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.DIV__LEFT));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.DIV__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDivisionAccess().getDivLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDivisionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     rates+=Rate+
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Mul_1_0 right=Division)
	 */
	protected void sequence_Multiplication(EObject context, Mul semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.MUL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.MUL__LEFT));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.MUL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.MUL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Double
	 */
	protected void sequence_PrimaryExpression(EObject context, Constant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValueDoubleParserRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     rate=[Rate|LOWER]
	 */
	protected void sequence_PrimaryExpression(EObject context, Rate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=LOWER value=Expression)
	 */
	protected void sequence_Rate(EObject context, Rate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Subtraction_Sub_1_0 right=Addition)
	 */
	protected void sequence_Subtraction(EObject context, Sub semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.SUB__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.SUB__LEFT));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.SUB__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.SUB__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubtractionAccess().getSubLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubtractionAccess().getRightAdditionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
}
