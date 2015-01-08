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
		i = 10 + i;
		P = P;
		(P,{i});
		'''.parse.assertError(ONPAPackage::eINSTANCE.store,
			ONPAValidator::SELF_REFERENCING_RATE,
			"Cannot have self referencing stores. 'i' is seen in the expression"
		)
	}
	
	@Test
	def void testCheckUniqueVariableNamesStores(){
		'''
		i = 10;
		i = 0.1;
		P = P;
		(P,{i});
		'''.parse.assertError(ONPAPackage::eINSTANCE.store,
			ONPAValidator::UNIQUE_VARIABLE_NAMES_STORES,
			"Must have unique store names. 'i' is repeated"
		)
	}
	
}