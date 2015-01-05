package com.blasedef.onpa.ONPA.tests;

import com.blasedef.onpa.ONPAInjectorProvider;
import com.blasedef.onpa.oNPA.Constant;
import com.blasedef.onpa.oNPA.Div;
import com.blasedef.onpa.oNPA.Expression;
import com.blasedef.onpa.oNPA.Model;
import com.blasedef.onpa.oNPA.Mul;
import com.blasedef.onpa.oNPA.Plu;
import com.blasedef.onpa.oNPA.Rate;
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
  
  private Rate intermediateRate;
  
  private Model intermediateModel;
  
  @Test
  public void testVariableExpression1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 10;");
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
      _builder.append("\t   ");
      _builder.append("j = 0.2;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("k = i + j;");
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
      _builder.append("\t   ");
      _builder.append("j = 0.2;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("k = (0.1 + i) + j;");
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
      EList<Rate> _rates = this.intermediateModel.getRates();
      Rate _last = IterableExtensions.<Rate>last(_rates);
      this.intermediateRate = _last;
      Expression _value = this.intermediateRate.getValue();
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
      if (e instanceof Rate) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Rate _rate = ((Rate)e).getRate();
        String _name = _rate.getName();
        _builder.append(_name, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Constant) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        double _value = ((Constant)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder.toString();
      }
    }
    return _switchResult.toString();
  }
}
