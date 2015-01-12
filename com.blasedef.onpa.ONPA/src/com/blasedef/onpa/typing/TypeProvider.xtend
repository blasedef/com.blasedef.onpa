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

class TypeProvider {
	
	public static val doubleConstantType = new DoubleConstantType
	public static val FreeVariableType = new FreeVariableType
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
			if (leftType == boolConstantType && rightType == boolConstantType)
				return boolConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(And e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if (leftType == boolConstantType && rightType == boolConstantType)
				return boolConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(Equality e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if (leftType == boolConstantType && rightType == boolConstantType)
				return boolConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(Comparison e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if (leftType == doubleConstantType && rightType == doubleConstantType)
				return boolConstantType
			else
				return null
			
		}
		
		def dispatch ExpressionsType typeFor(Sub e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if (leftType == doubleConstantType && rightType == doubleConstantType)
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(Plu e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if (leftType == doubleConstantType && rightType == doubleConstantType)
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(Mul e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if (leftType == doubleConstantType && rightType == doubleConstantType)
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(Div e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if (leftType == doubleConstantType && rightType == doubleConstantType)
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(Not e){
			if (e.expression?.typeFor == boolConstantType)
				return boolConstantType
			else 
				return null 
		}
		
		def dispatch ExpressionsType typeFor(ReferencedStore e){
			if( e.value == null ||
				!(e.value.variablesDefinedBefore.contains(e.value))) {
				println("null " + e.value)
				return null}
			else{
				println(e.value)
				return e.value.value?.typeFor}
		}
	
}