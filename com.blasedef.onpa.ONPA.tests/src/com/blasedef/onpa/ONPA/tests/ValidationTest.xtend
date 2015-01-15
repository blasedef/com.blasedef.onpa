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
import com.blasedef.onpa.typing.ExpressionsType

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ONPAInjectorProvider))
class ValidationTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Test
	def void testCheckNotSelfReferencing(){
		'''
		i = i;
		P = P;
		(P,{i});
		'''.parse.assertError(ONPAPackage::eINSTANCE.referencedStore,
			ONPAValidator::SELF_REFERENCING_STORE,
			"Cannot have self referencing stores. 'i' is seen in the expression"
		)
	}
	
	@Test
	def void testCheckStoresNamesUnique(){
		'''
		i = 10;
		i = 0.1;
		P = P;
		(P,{i});
		'''.parse.assertError(ONPAPackage::eINSTANCE.store,
			ONPAValidator::STORE_NAMES_UNIQUE,
			"Must have unique store names. 'i' is repeated"
		)
	}
	
	@Test
	def void testCheckProcessNamesUnique(){
		'''
		i = 10;
		P = P;
		P = P;
		(P,{i});
		'''.parse.assertError(ONPAPackage::eINSTANCE.process,
			ONPAValidator::PROCESS_NAMES_UNIQUE,
			"Must have unique process names. 'P' is repeated"
		)
	}
	
	@Test
	def void testReferencing(){
		'''
		a = 1.0;
		b = !a;
		P = nil;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.not,
			ONPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	@Test
	def void testActionReference(){
		'''
		a = 1.0;
		b = 3.0;
		P = c[$x;]($y;){this.b := !a;}.P;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.actionNot,
			ONPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	@Test
	def void testOr(){
		'''
		a = 1.0;
		b = true || a;
		P = nil;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.or,
			ONPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	@Test
	def void testActionOr(){
		'''
		a = 1.0;
		b = true;
		P = c[$x == (a || b);]($y;).P;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.actionOr,
			ONPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	@Test
	def void testAnd(){
		'''
		a = 1.0;
		b = true && a;
		P = nil;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.and,
			ONPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	@Test
	def void testActionAnd(){
		'''
		a = 1.0;
		b = true;
		P = c[(a && b);]($y;).P;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.actionAnd,
			ONPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	def void testEq(){
		'''
		a = 1.0;
		b = true == a;
		P = nil;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.equality,
			ONPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	@Test
	def void testActionEq(){
		'''
		a = 1.0;
		b = true;
		P = c[$x == a;]($y;).P;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.actionEquality,
			ONPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	def void testEq1(){
		'''
		a = 1.0;
		b = true != a;
		P = nil;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.equality,
			ONPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	@Test
	def void testActionEq1(){
		'''
		a = 1.0;
		b = true;
		P = c[$x != a;]($y;).P;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.actionEquality,
			ONPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	
	def void testCom1(){
		'''
		a = 1.0;
		b = true < a;
		P = nil;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.comparison,
			ONPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	@Test
	def void testActionCom1(){
		'''
		a = true;
		b = true;
		P = c[$x < a;]($y;).P;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.actionComparison,
			ONPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	def void testSub1(){
		'''
		a = 1.0;
		b = true - a;
		P = nil;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.sub,
			ONPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	@Test
	def void testActionSub1(){
		'''
		a = true;
		b = true;
		P = c($y - a;).P;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.actionSub,
			ONPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	def void testPlu1(){
		'''
		a = 1.0;
		b = true - a;
		P = nil;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.plu,
			ONPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	@Test
	def void testActionPlu1(){
		'''
		a = true;
		b = true;
		P = c($y + a;).P;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.actionPlu,
			ONPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	@Test
	def void testMul1(){
		'''
		a = 1.0;
		b = true * a;
		P = nil;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.mul,
			ONPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	@Test
	def void testActionMul1(){
		'''
		a = true;
		b = true;
		P = c($y * a;).P;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.actionMul,
			ONPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	@Test
	def void testDiv1(){
		'''
		a = 1.0;
		b = true / a;
		P = nil;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.div,
			ONPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	@Test
	def void testActionDiv1(){
		'''
		a = true;
		b = true;
		P = c($y / a;).P;
		(P,{b});
		'''.parse.assertError(ONPAPackage::eINSTANCE.actionDiv,
			ONPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	@Test
	def void testUpdateExpression1(){
		'''
		z = 0.2;
		P = c{this.z := boolean;}.P;
		(P,{z});
		'''.parse.assertError(ONPAPackage::eINSTANCE.updateExpression,
			ONPAValidator::WRONG_TYPE,
			"assignment has non matching type to reference"
		)
	}
	
	@Test
	def void testUpdateExpression2(){
		'''
		z = 0.2;
		P = c{z := boolean;}.P;
		(P,{z});
		'''.parse.assertError(ONPAPackage::eINSTANCE.updateExpression,
			ONPAValidator::WRONG_TYPE,
			"assignment has non matching type to reference"
		)
	}
	
	@Test
	def void testPredicateExpression1(){
		'''
		z = 0.2;
		P = c[1.0].P;
		(P,{z});
		'''.parse.assertError(ONPAPackage::eINSTANCE.predicateExpression,
			ONPAValidator::WRONG_TYPE,
			"Predicates must be boolean"
		)
	}	
	
	
}