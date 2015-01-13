package com.blasedef.onpa.typing

import com.blasedef.onpa.oNPA.Store
import static org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import com.blasedef.onpa.oNPA.Model

class ModelUtil {

	def static variablesDefinedBefore(Store e) {
		val allElements = 
			e.getContainerOfType(typeof(Model)).stores
		val containingElement = allElements.findFirst[isAncestor(it, e)]
		allElements.subList(0, allElements.indexOf(containingElement) + 1)
	}
}
