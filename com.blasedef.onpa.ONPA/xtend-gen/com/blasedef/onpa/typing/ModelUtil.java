package com.blasedef.onpa.typing;

import com.blasedef.onpa.oNPA.Model;
import com.blasedef.onpa.oNPA.ReferencedStore;
import com.blasedef.onpa.oNPA.SelfReferencedStore;
import com.blasedef.onpa.oNPA.Store;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ModelUtil {
  /**
   * Has the reference been defined before?
   */
  public static EList<Store> variablesDefinedBefore(final ReferencedStore e) {
    Model _containerOfType = EcoreUtil2.<Model>getContainerOfType(e, Model.class);
    final EList<Store> allElements = _containerOfType.getStores();
    return allElements;
  }
  
  public static EList<Store> variablesDefinedBefore(final SelfReferencedStore e) {
    Model _containerOfType = EcoreUtil2.<Model>getContainerOfType(e, Model.class);
    final EList<Store> allElements = _containerOfType.getStores();
    return allElements;
  }
  
  /**
   * Is there a store that references itself?
   */
  public static Store selfReferencedStores(final ReferencedStore e) {
    Store _xblockexpression = null;
    {
      Model _containerOfType = EcoreUtil2.<Model>getContainerOfType(e, Model.class);
      final EList<Store> allElements = _containerOfType.getStores();
      final Function1<Store, Boolean> _function = new Function1<Store, Boolean>() {
        public Boolean apply(final Store it) {
          return Boolean.valueOf(EcoreUtil.isAncestor(it, e));
        }
      };
      _xblockexpression = IterableExtensions.<Store>findFirst(allElements, _function);
    }
    return _xblockexpression;
  }
}
