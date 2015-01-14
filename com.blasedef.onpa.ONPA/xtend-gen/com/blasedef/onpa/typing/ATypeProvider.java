package com.blasedef.onpa.typing;

import com.blasedef.onpa.oNPA.ActionExpression;
import com.blasedef.onpa.oNPA.LocalUpdateExpression;
import com.blasedef.onpa.typing.ActionType;
import com.blasedef.onpa.typing.BoolConstantType;
import com.blasedef.onpa.typing.DoubleConstantType;
import com.blasedef.onpa.typing.FreeVariableType;
import com.blasedef.onpa.typing.ReferencedStoreType;
import com.blasedef.onpa.typing.SelfReferencedStoreType;
import com.blasedef.onpa.typing.UpdateExpressionType;
import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class ATypeProvider {
  public final static DoubleConstantType doubleConstantType = new DoubleConstantType();
  
  public final static FreeVariableType freeVariableType = new FreeVariableType();
  
  public final static BoolConstantType boolConstantType = new BoolConstantType();
  
  public final static ReferencedStoreType referencedStoreType = new ReferencedStoreType();
  
  public final static SelfReferencedStoreType selfReferencedStoreType = new SelfReferencedStoreType();
  
  public final static UpdateExpressionType updateExpressionType = new UpdateExpressionType();
  
  protected ActionType _typeFor(final SelfReferencedStoreType selfRef) {
    return ATypeProvider.selfReferencedStoreType;
  }
  
  protected ActionType _typeFor(final LocalUpdateExpression u) {
    boolean _and = false;
    EObject _name = u.getName();
    boolean _equals = Objects.equal(_name, ATypeProvider.selfReferencedStoreType);
    if (!_equals) {
      _and = false;
    } else {
      boolean _or = false;
      ActionExpression _expression = u.getExpression();
      boolean _equals_1 = Objects.equal(_expression, ATypeProvider.boolConstantType);
      if (_equals_1) {
        _or = true;
      } else {
        ActionExpression _expression_1 = u.getExpression();
        boolean _equals_2 = Objects.equal(_expression_1, ATypeProvider.doubleConstantType);
        _or = _equals_2;
      }
      _and = _or;
    }
    if (_and) {
      return ATypeProvider.updateExpressionType;
    } else {
      return null;
    }
  }
  
  public ActionType typeFor(final Object u) {
    if (u instanceof LocalUpdateExpression) {
      return _typeFor((LocalUpdateExpression)u);
    } else if (u instanceof SelfReferencedStoreType) {
      return _typeFor((SelfReferencedStoreType)u);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(u).toString());
    }
  }
}
