package com.blasedef.onpa.ONPA.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import com.blasedef.onpa.ONPAInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import com.blasedef.onpa.oNPA.Model
import com.blasedef.onpa.typing.ExpressionsType
import com.blasedef.onpa.typing.TypeProvider
import org.junit.Test

import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ONPAInjectorProvider))
class TypeTest {
	
		@Inject extension ParseHelper<Model>
		@Inject extension TypeProvider
		
		@Test def void DoubleConstant() { assertDoubleConstantType("i = 10") }
		
		def assertDoubleConstantType(CharSequence input) {
			input.assertEquals("i = 10")
			input.assertType(TypeProvider::doubleConstantType)
		}
		
		def assertType(CharSequence input, ExpressionsType expectedType) {
			expectedType.assertSame(input.parse.stores.last.value.typeFor)
		}
	
}