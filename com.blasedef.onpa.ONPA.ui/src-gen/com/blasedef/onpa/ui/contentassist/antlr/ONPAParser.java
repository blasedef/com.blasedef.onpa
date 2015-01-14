/*
* generated by Xtext
*/
package com.blasedef.onpa.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.blasedef.onpa.services.ONPAGrammarAccess;

public class ONPAParser extends AbstractContentAssistParser {
	
	@Inject
	private ONPAGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.blasedef.onpa.ui.contentassist.antlr.internal.InternalONPAParser createParser() {
		com.blasedef.onpa.ui.contentassist.antlr.internal.InternalONPAParser result = new com.blasedef.onpa.ui.contentassist.antlr.internal.InternalONPAParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPrimaryProcessAccess().getAlternatives(), "rule__PrimaryProcess__Alternatives");
					put(grammarAccess.getActionAccess().getAlternatives_0(), "rule__Action__Alternatives_0");
					put(grammarAccess.getEvaluationsAccess().getAlternatives(), "rule__Evaluations__Alternatives");
					put(grammarAccess.getUpdateExpressionAccess().getAlternatives(), "rule__UpdateExpression__Alternatives");
					put(grammarAccess.getActionEqualityAccess().getOpAlternatives_1_1_0(), "rule__ActionEquality__OpAlternatives_1_1_0");
					put(grammarAccess.getActionComparisonAccess().getOpAlternatives_1_1_0(), "rule__ActionComparison__OpAlternatives_1_1_0");
					put(grammarAccess.getActionPrimaryAccess().getAlternatives(), "rule__ActionPrimary__Alternatives");
					put(grammarAccess.getActionAtomicAccess().getAlternatives(), "rule__ActionAtomic__Alternatives");
					put(grammarAccess.getActionAtomicAccess().getValueAlternatives_2_1_0(), "rule__ActionAtomic__ValueAlternatives_2_1_0");
					put(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0(), "rule__Equality__OpAlternatives_1_1_0");
					put(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0(), "rule__Comparison__OpAlternatives_1_1_0");
					put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
					put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
					put(grammarAccess.getAtomicAccess().getValueAlternatives_1_1_0(), "rule__Atomic__ValueAlternatives_1_1_0");
					put(grammarAccess.getDoubleAccess().getAlternatives_1_2(), "rule__Double__Alternatives_1_2");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getTermAccess().getGroup(), "rule__Term__Group__0");
					put(grammarAccess.getProcessAccess().getGroup(), "rule__Process__Group__0");
					put(grammarAccess.getParallelAccess().getGroup(), "rule__Parallel__Group__0");
					put(grammarAccess.getParallelAccess().getGroup_1(), "rule__Parallel__Group_1__0");
					put(grammarAccess.getChoiceAccess().getGroup(), "rule__Choice__Group__0");
					put(grammarAccess.getChoiceAccess().getGroup_1(), "rule__Choice__Group_1__0");
					put(grammarAccess.getPrimaryProcessAccess().getGroup_0(), "rule__PrimaryProcess__Group_0__0");
					put(grammarAccess.getPrimaryProcessAccess().getGroup_1(), "rule__PrimaryProcess__Group_1__0");
					put(grammarAccess.getPrimaryProcessAccess().getGroup_4(), "rule__PrimaryProcess__Group_4__0");
					put(grammarAccess.getPredicateProcessAccess().getGroup(), "rule__PredicateProcess__Group__0");
					put(grammarAccess.getActionProcessAccess().getGroup(), "rule__ActionProcess__Group__0");
					put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
					put(grammarAccess.getActionAccess().getGroup_0_0(), "rule__Action__Group_0_0__0");
					put(grammarAccess.getActionAccess().getGroup_0_1(), "rule__Action__Group_0_1__0");
					put(grammarAccess.getPredicateAccess().getGroup(), "rule__Predicate__Group__0");
					put(grammarAccess.getEvaluationsAccess().getGroup_0(), "rule__Evaluations__Group_0__0");
					put(grammarAccess.getEvaluationsAccess().getGroup_1(), "rule__Evaluations__Group_1__0");
					put(grammarAccess.getUpdatesAccess().getGroup(), "rule__Updates__Group__0");
					put(grammarAccess.getPredicateExpressionAccess().getGroup(), "rule__PredicateExpression__Group__0");
					put(grammarAccess.getEvaluationExpressionAccess().getGroup(), "rule__EvaluationExpression__Group__0");
					put(grammarAccess.getUpdateExpressionAccess().getGroup_0(), "rule__UpdateExpression__Group_0__0");
					put(grammarAccess.getUpdateExpressionAccess().getGroup_1(), "rule__UpdateExpression__Group_1__0");
					put(grammarAccess.getSelfReferencedStoreAccess().getGroup(), "rule__SelfReferencedStore__Group__0");
					put(grammarAccess.getActionOrAccess().getGroup(), "rule__ActionOr__Group__0");
					put(grammarAccess.getActionOrAccess().getGroup_1(), "rule__ActionOr__Group_1__0");
					put(grammarAccess.getActionAndAccess().getGroup(), "rule__ActionAnd__Group__0");
					put(grammarAccess.getActionAndAccess().getGroup_1(), "rule__ActionAnd__Group_1__0");
					put(grammarAccess.getActionEqualityAccess().getGroup(), "rule__ActionEquality__Group__0");
					put(grammarAccess.getActionEqualityAccess().getGroup_1(), "rule__ActionEquality__Group_1__0");
					put(grammarAccess.getActionComparisonAccess().getGroup(), "rule__ActionComparison__Group__0");
					put(grammarAccess.getActionComparisonAccess().getGroup_1(), "rule__ActionComparison__Group_1__0");
					put(grammarAccess.getActionSubtractionAccess().getGroup(), "rule__ActionSubtraction__Group__0");
					put(grammarAccess.getActionSubtractionAccess().getGroup_1(), "rule__ActionSubtraction__Group_1__0");
					put(grammarAccess.getActionAdditionAccess().getGroup(), "rule__ActionAddition__Group__0");
					put(grammarAccess.getActionAdditionAccess().getGroup_1(), "rule__ActionAddition__Group_1__0");
					put(grammarAccess.getActionMultiplicationAccess().getGroup(), "rule__ActionMultiplication__Group__0");
					put(grammarAccess.getActionMultiplicationAccess().getGroup_1(), "rule__ActionMultiplication__Group_1__0");
					put(grammarAccess.getActionDivisionAccess().getGroup(), "rule__ActionDivision__Group__0");
					put(grammarAccess.getActionDivisionAccess().getGroup_1(), "rule__ActionDivision__Group_1__0");
					put(grammarAccess.getActionPrimaryAccess().getGroup_0(), "rule__ActionPrimary__Group_0__0");
					put(grammarAccess.getActionPrimaryAccess().getGroup_1(), "rule__ActionPrimary__Group_1__0");
					put(grammarAccess.getActionAtomicAccess().getGroup_0(), "rule__ActionAtomic__Group_0__0");
					put(grammarAccess.getActionAtomicAccess().getGroup_1(), "rule__ActionAtomic__Group_1__0");
					put(grammarAccess.getActionAtomicAccess().getGroup_2(), "rule__ActionAtomic__Group_2__0");
					put(grammarAccess.getActionAtomicAccess().getGroup_3(), "rule__ActionAtomic__Group_3__0");
					put(grammarAccess.getStoreAccess().getGroup(), "rule__Store__Group__0");
					put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
					put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
					put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
					put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
					put(grammarAccess.getEqualityAccess().getGroup(), "rule__Equality__Group__0");
					put(grammarAccess.getEqualityAccess().getGroup_1(), "rule__Equality__Group_1__0");
					put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
					put(grammarAccess.getComparisonAccess().getGroup_1(), "rule__Comparison__Group_1__0");
					put(grammarAccess.getSubtractionAccess().getGroup(), "rule__Subtraction__Group__0");
					put(grammarAccess.getSubtractionAccess().getGroup_1(), "rule__Subtraction__Group_1__0");
					put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
					put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
					put(grammarAccess.getDivisionAccess().getGroup(), "rule__Division__Group__0");
					put(grammarAccess.getDivisionAccess().getGroup_1(), "rule__Division__Group_1__0");
					put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
					put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
					put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
					put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
					put(grammarAccess.getAtomicAccess().getGroup_2(), "rule__Atomic__Group_2__0");
					put(grammarAccess.getDoubleAccess().getGroup(), "rule__Double__Group__0");
					put(grammarAccess.getDoubleAccess().getGroup_1(), "rule__Double__Group_1__0");
					put(grammarAccess.getDoubleAccess().getGroup_1_2_1(), "rule__Double__Group_1_2_1__0");
					put(grammarAccess.getFreeVariableAccess().getGroup(), "rule__FreeVariable__Group__0");
					put(grammarAccess.getModelAccess().getStoresAssignment_0(), "rule__Model__StoresAssignment_0");
					put(grammarAccess.getModelAccess().getProcessesAssignment_1(), "rule__Model__ProcessesAssignment_1");
					put(grammarAccess.getModelAccess().getTermsAssignment_2(), "rule__Model__TermsAssignment_2");
					put(grammarAccess.getTermAccess().getNameAssignment_1(), "rule__Term__NameAssignment_1");
					put(grammarAccess.getTermAccess().getStoresAssignment_4(), "rule__Term__StoresAssignment_4");
					put(grammarAccess.getProcessAccess().getNameAssignment_0(), "rule__Process__NameAssignment_0");
					put(grammarAccess.getProcessAccess().getValueAssignment_2(), "rule__Process__ValueAssignment_2");
					put(grammarAccess.getParallelAccess().getRightAssignment_1_2(), "rule__Parallel__RightAssignment_1_2");
					put(grammarAccess.getChoiceAccess().getRightAssignment_1_2(), "rule__Choice__RightAssignment_1_2");
					put(grammarAccess.getPrimaryProcessAccess().getValueAssignment_0_1(), "rule__PrimaryProcess__ValueAssignment_0_1");
					put(grammarAccess.getPrimaryProcessAccess().getValueAssignment_1_1(), "rule__PrimaryProcess__ValueAssignment_1_1");
					put(grammarAccess.getPrimaryProcessAccess().getValueAssignment_4_1(), "rule__PrimaryProcess__ValueAssignment_4_1");
					put(grammarAccess.getPredicateProcessAccess().getPredicateAssignment_1(), "rule__PredicateProcess__PredicateAssignment_1");
					put(grammarAccess.getPredicateProcessAccess().getValueAssignment_2(), "rule__PredicateProcess__ValueAssignment_2");
					put(grammarAccess.getActionProcessAccess().getActionAssignment_1(), "rule__ActionProcess__ActionAssignment_1");
					put(grammarAccess.getActionProcessAccess().getValueAssignment_2(), "rule__ActionProcess__ValueAssignment_2");
					put(grammarAccess.getActionAccess().getNameAssignment_0_0_1(), "rule__Action__NameAssignment_0_0_1");
					put(grammarAccess.getActionAccess().getNameAssignment_0_1_1(), "rule__Action__NameAssignment_0_1_1");
					put(grammarAccess.getActionAccess().getPredicateAssignment_1(), "rule__Action__PredicateAssignment_1");
					put(grammarAccess.getActionAccess().getEvaluationsAssignment_2(), "rule__Action__EvaluationsAssignment_2");
					put(grammarAccess.getActionAccess().getUpdatesAssignment_3(), "rule__Action__UpdatesAssignment_3");
					put(grammarAccess.getPredicateAccess().getPredicateAssignment_2(), "rule__Predicate__PredicateAssignment_2");
					put(grammarAccess.getEvaluationsAccess().getExpressionsAssignment_0_2(), "rule__Evaluations__ExpressionsAssignment_0_2");
					put(grammarAccess.getEvaluationsAccess().getExpressionsAssignment_1_2(), "rule__Evaluations__ExpressionsAssignment_1_2");
					put(grammarAccess.getUpdatesAccess().getUpdatesAssignment_2(), "rule__Updates__UpdatesAssignment_2");
					put(grammarAccess.getPredicateExpressionAccess().getExpressionAssignment_0(), "rule__PredicateExpression__ExpressionAssignment_0");
					put(grammarAccess.getUpdateExpressionAccess().getNameAssignment_0_1(), "rule__UpdateExpression__NameAssignment_0_1");
					put(grammarAccess.getUpdateExpressionAccess().getExpressionAssignment_0_3(), "rule__UpdateExpression__ExpressionAssignment_0_3");
					put(grammarAccess.getUpdateExpressionAccess().getNameAssignment_1_1(), "rule__UpdateExpression__NameAssignment_1_1");
					put(grammarAccess.getUpdateExpressionAccess().getExpressionAssignment_1_3(), "rule__UpdateExpression__ExpressionAssignment_1_3");
					put(grammarAccess.getSelfReferencedStoreAccess().getStoreAssignment_2(), "rule__SelfReferencedStore__StoreAssignment_2");
					put(grammarAccess.getActionOrAccess().getRightAssignment_1_2(), "rule__ActionOr__RightAssignment_1_2");
					put(grammarAccess.getActionAndAccess().getRightAssignment_1_2(), "rule__ActionAnd__RightAssignment_1_2");
					put(grammarAccess.getActionEqualityAccess().getOpAssignment_1_1(), "rule__ActionEquality__OpAssignment_1_1");
					put(grammarAccess.getActionEqualityAccess().getRightAssignment_1_2(), "rule__ActionEquality__RightAssignment_1_2");
					put(grammarAccess.getActionComparisonAccess().getOpAssignment_1_1(), "rule__ActionComparison__OpAssignment_1_1");
					put(grammarAccess.getActionComparisonAccess().getRightAssignment_1_2(), "rule__ActionComparison__RightAssignment_1_2");
					put(grammarAccess.getActionSubtractionAccess().getRightAssignment_1_2(), "rule__ActionSubtraction__RightAssignment_1_2");
					put(grammarAccess.getActionAdditionAccess().getRightAssignment_1_2(), "rule__ActionAddition__RightAssignment_1_2");
					put(grammarAccess.getActionMultiplicationAccess().getRightAssignment_1_2(), "rule__ActionMultiplication__RightAssignment_1_2");
					put(grammarAccess.getActionDivisionAccess().getRightAssignment_1_2(), "rule__ActionDivision__RightAssignment_1_2");
					put(grammarAccess.getActionPrimaryAccess().getExpressionAssignment_1_2(), "rule__ActionPrimary__ExpressionAssignment_1_2");
					put(grammarAccess.getActionAtomicAccess().getValueAssignment_0_1(), "rule__ActionAtomic__ValueAssignment_0_1");
					put(grammarAccess.getActionAtomicAccess().getValueAssignment_1_1(), "rule__ActionAtomic__ValueAssignment_1_1");
					put(grammarAccess.getActionAtomicAccess().getValueAssignment_2_1(), "rule__ActionAtomic__ValueAssignment_2_1");
					put(grammarAccess.getActionAtomicAccess().getValueAssignment_3_1(), "rule__ActionAtomic__ValueAssignment_3_1");
					put(grammarAccess.getStoreAccess().getNameAssignment_0(), "rule__Store__NameAssignment_0");
					put(grammarAccess.getStoreAccess().getValueAssignment_2(), "rule__Store__ValueAssignment_2");
					put(grammarAccess.getOrAccess().getRightAssignment_1_2(), "rule__Or__RightAssignment_1_2");
					put(grammarAccess.getAndAccess().getRightAssignment_1_2(), "rule__And__RightAssignment_1_2");
					put(grammarAccess.getEqualityAccess().getOpAssignment_1_1(), "rule__Equality__OpAssignment_1_1");
					put(grammarAccess.getEqualityAccess().getRightAssignment_1_2(), "rule__Equality__RightAssignment_1_2");
					put(grammarAccess.getComparisonAccess().getOpAssignment_1_1(), "rule__Comparison__OpAssignment_1_1");
					put(grammarAccess.getComparisonAccess().getRightAssignment_1_2(), "rule__Comparison__RightAssignment_1_2");
					put(grammarAccess.getSubtractionAccess().getRightAssignment_1_2(), "rule__Subtraction__RightAssignment_1_2");
					put(grammarAccess.getAdditionAccess().getRightAssignment_1_2(), "rule__Addition__RightAssignment_1_2");
					put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2(), "rule__Multiplication__RightAssignment_1_2");
					put(grammarAccess.getDivisionAccess().getRightAssignment_1_2(), "rule__Division__RightAssignment_1_2");
					put(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2(), "rule__Primary__ExpressionAssignment_1_2");
					put(grammarAccess.getAtomicAccess().getValueAssignment_0_1(), "rule__Atomic__ValueAssignment_0_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_1_1(), "rule__Atomic__ValueAssignment_1_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_2_1(), "rule__Atomic__ValueAssignment_2_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.blasedef.onpa.ui.contentassist.antlr.internal.InternalONPAParser typedParser = (com.blasedef.onpa.ui.contentassist.antlr.internal.InternalONPAParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ONPAGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ONPAGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
