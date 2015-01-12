package com.blasedef.onpa.typing;

import com.blasedef.onpa.oNPA.Model;
import com.blasedef.onpa.oNPA.Store;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ModelUtil {
  public static List<Store> variablesDefinedBefore(final Store e) {
    List<Store> _xblockexpression = null;
    {
      Model _containerOfType = EcoreUtil2.<Model>getContainerOfType(e, Model.class);
      final EList<Store> allElements = _containerOfType.getStores();
      final Function1<Store, Boolean> _function = new Function1<Store, Boolean>() {
        public Boolean apply(final Store it) {
          return Boolean.valueOf(EcoreUtil.isAncestor(it, e));
        }
      };
      final Store containingElement = IterableExtensions.<Store>findFirst(allElements, _function);
      int _indexOf = allElements.indexOf(containingElement);
      List<Store> _subList = allElements.subList(0, _indexOf);
      _xblockexpression = EcoreUtil2.<Store>typeSelect(_subList, Store.class);
    }
    return _xblockexpression;
  }
}
