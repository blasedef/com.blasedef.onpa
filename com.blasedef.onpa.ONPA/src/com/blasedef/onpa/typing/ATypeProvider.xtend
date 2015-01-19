package com.blasedef.onpa.typing

import com.blasedef.onpa.oNPA.LocalUpdateExpression
import com.blasedef.onpa.typing.ETypeProvider
import com.google.inject.Inject
import com.blasedef.onpa.oNPA.GlobalUpdateExpression
import com.blasedef.onpa.oNPA.PredicateExpression
import com.blasedef.onpa.oNPA.LocalEvaluationExpression
import com.blasedef.onpa.oNPA.ActionExpression
import com.blasedef.onpa.oNPA.GlobalEvaluationExpression
import com.blasedef.onpa.oNPA.FreeEvaluationExpression
import com.blasedef.onpa.oNPA.FreeVariable
import com.blasedef.onpa.oNPA.SelfReferencedStore
import com.blasedef.onpa.oNPA.Store

class ATypeProvider {
	
	@Inject extension ETypeProvider

	
	//ActionType
	public static val updateExpressionType = new UpdateExpressionType
	public static val predicateExpressionType = new PredicateExpressionType
	public static val evaluationExpressionType = new EvaluationExpressionType
	public static val actionExpression = new ActionExpressionType
	
	def dispatch ActionType typeForA(LocalUpdateExpression u){
		if((u.name.name.value?.typeFor == u.expression?.typeFor) || 
			(u.expression?.typeFor == ETypeProvider::freeVariableType)){
				return updateExpressionType
			}
			else {
				return null
			}
	}
	
	def dispatch ActionType typeForA(GlobalUpdateExpression u){
		if((u.name.value?.typeFor == u.expression?.typeFor) || 
			(u.expression?.typeFor == ETypeProvider::freeVariableType)){
				return updateExpressionType
			}
			else {
				return null
			}
	}
	
	def dispatch ActionType typeForA(LocalEvaluationExpression evaluationExpression){
		
		val variable = ((evaluationExpression.name as SelfReferencedStore).name as Store).value
		val expression = evaluationExpression.expression
		
		if(((variable?.typeFor == expression?.typeFor)
		   	&& (expression?.typeFor == ETypeProvider::freeVariableType ||
		   		expression?.typeFor == ETypeProvider::boolConstantType ||
		   		expression?.typeFor == ETypeProvider::doubleConstantType) ||
		   		(expression?.typeFor == ETypeProvider::freeVariableType)))
		   return evaluationExpressionType
	}
	
	def dispatch ActionType typeForA(GlobalEvaluationExpression evaluationExpression){
		
		val variable = (evaluationExpression.name as Store).value
		val expression = evaluationExpression.expression
		
		if(((variable?.typeFor == expression?.typeFor)
		   	&& (expression?.typeFor == ETypeProvider::freeVariableType ||
		   		expression?.typeFor == ETypeProvider::boolConstantType ||
		   		expression?.typeFor == ETypeProvider::doubleConstantType) ||
		   		(expression?.typeFor == ETypeProvider::freeVariableType)))
		   	return evaluationExpressionType
		else
			return null
	}
	
	def dispatch ActionType typeForA(FreeEvaluationExpression evaluationExpression){
		
		val variable = evaluationExpression.name
		val expression = evaluationExpression.expression
		
		
		if((variable.getClass == String) 
		   	&& (expression?.typeFor == ETypeProvider::freeVariableType ||
		   		expression?.typeFor == ETypeProvider::boolConstantType ||
		   		expression?.typeFor == ETypeProvider::doubleConstantType) ||
		   		(expression?.typeFor == ETypeProvider::freeVariableType))
		   	return evaluationExpressionType
		else
			return null
	}


	def dispatch ActionType typeForA(PredicateExpression p){
		if((p.expression?.typeFor == ETypeProvider::boolConstantType) ||
		(p.expression?.typeFor == ETypeProvider::freeVariableType))
			return predicateExpressionType
		else
			return null
	}
	
}