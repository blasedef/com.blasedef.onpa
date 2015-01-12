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
import com.blasedef.onpa.oNPA.ReferencedStore;
import com.blasedef.onpa.oNPA.Store;
import com.blasedef.onpa.oNPA.Sub;
import com.blasedef.onpa.typing.BoolConstantType;
import com.blasedef.onpa.typing.DoubleConstantType;
import com.blasedef.onpa.typing.ExpressionsType;
import com.blasedef.onpa.typing.FreeVariableType;
import com.blasedef.onpa.typing.ModelUtil;
import com.blasedef.onpa.typing.ReferencedStoreType;
import com.blasedef.onpa.typing.SelfReferencedStoreType;
import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.xbase.lib.InputOutput;

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
  
  protected ExpressionsType _typeFor(final Or e) {
    Expression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    Expression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _equals = Objects.equal(leftType, TypeProvider.boolConstantType);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(rightType, TypeProvider.boolConstantType);
      _and = _equals_1;
    }
    if (_and) {
      return TypeProvider.boolConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final And e) {
    Expression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    Expression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _equals = Objects.equal(leftType, TypeProvider.boolConstantType);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(rightType, TypeProvider.boolConstantType);
      _and = _equals_1;
    }
    if (_and) {
      return TypeProvider.boolConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final Equality e) {
    Expression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    Expression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _equals = Objects.equal(leftType, TypeProvider.boolConstantType);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(rightType, TypeProvider.boolConstantType);
      _and = _equals_1;
    }
    if (_and) {
      return TypeProvider.boolConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final Comparison e) {
    Expression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    Expression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _equals = Objects.equal(leftType, TypeProvider.doubleConstantType);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(rightType, TypeProvider.doubleConstantType);
      _and = _equals_1;
    }
    if (_and) {
      return TypeProvider.boolConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final Sub e) {
    Expression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    Expression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _equals = Objects.equal(leftType, TypeProvider.doubleConstantType);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(rightType, TypeProvider.doubleConstantType);
      _and = _equals_1;
    }
    if (_and) {
      return TypeProvider.doubleConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final Plu e) {
    Expression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    Expression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _equals = Objects.equal(leftType, TypeProvider.doubleConstantType);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(rightType, TypeProvider.doubleConstantType);
      _and = _equals_1;
    }
    if (_and) {
      return TypeProvider.doubleConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final Mul e) {
    Expression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    Expression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _equals = Objects.equal(leftType, TypeProvider.doubleConstantType);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(rightType, TypeProvider.doubleConstantType);
      _and = _equals_1;
    }
    if (_and) {
      return TypeProvider.doubleConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final Div e) {
    Expression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    Expression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _equals = Objects.equal(leftType, TypeProvider.doubleConstantType);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(rightType, TypeProvider.doubleConstantType);
      _and = _equals_1;
    }
    if (_and) {
      return TypeProvider.doubleConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final Not e) {
    Expression _expression = e.getExpression();
    ExpressionsType _typeFor = null;
    if (_expression!=null) {
      _typeFor=this.typeFor(_expression);
    }
    boolean _equals = Objects.equal(_typeFor, TypeProvider.boolConstantType);
    if (_equals) {
      return TypeProvider.boolConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final ReferencedStore e) {
    boolean _or = false;
    Store _value = e.getValue();
    boolean _equals = Objects.equal(_value, null);
    if (_equals) {
      _or = true;
    } else {
      Store _value_1 = e.getValue();
      List<Store> _variablesDefinedBefore = ModelUtil.variablesDefinedBefore(_value_1);
      Store _value_2 = e.getValue();
      boolean _contains = _variablesDefinedBefore.contains(_value_2);
      boolean _not = (!_contains);
      _or = _not;
    }
    if (_or) {
      Store _value_3 = e.getValue();
      String _plus = ("null " + _value_3);
      InputOutput.<String>println(_plus);
      return null;
    } else {
      Store _value_4 = e.getValue();
      InputOutput.<Store>println(_value_4);
      Store _value_5 = e.getValue();
      Expression _value_6 = _value_5.getValue();
      ExpressionsType _typeFor = null;
      if (_value_6!=null) {
        _typeFor=this.typeFor(_value_6);
      }
      return _typeFor;
    }
  }
  
  public ExpressionsType typeFor(final Expression e) {
    if (e instanceof And) {
      return _typeFor((And)e);
    } else if (e instanceof Comparison) {
      return _typeFor((Comparison)e);
    } else if (e instanceof Div) {
      return _typeFor((Div)e);
    } else if (e instanceof Equality) {
      return _typeFor((Equality)e);
    } else if (e instanceof Mul) {
      return _typeFor((Mul)e);
    } else if (e instanceof Not) {
      return _typeFor((Not)e);
    } else if (e instanceof Or) {
      return _typeFor((Or)e);
    } else if (e instanceof Plu) {
      return _typeFor((Plu)e);
    } else if (e instanceof ReferencedStore) {
      return _typeFor((ReferencedStore)e);
    } else if (e instanceof Sub) {
      return _typeFor((Sub)e);
    } else if (e != null) {
      return _typeFor(e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
