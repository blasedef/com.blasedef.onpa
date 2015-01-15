package com.blasedef.onpa.ONPA.tests;

import com.blasedef.onpa.ONPAInjectorProvider
import com.blasedef.onpa.oNPA.Action
import com.blasedef.onpa.oNPA.ActionAnd
import com.blasedef.onpa.oNPA.ActionComparison
import com.blasedef.onpa.oNPA.ActionDiv
import com.blasedef.onpa.oNPA.ActionEquality
import com.blasedef.onpa.oNPA.ActionExpression
import com.blasedef.onpa.oNPA.ActionMul
import com.blasedef.onpa.oNPA.ActionNot
import com.blasedef.onpa.oNPA.ActionOr
import com.blasedef.onpa.oNPA.ActionPlu
import com.blasedef.onpa.oNPA.ActionProcess
import com.blasedef.onpa.oNPA.ActionSub
import com.blasedef.onpa.oNPA.And
import com.blasedef.onpa.oNPA.BoolConstant
import com.blasedef.onpa.oNPA.Broadcast
import com.blasedef.onpa.oNPA.Choice
import com.blasedef.onpa.oNPA.Comparison
import com.blasedef.onpa.oNPA.Div
import com.blasedef.onpa.oNPA.DoubleConstant
import com.blasedef.onpa.oNPA.Equality
import com.blasedef.onpa.oNPA.Evaluations
import com.blasedef.onpa.oNPA.Expression
import com.blasedef.onpa.oNPA.FreeVariable
import com.blasedef.onpa.oNPA.In
import com.blasedef.onpa.oNPA.Leaf
import com.blasedef.onpa.oNPA.LocalUpdateExpression
import com.blasedef.onpa.oNPA.Model
import com.blasedef.onpa.oNPA.Mul
import com.blasedef.onpa.oNPA.Not
import com.blasedef.onpa.oNPA.Or
import com.blasedef.onpa.oNPA.Out
import com.blasedef.onpa.oNPA.Parallel
import com.blasedef.onpa.oNPA.Plu
import com.blasedef.onpa.oNPA.Predicate
import com.blasedef.onpa.oNPA.PredicateProcess
import com.blasedef.onpa.oNPA.Process
import com.blasedef.onpa.oNPA.ProcessExpression
import com.blasedef.onpa.oNPA.ProcessReference
import com.blasedef.onpa.oNPA.ReferencedStore
import com.blasedef.onpa.oNPA.SelfReferencedStore
import com.blasedef.onpa.oNPA.Store
import com.blasedef.onpa.oNPA.Sub
import com.blasedef.onpa.oNPA.Unicast
import com.blasedef.onpa.oNPA.UpdateExpression
import com.blasedef.onpa.oNPA.Updates
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import com.blasedef.onpa.oNPA.GlobalUpdateExpression

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ONPAInjectorProvider))
public class ModelParserTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	CharSequence output
	
	Store intermediateStore
	Process intermediateProcess
	
	Model intermediateModel
	
	@Test 
	def void testVariableExpression1() {
		'''
		i = 10;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpression2() {
		'''
		i = 10.0;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpression3() {
		'''
		i = 0.1;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpression4() {
		'''
		i = 0.1;
		P = Q;
		Q = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpression5() {
		'''
		i = 0.1;
		P = Q;
		Q = P;
		(Q,{i});
		'''.parse.assertNoErrors
	}

	@Test 
	def void testVariableExpressionSub1() {
		'''
		i = 0.2 - 0.1;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionPlu1() {
		'''
		i = 0.2 + 0.1;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionMul1() {
		'''
		i = 0.2 * 0.1;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionDiv1() {
		'''
		i = 0.2 / 0.1;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionOr1() {
		'''
		i = true || false;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionAnd1() {
		'''
		i = false && false;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionEqu1() {
		'''
		i = true != false;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionEqu2() {
		'''
		i = true == true;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionCom1() {
		'''
		i = 2.0 >= 2.0;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionCom2() {
		'''
		i = 2.0 > 1.0;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionCom3() {
		'''
		i = 1.0 < 2.0;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionCom4() {
		'''
		i = 2.0 >= 2.0;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionNot1() {
		'''
		i = !true;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionBoolConstant1() {
		'''
		i = true;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionBoolConstant2() {
		'''
		i = false;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionRat1() {
		'''
		i = 0.2 / 0.1;
		j = 0.2;
		k = i + j;
		P = P;
		(P,{i});
	   '''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionExp1() {
		'''
		i = (0.2 / 0.1) + 0.4;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testVariableExpressionExp2() {
		'''
		i = 0.2 / 0.1;
		j = 0.2;
		k = (0.1 + i) + j;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleAction1(){
		'''
		a = 0.1;
		b = 0.1;
		P = c*[$x;]<$y;>{a := $z;}.P;
		(P,{a});
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleAction2(){
		'''
		a = 0.1;
		b = 0.1;
		P = c*[$x;]($y;){a := $z;}.P;
		(P,{a});
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleAction3(){
		'''
		a = 0.1;
		b = 0.1;
		P = c[$x;]<$y;>{a := $z;}.P;
		(P,{a});
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleAction4(){
		'''
		a = 0.1;
		b = 0.1;
		P = c[$x;]($y;){a := $z;}.P;
		(P,{a});
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleAction5(){
		'''
		a = 0.1;
		b = 0.1;
		P = c[$x;]($y;){this.a := $z;}.P;
		(P,{a});
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleAction6(){
		'''
		a = 0.1;
		b = 0.1;
		P = c[$x;]<$y;>{this.a := $z;}.P;
		(P,{a});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testProcess1() {
		'''
		i = 0.1;
		P = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testProcess2() {
		'''
		i = 0.1;
		P = nil;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testProcess3() {
		'''
		i = 0.1;
		P = kill;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testProcess4() {
		'''
		i = 0.1;
		P = P + Q;
		Q = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testProcess5() {
		'''
		i = 0.1;
		P = P | Q;
		Q = P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testProcess6() {
		'''
		i = 0.1;
		P = [$x;]P;
		(P,{i});
		'''.parse.assertNoErrors
	}
	
	@Test 
	def void testProcess7() {
		'''
		i = 0.1;
		P = Q;
		Q = P;
		R = P + Q;
		(R,{i});
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimple() {
		assertReprStores("i = 10.0;","10.0")
	}
	
	@Test
	def void testSimple1() {
		assertReprStores("i = (10.0);","10.0")
	}
	
	@Test
	def void testSimple2() {
		assertReprStores("i = true;","true")
	}
	
	@Test
	def void testSimple3() {
		assertReprStores("i = false;","false")
	}
	
	@Test
	def void testSimple4() {
		assertReprStores("i = !false;","! false")
	}
	
	@Test
	def void testSimple5() {
		assertReprStores("i = !true;","! true")
	}
	
	@Test
	def void testSimpleOr() {
		assertReprStores("i = true || false);","(true || false)")
	}
	
	@Test
	def void testSimpleAnd() {
		assertReprStores("i = true && false);","(true && false)")
	}
	
	@Test
	def void testSimpleEquality1() {
		assertReprStores("i = true == true);","(true == true)")
	}
	
	@Test
	def void testSimpleEquality2() {
		assertReprStores("i = true != false);","(true != false)")
	}
	
	@Test
	def void testSimpleComparison1() {
		assertReprStores("i = 0.1 < 0.2);","(0.1 < 0.2)")
	}
	
	@Test
	def void testSimpleComparison2() {
		assertReprStores("i = 0.2 <= 0.2);","(0.2 <= 0.2)")
	}
	
	@Test
	def void testSimpleComparison3() {
		assertReprStores("i = 0.2 > 0.1);","(0.2 > 0.1)")
	}
	
	@Test
	def void testSimpleComparison4() {
		assertReprStores("i = 0.2 >= 0.2);","(0.2 >= 0.2)")
	}
	
	@Test
	def void testSimplePlus() {
		assertReprStores("i = (10.0 + 1.0);","(10.0 + 1.0)")
	}
	
	@Test
	def void testSimplePlus1() {
		assertReprStores("i = 10.0 + 1.0;","(10.0 + 1.0)")
	}
	
	@Test
	def void testPlus1() {
		assertReprStores("i = (10.0 + 1.0) + 3.0;","((10.0 + 1.0) + 3.0)")
	}
	
	@Test
	def void testMix1() {
		assertReprStores("i = ((10.0+1.0)/2.0)+((3.0+1.0)/2.0);","(((10.0 + 1.0) / 2.0) + ((3.0 + 1.0) / 2.0))")
	}
	
	def assertReprStores(CharSequence input, CharSequence expectation) {
		
		intermediateModel = input.parse
		intermediateStore = intermediateModel.stores.last
		output = intermediateStore.value.stringRepr
		//println(output)
		//println(expectation)
		Assert::assertEquals(output,expectation)
		
	}
	
	@Test
	def void testAssertProcess1() {
		assertReprProcesses("i = 0.1; P = nil; (P,{i});","nil")
	}
	
	@Test
	def void testAssertProcess2() {
		assertReprProcesses("i = 0.1; P = kill; (P,{i});","kill")
	}
	
	@Test
	def void testAssertProcess3() {
		assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;]<$y;>{this.a := $z;}.P; (P,{a});","c[$x;]<$y;>{this.a:=$z;}.P")
	}
	
	@Test
	def void testAssertProcess4() {
		assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;]($y;){this.a := $z;}.P; (P,{a});","c[$x;]($y;){this.a:=$z;}.P")
	}
	
	@Test
	def void testAssertProcess5() {
		assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;]($y;$a;){this.a := $z;}.P; (P,{a});","c[$x;]($y;$a;){this.a:=$z;}.P")
	}
	
	@Test
	def void testAssertProcess6() {
		assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;]($y;){this.a := $z;b:=$a;}.P; (P,{a});","c[$x;]($y;){this.a:=$z;b:=$a;}.P")
	}
	
	@Test
	def void testAssertProcess7() {
		assertReprProcesses("a = 0.1; b = 0.1; Q = P; P = Q; R = P + Q (R,{a});","(P + Q)")
	}
	
	@Test
	def void testAssertProcess8() {
		assertReprProcesses("a = 0.1; b = 0.1; Q = P; P = Q; R = P | Q (R,{a});","(P | Q)")
	}
	
	@Test
	def void testAssertProcess9() {
		assertReprProcesses("a = 0.1; b = 0.1; Q = P; P = Q; R = P | Q + P (R,{a});","(P | (Q + P))")
	}
	
	@Test
	def void testAssertProcess10() {
		assertReprProcesses("a = 0.1; b = 0.1; P = [$x]P (R,{a});","[$x;]P")
	}
	
	@Test
	def void testAssertProcess11() {
		assertReprProcesses("a = 0.1; b = 0.1; P = Q; R = P; (R,{a});","P")
	}
	
	@Test
	def void testAssertProcess12() {
		assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;]($y;){this.a := $z + 5 * 2.0 / 0.5 - 2;}.P; (P,{a});","c[$x;]($y;){this.a:=(($z + (5.0 * (2.0 / 0.5))) - 2.0);}.P")
	}
	
	@Test
	def void testAssertProcess12a() {
		assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;](this.a := $y;){this.a := $z+1.0;}.P; (P,{a});","c[$x;]($y;){this.a:=($z + 1.0);}.P")
	}
	
	@Test
	def void testAssertProcess13() {
		assertReprProcesses("a = 0.1; b = 0.1; P = c[$x + 5 * 2.0 / 0.5 - 2;]($y;){this.a := $z;}.P; (P,{a});","c[(($x + (5.0 * (2.0 / 0.5))) - 2.0);]($y;){this.a:=$z;}.P")
	}
	
	@Test
	def void testAssertProcess14() {
		assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;]($y;){this.a := $z + 5 * 2.0 / 0.5 - 2;}.P; (P,{a});","c[$x;]($y;){this.a:=(($z + (5.0 * (2.0 / 0.5))) - 2.0);}.P")
	}
	
	@Test
	def void testAssertProcess15() {
		assertReprProcesses("a = 0.1; b = 0.1; P = c*[$x;]($y;){this.a := $z + 5 * 2.0 / 0.5 - 2;}.P; (P,{a});","c*[$x;]($y;){this.a:=(($z + (5.0 * (2.0 / 0.5))) - 2.0);}.P")
	}
	
	def assertReprProcesses(CharSequence input, CharSequence expectation) {
		
		//println("input:")
		//println(input)
		intermediateModel = input.parse
		intermediateProcess = intermediateModel.processes.last
		output = intermediateProcess.value.stringRepr
		//println("output:")
		//println(output)
		//println("expectation:")
		//println(expectation)
		Assert::assertEquals(output,expectation)
		
	}
	
	def CharSequence stringRepr(Expression e) {
		switch (e) {
			Or: 					'''(«e.left.stringRepr» || «e.right.stringRepr»)'''
			And: 					'''(«e.left.stringRepr» && «e.right.stringRepr»)'''
			Equality:   			'''(«e.left.stringRepr» «e.op» «e.right.stringRepr»)'''
			Comparison: 			'''(«e.left.stringRepr» «e.op» «e.right.stringRepr»)'''
			Sub: 					'''(«e.left.stringRepr» - «e.right.stringRepr»)'''
			Plu: 					'''(«e.left.stringRepr» + «e.right.stringRepr»)'''
			Mul:					'''(«e.left.stringRepr» * «e.right.stringRepr»)'''
			Div: 					'''(«e.left.stringRepr» / «e.right.stringRepr»)'''
			Not: 					'''! «e.expression.stringRepr»'''
			ReferencedStore: 		'''(«e.value.name»)'''
			DoubleConstant: 		'''«e.value»'''
			BoolConstant: 			'''«e.value»'''
			}.toString
	}
	
	def CharSequence stringRepr(ActionExpression e) {
		switch (e) {
			ActionOr: 					'''(«e.left.stringRepr» || «e.right.stringRepr»)'''
			ActionAnd: 					'''(«e.left.stringRepr» && «e.right.stringRepr»)'''
			ActionEquality:   			'''(«e.left.stringRepr» «e.op» «e.right.stringRepr»)'''
			ActionComparison: 			'''(«e.left.stringRepr» «e.op» «e.right.stringRepr»)'''
			ActionSub: 					'''(«e.left.stringRepr» - «e.right.stringRepr»)'''
			ActionPlu: 					'''(«e.left.stringRepr» + «e.right.stringRepr»)'''
			ActionMul:					'''(«e.left.stringRepr» * «e.right.stringRepr»)'''
			ActionDiv: 					'''(«e.left.stringRepr» / «e.right.stringRepr»)'''
			ActionNot: 					'''! «e.expression.stringRepr»'''
			FreeVariable:				'''«e.value»'''
			SelfReferencedStore: 		'''(this.«e.name.name»)'''
			ReferencedStore: 		'''(«e.value.name»)'''
			DoubleConstant: 		'''«e.value»'''
			BoolConstant: 			'''«e.value»'''
			}.toString
	}
	
	def CharSequence stringRepr(ProcessExpression e) {
		switch (e) {
			Parallel:			'''(«e.left.stringRepr» | «e.right.stringRepr»)'''
			Choice:				'''(«e.left.stringRepr» + «e.right.stringRepr»)'''
			Leaf:				'''«e.value»'''
			PredicateProcess:	'''«e.predicate.stringRepr»«e.value.name»'''
			ActionProcess:		{'''«(e.action as Action).stringRepr».«e.value.name»'''}
			ProcessReference:	'''«e.value.name»'''
			}.toString
	}
	
	def CharSequence stringRepr(Action a) {
		switch(a){
			Broadcast:	'''«a.name»*«a.predicate.stringRepr»«a.evaluations.stringRepr»«a.updates.stringRepr»'''
			Unicast:	'''«a.name»«a.predicate.stringRepr»«a.evaluations.stringRepr»«a.updates.stringRepr»'''
		}.toString
		
	}
	
	def CharSequence stringRepr(Predicate p){
		'''[«(p.predicate.expression as ActionExpression).stringRepr»;]'''
	}
	
	def CharSequence stringRepr(Evaluations e){
		switch(e){
			In:				'''(«FOR evaluationExpression : e.expressions»«(evaluationExpression as ActionExpression).stringRepr»;«ENDFOR»)'''
			Out:			'''<«FOR evaluationExpression : e.expressions»«(evaluationExpression as ActionExpression).stringRepr»;«ENDFOR»>'''	
		}
	}
	
	def CharSequence stringRepr(Updates u){
			'''{«FOR updateExpression : u.updates»«updateExpression.stringRepr»«ENDFOR»}'''
				
	}
	
	def CharSequence stringRepr(UpdateExpression u){
		switch(u){
			LocalUpdateExpression: 	'''this.«u.name.name.name»:=«u.expression.stringRepr»;''' 
			GlobalUpdateExpression:		'''«u.name.name»:=«u.expression.stringRepr»;'''
		}
	}
	
}
