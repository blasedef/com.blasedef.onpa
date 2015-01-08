package com.blasedef.onpa.ONPA.tests;

import com.blasedef.onpa.ONPAInjectorProvider;
import com.blasedef.onpa.oNPA.And;
import com.blasedef.onpa.oNPA.BoolConstant;
import com.blasedef.onpa.oNPA.Comparison;
import com.blasedef.onpa.oNPA.Div;
import com.blasedef.onpa.oNPA.DoubleConstant;
import com.blasedef.onpa.oNPA.Equality;
import com.blasedef.onpa.oNPA.Expression;
import com.blasedef.onpa.oNPA.FreeVariable;
import com.blasedef.onpa.oNPA.Model;
import com.blasedef.onpa.oNPA.Mul;
import com.blasedef.onpa.oNPA.Not;
import com.blasedef.onpa.oNPA.Or;
import com.blasedef.onpa.oNPA.Plu;
import com.blasedef.onpa.oNPA.ReferencedStore;
import com.blasedef.onpa.oNPA.Store;
import com.blasedef.onpa.oNPA.Sub;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ONPAInjectorProvider.class)
@SuppressWarnings("all")
public class ModelParserTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  private CharSequence output;
  
  private Store intermediateStore;
  
  private Model intermediateModel;
  
  @Test
  public void testVariableExpression1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 10;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpression2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 10.0;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpression3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpression4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = Q;");
      _builder.newLine();
      _builder.append("Q = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpression5() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = Q;");
      _builder.newLine();
      _builder.append("Q = P;");
      _builder.newLine();
      _builder.append("(Q,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionSub1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.2 - 0.1;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionPlu1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.2 + 0.1;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionMul1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.2 * 0.1;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionDiv1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.2 / 0.1;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionOr1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = true || false;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionAnd1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = true && false;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionEqu1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = true != false;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionEqu2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = true == true;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionCom1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 2.0 >= 2.0;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionCom2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 2.0 > 1.0;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionCom3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 1.0 < 2.0;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionCom4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 2.0 >= 2.0;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionNot1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = !true;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionBoolConstant1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = true;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionBoolConstant2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = false;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionRat1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.2 / 0.1;");
      _builder.newLine();
      _builder.append("j = 0.2;");
      _builder.newLine();
      _builder.append("k = i + j;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionExp1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = (0.2 / 0.1) + 0.4;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionExp2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.2 / 0.1;");
      _builder.newLine();
      _builder.append("j = 0.2;");
      _builder.newLine();
      _builder.append("k = (0.1 + i) + j;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleAction1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 0.1;");
      _builder.newLine();
      _builder.append("b = 0.1;");
      _builder.newLine();
      _builder.append("P = c*[$x;]<$y;>{$z;}.P;");
      _builder.newLine();
      _builder.append("(P,{a});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleAction2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 0.1;");
      _builder.newLine();
      _builder.append("b = 0.1;");
      _builder.newLine();
      _builder.append("P = c*[$x;]($y;){$z;}.P;");
      _builder.newLine();
      _builder.append("(P,{a});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleAction3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 0.1;");
      _builder.newLine();
      _builder.append("b = 0.1;");
      _builder.newLine();
      _builder.append("P = c[$x;]<$y;>{$z;}.P;");
      _builder.newLine();
      _builder.append("(P,{a});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleAction4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 0.1;");
      _builder.newLine();
      _builder.append("b = 0.1;");
      _builder.newLine();
      _builder.append("P = c[$x;]($y;){$z;}.P;");
      _builder.newLine();
      _builder.append("(P,{a});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testProcess1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testProcess2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testProcess3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = kill;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testProcess4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = P + Q;");
      _builder.newLine();
      _builder.append("Q = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testProcess5() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = P | Q;");
      _builder.newLine();
      _builder.append("Q = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testProcess6() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = [$x;]P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testProcess7() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = Q;");
      _builder.newLine();
      _builder.append("Q = P;");
      _builder.newLine();
      _builder.append("R = P + Q;");
      _builder.newLine();
      _builder.append("(R,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimple() {
    this.assertRepr("i = 10.0;", "10.0");
  }
  
  @Test
  public void testSimple1() {
    this.assertRepr("i = (10.0);", "10.0");
  }
  
  @Test
  public void testSimple2() {
    this.assertRepr("i = true;", "true");
  }
  
  @Test
  public void testSimple3() {
    this.assertRepr("i = false;", "false");
  }
  
  @Test
  public void testSimple4() {
    this.assertRepr("i = !false;", "! false");
  }
  
  @Test
  public void testSimple5() {
    this.assertRepr("i = !true;", "! true");
  }
  
  @Test
  public void testSimpleOr() {
    this.assertRepr("i = true || false);", "(true || false)");
  }
  
  @Test
  public void testSimpleAnd() {
    this.assertRepr("i = true && false);", "(true && false)");
  }
  
  @Test
  public void testSimpleEquality1() {
    this.assertRepr("i = true == true);", "(true == true)");
  }
  
  @Test
  public void testSimpleEquality2() {
    this.assertRepr("i = true != false);", "(true != false)");
  }
  
  @Test
  public void testSimpleComparison1() {
    this.assertRepr("i = 0.1 < 0.2);", "(0.1 < 0.2)");
  }
  
  @Test
  public void testSimpleComparison2() {
    this.assertRepr("i = 0.2 <= 0.2);", "(0.2 <= 0.2)");
  }
  
  @Test
  public void testSimpleComparison3() {
    this.assertRepr("i = 0.2 > 0.1);", "(0.2 > 0.1)");
  }
  
  @Test
  public void testSimpleComparison4() {
    this.assertRepr("i = 0.2 >= 0.2);", "(0.2 >= 0.2)");
  }
  
  @Test
  public void testSimplePlus() {
    this.assertRepr("i = (10.0 + 1.0);", "(10.0 + 1.0)");
  }
  
  @Test
  public void testSimplePlus1() {
    this.assertRepr("i = 10.0 + 1.0;", "(10.0 + 1.0)");
  }
  
  @Test
  public void testPlus1() {
    this.assertRepr("i = (10.0 + 1.0) + 3.0;", "((10.0 + 1.0) + 3.0)");
  }
  
  @Test
  public void testMix1() {
    this.assertRepr("i = ((10.0+1.0)/2.0)+((3.0+1.0)/2.0);", "(((10.0 + 1.0) / 2.0) + ((3.0 + 1.0) / 2.0))");
  }
  
  public void assertRepr(final CharSequence input, final CharSequence expectation) {
    try {
      Model _parse = this._parseHelper.parse(input);
      this.intermediateModel = _parse;
      EList<Store> _stores = this.intermediateModel.getStores();
      Store _last = IterableExtensions.<Store>last(_stores);
      this.intermediateStore = _last;
      Expression _value = this.intermediateStore.getValue();
      CharSequence _stringRepr = this.stringRepr(_value);
      this.output = _stringRepr;
      Assert.assertEquals(this.output, expectation);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CharSequence stringRepr(final Expression e) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof Or) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Or)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" || ");
        Expression _right = ((Or)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((And)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" && ");
        Expression _right = ((And)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Equality)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" ");
        String _op = ((Equality)e).getOp();
        _builder.append(_op, "");
        _builder.append(" ");
        Expression _right = ((Equality)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Comparison)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" ");
        String _op = ((Comparison)e).getOp();
        _builder.append(_op, "");
        _builder.append(" ");
        Expression _right = ((Comparison)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Sub) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Sub)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" - ");
        Expression _right = ((Sub)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Plu) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Plu)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" + ");
        Expression _right = ((Plu)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Mul) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Mul)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" * ");
        Expression _right = ((Mul)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Div) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Div)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" / ");
        Expression _right = ((Div)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("! ");
        Expression _expression = ((Not)e).getExpression();
        CharSequence _stringRepr = this.stringRepr(_expression);
        _builder.append(_stringRepr, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof ReferencedStore) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Store _value = ((ReferencedStore)e).getValue();
        String _name = _value.getName();
        _builder.append(_name, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof DoubleConstant) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        double _value = ((DoubleConstant)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _value = ((BoolConstant)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof FreeVariable) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _value = ((FreeVariable)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder.toString();
      }
    }
    return _switchResult.toString();
  }
}
