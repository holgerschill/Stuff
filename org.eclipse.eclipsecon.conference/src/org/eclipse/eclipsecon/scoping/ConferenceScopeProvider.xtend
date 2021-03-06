/*
 * generated by Xtext
 */
package org.eclipse.eclipsecon.scoping

import org.eclipse.eclipsecon.conference.Conference
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.eclipsecon.location.Room
import org.eclipse.eclipsecon.location.Tool
import org.eclipse.xtext.scoping.IScope

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class ConferenceScopeProvider extends AbstractDeclarativeScopeProvider {
	def scope_Talk_room(Conference conf, EReference ref){
		if(conf.location != null)
			return Scopes.scopeFor(conf.location.elements.filter(Room))
		IScope.NULLSCOPE
	}
	
	def scope_Talk_tools(Conference conf, EReference ref){
		if(conf.location != null)
			return Scopes.scopeFor(conf.location.elements.filter(Tool))
		IScope.NULLSCOPE
			
	}
}
