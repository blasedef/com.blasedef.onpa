package com.blasedef.onpa.typing;

import com.blasedef.onpa.oNPA.ActionExpression;
import com.blasedef.onpa.oNPA.Expression;
import com.blasedef.onpa.oNPA.FreeEvaluationExpression;
import com.blasedef.onpa.oNPA.GlobalEvaluationExpression;
import com.blasedef.onpa.oNPA.GlobalUpdateExpression;
import com.blasedef.onpa.oNPA.LocalEvaluationExpression;
import com.blasedef.onpa.oNPA.LocalUpdateExpression;
import com.blasedef.onpa.oNPA.PredicateExpression;
import com.blasedef.onpa.oNPA.SelfReferencedStore;
import com.blasedef.onpa.oNPA.Store;
import com.blasedef.onpa.typing.ActionExpressionType;
import com.blasedef.onpa.typing.ActionType;
import com.blasedef.onpa.typing.ETypeProvider;
import com.blasedef.onpa.typing.EvaluationExpressionType;
import com.blasedef.onpa.typing.ExpressionsType;
import com.blasedef.onpa.typing.PredicateExpressionType;
import com.blasedef.onpa.typing.UpdateExpressionType;
import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ATypeProvider {
  @Inject
  @Extension
  private ETypeProvider _eTypeProvider;
  
  public final static UpdateExpressionType updateExpressionType = new UpdateExpressionType();
  
  public final static PredicateExpressionType predicateExpressionType = new PredicateExpressionType();
  
  public final static EvaluationExpressionType evaluationExpressionType = new EvaluationExpressionType();
  
  public final static ActionExpressionType actionExpression = new ActionExpressionType();
  
  protected ActionType _typeForA(final LocalUpdateExpression u) {
    boolean _or = false;
    SelfReferencedStore _name = u.getName();
    Store _name_1 = _name.getName();
    Expression _value = _name_1.getValue();
    ExpressionsType _typeFor = null;
    if (_value!=null) {
      _typeFor=this._eTypeProvider.typeFor(_value);
    }
    ActionExpression _expression = u.getExpression();
    ExpressionsType _typeFor_1 = null;
    if (_expression!=null) {
      _typeFor_1=this._eTypeProvider.typeFor(_expression);
    }
    boolean _equals = Objects.equal(_typeFor, _typeFor_1);
    if (_equals) {
      _or = true;
    } else {
      ActionExpression _expression_1 = u.getExpression();
      ExpressionsType _typeFor_2 = null;
      if (_expression_1!=null) {
        _typeFor_2=this._eTypeProvider.typeFor(_expression_1);
      }
      boolean _equals_1 = Objects.equal(_typeFor_2, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (_or) {
      return ATypeProvider.updateExpressionType;
    } else {
      return null;
    }
  }
  
  protected ActionType _typeForA(final GlobalUpdateExpression u) {
    boolean _or = false;
    Store _name = u.getName();
    Expression _value = _name.getValue();
    ExpressionsType _typeFor = null;
    if (_value!=null) {
      _typeFor=this._eTypeProvider.typeFor(_value);
    }
    ActionExpression _expression = u.getExpression();
    ExpressionsType _typeFor_1 = null;
    if (_expression!=null) {
      _typeFor_1=this._eTypeProvider.typeFor(_expression);
    }
    boolean _equals = Objects.equal(_typeFor, _typeFor_1);
    if (_equals) {
      _or = true;
    } else {
      ActionExpression _expression_1 = u.getExpression();
      ExpressionsType _typeFor_2 = null;
      if (_expression_1!=null) {
        _typeFor_2=this._eTypeProvider.typeFor(_expression_1);
      }
      boolean _equals_1 = Objects.equal(_typeFor_2, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (_or) {
      return ATypeProvider.updateExpressionType;
    } else {
      return null;
    }
  }
  
  protected ActionType _typeForA(final LocalEvaluationExpression evaluationExpression) {
    SelfReferencedStore _name = evaluationExpression.getName();
    Store _name_1 = ((SelfReferencedStore) _name).getName();
    final Expression variable = ((Store) _name_1).getValue();
    final ActionExpression expression = evaluationExpression.getExpression();
    boolean _or = false;
    boolean _and = false;
    ExpressionsType _typeFor = null;
    if (variable!=null) {
      _typeFor=this._eTypeProvider.typeFor(variable);
    }
    ExpressionsType _typeFor_1 = null;
    if (expression!=null) {
      _typeFor_1=this._eTypeProvider.typeFor(expression);
    }
    boolean _equals = Objects.equal(_typeFor, _typeFor_1);
    if (!_equals) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _or_2 = false;
      ExpressionsType _typeFor_2 = null;
      if (expression!=null) {
        _typeFor_2=this._eTypeProvider.typeFor(expression);
      }
      boolean _equals_1 = Objects.equal(_typeFor_2, ETypeProvider.freeVariableType);
      if (_equals_1) {
        _or_2 = true;
      } else {
        ExpressionsType _typeFor_3 = null;
        if (expression!=null) {
          _typeFor_3=this._eTypeProvider.typeFor(expression);
        }
        boolean _equals_2 = Objects.equal(_typeFor_3, ETypeProvider.boolConstantType);
        _or_2 = _equals_2;
      }
      if (_or_2) {
        _or_1 = true;
      } else {
        ExpressionsType _typeFor_4 = null;
        if (expression!=null) {
          _typeFor_4=this._eTypeProvider.typeFor(expression);
        }
        boolean _equals_3 = Objects.equal(_typeFor_4, ETypeProvider.doubleConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      _or = true;
    } else {
      ExpressionsType _typeFor_5 = null;
      if (expression!=null) {
        _typeFor_5=this._eTypeProvider.typeFor(expression);
      }
      boolean _equals_4 = Objects.equal(_typeFor_5, ETypeProvider.freeVariableType);
      _or = _equals_4;
    }
    if (_or) {
      return ATypeProvider.evaluationExpressionType;
    }
    return null;
  }
  
  protected ActionType _typeForA(final GlobalEvaluationExpression evaluationExpression) {
    Store _name = evaluationExpression.getName();
    final Expression variable = ((Store) _name).getValue();
    final ActionExpression expression = evaluationExpression.getExpression();
    boolean _or = false;
    boolean _and = false;
    ExpressionsType _typeFor = null;
    if (variable!=null) {
      _typeFor=this._eTypeProvider.typeFor(variable);
    }
    ExpressionsType _typeFor_1 = null;
    if (expression!=null) {
      _typeFor_1=this._eTypeProvider.typeFor(expression);
    }
    boolean _equals = Objects.equal(_typeFor, _typeFor_1);
    if (!_equals) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _or_2 = false;
      ExpressionsType _typeFor_2 = null;
      if (expression!=null) {
        _typeFor_2=this._eTypeProvider.typeFor(expression);
      }
      boolean _equals_1 = Objects.equal(_typeFor_2, ETypeProvider.freeVariableType);
      if (_equals_1) {
        _or_2 = true;
      } else {
        ExpressionsType _typeFor_3 = null;
        if (expression!=null) {
          _typeFor_3=this._eTypeProvider.typeFor(expression);
        }
        boolean _equals_2 = Objects.equal(_typeFor_3, ETypeProvider.boolConstantType);
        _or_2 = _equals_2;
      }
      if (_or_2) {
        _or_1 = true;
      } else {
        ExpressionsType _typeFor_4 = null;
        if (expression!=null) {
          _typeFor_4=this._eTypeProvider.typeFor(expression);
        }
        boolean _equals_3 = Objects.equal(_typeFor_4, ETypeProvider.doubleConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      _or = true;
    } else {
      ExpressionsType _typeFor_5 = null;
      if (expression!=null) {
        _typeFor_5=this._eTypeProvider.typeFor(expression);
      }
      boolean _equals_4 = Objects.equal(_typeFor_5, ETypeProvider.freeVariableType);
      _or = _equals_4;
    }
    if (_or) {
      return ATypeProvider.evaluationExpressionType;
    } else {
      return null;
    }
  }
  
  protected ActionType _typeForA(final FreeEvaluationExpression evaluationExpression) {
    final String variable = evaluationExpression.getName();
    final ActionExpression expression = evaluationExpression.getExpression();
    boolean _or = false;
    boolean _and = false;
    Class<? extends String> _class = variable.getClass();
    boolean _equals = Objects.equal(_class, String.class);
    if (!_equals) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _or_2 = false;
      ExpressionsType _typeFor = null;
      if (expression!=null) {
        _typeFor=this._eTypeProvider.typeFor(expression);
      }
      boolean _equals_1 = Objects.equal(_typeFor, ETypeProvider.freeVariableType);
      if (_equals_1) {
        _or_2 = true;
      } else {
        ExpressionsType _typeFor_1 = null;
        if (expression!=null) {
          _typeFor_1=this._eTypeProvider.typeFor(expression);
        }
        boolean _equals_2 = Objects.equal(_typeFor_1, ETypeProvider.boolConstantType);
        _or_2 = _equals_2;
      }
      if (_or_2) {
        _or_1 = true;
      } else {
        ExpressionsType _typeFor_2 = null;
        if (expression!=null) {
          _typeFor_2=this._eTypeProvider.typeFor(expression);
        }
        boolean _equals_3 = Objects.equal(_typeFor_2, ETypeProvider.doubleConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      _or = true;
    } else {
      ExpressionsType _typeFor_3 = null;
      if (expression!=null) {
        _typeFor_3=this._eTypeProvider.typeFor(expression);
      }
      boolean _equals_4 = Objects.equal(_typeFor_3, ETypeProvider.freeVariableType);
      _or = _equals_4;
    }
    if (_or) {
      return ATypeProvider.evaluationExpressionType;
    } else {
      return null;
    }
  }
  
  protected ActionType _typeForA(final PredicateExpression p) {
    boolean _or = false;
    ActionExpression _expression = p.getExpression();
    ExpressionsType _typeFor = null;
    if (_expression!=null) {
      _typeFor=this._eTypeProvider.typeFor(_expression);
    }
    boolean _equals = Objects.equal(_typeFor, ETypeProvider.boolConstantType);
    if (_equals) {
      _or = true;
    } else {
      ActionExpression _expression_1 = p.getExpression();
      ExpressionsType _typeFor_1 = null;
      if (_expression_1!=null) {
        _typeFor_1=this._eTypeProvider.typeFor(_expression_1);
      }
      boolean _equals_1 = Objects.equal(_typeFor_1, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (_or) {
      return ATypeProvider.predicateExpressionType;
    } else {
      return null;
    }
  }
  
  public ActionType typeForA(final EObject evaluationExpression) {
    if (evaluationExpression instanceof FreeEvaluationExpression) {
      return _typeForA((FreeEvaluationExpression)evaluationExpression);
    } else if (evaluationExpression instanceof GlobalEvaluationExpression) {
      return _typeForA((GlobalEvaluationExpression)evaluationExpression);
    } else if (evaluationExpression instanceof GlobalUpdateExpression) {
      return _typeForA((GlobalUpdateExpression)evaluationExpression);
    } else if (evaluationExpression instanceof LocalEvaluationExpression) {
      return _typeForA((LocalEvaluationExpression)evaluationExpression);
    } else if (evaluationExpression instanceof LocalUpdateExpression) {
      return _typeForA((LocalUpdateExpression)evaluationExpression);
    } else if (evaluationExpression instanceof PredicateExpression) {
      return _typeForA((PredicateExpression)evaluationExpression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(evaluationExpression).toString());
    }
  }
}
