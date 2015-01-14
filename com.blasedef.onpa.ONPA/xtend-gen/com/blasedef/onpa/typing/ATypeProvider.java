package com.blasedef.onpa.typing;

import com.blasedef.onpa.oNPA.LocalUpdateExpression;
import com.blasedef.onpa.typing.ActionType;
import com.blasedef.onpa.typing.BoolConstantType;
import com.blasedef.onpa.typing.DoubleConstantType;
import com.blasedef.onpa.typing.FreeVariableType;
import com.blasedef.onpa.typing.ReferencedStoreType;
import com.blasedef.onpa.typing.SelfReferencedStoreType;
import com.blasedef.onpa.typing.UpdateExpressionType;
import java.util.Arrays;

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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method value is undefined for the type ATypeProvider"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved");
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
