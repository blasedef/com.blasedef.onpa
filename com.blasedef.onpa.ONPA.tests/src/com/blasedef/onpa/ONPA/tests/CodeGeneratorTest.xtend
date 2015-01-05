package com.blasedef.onpa.ONPA.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ONPAInjectorProviderCustom))

class CodeGeneratorTest {
	@Inject extension CompilationTestHelper
	
	@Test
	def void testGeneratedValidJavaCode() {
		'''
		a = 0.1;
		'''.compile[compiledClass]
		// check that it is valid Java code
	}
	
}