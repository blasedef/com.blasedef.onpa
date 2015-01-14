package com.blasedef.onpa.typing

import com.blasedef.onpa.oNPA.LocalUpdateExpression

class ATypeProvider {
	
		//ExpressionType
	public static val doubleConstantType = new DoubleConstantType
	public static val freeVariableType = new FreeVariableType
	public static val boolConstantType = new BoolConstantType
	public static val referencedStoreType = new ReferencedStoreType
	public static val selfReferencedStoreType = new SelfReferencedStoreType
	
	//ActionType
	public static val updateExpressionType = new UpdateExpressionType
	
	def dispatch ActionType typeFor(SelfReferencedStoreType selfRef){
		return selfReferencedStoreType
	}
	
	def dispatch ActionType typeFor(LocalUpdateExpression u){
			
		if(u.name == selfReferencedStoreType &&
			(u.expression == boolConstantType || 
				u.expression == doubleConstantType)){
				return updateExpressionType
			}
			else {
				return null
			}
		}
	
}