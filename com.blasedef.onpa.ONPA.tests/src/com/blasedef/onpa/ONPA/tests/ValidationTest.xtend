package com.blasedef.onpa.ONPA.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import com.blasedef.onpa.ONPAInjectorProvider;
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import com.blasedef.onpa.oNPA.Model
import com.blasedef.onpa.oNPA.ONPAPackage
import com.blasedef.onpa.validation.ONPAValidator
import org.junit.Test

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ONPAInjectorProvider))
class ValidationTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Test
	def void testCheckNotSelfReferencing(){
		'''
		a = 0.1 + a;
		'''.parse.assertError(ONPAPackage::eINSTANCE.rate,
			ONPAValidator::SELF_REFERENCING_RATE,
			"Cannot have self referencing rates. 'a' is seen in the expression"
		)
	}
	
}