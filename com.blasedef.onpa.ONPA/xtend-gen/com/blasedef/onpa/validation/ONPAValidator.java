/**
 * generated by Xtext
 */
package com.blasedef.onpa.validation;

import com.blasedef.onpa.oNPA.ActionAnd;
import com.blasedef.onpa.oNPA.ActionComparison;
import com.blasedef.onpa.oNPA.ActionDiv;
import com.blasedef.onpa.oNPA.ActionEquality;
import com.blasedef.onpa.oNPA.ActionExpression;
import com.blasedef.onpa.oNPA.ActionMul;
import com.blasedef.onpa.oNPA.ActionNot;
import com.blasedef.onpa.oNPA.ActionOr;
import com.blasedef.onpa.oNPA.ActionPlu;
import com.blasedef.onpa.oNPA.ActionSub;
import com.blasedef.onpa.oNPA.And;
import com.blasedef.onpa.oNPA.Comparison;
import com.blasedef.onpa.oNPA.Div;
import com.blasedef.onpa.oNPA.Equality;
import com.blasedef.onpa.oNPA.Expression;
import com.blasedef.onpa.oNPA.FreeEvaluationExpression;
import com.blasedef.onpa.oNPA.FreeVariable;
import com.blasedef.onpa.oNPA.GlobalEvaluationExpression;
import com.blasedef.onpa.oNPA.GlobalUpdateExpression;
import com.blasedef.onpa.oNPA.LocalEvaluationExpression;
import com.blasedef.onpa.oNPA.LocalUpdateExpression;
import com.blasedef.onpa.oNPA.Model;
import com.blasedef.onpa.oNPA.Mul;
import com.blasedef.onpa.oNPA.Not;
import com.blasedef.onpa.oNPA.ONPAPackage;
import com.blasedef.onpa.oNPA.Or;
import com.blasedef.onpa.oNPA.Plu;
import com.blasedef.onpa.oNPA.PredicateExpression;
import com.blasedef.onpa.oNPA.ReferencedStore;
import com.blasedef.onpa.oNPA.Store;
import com.blasedef.onpa.oNPA.Sub;
import com.blasedef.onpa.typing.ATypeProvider;
import com.blasedef.onpa.typing.ActionType;
import com.blasedef.onpa.typing.ETypeProvider;
import com.blasedef.onpa.typing.ExpressionsType;
import com.blasedef.onpa.typing.ModelUtil;
import com.blasedef.onpa.validation.AbstractONPAValidator;
import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class ONPAValidator extends AbstractONPAValidator {
  public final static String SELF_REFERENCING_STORE = "com.blasedef.onpa.dice.selfReferencingStore";
  
  @Check
  public void checkNotSelfReferencing(final ReferencedStore refStore) {
    final Store store = refStore.getValue();
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(store, null));
    if (!_notEquals) {
      _and = false;
    } else {
      Store _selfReferencedStores = ModelUtil.selfReferencedStores(refStore);
      boolean _equals = Objects.equal(_selfReferencedStores, store);
      _and = _equals;
    }
    if (_and) {
      Store _value = refStore.getValue();
      String _name = _value.getName();
      String _plus = ("Cannot have self referencing stores. \'" + _name);
      String _plus_1 = (_plus + "\' is seen in the expression");
      EReference _referencedStore_Value = ONPAPackage.eINSTANCE.getReferencedStore_Value();
      this.error(_plus_1, _referencedStore_Value, 
        ONPAValidator.SELF_REFERENCING_STORE);
    }
  }
  
  public void findReferencedRates(final Expression e, final ArrayList<String> strings) {
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof Or) {
        _matched=true;
        Expression _left = ((Or)e).getLeft();
        this.findReferencedRates(_left, strings);
        Expression _right = ((Or)e).getRight();
        this.findReferencedRates(_right, strings);
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        _matched=true;
        Expression _left = ((And)e).getLeft();
        this.findReferencedRates(_left, strings);
        Expression _right = ((And)e).getRight();
        this.findReferencedRates(_right, strings);
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        _matched=true;
        Expression _left = ((Equality)e).getLeft();
        this.findReferencedRates(_left, strings);
        Expression _right = ((Equality)e).getRight();
        this.findReferencedRates(_right, strings);
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        _matched=true;
        Expression _left = ((Comparison)e).getLeft();
        this.findReferencedRates(_left, strings);
        Expression _right = ((Comparison)e).getRight();
        this.findReferencedRates(_right, strings);
      }
    }
    if (!_matched) {
      if (e instanceof Sub) {
        _matched=true;
        Expression _left = ((Sub)e).getLeft();
        this.findReferencedRates(_left, strings);
        Expression _right = ((Sub)e).getRight();
        this.findReferencedRates(_right, strings);
      }
    }
    if (!_matched) {
      if (e instanceof Plu) {
        _matched=true;
        Expression _left = ((Plu)e).getLeft();
        this.findReferencedRates(_left, strings);
        Expression _right = ((Plu)e).getRight();
        this.findReferencedRates(_right, strings);
      }
    }
    if (!_matched) {
      if (e instanceof Mul) {
        _matched=true;
        Expression _left = ((Mul)e).getLeft();
        this.findReferencedRates(_left, strings);
        Expression _right = ((Mul)e).getRight();
        this.findReferencedRates(_right, strings);
      }
    }
    if (!_matched) {
      if (e instanceof Div) {
        _matched=true;
        Expression _left = ((Div)e).getLeft();
        this.findReferencedRates(_left, strings);
        Expression _right = ((Div)e).getRight();
        this.findReferencedRates(_right, strings);
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        _matched=true;
        Expression _expression = ((Not)e).getExpression();
        this.findReferencedRates(_expression, strings);
      }
    }
    if (!_matched) {
      if (e instanceof ReferencedStore) {
        _matched=true;
        Store _value = ((ReferencedStore)e).getValue();
        String _name = _value.getName();
        strings.add(_name);
      }
    }
    if (!_matched) {
      if (e instanceof FreeVariable) {
        _matched=true;
        String _value = ((FreeVariable)e).getValue();
        String _substring = _value.substring(1);
        strings.add(_substring);
      }
    }
  }
  
  public final static String STORE_NAMES_UNIQUE = "com.blasedef.onpa.dice.storeNamesUnique";
  
  @Check
  public void checkStoresNamesUnique(final Store store) {
    Model _containerOfType = EcoreUtil2.<Model>getContainerOfType(store, Model.class);
    EList<Store> stores = _containerOfType.getStores();
    int count = 0;
    for (final Store st : stores) {
      String _name = st.getName();
      String _name_1 = store.getName();
      boolean _contains = _name.contains(_name_1);
      if (_contains) {
        count = (count + 1);
      }
    }
    if ((count == 1)) {
      return;
    } else {
      String _name_2 = store.getName();
      String _plus = ("Must have unique store names. \'" + _name_2);
      String _plus_1 = (_plus + "\' is repeated");
      EAttribute _store_Name = ONPAPackage.eINSTANCE.getStore_Name();
      this.error(_plus_1, _store_Name, 
        ONPAValidator.STORE_NAMES_UNIQUE);
    }
  }
  
  public final static String PROCESS_NAMES_UNIQUE = "com.blasedef.onpa.dice.processNamesUnique";
  
  @Check
  public void checkensureProcessCycles(final com.blasedef.onpa.oNPA.Process process) {
    Model _containerOfType = EcoreUtil2.<Model>getContainerOfType(process, Model.class);
    EList<com.blasedef.onpa.oNPA.Process> processes = _containerOfType.getProcesses();
    int count = 0;
    for (final com.blasedef.onpa.oNPA.Process proc : processes) {
      String _name = proc.getName();
      String _name_1 = process.getName();
      boolean _contains = _name.contains(_name_1);
      if (_contains) {
        count = (count + 1);
      }
    }
    if ((count == 1)) {
      return;
    } else {
      String _name_2 = process.getName();
      String _plus = ("Must have unique process names. \'" + _name_2);
      String _plus_1 = (_plus + "\' is repeated");
      EAttribute _process_Name = ONPAPackage.eINSTANCE.getProcess_Name();
      this.error(_plus_1, _process_Name, 
        ONPAValidator.PROCESS_NAMES_UNIQUE);
    }
  }
  
  @Inject
  @Extension
  private ETypeProvider _eTypeProvider;
  
  public final static String WRONG_TYPE = "com.blasedef.onpa.dice.WrongType";
  
  @Check
  public void checkType(final Not not) {
    Expression _expression = not.getExpression();
    this.checkExpectedBoolean(_expression, 
      ONPAPackage.Literals.NOT__EXPRESSION);
  }
  
  @Check
  public void checkType(final ActionNot not) {
    ActionExpression _expression = not.getExpression();
    this.checkExpectedBoolean(_expression, 
      ONPAPackage.Literals.ACTION_NOT__EXPRESSION);
  }
  
  @Check
  public void checkType(final Or or) {
    Expression _left = or.getLeft();
    this.checkExpectedBoolean(_left, 
      ONPAPackage.Literals.OR__LEFT);
    Expression _right = or.getRight();
    this.checkExpectedBoolean(_right, 
      ONPAPackage.Literals.OR__RIGHT);
  }
  
  @Check
  public void checkType(final ActionOr or) {
    ActionExpression _left = or.getLeft();
    this.checkExpectedBoolean(_left, 
      ONPAPackage.Literals.ACTION_OR__LEFT);
    ActionExpression _right = or.getRight();
    this.checkExpectedBoolean(_right, 
      ONPAPackage.Literals.ACTION_OR__RIGHT);
  }
  
  @Check
  public void checkType(final And and) {
    Expression _left = and.getLeft();
    this.checkExpectedBoolean(_left, 
      ONPAPackage.Literals.AND__LEFT);
    Expression _right = and.getRight();
    this.checkExpectedBoolean(_right, 
      ONPAPackage.Literals.AND__RIGHT);
  }
  
  @Check
  public void checkType(final ActionAnd and) {
    ActionExpression _left = and.getLeft();
    this.checkExpectedBoolean(_left, 
      ONPAPackage.Literals.ACTION_AND__LEFT);
    ActionExpression _right = and.getRight();
    this.checkExpectedBoolean(_right, 
      ONPAPackage.Literals.ACTION_AND__RIGHT);
  }
  
  @Check
  public void checkType(final Equality eq) {
    Expression _left = eq.getLeft();
    this.checkExpectedBoolean(_left, 
      ONPAPackage.Literals.EQUALITY__LEFT);
    Expression _right = eq.getRight();
    this.checkExpectedBoolean(_right, 
      ONPAPackage.Literals.EQUALITY__RIGHT);
  }
  
  @Check
  public void checkType(final ActionEquality eq) {
    ActionExpression _left = eq.getLeft();
    this.checkExpectedBoolean(_left, 
      ONPAPackage.Literals.ACTION_EQUALITY__LEFT);
    ActionExpression _right = eq.getRight();
    this.checkExpectedBoolean(_right, 
      ONPAPackage.Literals.ACTION_EQUALITY__RIGHT);
  }
  
  @Check
  public void checkType(final Comparison com) {
    Expression _left = com.getLeft();
    this.checkExpectedDouble(_left, 
      ONPAPackage.Literals.COMPARISON__LEFT);
    Expression _right = com.getRight();
    this.checkExpectedDouble(_right, 
      ONPAPackage.Literals.COMPARISON__RIGHT);
  }
  
  @Check
  public void checkType(final ActionComparison com) {
    ActionExpression _left = com.getLeft();
    this.checkExpectedDouble(_left, 
      ONPAPackage.Literals.ACTION_COMPARISON__LEFT);
    ActionExpression _right = com.getRight();
    this.checkExpectedDouble(_right, 
      ONPAPackage.Literals.ACTION_COMPARISON__RIGHT);
  }
  
  @Check
  public void checkType(final Sub sub) {
    Expression _left = sub.getLeft();
    this.checkExpectedDouble(_left, 
      ONPAPackage.Literals.SUB__LEFT);
    Expression _right = sub.getRight();
    this.checkExpectedDouble(_right, 
      ONPAPackage.Literals.SUB__RIGHT);
  }
  
  @Check
  public void checkType(final ActionSub sub) {
    ActionExpression _left = sub.getLeft();
    this.checkExpectedDouble(_left, 
      ONPAPackage.Literals.ACTION_SUB__LEFT);
    ActionExpression _right = sub.getRight();
    this.checkExpectedDouble(_right, 
      ONPAPackage.Literals.ACTION_SUB__RIGHT);
  }
  
  @Check
  public void checkType(final Plu plu) {
    Expression _left = plu.getLeft();
    this.checkExpectedDouble(_left, 
      ONPAPackage.Literals.PLU__LEFT);
    Expression _right = plu.getRight();
    this.checkExpectedDouble(_right, 
      ONPAPackage.Literals.PLU__RIGHT);
  }
  
  @Check
  public void checkType(final ActionPlu plu) {
    ActionExpression _left = plu.getLeft();
    this.checkExpectedDouble(_left, 
      ONPAPackage.Literals.ACTION_PLU__LEFT);
    ActionExpression _right = plu.getRight();
    this.checkExpectedDouble(_right, 
      ONPAPackage.Literals.ACTION_PLU__RIGHT);
  }
  
  @Check
  public void checkType(final Mul mul) {
    Expression _left = mul.getLeft();
    this.checkExpectedDouble(_left, 
      ONPAPackage.Literals.MUL__LEFT);
    Expression _right = mul.getRight();
    this.checkExpectedDouble(_right, 
      ONPAPackage.Literals.MUL__RIGHT);
  }
  
  @Check
  public void checkType(final ActionMul mul) {
    ActionExpression _left = mul.getLeft();
    this.checkExpectedDouble(_left, 
      ONPAPackage.Literals.ACTION_MUL__LEFT);
    ActionExpression _right = mul.getRight();
    this.checkExpectedDouble(_right, 
      ONPAPackage.Literals.ACTION_MUL__RIGHT);
  }
  
  @Check
  public void checkType(final Div div) {
    Expression _left = div.getLeft();
    this.checkExpectedDouble(_left, 
      ONPAPackage.Literals.DIV__LEFT);
    Expression _right = div.getRight();
    this.checkExpectedDouble(_right, 
      ONPAPackage.Literals.DIV__RIGHT);
  }
  
  @Check
  public void checkType(final ActionDiv div) {
    ActionExpression _left = div.getLeft();
    this.checkExpectedDouble(_left, 
      ONPAPackage.Literals.ACTION_DIV__LEFT);
    ActionExpression _right = div.getRight();
    this.checkExpectedDouble(_right, 
      ONPAPackage.Literals.ACTION_DIV__RIGHT);
  }
  
  @Inject
  @Extension
  private ATypeProvider _aTypeProvider;
  
  @Check
  public void checkType(final LocalUpdateExpression updateExpression) {
    ActionType _typeForA = null;
    if (updateExpression!=null) {
      _typeForA=this._aTypeProvider.typeForA(updateExpression);
    }
    ActionType type = _typeForA;
    boolean _equals = Objects.equal(type, null);
    if (_equals) {
      this.error("assignment has non matching type to reference", ONPAPackage.Literals.UPDATE_EXPRESSION__EXPRESSION, ONPAValidator.WRONG_TYPE);
    }
  }
  
  @Check
  public void checkType(final GlobalUpdateExpression updateExpression) {
    ActionType _typeForA = null;
    if (updateExpression!=null) {
      _typeForA=this._aTypeProvider.typeForA(updateExpression);
    }
    ActionType type = _typeForA;
    boolean _equals = Objects.equal(type, null);
    if (_equals) {
      this.error("assignment has non matching type to reference", ONPAPackage.Literals.UPDATE_EXPRESSION__EXPRESSION, ONPAValidator.WRONG_TYPE);
    }
  }
  
  @Check
  public void checkType(final PredicateExpression predicateExpression) {
    ActionType _typeForA = null;
    if (predicateExpression!=null) {
      _typeForA=this._aTypeProvider.typeForA(predicateExpression);
    }
    ActionType type = _typeForA;
    boolean _equals = Objects.equal(type, null);
    if (_equals) {
      this.error("Predicates must be boolean", ONPAPackage.Literals.PREDICATE_EXPRESSION__EXPRESSION, ONPAValidator.WRONG_TYPE);
    }
  }
  
  @Check
  public void checkType(final LocalEvaluationExpression evalExpression) {
    ActionType _typeForA = null;
    if (evalExpression!=null) {
      _typeForA=this._aTypeProvider.typeForA(evalExpression);
    }
    ActionType type = _typeForA;
    boolean _equals = Objects.equal(type, null);
    if (_equals) {
      this.error("bad assignment, check types and references", 
        ONPAPackage.Literals.EVALUATION_EXPRESSION_IN__EXPRESSION, 
        ONPAValidator.WRONG_TYPE);
    }
  }
  
  @Check
  public void checkType(final GlobalEvaluationExpression evalExpression) {
    ActionType _typeForA = null;
    if (evalExpression!=null) {
      _typeForA=this._aTypeProvider.typeForA(evalExpression);
    }
    ActionType type = _typeForA;
    boolean _equals = Objects.equal(type, null);
    if (_equals) {
      this.error("bad assignment, check types and references", ONPAPackage.Literals.EVALUATION_EXPRESSION_IN__EXPRESSION, ONPAValidator.WRONG_TYPE);
    }
  }
  
  @Check
  public void checkType(final FreeEvaluationExpression evalExpression) {
    ActionType _typeForA = null;
    if (evalExpression!=null) {
      _typeForA=this._aTypeProvider.typeForA(evalExpression);
    }
    ActionType type = _typeForA;
    boolean _equals = Objects.equal(type, null);
    if (_equals) {
      this.error("bad assignment, check types and references", ONPAPackage.Literals.FREE_EVALUATION_EXPRESSION__EXPRESSION, ONPAValidator.WRONG_TYPE);
    }
  }
  
  private void checkExpectedBoolean(final Expression exp, final EReference reference) {
    this.checkExpectedType(exp, ETypeProvider.boolConstantType, reference);
  }
  
  private void checkExpectedBoolean(final ActionExpression exp, final EReference reference) {
    this.checkExpectedType(exp, ETypeProvider.boolConstantType, reference);
  }
  
  private void checkExpectedDouble(final Expression exp, final EReference reference) {
    this.checkExpectedType(exp, ETypeProvider.doubleConstantType, reference);
  }
  
  private void checkExpectedDouble(final ActionExpression exp, final EReference reference) {
    this.checkExpectedType(exp, ETypeProvider.doubleConstantType, reference);
  }
  
  private void checkExpectedType(final ActionExpression exp, final ExpressionsType expectedType, final EReference reference) {
    final ExpressionsType actualType = this.getTypeAndCheckNotNull(exp, reference);
    boolean _or = false;
    boolean _equals = Objects.equal(actualType, expectedType);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Objects.equal(actualType, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    boolean _not = (!_or);
    if (_not) {
      this.error(((("Expected " + expectedType) + " type, but was ") + actualType), reference, ONPAValidator.WRONG_TYPE);
    }
  }
  
  private void checkExpectedType(final Expression exp, final ExpressionsType expectedType, final EReference reference) {
    final ExpressionsType actualType = this.getTypeAndCheckNotNull(exp, reference);
    boolean _notEquals = (!Objects.equal(actualType, expectedType));
    if (_notEquals) {
      this.error(((("Expected " + expectedType) + " type, but was ") + actualType), reference, ONPAValidator.WRONG_TYPE);
    }
  }
  
  private ExpressionsType getTypeAndCheckNotNull(final ActionExpression exp, final EReference reference) {
    ExpressionsType _typeFor = null;
    if (exp!=null) {
      _typeFor=this._eTypeProvider.typeFor(exp);
    }
    ExpressionsType type = _typeFor;
    boolean _equals = Objects.equal(type, null);
    if (_equals) {
      this.error("null type", reference, ONPAValidator.WRONG_TYPE);
    }
    return type;
  }
  
  private ExpressionsType getTypeAndCheckNotNull(final Expression exp, final EReference reference) {
    ExpressionsType _typeFor = null;
    if (exp!=null) {
      _typeFor=this._eTypeProvider.typeFor(exp);
    }
    ExpressionsType type = _typeFor;
    boolean _equals = Objects.equal(type, null);
    if (_equals) {
      this.error("null type", reference, ONPAValidator.WRONG_TYPE);
    }
    return type;
  }
}
