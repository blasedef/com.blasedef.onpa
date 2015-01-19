/**
 * generated by Xtext
 */
package com.blasedef.onpa.ui.labeling;

import com.blasedef.onpa.oNPA.Action;
import com.blasedef.onpa.oNPA.ActionAnd;
import com.blasedef.onpa.oNPA.ActionComparison;
import com.blasedef.onpa.oNPA.ActionDiv;
import com.blasedef.onpa.oNPA.ActionEquality;
import com.blasedef.onpa.oNPA.ActionExpression;
import com.blasedef.onpa.oNPA.ActionMul;
import com.blasedef.onpa.oNPA.ActionNot;
import com.blasedef.onpa.oNPA.ActionOr;
import com.blasedef.onpa.oNPA.ActionPlu;
import com.blasedef.onpa.oNPA.ActionProcess;
import com.blasedef.onpa.oNPA.ActionSub;
import com.blasedef.onpa.oNPA.And;
import com.blasedef.onpa.oNPA.BoolConstant;
import com.blasedef.onpa.oNPA.Broadcast;
import com.blasedef.onpa.oNPA.Choice;
import com.blasedef.onpa.oNPA.Comparison;
import com.blasedef.onpa.oNPA.Div;
import com.blasedef.onpa.oNPA.DoubleConstant;
import com.blasedef.onpa.oNPA.Equality;
import com.blasedef.onpa.oNPA.EvaluationExpressionIn;
import com.blasedef.onpa.oNPA.EvaluationExpressionOut;
import com.blasedef.onpa.oNPA.Evaluations;
import com.blasedef.onpa.oNPA.Expression;
import com.blasedef.onpa.oNPA.FreeEvaluationExpression;
import com.blasedef.onpa.oNPA.FreeVariable;
import com.blasedef.onpa.oNPA.GlobalEvaluationExpression;
import com.blasedef.onpa.oNPA.GlobalUpdateExpression;
import com.blasedef.onpa.oNPA.In;
import com.blasedef.onpa.oNPA.Leaf;
import com.blasedef.onpa.oNPA.LocalEvaluationExpression;
import com.blasedef.onpa.oNPA.LocalUpdateExpression;
import com.blasedef.onpa.oNPA.Mul;
import com.blasedef.onpa.oNPA.Not;
import com.blasedef.onpa.oNPA.Or;
import com.blasedef.onpa.oNPA.Out;
import com.blasedef.onpa.oNPA.Parallel;
import com.blasedef.onpa.oNPA.Plu;
import com.blasedef.onpa.oNPA.Predicate;
import com.blasedef.onpa.oNPA.PredicateExpression;
import com.blasedef.onpa.oNPA.PredicateProcess;
import com.blasedef.onpa.oNPA.ProcessExpression;
import com.blasedef.onpa.oNPA.ProcessReference;
import com.blasedef.onpa.oNPA.ReferencedStore;
import com.blasedef.onpa.oNPA.SelfReferencedStore;
import com.blasedef.onpa.oNPA.Store;
import com.blasedef.onpa.oNPA.Sub;
import com.blasedef.onpa.oNPA.Unicast;
import com.blasedef.onpa.oNPA.UpdateExpression;
import com.blasedef.onpa.oNPA.Updates;
import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class ONPALabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public ONPALabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final Plu plu) {
    Expression _left = plu.getLeft();
    CharSequence _stringRepr = this.stringRepr(_left);
    String _plus = (_stringRepr + " + ");
    Expression _right = plu.getRight();
    CharSequence _stringRepr_1 = this.stringRepr(_right);
    return (_plus + _stringRepr_1);
  }
  
  public String text(final Sub sub) {
    Expression _left = sub.getLeft();
    CharSequence _stringRepr = this.stringRepr(_left);
    String _plus = (_stringRepr + " - ");
    Expression _right = sub.getRight();
    CharSequence _stringRepr_1 = this.stringRepr(_right);
    return (_plus + _stringRepr_1);
  }
  
  public String text(final Mul mul) {
    Expression _left = mul.getLeft();
    CharSequence _stringRepr = this.stringRepr(_left);
    String _plus = (_stringRepr + " * ");
    Expression _right = mul.getRight();
    CharSequence _stringRepr_1 = this.stringRepr(_right);
    return (_plus + _stringRepr_1);
  }
  
  public String text(final Div div) {
    Expression _left = div.getLeft();
    CharSequence _stringRepr = this.stringRepr(_left);
    String _plus = (_stringRepr + " / ");
    Expression _right = div.getRight();
    CharSequence _stringRepr_1 = this.stringRepr(_right);
    return (_plus + _stringRepr_1);
  }
  
  public String text(final Store store) {
    String _xifexpression = null;
    String _name = store.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      String _name_1 = store.getName();
      String _xifexpression_1 = null;
      Expression _value = store.getValue();
      boolean _notEquals_1 = (!Objects.equal(_value, null));
      if (_notEquals_1) {
        Expression _value_1 = store.getValue();
        CharSequence _stringRepr = this.stringRepr(_value_1);
        _xifexpression_1 = (" = " + _stringRepr);
      } else {
        _xifexpression_1 = "";
      }
      _xifexpression = (_name_1 + _xifexpression_1);
    }
    return _xifexpression;
  }
  
  public String text(final com.blasedef.onpa.oNPA.Process process) {
    String _xifexpression = null;
    String _name = process.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      String _name_1 = process.getName();
      String _xifexpression_1 = null;
      ProcessExpression _value = process.getValue();
      boolean _notEquals_1 = (!Objects.equal(_value, null));
      if (_notEquals_1) {
        ProcessExpression _value_1 = process.getValue();
        CharSequence _stringRepr = this.stringRepr(_value_1);
        _xifexpression_1 = (" = " + _stringRepr);
      } else {
        _xifexpression_1 = "";
      }
      _xifexpression = (_name_1 + _xifexpression_1);
    }
    return _xifexpression;
  }
  
  public String text(final Double d) {
    return d.toString();
  }
  
  public CharSequence stringRepr(final Expression e) {
    CharSequence _switchResult = null;
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
        _switchResult = _builder;
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
        _switchResult = _builder;
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
        _switchResult = _builder;
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
        _switchResult = _builder;
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
        _switchResult = _builder;
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
        _switchResult = _builder;
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
        _switchResult = _builder;
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
        _switchResult = _builder;
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
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof ReferencedStore) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        Store _value = ((ReferencedStore)e).getValue();
        String _name = _value.getName();
        _builder.append(_name, "");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof DoubleConstant) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        double _value = ((DoubleConstant)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _value = ((BoolConstant)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  public CharSequence stringRepr(final ActionExpression e) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof ActionOr) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ActionExpression _left = ((ActionOr)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" || ");
        ActionExpression _right = ((ActionOr)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof ActionAnd) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ActionExpression _left = ((ActionAnd)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" && ");
        ActionExpression _right = ((ActionAnd)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof ActionEquality) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ActionExpression _left = ((ActionEquality)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" ");
        String _op = ((ActionEquality)e).getOp();
        _builder.append(_op, "");
        _builder.append(" ");
        ActionExpression _right = ((ActionEquality)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof ActionComparison) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ActionExpression _left = ((ActionComparison)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" ");
        String _op = ((ActionComparison)e).getOp();
        _builder.append(_op, "");
        _builder.append(" ");
        ActionExpression _right = ((ActionComparison)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof ActionSub) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ActionExpression _left = ((ActionSub)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" - ");
        ActionExpression _right = ((ActionSub)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof ActionPlu) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ActionExpression _left = ((ActionPlu)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" + ");
        ActionExpression _right = ((ActionPlu)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof ActionMul) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ActionExpression _left = ((ActionMul)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" * ");
        ActionExpression _right = ((ActionMul)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof ActionDiv) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ActionExpression _left = ((ActionDiv)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" / ");
        ActionExpression _right = ((ActionDiv)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof ActionNot) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("! ");
        ActionExpression _expression = ((ActionNot)e).getExpression();
        CharSequence _stringRepr = this.stringRepr(_expression);
        _builder.append(_stringRepr, "");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof FreeVariable) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _value = ((FreeVariable)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof SelfReferencedStore) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("this.");
        Store _name = ((SelfReferencedStore)e).getName();
        String _name_1 = _name.getName();
        _builder.append(_name_1, "");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof ReferencedStore) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        Store _value = ((ReferencedStore)e).getValue();
        String _name = _value.getName();
        _builder.append(_name, "");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof DoubleConstant) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        double _value = ((DoubleConstant)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _value = ((BoolConstant)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  public CharSequence stringRepr(final ProcessExpression e) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof Parallel) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ProcessExpression _left = ((Parallel)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" | ");
        ProcessExpression _right = ((Parallel)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof Choice) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ProcessExpression _left = ((Choice)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" + ");
        ProcessExpression _right = ((Choice)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof Leaf) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _value = ((Leaf)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof PredicateProcess) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        Predicate _predicate = ((PredicateProcess)e).getPredicate();
        CharSequence _stringRepr = this.stringRepr(_predicate);
        _builder.append(_stringRepr, "");
        com.blasedef.onpa.oNPA.Process _value = ((PredicateProcess)e).getValue();
        String _name = _value.getName();
        _builder.append(_name, "");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof ActionProcess) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        Action _action = ((ActionProcess)e).getAction();
        CharSequence _stringRepr = this.stringRepr(((Action) _action));
        _builder.append(_stringRepr, "");
        _builder.append(".");
        com.blasedef.onpa.oNPA.Process _value = ((ActionProcess)e).getValue();
        String _name = _value.getName();
        _builder.append(_name, "");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof ProcessReference) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        com.blasedef.onpa.oNPA.Process _value = ((ProcessReference)e).getValue();
        String _name = _value.getName();
        _builder.append(_name, "");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  public CharSequence stringRepr(final Action a) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (a instanceof Broadcast) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _name = ((Broadcast)a).getName();
        _builder.append(_name, "");
        _builder.append("*");
        Predicate _predicate = ((Broadcast)a).getPredicate();
        CharSequence _stringRepr = this.stringRepr(_predicate);
        _builder.append(_stringRepr, "");
        Evaluations _evaluations = ((Broadcast)a).getEvaluations();
        CharSequence _stringRepr_1 = this.stringRepr(_evaluations);
        _builder.append(_stringRepr_1, "");
        Updates _updates = ((Broadcast)a).getUpdates();
        CharSequence _stringRepr_2 = this.stringRepr(_updates);
        _builder.append(_stringRepr_2, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (a instanceof Unicast) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _name = ((Unicast)a).getName();
        _builder.append(_name, "");
        Predicate _predicate = ((Unicast)a).getPredicate();
        CharSequence _stringRepr = this.stringRepr(_predicate);
        _builder.append(_stringRepr, "");
        Evaluations _evaluations = ((Unicast)a).getEvaluations();
        CharSequence _stringRepr_1 = this.stringRepr(_evaluations);
        _builder.append(_stringRepr_1, "");
        Updates _updates = ((Unicast)a).getUpdates();
        CharSequence _stringRepr_2 = this.stringRepr(_updates);
        _builder.append(_stringRepr_2, "");
        _switchResult = _builder.toString();
      }
    }
    return _switchResult.toString();
  }
  
  public CharSequence stringRepr(final Predicate p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[");
    PredicateExpression _predicate = p.getPredicate();
    ActionExpression _expression = _predicate.getExpression();
    CharSequence _stringRepr = this.stringRepr(((ActionExpression) _expression));
    _builder.append(_stringRepr, "");
    _builder.append(";]");
    return _builder;
  }
  
  public CharSequence stringRepr(final Evaluations e) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof In) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        {
          EList<EvaluationExpressionIn> _expressions = ((In)e).getExpressions();
          for(final EvaluationExpressionIn evaluationExpression : _expressions) {
            CharSequence _stringRepr = this.stringRepr(((EvaluationExpressionIn) evaluationExpression));
            _builder.append(_stringRepr, "");
            _builder.append(";");
          }
        }
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof Out) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<");
        {
          EList<EvaluationExpressionOut> _expressions = ((Out)e).getExpressions();
          for(final EvaluationExpressionOut evaluationExpression : _expressions) {
            CharSequence _stringRepr = this.stringRepr(((FreeEvaluationExpression) evaluationExpression));
            _builder.append(_stringRepr, "");
            _builder.append(";");
          }
        }
        _builder.append(">");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  public CharSequence stringRepr(final EvaluationExpressionIn e) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof LocalEvaluationExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("this.");
        SelfReferencedStore _name = ((LocalEvaluationExpression)e).getName();
        Store _name_1 = ((SelfReferencedStore) _name).getName();
        String _name_2 = _name_1.getName();
        _builder.append(_name_2, "");
        _builder.append(":=");
        ActionExpression _expression = ((LocalEvaluationExpression)e).getExpression();
        CharSequence _stringRepr = this.stringRepr(((ActionExpression) _expression));
        _builder.append(_stringRepr, "");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof GlobalEvaluationExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        Store _name = ((GlobalEvaluationExpression)e).getName();
        Expression _value = ((Store) _name).getValue();
        CharSequence _stringRepr = this.stringRepr(_value);
        _builder.append(_stringRepr, "");
        _builder.append(":=");
        ActionExpression _expression = ((GlobalEvaluationExpression)e).getExpression();
        CharSequence _stringRepr_1 = this.stringRepr(((ActionExpression) _expression));
        _builder.append(_stringRepr_1, "");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  public CharSequence stringRepr(final FreeEvaluationExpression e) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(":=");
    ActionExpression _expression = e.getExpression();
    CharSequence _stringRepr = this.stringRepr(((ActionExpression) _expression));
    _builder.append(_stringRepr, "");
    return _builder;
  }
  
  public CharSequence stringRepr(final Updates u) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    {
      EList<UpdateExpression> _updates = u.getUpdates();
      for(final UpdateExpression updateExpression : _updates) {
        CharSequence _stringRepr = this.stringRepr(updateExpression);
        _builder.append(_stringRepr, "");
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence stringRepr(final UpdateExpression u) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (u instanceof LocalUpdateExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("this.");
        SelfReferencedStore _name = ((LocalUpdateExpression)u).getName();
        Store _name_1 = _name.getName();
        String _name_2 = _name_1.getName();
        _builder.append(_name_2, "");
        _builder.append(":=");
        ActionExpression _expression = ((LocalUpdateExpression)u).getExpression();
        CharSequence _stringRepr = this.stringRepr(_expression);
        _builder.append(_stringRepr, "");
        _builder.append(";");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (u instanceof GlobalUpdateExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        Store _name = ((GlobalUpdateExpression)u).getName();
        String _name_1 = _name.getName();
        _builder.append(_name_1, "");
        _builder.append(":=");
        ActionExpression _expression = ((GlobalUpdateExpression)u).getExpression();
        CharSequence _stringRepr = this.stringRepr(_expression);
        _builder.append(_stringRepr, "");
        _builder.append(";");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
}
