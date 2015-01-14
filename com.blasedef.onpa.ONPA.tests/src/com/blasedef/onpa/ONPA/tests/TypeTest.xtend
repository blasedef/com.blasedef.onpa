package com.blasedef.onpa.ONPA.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import com.blasedef.onpa.ONPAInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import com.blasedef.onpa.oNPA.Model
import com.blasedef.onpa.typing.ExpressionsType
import org.junit.Test

import static extension org.junit.Assert.*
import com.blasedef.onpa.typing.ETypeProvider

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ONPAInjectorProvider))
class TypeTest {
	
		@Inject extension ParseHelper<Model>
		@Inject extension ETypeProvider
		
		@Test def void doubleConstant() { assertDoubleConstantType("i = 10;") }
		
		@Test def void boolConstantType() { assertBoolConstantType("i = true;") }
		
		@Test def void andType() { assertBoolConstantType("i = true && false;") }
		
		@Test def void OrType() { assertBoolConstantType("i = true || false;") }
		
		@Test def void EqType() { assertBoolConstantType("i = true == false;") }
		
		@Test def void ComType() { assertBoolConstantType("i = 10 <= 10;") }
		
		@Test def void ComType2() { assertBoolConstantType("i = (10 + 1) <= (10 + 2);") }
		
		@Test def void NotType() { assertBoolConstantType("i = !false;") }
		
		def assertDoubleConstantType(CharSequence input) {
			input.assertType(ETypeProvider::doubleConstantType)
		}
		
		def assertBoolConstantType(CharSequence input) {
			input.assertType(ETypeProvider::boolConstantType)
		}
		
		def assertType(CharSequence input, ExpressionsType expectedType) {
			expectedType.assertSame(input.parse.stores.last.value.typeFor)
		}
		
	
}