package com.blasedef.onpa.ONPA.tests;

import com.blasedef.onpa.ONPAInjectorProvider;
import com.blasedef.onpa.oNPA.Expression;
import com.blasedef.onpa.oNPA.Model;
import com.blasedef.onpa.oNPA.Store;
import com.blasedef.onpa.typing.ExpressionsType;
import com.blasedef.onpa.typing.TypeProvider;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ONPAInjectorProvider.class)
@SuppressWarnings("all")
public class TypeTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private TypeProvider _typeProvider;
  
  @Test
  public void DoubleConstant() {
    this.assertDoubleConstantType("i = 10");
  }
  
  public void assertDoubleConstantType(final CharSequence input) {
    Assert.assertEquals(input, "i = 10");
    this.assertType(input, TypeProvider.doubleConstantType);
  }
  
  public void assertType(final CharSequence input, final ExpressionsType expectedType) {
    try {
      Model _parse = this._parseHelper.parse(input);
      EList<Store> _stores = _parse.getStores();
      Store _last = IterableExtensions.<Store>last(_stores);
      Expression _value = _last.getValue();
      ExpressionsType _typeFor = this._typeProvider.typeFor(_value);
      Assert.assertSame(expectedType, _typeFor);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
