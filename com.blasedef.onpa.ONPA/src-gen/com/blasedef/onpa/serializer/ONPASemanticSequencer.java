package com.blasedef.onpa.serializer;

import com.blasedef.onpa.oNPA.ActionAnd;
import com.blasedef.onpa.oNPA.ActionComparison;
import com.blasedef.onpa.oNPA.ActionDiv;
import com.blasedef.onpa.oNPA.ActionEquality;
import com.blasedef.onpa.oNPA.ActionMul;
import com.blasedef.onpa.oNPA.ActionNot;
import com.blasedef.onpa.oNPA.ActionOr;
import com.blasedef.onpa.oNPA.ActionPlu;
import com.blasedef.onpa.oNPA.ActionProcess;
import com.blasedef.onpa.oNPA.ActionSub;
import com.blasedef.onpa.oNPA.And;
import com.blasedef.onpa.oNPA.BoolConstant;
import com.blasedef.onpa.oNPA.Broadcast;
import com.blasedef.onpa.oNPA.Choice;
import com.blasedef.onpa.oNPA.Comparison;
import com.blasedef.onpa.oNPA.Div;
import com.blasedef.onpa.oNPA.DoubleConstant;
import com.blasedef.onpa.oNPA.Equality;
import com.blasedef.onpa.oNPA.FreeEvaluationExpression;
import com.blasedef.onpa.oNPA.FreeVariable;
import com.blasedef.onpa.oNPA.GlobalEvaluationExpression;
import com.blasedef.onpa.oNPA.GlobalUpdateExpression;
import com.blasedef.onpa.oNPA.In;
import com.blasedef.onpa.oNPA.Leaf;
import com.blasedef.onpa.oNPA.LocalEvaluationExpression;
import com.blasedef.onpa.oNPA.LocalUpdateExpression;
import com.blasedef.onpa.oNPA.Model;
import com.blasedef.onpa.oNPA.Mul;
import com.blasedef.onpa.oNPA.Not;
import com.blasedef.onpa.oNPA.ONPAPackage;
import com.blasedef.onpa.oNPA.Or;
import com.blasedef.onpa.oNPA.Out;
import com.blasedef.onpa.oNPA.Parallel;
import com.blasedef.onpa.oNPA.Plu;
import com.blasedef.onpa.oNPA.Predicate;
import com.blasedef.onpa.oNPA.PredicateExpression;
import com.blasedef.onpa.oNPA.PredicateProcess;
import com.blasedef.onpa.oNPA.ProcessReference;
import com.blasedef.onpa.oNPA.ReferencedStore;
import com.blasedef.onpa.oNPA.SelfReferencedStore;
import com.blasedef.onpa.oNPA.Store;
import com.blasedef.onpa.oNPA.Sub;
import com.blasedef.onpa.oNPA.Term;
import com.blasedef.onpa.oNPA.Unicast;
import com.blasedef.onpa.oNPA.Updates;
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
			case ONPAPackage.ACTION_AND:
				if(context == grammarAccess.getActionAdditionRule() ||
				   context == grammarAccess.getActionAdditionAccess().getActionPluLeftAction_1_0() ||
				   context == grammarAccess.getActionAndRule() ||
				   context == grammarAccess.getActionAndAccess().getActionAndLeftAction_1_0() ||
				   context == grammarAccess.getActionComparisonRule() ||
				   context == grammarAccess.getActionComparisonAccess().getActionComparisonLeftAction_1_0() ||
				   context == grammarAccess.getActionDivisionRule() ||
				   context == grammarAccess.getActionDivisionAccess().getActionDivLeftAction_1_0() ||
				   context == grammarAccess.getActionEqualityRule() ||
				   context == grammarAccess.getActionEqualityAccess().getActionEqualityLeftAction_1_0() ||
				   context == grammarAccess.getActionExpressionRule() ||
				   context == grammarAccess.getActionMultiplicationRule() ||
				   context == grammarAccess.getActionMultiplicationAccess().getActionMulLeftAction_1_0() ||
				   context == grammarAccess.getActionOrRule() ||
				   context == grammarAccess.getActionOrAccess().getActionOrLeftAction_1_0() ||
				   context == grammarAccess.getActionPrimaryRule() ||
				   context == grammarAccess.getActionSubtractionRule() ||
				   context == grammarAccess.getActionSubtractionAccess().getActionSubLeftAction_1_0()) {
					sequence_ActionAnd(context, (ActionAnd) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.ACTION_COMPARISON:
				if(context == grammarAccess.getActionAdditionRule() ||
				   context == grammarAccess.getActionAdditionAccess().getActionPluLeftAction_1_0() ||
				   context == grammarAccess.getActionAndRule() ||
				   context == grammarAccess.getActionAndAccess().getActionAndLeftAction_1_0() ||
				   context == grammarAccess.getActionComparisonRule() ||
				   context == grammarAccess.getActionComparisonAccess().getActionComparisonLeftAction_1_0() ||
				   context == grammarAccess.getActionDivisionRule() ||
				   context == grammarAccess.getActionDivisionAccess().getActionDivLeftAction_1_0() ||
				   context == grammarAccess.getActionEqualityRule() ||
				   context == grammarAccess.getActionEqualityAccess().getActionEqualityLeftAction_1_0() ||
				   context == grammarAccess.getActionExpressionRule() ||
				   context == grammarAccess.getActionMultiplicationRule() ||
				   context == grammarAccess.getActionMultiplicationAccess().getActionMulLeftAction_1_0() ||
				   context == grammarAccess.getActionOrRule() ||
				   context == grammarAccess.getActionOrAccess().getActionOrLeftAction_1_0() ||
				   context == grammarAccess.getActionPrimaryRule() ||
				   context == grammarAccess.getActionSubtractionRule() ||
				   context == grammarAccess.getActionSubtractionAccess().getActionSubLeftAction_1_0()) {
					sequence_ActionComparison(context, (ActionComparison) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.ACTION_DIV:
				if(context == grammarAccess.getActionAdditionRule() ||
				   context == grammarAccess.getActionAdditionAccess().getActionPluLeftAction_1_0() ||
				   context == grammarAccess.getActionAndRule() ||
				   context == grammarAccess.getActionAndAccess().getActionAndLeftAction_1_0() ||
				   context == grammarAccess.getActionComparisonRule() ||
				   context == grammarAccess.getActionComparisonAccess().getActionComparisonLeftAction_1_0() ||
				   context == grammarAccess.getActionDivisionRule() ||
				   context == grammarAccess.getActionDivisionAccess().getActionDivLeftAction_1_0() ||
				   context == grammarAccess.getActionEqualityRule() ||
				   context == grammarAccess.getActionEqualityAccess().getActionEqualityLeftAction_1_0() ||
				   context == grammarAccess.getActionExpressionRule() ||
				   context == grammarAccess.getActionMultiplicationRule() ||
				   context == grammarAccess.getActionMultiplicationAccess().getActionMulLeftAction_1_0() ||
				   context == grammarAccess.getActionOrRule() ||
				   context == grammarAccess.getActionOrAccess().getActionOrLeftAction_1_0() ||
				   context == grammarAccess.getActionPrimaryRule() ||
				   context == grammarAccess.getActionSubtractionRule() ||
				   context == grammarAccess.getActionSubtractionAccess().getActionSubLeftAction_1_0()) {
					sequence_ActionDivision(context, (ActionDiv) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.ACTION_EQUALITY:
				if(context == grammarAccess.getActionAdditionRule() ||
				   context == grammarAccess.getActionAdditionAccess().getActionPluLeftAction_1_0() ||
				   context == grammarAccess.getActionAndRule() ||
				   context == grammarAccess.getActionAndAccess().getActionAndLeftAction_1_0() ||
				   context == grammarAccess.getActionComparisonRule() ||
				   context == grammarAccess.getActionComparisonAccess().getActionComparisonLeftAction_1_0() ||
				   context == grammarAccess.getActionDivisionRule() ||
				   context == grammarAccess.getActionDivisionAccess().getActionDivLeftAction_1_0() ||
				   context == grammarAccess.getActionEqualityRule() ||
				   context == grammarAccess.getActionEqualityAccess().getActionEqualityLeftAction_1_0() ||
				   context == grammarAccess.getActionExpressionRule() ||
				   context == grammarAccess.getActionMultiplicationRule() ||
				   context == grammarAccess.getActionMultiplicationAccess().getActionMulLeftAction_1_0() ||
				   context == grammarAccess.getActionOrRule() ||
				   context == grammarAccess.getActionOrAccess().getActionOrLeftAction_1_0() ||
				   context == grammarAccess.getActionPrimaryRule() ||
				   context == grammarAccess.getActionSubtractionRule() ||
				   context == grammarAccess.getActionSubtractionAccess().getActionSubLeftAction_1_0()) {
					sequence_ActionEquality(context, (ActionEquality) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.ACTION_MUL:
				if(context == grammarAccess.getActionAdditionRule() ||
				   context == grammarAccess.getActionAdditionAccess().getActionPluLeftAction_1_0() ||
				   context == grammarAccess.getActionAndRule() ||
				   context == grammarAccess.getActionAndAccess().getActionAndLeftAction_1_0() ||
				   context == grammarAccess.getActionComparisonRule() ||
				   context == grammarAccess.getActionComparisonAccess().getActionComparisonLeftAction_1_0() ||
				   context == grammarAccess.getActionDivisionRule() ||
				   context == grammarAccess.getActionDivisionAccess().getActionDivLeftAction_1_0() ||
				   context == grammarAccess.getActionEqualityRule() ||
				   context == grammarAccess.getActionEqualityAccess().getActionEqualityLeftAction_1_0() ||
				   context == grammarAccess.getActionExpressionRule() ||
				   context == grammarAccess.getActionMultiplicationRule() ||
				   context == grammarAccess.getActionMultiplicationAccess().getActionMulLeftAction_1_0() ||
				   context == grammarAccess.getActionOrRule() ||
				   context == grammarAccess.getActionOrAccess().getActionOrLeftAction_1_0() ||
				   context == grammarAccess.getActionPrimaryRule() ||
				   context == grammarAccess.getActionSubtractionRule() ||
				   context == grammarAccess.getActionSubtractionAccess().getActionSubLeftAction_1_0()) {
					sequence_ActionMultiplication(context, (ActionMul) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.ACTION_NOT:
				if(context == grammarAccess.getActionAdditionRule() ||
				   context == grammarAccess.getActionAdditionAccess().getActionPluLeftAction_1_0() ||
				   context == grammarAccess.getActionAndRule() ||
				   context == grammarAccess.getActionAndAccess().getActionAndLeftAction_1_0() ||
				   context == grammarAccess.getActionComparisonRule() ||
				   context == grammarAccess.getActionComparisonAccess().getActionComparisonLeftAction_1_0() ||
				   context == grammarAccess.getActionDivisionRule() ||
				   context == grammarAccess.getActionDivisionAccess().getActionDivLeftAction_1_0() ||
				   context == grammarAccess.getActionEqualityRule() ||
				   context == grammarAccess.getActionEqualityAccess().getActionEqualityLeftAction_1_0() ||
				   context == grammarAccess.getActionExpressionRule() ||
				   context == grammarAccess.getActionMultiplicationRule() ||
				   context == grammarAccess.getActionMultiplicationAccess().getActionMulLeftAction_1_0() ||
				   context == grammarAccess.getActionOrRule() ||
				   context == grammarAccess.getActionOrAccess().getActionOrLeftAction_1_0() ||
				   context == grammarAccess.getActionPrimaryRule() ||
				   context == grammarAccess.getActionSubtractionRule() ||
				   context == grammarAccess.getActionSubtractionAccess().getActionSubLeftAction_1_0()) {
					sequence_ActionPrimary(context, (ActionNot) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.ACTION_OR:
				if(context == grammarAccess.getActionAdditionRule() ||
				   context == grammarAccess.getActionAdditionAccess().getActionPluLeftAction_1_0() ||
				   context == grammarAccess.getActionAndRule() ||
				   context == grammarAccess.getActionAndAccess().getActionAndLeftAction_1_0() ||
				   context == grammarAccess.getActionComparisonRule() ||
				   context == grammarAccess.getActionComparisonAccess().getActionComparisonLeftAction_1_0() ||
				   context == grammarAccess.getActionDivisionRule() ||
				   context == grammarAccess.getActionDivisionAccess().getActionDivLeftAction_1_0() ||
				   context == grammarAccess.getActionEqualityRule() ||
				   context == grammarAccess.getActionEqualityAccess().getActionEqualityLeftAction_1_0() ||
				   context == grammarAccess.getActionExpressionRule() ||
				   context == grammarAccess.getActionMultiplicationRule() ||
				   context == grammarAccess.getActionMultiplicationAccess().getActionMulLeftAction_1_0() ||
				   context == grammarAccess.getActionOrRule() ||
				   context == grammarAccess.getActionOrAccess().getActionOrLeftAction_1_0() ||
				   context == grammarAccess.getActionPrimaryRule() ||
				   context == grammarAccess.getActionSubtractionRule() ||
				   context == grammarAccess.getActionSubtractionAccess().getActionSubLeftAction_1_0()) {
					sequence_ActionOr(context, (ActionOr) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.ACTION_PLU:
				if(context == grammarAccess.getActionAdditionRule() ||
				   context == grammarAccess.getActionAdditionAccess().getActionPluLeftAction_1_0() ||
				   context == grammarAccess.getActionAndRule() ||
				   context == grammarAccess.getActionAndAccess().getActionAndLeftAction_1_0() ||
				   context == grammarAccess.getActionComparisonRule() ||
				   context == grammarAccess.getActionComparisonAccess().getActionComparisonLeftAction_1_0() ||
				   context == grammarAccess.getActionDivisionRule() ||
				   context == grammarAccess.getActionDivisionAccess().getActionDivLeftAction_1_0() ||
				   context == grammarAccess.getActionEqualityRule() ||
				   context == grammarAccess.getActionEqualityAccess().getActionEqualityLeftAction_1_0() ||
				   context == grammarAccess.getActionExpressionRule() ||
				   context == grammarAccess.getActionMultiplicationRule() ||
				   context == grammarAccess.getActionMultiplicationAccess().getActionMulLeftAction_1_0() ||
				   context == grammarAccess.getActionOrRule() ||
				   context == grammarAccess.getActionOrAccess().getActionOrLeftAction_1_0() ||
				   context == grammarAccess.getActionPrimaryRule() ||
				   context == grammarAccess.getActionSubtractionRule() ||
				   context == grammarAccess.getActionSubtractionAccess().getActionSubLeftAction_1_0()) {
					sequence_ActionAddition(context, (ActionPlu) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.ACTION_PROCESS:
				if(context == grammarAccess.getActionProcessRule() ||
				   context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoiceAccess().getChoiceLeftAction_1_0() ||
				   context == grammarAccess.getParallelRule() ||
				   context == grammarAccess.getParallelAccess().getParallelLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryProcessRule() ||
				   context == grammarAccess.getProcessExpressionRule()) {
					sequence_ActionProcess(context, (ActionProcess) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.ACTION_SUB:
				if(context == grammarAccess.getActionAdditionRule() ||
				   context == grammarAccess.getActionAdditionAccess().getActionPluLeftAction_1_0() ||
				   context == grammarAccess.getActionAndRule() ||
				   context == grammarAccess.getActionAndAccess().getActionAndLeftAction_1_0() ||
				   context == grammarAccess.getActionComparisonRule() ||
				   context == grammarAccess.getActionComparisonAccess().getActionComparisonLeftAction_1_0() ||
				   context == grammarAccess.getActionDivisionRule() ||
				   context == grammarAccess.getActionDivisionAccess().getActionDivLeftAction_1_0() ||
				   context == grammarAccess.getActionEqualityRule() ||
				   context == grammarAccess.getActionEqualityAccess().getActionEqualityLeftAction_1_0() ||
				   context == grammarAccess.getActionExpressionRule() ||
				   context == grammarAccess.getActionMultiplicationRule() ||
				   context == grammarAccess.getActionMultiplicationAccess().getActionMulLeftAction_1_0() ||
				   context == grammarAccess.getActionOrRule() ||
				   context == grammarAccess.getActionOrAccess().getActionOrLeftAction_1_0() ||
				   context == grammarAccess.getActionPrimaryRule() ||
				   context == grammarAccess.getActionSubtractionRule() ||
				   context == grammarAccess.getActionSubtractionAccess().getActionSubLeftAction_1_0()) {
					sequence_ActionSubtraction(context, (ActionSub) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.AND:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getPluLeftAction_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubLeftAction_1_0()) {
					sequence_And(context, (And) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.BOOL_CONSTANT:
				if(context == grammarAccess.getActionAdditionRule() ||
				   context == grammarAccess.getActionAdditionAccess().getActionPluLeftAction_1_0() ||
				   context == grammarAccess.getActionAndRule() ||
				   context == grammarAccess.getActionAndAccess().getActionAndLeftAction_1_0() ||
				   context == grammarAccess.getActionAtomicRule() ||
				   context == grammarAccess.getActionComparisonRule() ||
				   context == grammarAccess.getActionComparisonAccess().getActionComparisonLeftAction_1_0() ||
				   context == grammarAccess.getActionDivisionRule() ||
				   context == grammarAccess.getActionDivisionAccess().getActionDivLeftAction_1_0() ||
				   context == grammarAccess.getActionEqualityRule() ||
				   context == grammarAccess.getActionEqualityAccess().getActionEqualityLeftAction_1_0() ||
				   context == grammarAccess.getActionExpressionRule() ||
				   context == grammarAccess.getActionMultiplicationRule() ||
				   context == grammarAccess.getActionMultiplicationAccess().getActionMulLeftAction_1_0() ||
				   context == grammarAccess.getActionOrRule() ||
				   context == grammarAccess.getActionOrAccess().getActionOrLeftAction_1_0() ||
				   context == grammarAccess.getActionPrimaryRule() ||
				   context == grammarAccess.getActionSubtractionRule() ||
				   context == grammarAccess.getActionSubtractionAccess().getActionSubLeftAction_1_0()) {
					sequence_ActionAtomic(context, (BoolConstant) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getPluLeftAction_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubLeftAction_1_0()) {
					sequence_Atomic(context, (BoolConstant) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.BROADCAST:
				if(context == grammarAccess.getActionRule()) {
					sequence_Action(context, (Broadcast) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.CHOICE:
				if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoiceAccess().getChoiceLeftAction_1_0() ||
				   context == grammarAccess.getParallelRule() ||
				   context == grammarAccess.getParallelAccess().getParallelLeftAction_1_0() ||
				   context == grammarAccess.getProcessExpressionRule()) {
					sequence_Choice(context, (Choice) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.COMPARISON:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getPluLeftAction_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubLeftAction_1_0()) {
					sequence_Comparison(context, (Comparison) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.DIV:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getPluLeftAction_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubLeftAction_1_0()) {
					sequence_Division(context, (Div) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.DOUBLE_CONSTANT:
				if(context == grammarAccess.getActionAdditionRule() ||
				   context == grammarAccess.getActionAdditionAccess().getActionPluLeftAction_1_0() ||
				   context == grammarAccess.getActionAndRule() ||
				   context == grammarAccess.getActionAndAccess().getActionAndLeftAction_1_0() ||
				   context == grammarAccess.getActionAtomicRule() ||
				   context == grammarAccess.getActionComparisonRule() ||
				   context == grammarAccess.getActionComparisonAccess().getActionComparisonLeftAction_1_0() ||
				   context == grammarAccess.getActionDivisionRule() ||
				   context == grammarAccess.getActionDivisionAccess().getActionDivLeftAction_1_0() ||
				   context == grammarAccess.getActionEqualityRule() ||
				   context == grammarAccess.getActionEqualityAccess().getActionEqualityLeftAction_1_0() ||
				   context == grammarAccess.getActionExpressionRule() ||
				   context == grammarAccess.getActionMultiplicationRule() ||
				   context == grammarAccess.getActionMultiplicationAccess().getActionMulLeftAction_1_0() ||
				   context == grammarAccess.getActionOrRule() ||
				   context == grammarAccess.getActionOrAccess().getActionOrLeftAction_1_0() ||
				   context == grammarAccess.getActionPrimaryRule() ||
				   context == grammarAccess.getActionSubtractionRule() ||
				   context == grammarAccess.getActionSubtractionAccess().getActionSubLeftAction_1_0()) {
					sequence_ActionAtomic(context, (DoubleConstant) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getPluLeftAction_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubLeftAction_1_0()) {
					sequence_Atomic(context, (DoubleConstant) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.EQUALITY:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getPluLeftAction_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubLeftAction_1_0()) {
					sequence_Equality(context, (Equality) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.FREE_EVALUATION_EXPRESSION:
				if(context == grammarAccess.getEvaluationExpressionOutRule()) {
					sequence_EvaluationExpressionOut(context, (FreeEvaluationExpression) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.FREE_VARIABLE:
				if(context == grammarAccess.getActionAdditionRule() ||
				   context == grammarAccess.getActionAdditionAccess().getActionPluLeftAction_1_0() ||
				   context == grammarAccess.getActionAndRule() ||
				   context == grammarAccess.getActionAndAccess().getActionAndLeftAction_1_0() ||
				   context == grammarAccess.getActionAtomicRule() ||
				   context == grammarAccess.getActionComparisonRule() ||
				   context == grammarAccess.getActionComparisonAccess().getActionComparisonLeftAction_1_0() ||
				   context == grammarAccess.getActionDivisionRule() ||
				   context == grammarAccess.getActionDivisionAccess().getActionDivLeftAction_1_0() ||
				   context == grammarAccess.getActionEqualityRule() ||
				   context == grammarAccess.getActionEqualityAccess().getActionEqualityLeftAction_1_0() ||
				   context == grammarAccess.getActionExpressionRule() ||
				   context == grammarAccess.getActionMultiplicationRule() ||
				   context == grammarAccess.getActionMultiplicationAccess().getActionMulLeftAction_1_0() ||
				   context == grammarAccess.getActionOrRule() ||
				   context == grammarAccess.getActionOrAccess().getActionOrLeftAction_1_0() ||
				   context == grammarAccess.getActionPrimaryRule() ||
				   context == grammarAccess.getActionSubtractionRule() ||
				   context == grammarAccess.getActionSubtractionAccess().getActionSubLeftAction_1_0()) {
					sequence_ActionAtomic(context, (FreeVariable) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.GLOBAL_EVALUATION_EXPRESSION:
				if(context == grammarAccess.getEvaluationExpressionInRule()) {
					sequence_EvaluationExpressionIn(context, (GlobalEvaluationExpression) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.GLOBAL_UPDATE_EXPRESSION:
				if(context == grammarAccess.getUpdateExpressionRule()) {
					sequence_UpdateExpression(context, (GlobalUpdateExpression) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.IN:
				if(context == grammarAccess.getEvaluationsRule()) {
					sequence_Evaluations(context, (In) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.LEAF:
				if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoiceAccess().getChoiceLeftAction_1_0() ||
				   context == grammarAccess.getParallelRule() ||
				   context == grammarAccess.getParallelAccess().getParallelLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryProcessRule() ||
				   context == grammarAccess.getProcessExpressionRule()) {
					sequence_PrimaryProcess(context, (Leaf) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.LOCAL_EVALUATION_EXPRESSION:
				if(context == grammarAccess.getEvaluationExpressionInRule()) {
					sequence_EvaluationExpressionIn(context, (LocalEvaluationExpression) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.LOCAL_UPDATE_EXPRESSION:
				if(context == grammarAccess.getUpdateExpressionRule()) {
					sequence_UpdateExpression(context, (LocalUpdateExpression) semanticObject); 
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
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubLeftAction_1_0()) {
					sequence_Multiplication(context, (Mul) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.NOT:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getPluLeftAction_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubLeftAction_1_0()) {
					sequence_Primary(context, (Not) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.OR:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getPluLeftAction_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubLeftAction_1_0()) {
					sequence_Or(context, (Or) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.OUT:
				if(context == grammarAccess.getEvaluationsRule()) {
					sequence_Evaluations(context, (Out) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.PARALLEL:
				if(context == grammarAccess.getParallelRule() ||
				   context == grammarAccess.getParallelAccess().getParallelLeftAction_1_0() ||
				   context == grammarAccess.getProcessExpressionRule()) {
					sequence_Parallel(context, (Parallel) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.PLU:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getPluLeftAction_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubLeftAction_1_0()) {
					sequence_Addition(context, (Plu) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.PREDICATE:
				if(context == grammarAccess.getPredicateRule()) {
					sequence_Predicate(context, (Predicate) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.PREDICATE_EXPRESSION:
				if(context == grammarAccess.getPredicateExpressionRule()) {
					sequence_PredicateExpression(context, (PredicateExpression) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.PREDICATE_PROCESS:
				if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoiceAccess().getChoiceLeftAction_1_0() ||
				   context == grammarAccess.getParallelRule() ||
				   context == grammarAccess.getParallelAccess().getParallelLeftAction_1_0() ||
				   context == grammarAccess.getPredicateProcessRule() ||
				   context == grammarAccess.getPrimaryProcessRule() ||
				   context == grammarAccess.getProcessExpressionRule()) {
					sequence_PredicateProcess(context, (PredicateProcess) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.PROCESS:
				if(context == grammarAccess.getProcessRule()) {
					sequence_Process(context, (com.blasedef.onpa.oNPA.Process) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.PROCESS_REFERENCE:
				if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoiceAccess().getChoiceLeftAction_1_0() ||
				   context == grammarAccess.getParallelRule() ||
				   context == grammarAccess.getParallelAccess().getParallelLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryProcessRule() ||
				   context == grammarAccess.getProcessExpressionRule()) {
					sequence_PrimaryProcess(context, (ProcessReference) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.REFERENCED_STORE:
				if(context == grammarAccess.getActionAdditionRule() ||
				   context == grammarAccess.getActionAdditionAccess().getActionPluLeftAction_1_0() ||
				   context == grammarAccess.getActionAndRule() ||
				   context == grammarAccess.getActionAndAccess().getActionAndLeftAction_1_0() ||
				   context == grammarAccess.getActionAtomicRule() ||
				   context == grammarAccess.getActionComparisonRule() ||
				   context == grammarAccess.getActionComparisonAccess().getActionComparisonLeftAction_1_0() ||
				   context == grammarAccess.getActionDivisionRule() ||
				   context == grammarAccess.getActionDivisionAccess().getActionDivLeftAction_1_0() ||
				   context == grammarAccess.getActionEqualityRule() ||
				   context == grammarAccess.getActionEqualityAccess().getActionEqualityLeftAction_1_0() ||
				   context == grammarAccess.getActionExpressionRule() ||
				   context == grammarAccess.getActionMultiplicationRule() ||
				   context == grammarAccess.getActionMultiplicationAccess().getActionMulLeftAction_1_0() ||
				   context == grammarAccess.getActionOrRule() ||
				   context == grammarAccess.getActionOrAccess().getActionOrLeftAction_1_0() ||
				   context == grammarAccess.getActionPrimaryRule() ||
				   context == grammarAccess.getActionSubtractionRule() ||
				   context == grammarAccess.getActionSubtractionAccess().getActionSubLeftAction_1_0()) {
					sequence_ActionAtomic(context, (ReferencedStore) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getPluLeftAction_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubLeftAction_1_0()) {
					sequence_Atomic(context, (ReferencedStore) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.SELF_REFERENCED_STORE:
				if(context == grammarAccess.getSelfReferencedStoreRule()) {
					sequence_SelfReferencedStore(context, (SelfReferencedStore) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.STORE:
				if(context == grammarAccess.getStoreRule()) {
					sequence_Store(context, (Store) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.SUB:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getPluLeftAction_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubLeftAction_1_0()) {
					sequence_Subtraction(context, (Sub) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.TERM:
				if(context == grammarAccess.getTermRule()) {
					sequence_Term(context, (Term) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.UNICAST:
				if(context == grammarAccess.getActionRule()) {
					sequence_Action(context, (Unicast) semanticObject); 
					return; 
				}
				else break;
			case ONPAPackage.UPDATES:
				if(context == grammarAccess.getUpdatesRule()) {
					sequence_Updates(context, (Updates) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=ActionAddition_ActionPlu_1_0 right=ActionMultiplication)
	 */
	protected void sequence_ActionAddition(EObject context, ActionPlu semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.ACTION_PLU__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.ACTION_PLU__LEFT));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.ACTION_PLU__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.ACTION_PLU__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionAdditionAccess().getActionPluLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getActionAdditionAccess().getRightActionMultiplicationParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ActionAnd_ActionAnd_1_0 right=ActionEquality)
	 */
	protected void sequence_ActionAnd(EObject context, ActionAnd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.ACTION_AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.ACTION_AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.ACTION_AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.ACTION_AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionAndAccess().getActionAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getActionAndAccess().getRightActionEqualityParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_ActionAtomic(EObject context, BoolConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Double
	 */
	protected void sequence_ActionAtomic(EObject context, DoubleConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.DOUBLE_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.DOUBLE_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionAtomicAccess().getValueDoubleParserRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=FreeVariable
	 */
	protected void sequence_ActionAtomic(EObject context, FreeVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.FREE_VARIABLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.FREE_VARIABLE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionAtomicAccess().getValueFreeVariableParserRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=[Store|LOWER]
	 */
	protected void sequence_ActionAtomic(EObject context, ReferencedStore semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.REFERENCED_STORE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.REFERENCED_STORE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionAtomicAccess().getValueStoreLOWERTerminalRuleCall_3_1_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ActionComparison_ActionComparison_1_0 (op='>=' | op='<=' | op='>' | op='<') right=ActionSubtraction)
	 */
	protected void sequence_ActionComparison(EObject context, ActionComparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ActionDivision_ActionDiv_1_0 right=ActionPrimary)
	 */
	protected void sequence_ActionDivision(EObject context, ActionDiv semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.ACTION_DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.ACTION_DIV__LEFT));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.ACTION_DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.ACTION_DIV__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionDivisionAccess().getActionDivLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getActionDivisionAccess().getRightActionPrimaryParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ActionEquality_ActionEquality_1_0 (op='==' | op='!=') right=ActionComparison)
	 */
	protected void sequence_ActionEquality(EObject context, ActionEquality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ActionMultiplication_ActionMul_1_0 right=ActionDivision)
	 */
	protected void sequence_ActionMultiplication(EObject context, ActionMul semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.ACTION_MUL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.ACTION_MUL__LEFT));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.ACTION_MUL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.ACTION_MUL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionMultiplicationAccess().getActionMulLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getActionMultiplicationAccess().getRightActionDivisionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ActionOr_ActionOr_1_0 right=ActionAnd)
	 */
	protected void sequence_ActionOr(EObject context, ActionOr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.ACTION_OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.ACTION_OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.ACTION_OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.ACTION_OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionOrAccess().getActionOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getActionOrAccess().getRightActionAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=ActionPrimary
	 */
	protected void sequence_ActionPrimary(EObject context, ActionNot semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.ACTION_NOT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.ACTION_NOT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionPrimaryAccess().getExpressionActionPrimaryParserRuleCall_1_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (action=Action value=[Process|UPPER])
	 */
	protected void sequence_ActionProcess(EObject context, ActionProcess semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.ACTION_PROCESS__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.ACTION_PROCESS__ACTION));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.ACTION_PROCESS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.ACTION_PROCESS__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionProcessAccess().getActionActionParserRuleCall_1_0(), semanticObject.getAction());
		feeder.accept(grammarAccess.getActionProcessAccess().getValueProcessUPPERTerminalRuleCall_2_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ActionSubtraction_ActionSub_1_0 right=ActionAddition)
	 */
	protected void sequence_ActionSubtraction(EObject context, ActionSub semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.ACTION_SUB__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.ACTION_SUB__LEFT));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.ACTION_SUB__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.ACTION_SUB__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionSubtractionAccess().getActionSubLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getActionSubtractionAccess().getRightActionAdditionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=LOWER predicate=Predicate? evaluations=Evaluations? updates=Updates?)
	 */
	protected void sequence_Action(EObject context, Broadcast semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=LOWER predicate=Predicate? evaluations=Evaluations? updates=Updates?)
	 */
	protected void sequence_Action(EObject context, Unicast semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (left=And_And_1_0 right=Equality)
	 */
	protected void sequence_And(EObject context, And semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAndAccess().getAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_Atomic(EObject context, BoolConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Double
	 */
	protected void sequence_Atomic(EObject context, DoubleConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.DOUBLE_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.DOUBLE_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueDoubleParserRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=[Store|LOWER]
	 */
	protected void sequence_Atomic(EObject context, ReferencedStore semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.REFERENCED_STORE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.REFERENCED_STORE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueStoreLOWERTerminalRuleCall_2_1_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Choice_Choice_1_0 right=PrimaryProcess)
	 */
	protected void sequence_Choice(EObject context, Choice semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.CHOICE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.CHOICE__LEFT));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.CHOICE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.CHOICE__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getChoiceAccess().getChoiceLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getChoiceAccess().getRightPrimaryProcessParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Comparison_Comparison_1_0 (op='>=' | op='<=' | op='>' | op='<') right=Subtraction)
	 */
	protected void sequence_Comparison(EObject context, Comparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Division_Div_1_0 right=Primary)
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
		feeder.accept(grammarAccess.getDivisionAccess().getRightPrimaryParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Equality_Equality_1_0 (op='==' | op='!=') right=Comparison)
	 */
	protected void sequence_Equality(EObject context, Equality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=[Store|LOWER] expression=ActionExpression)
	 */
	protected void sequence_EvaluationExpressionIn(EObject context, GlobalEvaluationExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.EVALUATION_EXPRESSION_IN__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.EVALUATION_EXPRESSION_IN__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.GLOBAL_EVALUATION_EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.GLOBAL_EVALUATION_EXPRESSION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEvaluationExpressionInAccess().getNameStoreLOWERTerminalRuleCall_0_1_1_0_1(), semanticObject.getName());
		feeder.accept(grammarAccess.getEvaluationExpressionInAccess().getExpressionActionExpressionParserRuleCall_0_1_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=SelfReferencedStore expression=ActionExpression)
	 */
	protected void sequence_EvaluationExpressionIn(EObject context, LocalEvaluationExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.EVALUATION_EXPRESSION_IN__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.EVALUATION_EXPRESSION_IN__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.LOCAL_EVALUATION_EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.LOCAL_EVALUATION_EXPRESSION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEvaluationExpressionInAccess().getNameSelfReferencedStoreParserRuleCall_0_0_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEvaluationExpressionInAccess().getExpressionActionExpressionParserRuleCall_0_0_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=FreeVariable expression=ActionExpression)
	 */
	protected void sequence_EvaluationExpressionOut(EObject context, FreeEvaluationExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.FREE_EVALUATION_EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.FREE_EVALUATION_EXPRESSION__NAME));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.FREE_EVALUATION_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.FREE_EVALUATION_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEvaluationExpressionOutAccess().getNameFreeVariableParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEvaluationExpressionOutAccess().getExpressionActionExpressionParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expressions+=EvaluationExpressionIn+
	 */
	protected void sequence_Evaluations(EObject context, In semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expressions+=EvaluationExpressionOut+
	 */
	protected void sequence_Evaluations(EObject context, Out semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stores+=Store+ processes+=Process+ terms+=Term+)
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
	 *     (left=Or_Or_1_0 right=And)
	 */
	protected void sequence_Or(EObject context, Or semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrAccess().getOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Parallel_Parallel_1_0 right=Choice)
	 */
	protected void sequence_Parallel(EObject context, Parallel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.PARALLEL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.PARALLEL__LEFT));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.PARALLEL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.PARALLEL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParallelAccess().getParallelLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getParallelAccess().getRightChoiceParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=ActionExpression
	 */
	protected void sequence_PredicateExpression(EObject context, PredicateExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.PREDICATE_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.PREDICATE_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPredicateExpressionAccess().getExpressionActionExpressionParserRuleCall_0_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (predicate=Predicate value=[Process|UPPER])
	 */
	protected void sequence_PredicateProcess(EObject context, PredicateProcess semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.PREDICATE_PROCESS__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.PREDICATE_PROCESS__PREDICATE));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.PREDICATE_PROCESS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.PREDICATE_PROCESS__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPredicateProcessAccess().getPredicatePredicateParserRuleCall_1_0(), semanticObject.getPredicate());
		feeder.accept(grammarAccess.getPredicateProcessAccess().getValueProcessUPPERTerminalRuleCall_2_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     predicate=PredicateExpression
	 */
	protected void sequence_Predicate(EObject context, Predicate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.PREDICATE__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.PREDICATE__PREDICATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPredicateAccess().getPredicatePredicateExpressionParserRuleCall_2_0(), semanticObject.getPredicate());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value='nil' | value='kill')
	 */
	protected void sequence_PrimaryProcess(EObject context, Leaf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=[Process|UPPER]
	 */
	protected void sequence_PrimaryProcess(EObject context, ProcessReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.PROCESS_REFERENCE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.PROCESS_REFERENCE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryProcessAccess().getValueProcessUPPERTerminalRuleCall_4_1_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=Primary
	 */
	protected void sequence_Primary(EObject context, Not semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.NOT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.NOT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=UPPER value=ProcessExpression)
	 */
	protected void sequence_Process(EObject context, com.blasedef.onpa.oNPA.Process semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.PROCESS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.PROCESS__NAME));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.PROCESS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.PROCESS__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProcessAccess().getNameUPPERTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProcessAccess().getValueProcessExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=[Store|LOWER]
	 */
	protected void sequence_SelfReferencedStore(EObject context, SelfReferencedStore semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.SELF_REFERENCED_STORE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.SELF_REFERENCED_STORE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelfReferencedStoreAccess().getNameStoreLOWERTerminalRuleCall_2_0_1(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=LOWER value=Expression)
	 */
	protected void sequence_Store(EObject context, Store semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.STORE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.STORE__NAME));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.STORE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.STORE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStoreAccess().getNameLOWERTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStoreAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
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
	
	
	/**
	 * Constraint:
	 *     (name=[Process|UPPER] stores+=[Store|LOWER])
	 */
	protected void sequence_Term(EObject context, Term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=[Store|LOWER] expression=ActionExpression)
	 */
	protected void sequence_UpdateExpression(EObject context, GlobalUpdateExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.UPDATE_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.UPDATE_EXPRESSION__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.GLOBAL_UPDATE_EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.GLOBAL_UPDATE_EXPRESSION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUpdateExpressionAccess().getNameStoreLOWERTerminalRuleCall_0_1_1_0_1(), semanticObject.getName());
		feeder.accept(grammarAccess.getUpdateExpressionAccess().getExpressionActionExpressionParserRuleCall_0_1_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=SelfReferencedStore expression=ActionExpression)
	 */
	protected void sequence_UpdateExpression(EObject context, LocalUpdateExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.UPDATE_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.UPDATE_EXPRESSION__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, ONPAPackage.Literals.LOCAL_UPDATE_EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ONPAPackage.Literals.LOCAL_UPDATE_EXPRESSION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUpdateExpressionAccess().getNameSelfReferencedStoreParserRuleCall_0_0_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getUpdateExpressionAccess().getExpressionActionExpressionParserRuleCall_0_0_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     updates+=UpdateExpression+
	 */
	protected void sequence_Updates(EObject context, Updates semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
