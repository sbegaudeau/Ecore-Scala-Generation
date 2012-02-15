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
 * <!-- Start of user code An implementation of the model object CardinalityAttributesClass -->
 * ScalaDoc of CardinalityAttributesClass.
 * 
 * The following features are implemented:
 * - CardinalityAttributesClassImpl#_firstAttribute
 * - CardinalityAttributesClassImpl#_secondAttribute
 * - CardinalityAttributesClassImpl#_thirdAttribute
 * - CardinalityAttributesClassImpl#_fourthAttribute
 * - CardinalityAttributesClassImpl#_fifthAttribute
 * - CardinalityAttributesClassImpl#_sixthAttribute
 * - CardinalityAttributesClassImpl#_seventhAttribute
 * - CardinalityAttributesClassImpl#_eighthAttribute
 * 
 * <!-- End of user code -->
 */
class CardinalityAttributesClassImpl {
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
	private[this] var _secondAttribute: String = "";
	
	/**
	 * <!-- Start of user code for the attribute _thirdAttribute -->
	 * ScalaDoc of _thirdAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _thirdAttribute: HashSet[String] = HashSet[String]();
	
	/**
	 * <!-- Start of user code for the attribute _fourthAttribute -->
	 * ScalaDoc of _fourthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _fourthAttribute: HashSet[String] = HashSet[String]();
	
	/**
	 * <!-- Start of user code for the attribute _fifthAttribute -->
	 * ScalaDoc of _fifthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _fifthAttribute: Option[HashSet[String]] = None;
	
	/**
	 * <!-- Start of user code for the attribute _sixthAttribute -->
	 * ScalaDoc of _sixthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _sixthAttribute: HashSet[String] = HashSet[String]();
	
	/**
	 * <!-- Start of user code for the attribute _seventhAttribute -->
	 * ScalaDoc of _seventhAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _seventhAttribute: List[String] = List[String]();
	
	/**
	 * <!-- Start of user code for the attribute _eighthAttribute -->
	 * ScalaDoc of _eighthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _eighthAttribute: List[String] = List[String]();
	
	
	
	
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
	def secondAttribute(): String = {
		return this._secondAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator secondAttribute_ -->
	 * ScalaDoc of secondAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def secondAttribute_(new_secondAttribute: String) {
		this._secondAttribute = new_secondAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor thirdAttribute -->
	 * ScalaDoc of _thirdAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def thirdAttribute(): HashSet[String] = {
		return this._thirdAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator thirdAttribute_ -->
	 * ScalaDoc of thirdAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def thirdAttribute_(new_thirdAttribute: HashSet[String]) {
		this._thirdAttribute = new_thirdAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor fourthAttribute -->
	 * ScalaDoc of _fourthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def fourthAttribute(): HashSet[String] = {
		return this._fourthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator fourthAttribute_ -->
	 * ScalaDoc of fourthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def fourthAttribute_(new_fourthAttribute: HashSet[String]) {
		this._fourthAttribute = new_fourthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor fifthAttribute -->
	 * ScalaDoc of _fifthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def fifthAttribute(): Option[HashSet[String]] = {
		return this._fifthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator fifthAttribute_ -->
	 * ScalaDoc of fifthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def fifthAttribute_(new_fifthAttribute: Option[HashSet[String]]) {
		this._fifthAttribute = new_fifthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor sixthAttribute -->
	 * ScalaDoc of _sixthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def sixthAttribute(): HashSet[String] = {
		return this._sixthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator sixthAttribute_ -->
	 * ScalaDoc of sixthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def sixthAttribute_(new_sixthAttribute: HashSet[String]) {
		this._sixthAttribute = new_sixthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor seventhAttribute -->
	 * ScalaDoc of _seventhAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def seventhAttribute(): List[String] = {
		return this._seventhAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator seventhAttribute_ -->
	 * ScalaDoc of seventhAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def seventhAttribute_(new_seventhAttribute: List[String]) {
		this._seventhAttribute = new_seventhAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor eighthAttribute -->
	 * ScalaDoc of _eighthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def eighthAttribute(): List[String] = {
		return this._eighthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator eighthAttribute_ -->
	 * ScalaDoc of eighthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def eighthAttribute_(new_eighthAttribute: List[String]) {
		this._eighthAttribute = new_eighthAttribute;
	}
}
