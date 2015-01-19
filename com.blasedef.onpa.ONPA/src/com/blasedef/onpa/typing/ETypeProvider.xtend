package com.blasedef.onpa.typing

import com.blasedef.onpa.oNPA.Expression
import com.blasedef.onpa.oNPA.Or
import com.blasedef.onpa.oNPA.And
import com.blasedef.onpa.oNPA.Equality
import com.blasedef.onpa.oNPA.Comparison
import com.blasedef.onpa.oNPA.Sub
import com.blasedef.onpa.oNPA.Plu
import com.blasedef.onpa.oNPA.Mul
import com.blasedef.onpa.oNPA.Div
import com.blasedef.onpa.oNPA.Not
import com.blasedef.onpa.oNPA.DoubleConstant
import com.blasedef.onpa.oNPA.BoolConstant
import com.blasedef.onpa.oNPA.ReferencedStore

import static extension com.blasedef.onpa.typing.ModelUtil.*
import com.blasedef.onpa.oNPA.FreeVariable
import com.blasedef.onpa.oNPA.SelfReferencedStore
import com.blasedef.onpa.oNPA.ActionOr
import com.blasedef.onpa.oNPA.ActionAnd
import com.blasedef.onpa.oNPA.ActionEquality
import com.blasedef.onpa.oNPA.ActionComparison
import com.blasedef.onpa.oNPA.ActionSub
import com.blasedef.onpa.oNPA.ActionPlu
import com.blasedef.onpa.oNPA.ActionMul
import com.blasedef.onpa.oNPA.ActionDiv
import com.blasedef.onpa.oNPA.ActionNot

import static extension com.blasedef.onpa.typing.ModelUtil.*
import com.blasedef.onpa.oNPA.Store

class ETypeProvider {
	
	//ExpressionType
	public static val doubleConstantType = new DoubleConstantType
	public static val freeVariableType = new FreeVariableType
	public static val boolConstantType = new BoolConstantType
	public static val referencedStoreType = new ReferencedStoreType
	public static val selfReferencedStoreType = new SelfReferencedStoreType
	
	
		def dispatch ExpressionsType typeFor(Expression e) {
			switch (e) {
				DoubleConstant: 		doubleConstantType
				BoolConstant: 			boolConstantType	
			}
		}
		
		def dispatch ExpressionsType typeFor(Or e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == boolConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == boolConstantType))
				return boolConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(ActionOr e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == boolConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == boolConstantType))
				return boolConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(And e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == boolConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == boolConstantType))
				return boolConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(ActionAnd e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == boolConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == boolConstantType))
				return boolConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(Equality e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == boolConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == boolConstantType))
				return boolConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(ActionEquality e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == boolConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == boolConstantType)){
				println("here")
				return boolConstantType}
			else
				{return null}
		}
		
		def dispatch ExpressionsType typeFor(Comparison e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return boolConstantType
			else
				return null
			
		}
		
		def dispatch ExpressionsType typeFor(ActionComparison e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return boolConstantType
			else
				return null
			
		}
		
		def dispatch ExpressionsType typeFor(Sub e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(ActionSub e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(Plu e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(ActionPlu e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(Mul e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(ActionMul e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(Div e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(ActionDiv e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(Not e){
			if (e.expression?.typeFor == boolConstantType 
				|| e.expression?.typeFor == freeVariableType)
				return boolConstantType
			else 
				return null 
		}
		
		def dispatch ExpressionsType typeFor(ActionNot e){
			if (e.expression?.typeFor == boolConstantType 
				|| e.expression?.typeFor == freeVariableType)
				return boolConstantType
			else 
				return null 
		}

		def dispatch ExpressionsType typeFor(ReferencedStore e){
			if( e.value == null || (e.selfReferencedStores == e.value) ||
				!(e.variablesHaveBeenDefinedBefore.contains(e.value))) {
				return null}
			else{
				return e.value.value?.typeFor}
		}
		
		def dispatch ExpressionsType typeFor(SelfReferencedStore e){
			if( e.name.value == null ||
				!(e.variablesHaveBeenDefinedBefore.contains((e.name as Store)))) {
				return null}
			else{
				return selfReferencedStoreType}
		}
		
		def dispatch ExpressionsType typeFor(FreeVariable e){
			return freeVariableType
		}
		

	
}