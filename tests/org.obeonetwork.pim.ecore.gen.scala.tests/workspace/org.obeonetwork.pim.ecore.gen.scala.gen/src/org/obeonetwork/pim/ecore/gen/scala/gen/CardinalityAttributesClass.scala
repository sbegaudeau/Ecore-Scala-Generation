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
 * <!-- Start of user code A representation of the model object CardinalityAttributesClass -->
 * ScalaDoc of CardinalityAttributesClass.
 * 
 * The following features are supported:
 * - CardinalityAttributesClass#_firstAttribute
 * - CardinalityAttributesClass#_secondAttribute
 * - CardinalityAttributesClass#_thirdAttribute
 * - CardinalityAttributesClass#_fourthAttribute
 * - CardinalityAttributesClass#_fifthAttribute
 * - CardinalityAttributesClass#_sixthAttribute
 * - CardinalityAttributesClass#_seventhAttribute
 * - CardinalityAttributesClass#_eighthAttribute
 * 
 * @see Package
 * @model
 * <!-- End of user code -->
 */
trait CardinalityAttributesClass {
	/**
	 * <!-- Start of user code for the accessor firstAttribute -->
	 * ScalaDoc of _firstAttribute.
	 * 
	 * Returns the value of the '_firstAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_firstAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def firstAttribute(): String
	
	/**
	 * <!-- Start of user code for the mutator firstAttribute_ -->
	 * ScalaDoc of firstAttribute_.
	 * 
	 * Sets the value of the '_firstAttribute' attribute.
	 * 
	 * @param new_firstAttribute
	 *       Sets the value of the field '_firstAttribute'.
	 * <!-- End of user code -->
	 */
	def firstAttribute_(new_firstAttribute: String)
	
	/**
	 * <!-- Start of user code for the accessor secondAttribute -->
	 * ScalaDoc of _secondAttribute.
	 * 
	 * Returns the value of the '_secondAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_secondAttribute'.
	 * @model required="true"
	 * <!-- End of user code -->
	 */
	def secondAttribute(): String
	
	/**
	 * <!-- Start of user code for the mutator secondAttribute_ -->
	 * ScalaDoc of secondAttribute_.
	 * 
	 * Sets the value of the '_secondAttribute' attribute.
	 * 
	 * @param new_secondAttribute
	 *       Sets the value of the field '_secondAttribute'.
	 * <!-- End of user code -->
	 */
	def secondAttribute_(new_secondAttribute: String)
	
	/**
	 * <!-- Start of user code for the accessor thirdAttribute -->
	 * ScalaDoc of _thirdAttribute.
	 * 
	 * Returns the value of the '_thirdAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_thirdAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def thirdAttribute(): HashSet[String]
	
	/**
	 * <!-- Start of user code for the mutator thirdAttribute_ -->
	 * ScalaDoc of thirdAttribute_.
	 * 
	 * Sets the value of the '_thirdAttribute' attribute.
	 * 
	 * @param new_thirdAttribute
	 *       Sets the value of the field '_thirdAttribute'.
	 * <!-- End of user code -->
	 */
	def thirdAttribute_(new_thirdAttribute: HashSet[String])
	
	/**
	 * <!-- Start of user code for the accessor fourthAttribute -->
	 * ScalaDoc of _fourthAttribute.
	 * 
	 * Returns the value of the '_fourthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_fourthAttribute'.
	 * @model required="true"
	 * <!-- End of user code -->
	 */
	def fourthAttribute(): HashSet[String]
	
	/**
	 * <!-- Start of user code for the mutator fourthAttribute_ -->
	 * ScalaDoc of fourthAttribute_.
	 * 
	 * Sets the value of the '_fourthAttribute' attribute.
	 * 
	 * @param new_fourthAttribute
	 *       Sets the value of the field '_fourthAttribute'.
	 * <!-- End of user code -->
	 */
	def fourthAttribute_(new_fourthAttribute: HashSet[String])
	
	/**
	 * <!-- Start of user code for the accessor fifthAttribute -->
	 * ScalaDoc of _fifthAttribute.
	 * 
	 * Returns the value of the '_fifthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_fifthAttribute'.
	 * @model required="true"
	 * <!-- End of user code -->
	 */
	def fifthAttribute(): Option[HashSet[String]]
	
	/**
	 * <!-- Start of user code for the mutator fifthAttribute_ -->
	 * ScalaDoc of fifthAttribute_.
	 * 
	 * Sets the value of the '_fifthAttribute' attribute.
	 * 
	 * @param new_fifthAttribute
	 *       Sets the value of the field '_fifthAttribute'.
	 * <!-- End of user code -->
	 */
	def fifthAttribute_(new_fifthAttribute: Option[HashSet[String]])
	
	/**
	 * <!-- Start of user code for the accessor sixthAttribute -->
	 * ScalaDoc of _sixthAttribute.
	 * 
	 * Returns the value of the '_sixthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_sixthAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def sixthAttribute(): HashSet[String]
	
	/**
	 * <!-- Start of user code for the mutator sixthAttribute_ -->
	 * ScalaDoc of sixthAttribute_.
	 * 
	 * Sets the value of the '_sixthAttribute' attribute.
	 * 
	 * @param new_sixthAttribute
	 *       Sets the value of the field '_sixthAttribute'.
	 * <!-- End of user code -->
	 */
	def sixthAttribute_(new_sixthAttribute: HashSet[String])
	
	/**
	 * <!-- Start of user code for the accessor seventhAttribute -->
	 * ScalaDoc of _seventhAttribute.
	 * 
	 * Returns the value of the '_seventhAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_seventhAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def seventhAttribute(): List[String]
	
	/**
	 * <!-- Start of user code for the mutator seventhAttribute_ -->
	 * ScalaDoc of seventhAttribute_.
	 * 
	 * Sets the value of the '_seventhAttribute' attribute.
	 * 
	 * @param new_seventhAttribute
	 *       Sets the value of the field '_seventhAttribute'.
	 * <!-- End of user code -->
	 */
	def seventhAttribute_(new_seventhAttribute: List[String])
	
	/**
	 * <!-- Start of user code for the accessor eighthAttribute -->
	 * ScalaDoc of _eighthAttribute.
	 * 
	 * Returns the value of the '_eighthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_eighthAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def eighthAttribute(): List[String]
	
	/**
	 * <!-- Start of user code for the mutator eighthAttribute_ -->
	 * ScalaDoc of eighthAttribute_.
	 * 
	 * Sets the value of the '_eighthAttribute' attribute.
	 * 
	 * @param new_eighthAttribute
	 *       Sets the value of the field '_eighthAttribute'.
	 * <!-- End of user code -->
	 */
	def eighthAttribute_(new_eighthAttribute: List[String])
}
