package com.blasedef.onpa.ONPA.tests;

import com.blasedef.onpa.ONPAInjectorProvider;
import com.blasedef.onpa.oNPA.Model;
import com.blasedef.onpa.oNPA.ONPAPackage;
import com.blasedef.onpa.validation.ONPAValidator;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ONPAInjectorProvider.class)
@SuppressWarnings("all")
public class ValidationTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testCheckNotSelfReferencing() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 10 + i;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _store = ONPAPackage.eINSTANCE.getStore();
      this._validationTestHelper.assertError(_parse, _store, 
        ONPAValidator.SELF_REFERENCING_STORE, 
        "Cannot have self referencing stores. \'i\' is seen in the expression");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCheckStoresNamesUnique() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 10;");
      _builder.newLine();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _store = ONPAPackage.eINSTANCE.getStore();
      this._validationTestHelper.assertError(_parse, _store, 
        ONPAValidator.STORE_NAMES_UNIQUE, 
        "Must have unique store names. \'i\' is repeated");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCheckProcessNamesUnique() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 10;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _process = ONPAPackage.eINSTANCE.getProcess();
      this._validationTestHelper.assertError(_parse, _process, 
        ONPAValidator.PROCESS_NAMES_UNIQUE, 
        "Must have unique process names. \'P\' is repeated");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testReferencing() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = !a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _not = ONPAPackage.eINSTANCE.getNot();
      this._validationTestHelper.assertError(_parse, _not, 
        ONPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionReference() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = 3.0;");
      _builder.newLine();
      _builder.append("P = c[$x;]($y;){this.b := !a;}.P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionNot = ONPAPackage.eINSTANCE.getActionNot();
      this._validationTestHelper.assertError(_parse, _actionNot, 
        ONPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOr() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true || a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _or = ONPAPackage.eINSTANCE.getOr();
      this._validationTestHelper.assertError(_parse, _or, 
        ONPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionOr() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true;");
      _builder.newLine();
      _builder.append("P = c[$x == (a || b);]($y;).P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionOr = ONPAPackage.eINSTANCE.getActionOr();
      this._validationTestHelper.assertError(_parse, _actionOr, 
        ONPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAnd() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true && a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _and = ONPAPackage.eINSTANCE.getAnd();
      this._validationTestHelper.assertError(_parse, _and, 
        ONPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionAnd() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true;");
      _builder.newLine();
      _builder.append("P = c[(a && b);]($y;).P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionAnd = ONPAPackage.eINSTANCE.getActionAnd();
      this._validationTestHelper.assertError(_parse, _actionAnd, 
        ONPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void testEq() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true == a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _equality = ONPAPackage.eINSTANCE.getEquality();
      this._validationTestHelper.assertError(_parse, _equality, 
        ONPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionEq() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true;");
      _builder.newLine();
      _builder.append("P = c[$x == a;]($y;).P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionEquality = ONPAPackage.eINSTANCE.getActionEquality();
      this._validationTestHelper.assertError(_parse, _actionEquality, 
        ONPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void testEq1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true != a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _equality = ONPAPackage.eINSTANCE.getEquality();
      this._validationTestHelper.assertError(_parse, _equality, 
        ONPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionEq1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true;");
      _builder.newLine();
      _builder.append("P = c[$x != a;]($y;).P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionEquality = ONPAPackage.eINSTANCE.getActionEquality();
      this._validationTestHelper.assertError(_parse, _actionEquality, 
        ONPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void testCom1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true < a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _comparison = ONPAPackage.eINSTANCE.getComparison();
      this._validationTestHelper.assertError(_parse, _comparison, 
        ONPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionCom1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true;");
      _builder.newLine();
      _builder.append("P = c[$x < a;]($y;).P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionComparison = ONPAPackage.eINSTANCE.getActionComparison();
      this._validationTestHelper.assertError(_parse, _actionComparison, 
        ONPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
