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

class TypeProvider {
	
	public static val doubleConstantType = new DoubleConstantType
	public static val FreeVariableType = new FreeVariableType
	public static val boolConstantType = new BoolConstantType
	public static val referencedStoreType = new ReferencedStoreType
	public static val selfReferencedStoreType = new SelfReferencedStoreType
	
	
		def dispatch ExpressionsType typeFor(Expression e) {
			switch (e) {
				Or: 					boolConstantType
				And: 					boolConstantType
				Equality:   			boolConstantType
				Comparison: 			boolConstantType
				Sub: 					doubleConstantType
				Plu: 					doubleConstantType
				Mul:					doubleConstantType
				Div: 					doubleConstantType
				Not: 					boolConstantType
				DoubleConstant: 		doubleConstantType
				BoolConstant: 			boolConstantType	
			}
	}
	
}