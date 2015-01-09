package com.blasedef.onpa.typing;

import com.blasedef.onpa.oNPA.And;
import com.blasedef.onpa.oNPA.BoolConstant;
import com.blasedef.onpa.oNPA.Comparison;
import com.blasedef.onpa.oNPA.Div;
import com.blasedef.onpa.oNPA.DoubleConstant;
import com.blasedef.onpa.oNPA.Equality;
import com.blasedef.onpa.oNPA.Expression;
import com.blasedef.onpa.oNPA.Mul;
import com.blasedef.onpa.oNPA.Not;
import com.blasedef.onpa.oNPA.Or;
import com.blasedef.onpa.oNPA.Plu;
import com.blasedef.onpa.oNPA.Sub;
import com.blasedef.onpa.typing.BoolConstantType;
import com.blasedef.onpa.typing.DoubleConstantType;
import com.blasedef.onpa.typing.ExpressionsType;
import com.blasedef.onpa.typing.FreeVariableType;
import com.blasedef.onpa.typing.ReferencedStoreType;
import com.blasedef.onpa.typing.SelfReferencedStoreType;

@SuppressWarnings("all")
public class TypeProvider {
  public final static DoubleConstantType doubleConstantType = new DoubleConstantType();
  
  public final static FreeVariableType FreeVariableType = new FreeVariableType();
  
  public final static BoolConstantType boolConstantType = new BoolConstantType();
  
  public final static ReferencedStoreType referencedStoreType = new ReferencedStoreType();
  
  public final static SelfReferencedStoreType selfReferencedStoreType = new SelfReferencedStoreType();
  
  protected ExpressionsType _typeFor(final Expression e) {
    ExpressionsType _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof Or) {
        _matched=true;
        _switchResult = TypeProvider.boolConstantType;
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        _matched=true;
        _switchResult = TypeProvider.boolConstantType;
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        _matched=true;
        _switchResult = TypeProvider.boolConstantType;
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        _matched=true;
        _switchResult = TypeProvider.boolConstantType;
      }
    }
    if (!_matched) {
      if (e instanceof Sub) {
        _matched=true;
        _switchResult = TypeProvider.doubleConstantType;
      }
    }
    if (!_matched) {
      if (e instanceof Plu) {
        _matched=true;
        _switchResult = TypeProvider.doubleConstantType;
      }
    }
    if (!_matched) {
      if (e instanceof Mul) {
        _matched=true;
        _switchResult = TypeProvider.doubleConstantType;
      }
    }
    if (!_matched) {
      if (e instanceof Div) {
        _matched=true;
        _switchResult = TypeProvider.doubleConstantType;
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        _matched=true;
        _switchResult = TypeProvider.boolConstantType;
      }
    }
    if (!_matched) {
      if (e instanceof DoubleConstant) {
        _matched=true;
        _switchResult = TypeProvider.doubleConstantType;
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        _switchResult = TypeProvider.boolConstantType;
      }
    }
    return _switchResult;
  }
  
  public ExpressionsType typeFor(final Expression e) {
    return _typeFor(e);
  }
}
