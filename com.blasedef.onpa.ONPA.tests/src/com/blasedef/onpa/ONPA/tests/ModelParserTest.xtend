package com.blasedef.onpa.ONPA.tests;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.runner.RunWith;
import com.google.inject.Inject;
import com.blasedef.onpa.ONPAInjectorProvider;
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import com.blasedef.onpa.oNPA.Model
import org.junit.Test
import org.junit.Assert
import com.blasedef.onpa.oNPA.Expression
import com.blasedef.onpa.oNPA.Sub
import com.blasedef.onpa.oNPA.Plu
import com.blasedef.onpa.oNPA.Mul
import com.blasedef.onpa.oNPA.Div
import com.blasedef.onpa.oNPA.DoubleConstant
import com.blasedef.onpa.oNPA.BoolConstant
import com.blasedef.onpa.oNPA.Not
import com.blasedef.onpa.oNPA.Or
import com.blasedef.onpa.oNPA.And
import com.blasedef.onpa.oNPA.Equality
import com.blasedef.onpa.oNPA.Comparison
import com.blasedef.onpa.oNPA.ReferencedRate
import com.blasedef.onpa.oNPA.AttributeValue

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ONPAInjectorProvider))
public class ModelParserTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	CharSequence output
	
	AttributeValue intermediateStore
	
	Model intermediateModel
	
	@Test 
	def void testVariableExpression1() {
		'''i = 10;'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpression2() {
		'''i = 10.0;'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpression3() {
		'''i = 0.1;'''.parse.assertNoErrors
	}

	@Test 
	def void testVariableExpressionSub1() {
		'''i = 0.2 - 0.1;'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionPlu1() {
		'''i = 0.2 + 0.1;'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionMul1() {
		'''i = 0.2 * 0.1;'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionDiv1() {
		'''i = 0.2 / 0.1;'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionOr1() {
		'''i = true || false;'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionAnd1() {
		'''i = true && false;'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionEqu1() {
		'''i = true != false;'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionEqu2() {
		'''i = true == true;'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionCom1() {
		'''i = 2.0 >= 2.0;'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionCom2() {
		'''i = 2.0 > 1.0;'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionCom3() {
		'''i = 1.0 < 2.0;'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionCom4() {
		'''i = 2.0 >= 2.0;'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionNot1() {
		'''i = !true;'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionBoolConstant1() {
		'''i = true;'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionBoolConstant2() {
		'''i = false;'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionRat1() {
		'''i = 0.2 / 0.1;
	   j = 0.2;
	   k = i + j;'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionExp1() {
		'''i = (0.2 / 0.1) + 0.4;'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionExp2() {
		'''i = 0.2 / 0.1;
	   j = 0.2;
	   k = (0.1 + i) + j;'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleAction1(){
		'''
		broadcastOut * [ ] < >  ;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleAction2(){
		'''
		broadcastIn * [ ] ( )  ;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleAction3(){
		'''
		unicastOut [ ] < >  ;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleAction4(){
		'''
		unicastIn [ ] ( )  ;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testUpdateAction1(){
		'''
		a = 0.1;
		broadcastOut * [ ] < > { } ;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimple() {
		assertRepr("i = 10.0;","10.0")
	}
	
	@Test
	def void testSimple1() {
		assertRepr("i = (10.0);","10.0")
	}
	
	@Test
	def void testSimple2() {
		assertRepr("i = true;","true")
	}
	
	@Test
	def void testSimple3() {
		assertRepr("i = false;","false")
	}
	
	@Test
	def void testSimple4() {
		assertRepr("i = !false;","! false")
	}
	
	@Test
	def void testSimple5() {
		assertRepr("i = !true;","! true")
	}
	
	@Test
	def void testSimpleOr() {
		assertRepr("i = true || false);","(true || false)")
	}
	
	@Test
	def void testSimpleAnd() {
		assertRepr("i = true && false);","(true && false)")
	}
	
	@Test
	def void testSimpleEquality1() {
		assertRepr("i = true == true);","(true == true)")
	}
	
	@Test
	def void testSimpleEquality2() {
		assertRepr("i = true != false);","(true != false)")
	}
	
	@Test
	def void testSimpleComparison1() {
		assertRepr("i = 0.1 < 0.2);","(0.1 < 0.2)")
	}
	
	@Test
	def void testSimpleComparison2() {
		assertRepr("i = 0.2 <= 0.2);","(0.2 <= 0.2)")
	}
	
	@Test
	def void testSimpleComparison3() {
		assertRepr("i = 0.2 > 0.1);","(0.2 > 0.1)")
	}
	
	@Test
	def void testSimpleComparison4() {
		assertRepr("i = 0.2 >= 0.2);","(0.2 >= 0.2)")
	}
	
	@Test
	def void testSimplePlus() {
		assertRepr("i = (10.0 + 1.0);","(10.0 + 1.0)")
	}
	
	@Test
	def void testSimplePlus1() {
		assertRepr("i = 10.0 + 1.0;","(10.0 + 1.0)")
	}
	
	@Test
	def void testPlus1() {
		assertRepr("i = (10.0 + 1.0) + 3.0;","((10.0 + 1.0) + 3.0)")
	}
	
	@Test
	def void testMix1() {
		assertRepr("i = ((10.0+1.0)/2.0)+((3.0+1.0)/2.0);","(((10.0 + 1.0) / 2.0) + ((3.0 + 1.0) / 2.0))")
	}
	
	def assertRepr(CharSequence input, CharSequence expectation) {
		
		intermediateModel = input.parse
		intermediateStore = (intermediateModel.stores).last as AttributeValue
		output = intermediateStore.value.stringRepr
		//println(output)
		//println(expectation)
		Assert::assertEquals(output,expectation)
		
	}
	
	def CharSequence stringRepr(Expression e) {
		switch (e) {
			Or: 			'''(«e.left.stringRepr» || «e.right.stringRepr»)'''
			And: 			'''(«e.left.stringRepr» && «e.right.stringRepr»)'''
			Equality:   	'''(«e.left.stringRepr» «e.op» «e.right.stringRepr»)'''
			Comparison: 	'''(«e.left.stringRepr» «e.op» «e.right.stringRepr»)'''
			Sub: 			'''(«e.left.stringRepr» - «e.right.stringRepr»)'''
			Plu: 			'''(«e.left.stringRepr» + «e.right.stringRepr»)'''
			Mul:			'''(«e.left.stringRepr» * «e.right.stringRepr»)'''
			Div: 			'''(«e.left.stringRepr» / «e.right.stringRepr»)'''
			Not: 			'''! «e.expression.stringRepr»'''
			ReferencedRate: '''(«e.rate.name»)'''
			DoubleConstant: '''«e.value»'''
			BoolConstant: 	'''«e.value»'''
			}.toString
	}

	
}
