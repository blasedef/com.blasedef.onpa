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
      _builder.append("i = i;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _referencedStore = ONPAPackage.eINSTANCE.getReferencedStore();
      this._validationTestHelper.assertError(_parse, _referencedStore, 
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
      _builder.append("a = true;");
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
  
  public void testSub1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true - a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _sub = ONPAPackage.eINSTANCE.getSub();
      this._validationTestHelper.assertError(_parse, _sub, 
        ONPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionSub1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = true;");
      _builder.newLine();
      _builder.append("b = true;");
      _builder.newLine();
      _builder.append("P = c($y - a;).P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionSub = ONPAPackage.eINSTANCE.getActionSub();
      this._validationTestHelper.assertError(_parse, _actionSub, 
        ONPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void testPlu1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true - a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _plu = ONPAPackage.eINSTANCE.getPlu();
      this._validationTestHelper.assertError(_parse, _plu, 
        ONPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionPlu1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = true;");
      _builder.newLine();
      _builder.append("b = true;");
      _builder.newLine();
      _builder.append("P = c($y + a;).P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionPlu = ONPAPackage.eINSTANCE.getActionPlu();
      this._validationTestHelper.assertError(_parse, _actionPlu, 
        ONPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMul1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true * a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _mul = ONPAPackage.eINSTANCE.getMul();
      this._validationTestHelper.assertError(_parse, _mul, 
        ONPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionMul1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = true;");
      _builder.newLine();
      _builder.append("b = true;");
      _builder.newLine();
      _builder.append("P = c($y * a;).P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionMul = ONPAPackage.eINSTANCE.getActionMul();
      this._validationTestHelper.assertError(_parse, _actionMul, 
        ONPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDiv1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true / a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _div = ONPAPackage.eINSTANCE.getDiv();
      this._validationTestHelper.assertError(_parse, _div, 
        ONPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionDiv1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = true;");
      _builder.newLine();
      _builder.append("b = true;");
      _builder.newLine();
      _builder.append("P = c($y / a;).P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionDiv = ONPAPackage.eINSTANCE.getActionDiv();
      this._validationTestHelper.assertError(_parse, _actionDiv, 
        ONPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testUpdateExpression1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("z = 0.2;");
      _builder.newLine();
      _builder.append("P = c{this.z := boolean;}.P;");
      _builder.newLine();
      _builder.append("(P,{z});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _updateExpression = ONPAPackage.eINSTANCE.getUpdateExpression();
      this._validationTestHelper.assertError(_parse, _updateExpression, 
        ONPAValidator.WRONG_TYPE, 
        "Expected self reference type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
