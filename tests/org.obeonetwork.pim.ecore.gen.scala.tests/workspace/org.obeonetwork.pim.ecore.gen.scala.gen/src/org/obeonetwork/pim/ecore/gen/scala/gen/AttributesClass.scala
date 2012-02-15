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

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap$Entry;
import scala.collection.mutable.List;
import scala.collection.mutable.Map;
import scala.math.BigDecimal;
import scala.math.BigInt;

// Start of user code for imports
// End of user code

/**
 * <!-- Start of user code A representation of the model object AttributesClass -->
 * ScalaDoc of AttributesClass.
 * 
 * The following features are supported:
 * - AttributesClass#_firstAttribute
 * - AttributesClass#_secondAttribute
 * - AttributesClass#_thirdAttribute
 * - AttributesClass#_fourthAttribute
 * - AttributesClass#_fifthAttribute
 * - AttributesClass#_sixthAttribute
 * - AttributesClass#_seventhAttribute
 * - AttributesClass#_eighthAttribute
 * - AttributesClass#_ninthAttribute
 * - AttributesClass#_tenthAttribute
 * - AttributesClass#_eleventhAttribute
 * - AttributesClass#_twelfthAttribute
 * - AttributesClass#_thirteenthAttribute
 * - AttributesClass#_fourteenthAttribute
 * - AttributesClass#_fifteenthAttribute
 * - AttributesClass#_sixteenthAttribute
 * - AttributesClass#_seventeenthAttribute
 * - AttributesClass#_eighteenthAttribute
 * - AttributesClass#_nineteenthAttribute
 * - AttributesClass#_twentiethAttribute
 * - AttributesClass#_twentyFirstAttribute
 * - AttributesClass#_twentySecondAttribute
 * - AttributesClass#_twentyThirdAttribute
 * - AttributesClass#_twentyFourthAttribute
 * - AttributesClass#_twentyFifthAttribute
 * - AttributesClass#_twentySixthAttribute
 * - AttributesClass#_twentySeventhAttribute
 * - AttributesClass#_twentyEighthAttribute
 * - AttributesClass#_twentyNinthAttribute
 * - AttributesClass#_thirtiethAttribute
 * - AttributesClass#_thirtyFirstAttribute
 * - AttributesClass#_thirtySecondAttribute
 * - AttributesClass#_thirtyThirdAttribute
 * 
 * @see Package
 * @model
 * <!-- End of user code -->
 */
trait AttributesClass {
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
	def firstAttribute(): BigDecimal
	
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
	def firstAttribute_(new_firstAttribute: BigDecimal)
	
	/**
	 * <!-- Start of user code for the accessor secondAttribute -->
	 * ScalaDoc of _secondAttribute.
	 * 
	 * Returns the value of the '_secondAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_secondAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def secondAttribute(): BigInt
	
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
	def secondAttribute_(new_secondAttribute: BigInt)
	
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
	def thirdAttribute(): Boolean
	
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
	def thirdAttribute_(new_thirdAttribute: Boolean)
	
	/**
	 * <!-- Start of user code for the accessor fourthAttribute -->
	 * ScalaDoc of _fourthAttribute.
	 * 
	 * Returns the value of the '_fourthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_fourthAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def fourthAttribute(): Boolean
	
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
	def fourthAttribute_(new_fourthAttribute: Boolean)
	
	/**
	 * <!-- Start of user code for the accessor fifthAttribute -->
	 * ScalaDoc of _fifthAttribute.
	 * 
	 * Returns the value of the '_fifthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_fifthAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def fifthAttribute(): Byte
	
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
	def fifthAttribute_(new_fifthAttribute: Byte)
	
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
	def sixthAttribute(): Array[Byte]
	
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
	def sixthAttribute_(new_sixthAttribute: Array[Byte])
	
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
	def seventhAttribute(): Byte
	
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
	def seventhAttribute_(new_seventhAttribute: Byte)
	
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
	def eighthAttribute(): Char
	
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
	def eighthAttribute_(new_eighthAttribute: Char)
	
	/**
	 * <!-- Start of user code for the accessor ninthAttribute -->
	 * ScalaDoc of _ninthAttribute.
	 * 
	 * Returns the value of the '_ninthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_ninthAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def ninthAttribute(): Character
	
	/**
	 * <!-- Start of user code for the mutator ninthAttribute_ -->
	 * ScalaDoc of ninthAttribute_.
	 * 
	 * Sets the value of the '_ninthAttribute' attribute.
	 * 
	 * @param new_ninthAttribute
	 *       Sets the value of the field '_ninthAttribute'.
	 * <!-- End of user code -->
	 */
	def ninthAttribute_(new_ninthAttribute: Character)
	
	/**
	 * <!-- Start of user code for the accessor tenthAttribute -->
	 * ScalaDoc of _tenthAttribute.
	 * 
	 * Returns the value of the '_tenthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_tenthAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def tenthAttribute(): Date
	
	/**
	 * <!-- Start of user code for the mutator tenthAttribute_ -->
	 * ScalaDoc of tenthAttribute_.
	 * 
	 * Sets the value of the '_tenthAttribute' attribute.
	 * 
	 * @param new_tenthAttribute
	 *       Sets the value of the field '_tenthAttribute'.
	 * <!-- End of user code -->
	 */
	def tenthAttribute_(new_tenthAttribute: Date)
	
	/**
	 * <!-- Start of user code for the accessor eleventhAttribute -->
	 * ScalaDoc of _eleventhAttribute.
	 * 
	 * Returns the value of the '_eleventhAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_eleventhAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def eleventhAttribute(): DiagnosticChain
	
	/**
	 * <!-- Start of user code for the mutator eleventhAttribute_ -->
	 * ScalaDoc of eleventhAttribute_.
	 * 
	 * Sets the value of the '_eleventhAttribute' attribute.
	 * 
	 * @param new_eleventhAttribute
	 *       Sets the value of the field '_eleventhAttribute'.
	 * <!-- End of user code -->
	 */
	def eleventhAttribute_(new_eleventhAttribute: DiagnosticChain)
	
	/**
	 * <!-- Start of user code for the accessor twelfthAttribute -->
	 * ScalaDoc of _twelfthAttribute.
	 * 
	 * Returns the value of the '_twelfthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_twelfthAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def twelfthAttribute(): Double
	
	/**
	 * <!-- Start of user code for the mutator twelfthAttribute_ -->
	 * ScalaDoc of twelfthAttribute_.
	 * 
	 * Sets the value of the '_twelfthAttribute' attribute.
	 * 
	 * @param new_twelfthAttribute
	 *       Sets the value of the field '_twelfthAttribute'.
	 * <!-- End of user code -->
	 */
	def twelfthAttribute_(new_twelfthAttribute: Double)
	
	/**
	 * <!-- Start of user code for the accessor thirteenthAttribute -->
	 * ScalaDoc of _thirteenthAttribute.
	 * 
	 * Returns the value of the '_thirteenthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_thirteenthAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def thirteenthAttribute(): Double
	
	/**
	 * <!-- Start of user code for the mutator thirteenthAttribute_ -->
	 * ScalaDoc of thirteenthAttribute_.
	 * 
	 * Sets the value of the '_thirteenthAttribute' attribute.
	 * 
	 * @param new_thirteenthAttribute
	 *       Sets the value of the field '_thirteenthAttribute'.
	 * <!-- End of user code -->
	 */
	def thirteenthAttribute_(new_thirteenthAttribute: Double)
	
	/**
	 * <!-- Start of user code for the accessor fourteenthAttribute -->
	 * ScalaDoc of _fourteenthAttribute.
	 * 
	 * Returns the value of the '_fourteenthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_fourteenthAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def fourteenthAttribute(): List
	
	/**
	 * <!-- Start of user code for the mutator fourteenthAttribute_ -->
	 * ScalaDoc of fourteenthAttribute_.
	 * 
	 * Sets the value of the '_fourteenthAttribute' attribute.
	 * 
	 * @param new_fourteenthAttribute
	 *       Sets the value of the field '_fourteenthAttribute'.
	 * <!-- End of user code -->
	 */
	def fourteenthAttribute_(new_fourteenthAttribute: List)
	
	/**
	 * <!-- Start of user code for the accessor fifteenthAttribute -->
	 * ScalaDoc of _fifteenthAttribute.
	 * 
	 * Returns the value of the '_fifteenthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_fifteenthAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def fifteenthAttribute(): Enumerator
	
	/**
	 * <!-- Start of user code for the mutator fifteenthAttribute_ -->
	 * ScalaDoc of fifteenthAttribute_.
	 * 
	 * Sets the value of the '_fifteenthAttribute' attribute.
	 * 
	 * @param new_fifteenthAttribute
	 *       Sets the value of the field '_fifteenthAttribute'.
	 * <!-- End of user code -->
	 */
	def fifteenthAttribute_(new_fifteenthAttribute: Enumerator)
	
	/**
	 * <!-- Start of user code for the accessor sixteenthAttribute -->
	 * ScalaDoc of _sixteenthAttribute.
	 * 
	 * Returns the value of the '_sixteenthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_sixteenthAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def sixteenthAttribute(): FeatureMap
	
	/**
	 * <!-- Start of user code for the mutator sixteenthAttribute_ -->
	 * ScalaDoc of sixteenthAttribute_.
	 * 
	 * Sets the value of the '_sixteenthAttribute' attribute.
	 * 
	 * @param new_sixteenthAttribute
	 *       Sets the value of the field '_sixteenthAttribute'.
	 * <!-- End of user code -->
	 */
	def sixteenthAttribute_(new_sixteenthAttribute: FeatureMap)
	
	/**
	 * <!-- Start of user code for the accessor seventeenthAttribute -->
	 * ScalaDoc of _seventeenthAttribute.
	 * 
	 * Returns the value of the '_seventeenthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_seventeenthAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def seventeenthAttribute(): FeatureMap$Entry
	
	/**
	 * <!-- Start of user code for the mutator seventeenthAttribute_ -->
	 * ScalaDoc of seventeenthAttribute_.
	 * 
	 * Sets the value of the '_seventeenthAttribute' attribute.
	 * 
	 * @param new_seventeenthAttribute
	 *       Sets the value of the field '_seventeenthAttribute'.
	 * <!-- End of user code -->
	 */
	def seventeenthAttribute_(new_seventeenthAttribute: FeatureMap$Entry)
	
	/**
	 * <!-- Start of user code for the accessor eighteenthAttribute -->
	 * ScalaDoc of _eighteenthAttribute.
	 * 
	 * Returns the value of the '_eighteenthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_eighteenthAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def eighteenthAttribute(): Float
	
	/**
	 * <!-- Start of user code for the mutator eighteenthAttribute_ -->
	 * ScalaDoc of eighteenthAttribute_.
	 * 
	 * Sets the value of the '_eighteenthAttribute' attribute.
	 * 
	 * @param new_eighteenthAttribute
	 *       Sets the value of the field '_eighteenthAttribute'.
	 * <!-- End of user code -->
	 */
	def eighteenthAttribute_(new_eighteenthAttribute: Float)
	
	/**
	 * <!-- Start of user code for the accessor nineteenthAttribute -->
	 * ScalaDoc of _nineteenthAttribute.
	 * 
	 * Returns the value of the '_nineteenthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_nineteenthAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def nineteenthAttribute(): Float
	
	/**
	 * <!-- Start of user code for the mutator nineteenthAttribute_ -->
	 * ScalaDoc of nineteenthAttribute_.
	 * 
	 * Sets the value of the '_nineteenthAttribute' attribute.
	 * 
	 * @param new_nineteenthAttribute
	 *       Sets the value of the field '_nineteenthAttribute'.
	 * <!-- End of user code -->
	 */
	def nineteenthAttribute_(new_nineteenthAttribute: Float)
	
	/**
	 * <!-- Start of user code for the accessor twentiethAttribute -->
	 * ScalaDoc of _twentiethAttribute.
	 * 
	 * Returns the value of the '_twentiethAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_twentiethAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def twentiethAttribute(): Int
	
	/**
	 * <!-- Start of user code for the mutator twentiethAttribute_ -->
	 * ScalaDoc of twentiethAttribute_.
	 * 
	 * Sets the value of the '_twentiethAttribute' attribute.
	 * 
	 * @param new_twentiethAttribute
	 *       Sets the value of the field '_twentiethAttribute'.
	 * <!-- End of user code -->
	 */
	def twentiethAttribute_(new_twentiethAttribute: Int)
	
	/**
	 * <!-- Start of user code for the accessor twentyFirstAttribute -->
	 * ScalaDoc of _twentyFirstAttribute.
	 * 
	 * Returns the value of the '_twentyFirstAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_twentyFirstAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def twentyFirstAttribute(): Integer
	
	/**
	 * <!-- Start of user code for the mutator twentyFirstAttribute_ -->
	 * ScalaDoc of twentyFirstAttribute_.
	 * 
	 * Sets the value of the '_twentyFirstAttribute' attribute.
	 * 
	 * @param new_twentyFirstAttribute
	 *       Sets the value of the field '_twentyFirstAttribute'.
	 * <!-- End of user code -->
	 */
	def twentyFirstAttribute_(new_twentyFirstAttribute: Integer)
	
	/**
	 * <!-- Start of user code for the accessor twentySecondAttribute -->
	 * ScalaDoc of _twentySecondAttribute.
	 * 
	 * Returns the value of the '_twentySecondAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_twentySecondAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def twentySecondAttribute(): InvocationTargetException
	
	/**
	 * <!-- Start of user code for the mutator twentySecondAttribute_ -->
	 * ScalaDoc of twentySecondAttribute_.
	 * 
	 * Sets the value of the '_twentySecondAttribute' attribute.
	 * 
	 * @param new_twentySecondAttribute
	 *       Sets the value of the field '_twentySecondAttribute'.
	 * <!-- End of user code -->
	 */
	def twentySecondAttribute_(new_twentySecondAttribute: InvocationTargetException)
	
	/**
	 * <!-- Start of user code for the accessor twentyThirdAttribute -->
	 * ScalaDoc of _twentyThirdAttribute.
	 * 
	 * Returns the value of the '_twentyThirdAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_twentyThirdAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def twentyThirdAttribute(): Class
	
	/**
	 * <!-- Start of user code for the mutator twentyThirdAttribute_ -->
	 * ScalaDoc of twentyThirdAttribute_.
	 * 
	 * Sets the value of the '_twentyThirdAttribute' attribute.
	 * 
	 * @param new_twentyThirdAttribute
	 *       Sets the value of the field '_twentyThirdAttribute'.
	 * <!-- End of user code -->
	 */
	def twentyThirdAttribute_(new_twentyThirdAttribute: Class)
	
	/**
	 * <!-- Start of user code for the accessor twentyFourthAttribute -->
	 * ScalaDoc of _twentyFourthAttribute.
	 * 
	 * Returns the value of the '_twentyFourthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_twentyFourthAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def twentyFourthAttribute(): Object
	
	/**
	 * <!-- Start of user code for the mutator twentyFourthAttribute_ -->
	 * ScalaDoc of twentyFourthAttribute_.
	 * 
	 * Sets the value of the '_twentyFourthAttribute' attribute.
	 * 
	 * @param new_twentyFourthAttribute
	 *       Sets the value of the field '_twentyFourthAttribute'.
	 * <!-- End of user code -->
	 */
	def twentyFourthAttribute_(new_twentyFourthAttribute: Object)
	
	/**
	 * <!-- Start of user code for the accessor twentyFifthAttribute -->
	 * ScalaDoc of _twentyFifthAttribute.
	 * 
	 * Returns the value of the '_twentyFifthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_twentyFifthAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def twentyFifthAttribute(): Long
	
	/**
	 * <!-- Start of user code for the mutator twentyFifthAttribute_ -->
	 * ScalaDoc of twentyFifthAttribute_.
	 * 
	 * Sets the value of the '_twentyFifthAttribute' attribute.
	 * 
	 * @param new_twentyFifthAttribute
	 *       Sets the value of the field '_twentyFifthAttribute'.
	 * <!-- End of user code -->
	 */
	def twentyFifthAttribute_(new_twentyFifthAttribute: Long)
	
	/**
	 * <!-- Start of user code for the accessor twentySixthAttribute -->
	 * ScalaDoc of _twentySixthAttribute.
	 * 
	 * Returns the value of the '_twentySixthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_twentySixthAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def twentySixthAttribute(): Long
	
	/**
	 * <!-- Start of user code for the mutator twentySixthAttribute_ -->
	 * ScalaDoc of twentySixthAttribute_.
	 * 
	 * Sets the value of the '_twentySixthAttribute' attribute.
	 * 
	 * @param new_twentySixthAttribute
	 *       Sets the value of the field '_twentySixthAttribute'.
	 * <!-- End of user code -->
	 */
	def twentySixthAttribute_(new_twentySixthAttribute: Long)
	
	/**
	 * <!-- Start of user code for the accessor twentySeventhAttribute -->
	 * ScalaDoc of _twentySeventhAttribute.
	 * 
	 * Returns the value of the '_twentySeventhAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_twentySeventhAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def twentySeventhAttribute(): Map
	
	/**
	 * <!-- Start of user code for the mutator twentySeventhAttribute_ -->
	 * ScalaDoc of twentySeventhAttribute_.
	 * 
	 * Sets the value of the '_twentySeventhAttribute' attribute.
	 * 
	 * @param new_twentySeventhAttribute
	 *       Sets the value of the field '_twentySeventhAttribute'.
	 * <!-- End of user code -->
	 */
	def twentySeventhAttribute_(new_twentySeventhAttribute: Map)
	
	/**
	 * <!-- Start of user code for the accessor twentyEighthAttribute -->
	 * ScalaDoc of _twentyEighthAttribute.
	 * 
	 * Returns the value of the '_twentyEighthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_twentyEighthAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def twentyEighthAttribute(): Resource
	
	/**
	 * <!-- Start of user code for the mutator twentyEighthAttribute_ -->
	 * ScalaDoc of twentyEighthAttribute_.
	 * 
	 * Sets the value of the '_twentyEighthAttribute' attribute.
	 * 
	 * @param new_twentyEighthAttribute
	 *       Sets the value of the field '_twentyEighthAttribute'.
	 * <!-- End of user code -->
	 */
	def twentyEighthAttribute_(new_twentyEighthAttribute: Resource)
	
	/**
	 * <!-- Start of user code for the accessor twentyNinthAttribute -->
	 * ScalaDoc of _twentyNinthAttribute.
	 * 
	 * Returns the value of the '_twentyNinthAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_twentyNinthAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def twentyNinthAttribute(): ResourceSet
	
	/**
	 * <!-- Start of user code for the mutator twentyNinthAttribute_ -->
	 * ScalaDoc of twentyNinthAttribute_.
	 * 
	 * Sets the value of the '_twentyNinthAttribute' attribute.
	 * 
	 * @param new_twentyNinthAttribute
	 *       Sets the value of the field '_twentyNinthAttribute'.
	 * <!-- End of user code -->
	 */
	def twentyNinthAttribute_(new_twentyNinthAttribute: ResourceSet)
	
	/**
	 * <!-- Start of user code for the accessor thirtiethAttribute -->
	 * ScalaDoc of _thirtiethAttribute.
	 * 
	 * Returns the value of the '_thirtiethAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_thirtiethAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def thirtiethAttribute(): Short
	
	/**
	 * <!-- Start of user code for the mutator thirtiethAttribute_ -->
	 * ScalaDoc of thirtiethAttribute_.
	 * 
	 * Sets the value of the '_thirtiethAttribute' attribute.
	 * 
	 * @param new_thirtiethAttribute
	 *       Sets the value of the field '_thirtiethAttribute'.
	 * <!-- End of user code -->
	 */
	def thirtiethAttribute_(new_thirtiethAttribute: Short)
	
	/**
	 * <!-- Start of user code for the accessor thirtyFirstAttribute -->
	 * ScalaDoc of _thirtyFirstAttribute.
	 * 
	 * Returns the value of the '_thirtyFirstAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_thirtyFirstAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def thirtyFirstAttribute(): Short
	
	/**
	 * <!-- Start of user code for the mutator thirtyFirstAttribute_ -->
	 * ScalaDoc of thirtyFirstAttribute_.
	 * 
	 * Sets the value of the '_thirtyFirstAttribute' attribute.
	 * 
	 * @param new_thirtyFirstAttribute
	 *       Sets the value of the field '_thirtyFirstAttribute'.
	 * <!-- End of user code -->
	 */
	def thirtyFirstAttribute_(new_thirtyFirstAttribute: Short)
	
	/**
	 * <!-- Start of user code for the accessor thirtySecondAttribute -->
	 * ScalaDoc of _thirtySecondAttribute.
	 * 
	 * Returns the value of the '_thirtySecondAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_thirtySecondAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def thirtySecondAttribute(): String
	
	/**
	 * <!-- Start of user code for the mutator thirtySecondAttribute_ -->
	 * ScalaDoc of thirtySecondAttribute_.
	 * 
	 * Sets the value of the '_thirtySecondAttribute' attribute.
	 * 
	 * @param new_thirtySecondAttribute
	 *       Sets the value of the field '_thirtySecondAttribute'.
	 * <!-- End of user code -->
	 */
	def thirtySecondAttribute_(new_thirtySecondAttribute: String)
	
	/**
	 * <!-- Start of user code for the accessor thirtyThirdAttribute -->
	 * ScalaDoc of _thirtyThirdAttribute.
	 * 
	 * Returns the value of the '_thirtyThirdAttribute' attribute.
	 * 
	 * @return
	 *       The value of the field '_thirtyThirdAttribute'.
	 * @model
	 * <!-- End of user code -->
	 */
	def thirtyThirdAttribute(): TreeIterator
	
	/**
	 * <!-- Start of user code for the mutator thirtyThirdAttribute_ -->
	 * ScalaDoc of thirtyThirdAttribute_.
	 * 
	 * Sets the value of the '_thirtyThirdAttribute' attribute.
	 * 
	 * @param new_thirtyThirdAttribute
	 *       Sets the value of the field '_thirtyThirdAttribute'.
	 * <!-- End of user code -->
	 */
	def thirtyThirdAttribute_(new_thirtyThirdAttribute: TreeIterator)
}
