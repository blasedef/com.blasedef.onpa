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
        ONPAValidator.SELF_REFERENCING_RATE, 
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
}
