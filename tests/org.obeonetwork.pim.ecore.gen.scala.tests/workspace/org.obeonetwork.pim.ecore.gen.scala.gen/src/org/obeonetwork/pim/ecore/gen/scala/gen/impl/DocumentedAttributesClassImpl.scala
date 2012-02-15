/**
 * Copyright (c) 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Stephane Begaudeau (Obeo) - initial API and implementation
 */
package org.obeonetwork.pim.ecore.gen.scala.gen;

// Start of user code for imports
// End of user code

/**
 * <!-- Start of user code An implementation of the model object DocumentedAttributesClass -->
 * ScalaDoc of DocumentedAttributesClass.
 * 
 * The following features are implemented:
 * - DocumentedAttributesClassImpl#_firstAttribute
 * - DocumentedAttributesClassImpl#_secondAttribute
 * - DocumentedAttributesClassImpl#_thirdAttribute
 * - DocumentedAttributesClassImpl#_fourthAttribute
 * 
 * <!-- End of user code -->
 */
class DocumentedAttributesClassImpl {
	/**
	 * <!-- Start of user code for the attribute _firstAttribute -->
	 * ScalaDoc of _firstAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _firstAttribute: String = "";
	
	/**
	 * <!-- Start of user code for the attribute _secondAttribute -->
	 * ScalaDoc of _secondAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _secondAttribute: Int = 0;
	
	/**
	 * <!-- Start of user code for the attribute _thirdAttribute -->
	 * ScalaDoc of _thirdAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _thirdAttribute: Long = 0;
	
	/**
	 * <!-- Start of user code for the attribute _fourthAttribute -->
	 * ScalaDoc of _fourthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _fourthAttribute: Boolean = false;
	
	
	
	
	/**
	 * <!-- Start of user code for the accessor firstAttribute -->
	 * ScalaDoc of _firstAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def firstAttribute(): String = {
		return this._firstAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator firstAttribute_ -->
	 * ScalaDoc of firstAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def firstAttribute_(new_firstAttribute: String) {
		this._firstAttribute = new_firstAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor secondAttribute -->
	 * ScalaDoc of _secondAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def secondAttribute(): Int = {
		return this._secondAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator secondAttribute_ -->
	 * ScalaDoc of secondAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def secondAttribute_(new_secondAttribute: Int) {
		this._secondAttribute = new_secondAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor thirdAttribute -->
	 * ScalaDoc of _thirdAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def thirdAttribute(): Long = {
		return this._thirdAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator thirdAttribute_ -->
	 * ScalaDoc of thirdAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def thirdAttribute_(new_thirdAttribute: Long) {
		this._thirdAttribute = new_thirdAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor fourthAttribute -->
	 * ScalaDoc of _fourthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def fourthAttribute(): Boolean = {
		return this._fourthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator fourthAttribute_ -->
	 * ScalaDoc of fourthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def fourthAttribute_(new_fourthAttribute: Boolean) {
		this._fourthAttribute = new_fourthAttribute;
	}
}
