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
 * <!-- Start of user code An implementation of the model object AttributesClass -->
 * ScalaDoc of AttributesClass.
 * 
 * The following features are implemented:
 * - AttributesClassImpl#_firstAttribute
 * - AttributesClassImpl#_secondAttribute
 * - AttributesClassImpl#_thirdAttribute
 * - AttributesClassImpl#_fourthAttribute
 * - AttributesClassImpl#_fifthAttribute
 * - AttributesClassImpl#_sixthAttribute
 * - AttributesClassImpl#_seventhAttribute
 * - AttributesClassImpl#_eighthAttribute
 * - AttributesClassImpl#_ninthAttribute
 * - AttributesClassImpl#_tenthAttribute
 * - AttributesClassImpl#_eleventhAttribute
 * - AttributesClassImpl#_twelfthAttribute
 * - AttributesClassImpl#_thirteenthAttribute
 * - AttributesClassImpl#_fourteenthAttribute
 * - AttributesClassImpl#_fifteenthAttribute
 * - AttributesClassImpl#_sixteenthAttribute
 * - AttributesClassImpl#_seventeenthAttribute
 * - AttributesClassImpl#_eighteenthAttribute
 * - AttributesClassImpl#_nineteenthAttribute
 * - AttributesClassImpl#_twentiethAttribute
 * - AttributesClassImpl#_twentyFirstAttribute
 * - AttributesClassImpl#_twentySecondAttribute
 * - AttributesClassImpl#_twentyThirdAttribute
 * - AttributesClassImpl#_twentyFourthAttribute
 * - AttributesClassImpl#_twentyFifthAttribute
 * - AttributesClassImpl#_twentySixthAttribute
 * - AttributesClassImpl#_twentySeventhAttribute
 * - AttributesClassImpl#_twentyEighthAttribute
 * - AttributesClassImpl#_twentyNinthAttribute
 * - AttributesClassImpl#_thirtiethAttribute
 * - AttributesClassImpl#_thirtyFirstAttribute
 * - AttributesClassImpl#_thirtySecondAttribute
 * - AttributesClassImpl#_thirtyThirdAttribute
 * 
 * <!-- End of user code -->
 */
class AttributesClassImpl {
	/**
	 * <!-- Start of user code for the attribute _firstAttribute -->
	 * ScalaDoc of _firstAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _firstAttribute: BigDecimal = 0;
	
	/**
	 * <!-- Start of user code for the attribute _secondAttribute -->
	 * ScalaDoc of _secondAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _secondAttribute: BigInt = 0;
	
	/**
	 * <!-- Start of user code for the attribute _thirdAttribute -->
	 * ScalaDoc of _thirdAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _thirdAttribute: Boolean = false;
	
	/**
	 * <!-- Start of user code for the attribute _fourthAttribute -->
	 * ScalaDoc of _fourthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _fourthAttribute: Boolean = false;
	
	/**
	 * <!-- Start of user code for the attribute _fifthAttribute -->
	 * ScalaDoc of _fifthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _fifthAttribute: Byte = 0;
	
	/**
	 * <!-- Start of user code for the attribute _sixthAttribute -->
	 * ScalaDoc of _sixthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _sixthAttribute: Array[Byte] = Array[Byte]();
	
	/**
	 * <!-- Start of user code for the attribute _seventhAttribute -->
	 * ScalaDoc of _seventhAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _seventhAttribute: Byte = 0;
	
	/**
	 * <!-- Start of user code for the attribute _eighthAttribute -->
	 * ScalaDoc of _eighthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _eighthAttribute: Char = 0;
	
	/**
	 * <!-- Start of user code for the attribute _ninthAttribute -->
	 * ScalaDoc of _ninthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _ninthAttribute: Character = new Character(0);
	
	/**
	 * <!-- Start of user code for the attribute _tenthAttribute -->
	 * ScalaDoc of _tenthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _tenthAttribute: Date = null;
	
	/**
	 * <!-- Start of user code for the attribute _eleventhAttribute -->
	 * ScalaDoc of _eleventhAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _eleventhAttribute: DiagnosticChain = null;
	
	/**
	 * <!-- Start of user code for the attribute _twelfthAttribute -->
	 * ScalaDoc of _twelfthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _twelfthAttribute: Double = 0.0;
	
	/**
	 * <!-- Start of user code for the attribute _thirteenthAttribute -->
	 * ScalaDoc of _thirteenthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _thirteenthAttribute: Double = 0.0;
	
	/**
	 * <!-- Start of user code for the attribute _fourteenthAttribute -->
	 * ScalaDoc of _fourteenthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _fourteenthAttribute: List = List();
	
	/**
	 * <!-- Start of user code for the attribute _fifteenthAttribute -->
	 * ScalaDoc of _fifteenthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _fifteenthAttribute: Enumerator = null;
	
	/**
	 * <!-- Start of user code for the attribute _sixteenthAttribute -->
	 * ScalaDoc of _sixteenthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _sixteenthAttribute: FeatureMap = null;
	
	/**
	 * <!-- Start of user code for the attribute _seventeenthAttribute -->
	 * ScalaDoc of _seventeenthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _seventeenthAttribute: FeatureMap$Entry = null;
	
	/**
	 * <!-- Start of user code for the attribute _eighteenthAttribute -->
	 * ScalaDoc of _eighteenthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _eighteenthAttribute: Float = 0.0f;
	
	/**
	 * <!-- Start of user code for the attribute _nineteenthAttribute -->
	 * ScalaDoc of _nineteenthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _nineteenthAttribute: Float = 0.0f;
	
	/**
	 * <!-- Start of user code for the attribute _twentiethAttribute -->
	 * ScalaDoc of _twentiethAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _twentiethAttribute: Int = 0;
	
	/**
	 * <!-- Start of user code for the attribute _twentyFirstAttribute -->
	 * ScalaDoc of _twentyFirstAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _twentyFirstAttribute: Integer = 0;
	
	/**
	 * <!-- Start of user code for the attribute _twentySecondAttribute -->
	 * ScalaDoc of _twentySecondAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _twentySecondAttribute: InvocationTargetException = null;
	
	/**
	 * <!-- Start of user code for the attribute _twentyThirdAttribute -->
	 * ScalaDoc of _twentyThirdAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _twentyThirdAttribute: Class = null;
	
	/**
	 * <!-- Start of user code for the attribute _twentyFourthAttribute -->
	 * ScalaDoc of _twentyFourthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _twentyFourthAttribute: Object = null;
	
	/**
	 * <!-- Start of user code for the attribute _twentyFifthAttribute -->
	 * ScalaDoc of _twentyFifthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _twentyFifthAttribute: Long = 0;
	
	/**
	 * <!-- Start of user code for the attribute _twentySixthAttribute -->
	 * ScalaDoc of _twentySixthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _twentySixthAttribute: Long = 0;
	
	/**
	 * <!-- Start of user code for the attribute _twentySeventhAttribute -->
	 * ScalaDoc of _twentySeventhAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _twentySeventhAttribute: Map = null;
	
	/**
	 * <!-- Start of user code for the attribute _twentyEighthAttribute -->
	 * ScalaDoc of _twentyEighthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _twentyEighthAttribute: Resource = null;
	
	/**
	 * <!-- Start of user code for the attribute _twentyNinthAttribute -->
	 * ScalaDoc of _twentyNinthAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _twentyNinthAttribute: ResourceSet = null;
	
	/**
	 * <!-- Start of user code for the attribute _thirtiethAttribute -->
	 * ScalaDoc of _thirtiethAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _thirtiethAttribute: Short = 0;
	
	/**
	 * <!-- Start of user code for the attribute _thirtyFirstAttribute -->
	 * ScalaDoc of _thirtyFirstAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _thirtyFirstAttribute: Short = 0;
	
	/**
	 * <!-- Start of user code for the attribute _thirtySecondAttribute -->
	 * ScalaDoc of _thirtySecondAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _thirtySecondAttribute: String = "";
	
	/**
	 * <!-- Start of user code for the attribute _thirtyThirdAttribute -->
	 * ScalaDoc of _thirtyThirdAttribute.
	 * <!-- End of user code -->
	 */
	private[this] var _thirtyThirdAttribute: TreeIterator = null;
	
	
	
	
	/**
	 * <!-- Start of user code for the accessor firstAttribute -->
	 * ScalaDoc of _firstAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def firstAttribute(): BigDecimal = {
		return this._firstAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator firstAttribute_ -->
	 * ScalaDoc of firstAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def firstAttribute_(new_firstAttribute: BigDecimal) {
		this._firstAttribute = new_firstAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor secondAttribute -->
	 * ScalaDoc of _secondAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def secondAttribute(): BigInt = {
		return this._secondAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator secondAttribute_ -->
	 * ScalaDoc of secondAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def secondAttribute_(new_secondAttribute: BigInt) {
		this._secondAttribute = new_secondAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor thirdAttribute -->
	 * ScalaDoc of _thirdAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def thirdAttribute(): Boolean = {
		return this._thirdAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator thirdAttribute_ -->
	 * ScalaDoc of thirdAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def thirdAttribute_(new_thirdAttribute: Boolean) {
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
	
	/**
	 * <!-- Start of user code for the accessor fifthAttribute -->
	 * ScalaDoc of _fifthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def fifthAttribute(): Byte = {
		return this._fifthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator fifthAttribute_ -->
	 * ScalaDoc of fifthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def fifthAttribute_(new_fifthAttribute: Byte) {
		this._fifthAttribute = new_fifthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor sixthAttribute -->
	 * ScalaDoc of _sixthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def sixthAttribute(): Array[Byte] = {
		return this._sixthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator sixthAttribute_ -->
	 * ScalaDoc of sixthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def sixthAttribute_(new_sixthAttribute: Array[Byte]) {
		this._sixthAttribute = new_sixthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor seventhAttribute -->
	 * ScalaDoc of _seventhAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def seventhAttribute(): Byte = {
		return this._seventhAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator seventhAttribute_ -->
	 * ScalaDoc of seventhAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def seventhAttribute_(new_seventhAttribute: Byte) {
		this._seventhAttribute = new_seventhAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor eighthAttribute -->
	 * ScalaDoc of _eighthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def eighthAttribute(): Char = {
		return this._eighthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator eighthAttribute_ -->
	 * ScalaDoc of eighthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def eighthAttribute_(new_eighthAttribute: Char) {
		this._eighthAttribute = new_eighthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor ninthAttribute -->
	 * ScalaDoc of _ninthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def ninthAttribute(): Character = {
		return this._ninthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator ninthAttribute_ -->
	 * ScalaDoc of ninthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def ninthAttribute_(new_ninthAttribute: Character) {
		this._ninthAttribute = new_ninthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor tenthAttribute -->
	 * ScalaDoc of _tenthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def tenthAttribute(): Date = {
		return this._tenthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator tenthAttribute_ -->
	 * ScalaDoc of tenthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def tenthAttribute_(new_tenthAttribute: Date) {
		this._tenthAttribute = new_tenthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor eleventhAttribute -->
	 * ScalaDoc of _eleventhAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def eleventhAttribute(): DiagnosticChain = {
		return this._eleventhAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator eleventhAttribute_ -->
	 * ScalaDoc of eleventhAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def eleventhAttribute_(new_eleventhAttribute: DiagnosticChain) {
		this._eleventhAttribute = new_eleventhAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor twelfthAttribute -->
	 * ScalaDoc of _twelfthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twelfthAttribute(): Double = {
		return this._twelfthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator twelfthAttribute_ -->
	 * ScalaDoc of twelfthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twelfthAttribute_(new_twelfthAttribute: Double) {
		this._twelfthAttribute = new_twelfthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor thirteenthAttribute -->
	 * ScalaDoc of _thirteenthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def thirteenthAttribute(): Double = {
		return this._thirteenthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator thirteenthAttribute_ -->
	 * ScalaDoc of thirteenthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def thirteenthAttribute_(new_thirteenthAttribute: Double) {
		this._thirteenthAttribute = new_thirteenthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor fourteenthAttribute -->
	 * ScalaDoc of _fourteenthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def fourteenthAttribute(): List = {
		return this._fourteenthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator fourteenthAttribute_ -->
	 * ScalaDoc of fourteenthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def fourteenthAttribute_(new_fourteenthAttribute: List) {
		this._fourteenthAttribute = new_fourteenthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor fifteenthAttribute -->
	 * ScalaDoc of _fifteenthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def fifteenthAttribute(): Enumerator = {
		return this._fifteenthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator fifteenthAttribute_ -->
	 * ScalaDoc of fifteenthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def fifteenthAttribute_(new_fifteenthAttribute: Enumerator) {
		this._fifteenthAttribute = new_fifteenthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor sixteenthAttribute -->
	 * ScalaDoc of _sixteenthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def sixteenthAttribute(): FeatureMap = {
		return this._sixteenthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator sixteenthAttribute_ -->
	 * ScalaDoc of sixteenthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def sixteenthAttribute_(new_sixteenthAttribute: FeatureMap) {
		this._sixteenthAttribute = new_sixteenthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor seventeenthAttribute -->
	 * ScalaDoc of _seventeenthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def seventeenthAttribute(): FeatureMap$Entry = {
		return this._seventeenthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator seventeenthAttribute_ -->
	 * ScalaDoc of seventeenthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def seventeenthAttribute_(new_seventeenthAttribute: FeatureMap$Entry) {
		this._seventeenthAttribute = new_seventeenthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor eighteenthAttribute -->
	 * ScalaDoc of _eighteenthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def eighteenthAttribute(): Float = {
		return this._eighteenthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator eighteenthAttribute_ -->
	 * ScalaDoc of eighteenthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def eighteenthAttribute_(new_eighteenthAttribute: Float) {
		this._eighteenthAttribute = new_eighteenthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor nineteenthAttribute -->
	 * ScalaDoc of _nineteenthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def nineteenthAttribute(): Float = {
		return this._nineteenthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator nineteenthAttribute_ -->
	 * ScalaDoc of nineteenthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def nineteenthAttribute_(new_nineteenthAttribute: Float) {
		this._nineteenthAttribute = new_nineteenthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor twentiethAttribute -->
	 * ScalaDoc of _twentiethAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentiethAttribute(): Int = {
		return this._twentiethAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator twentiethAttribute_ -->
	 * ScalaDoc of twentiethAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentiethAttribute_(new_twentiethAttribute: Int) {
		this._twentiethAttribute = new_twentiethAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor twentyFirstAttribute -->
	 * ScalaDoc of _twentyFirstAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentyFirstAttribute(): Integer = {
		return this._twentyFirstAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator twentyFirstAttribute_ -->
	 * ScalaDoc of twentyFirstAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentyFirstAttribute_(new_twentyFirstAttribute: Integer) {
		this._twentyFirstAttribute = new_twentyFirstAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor twentySecondAttribute -->
	 * ScalaDoc of _twentySecondAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentySecondAttribute(): InvocationTargetException = {
		return this._twentySecondAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator twentySecondAttribute_ -->
	 * ScalaDoc of twentySecondAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentySecondAttribute_(new_twentySecondAttribute: InvocationTargetException) {
		this._twentySecondAttribute = new_twentySecondAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor twentyThirdAttribute -->
	 * ScalaDoc of _twentyThirdAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentyThirdAttribute(): Class = {
		return this._twentyThirdAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator twentyThirdAttribute_ -->
	 * ScalaDoc of twentyThirdAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentyThirdAttribute_(new_twentyThirdAttribute: Class) {
		this._twentyThirdAttribute = new_twentyThirdAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor twentyFourthAttribute -->
	 * ScalaDoc of _twentyFourthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentyFourthAttribute(): Object = {
		return this._twentyFourthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator twentyFourthAttribute_ -->
	 * ScalaDoc of twentyFourthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentyFourthAttribute_(new_twentyFourthAttribute: Object) {
		this._twentyFourthAttribute = new_twentyFourthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor twentyFifthAttribute -->
	 * ScalaDoc of _twentyFifthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentyFifthAttribute(): Long = {
		return this._twentyFifthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator twentyFifthAttribute_ -->
	 * ScalaDoc of twentyFifthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentyFifthAttribute_(new_twentyFifthAttribute: Long) {
		this._twentyFifthAttribute = new_twentyFifthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor twentySixthAttribute -->
	 * ScalaDoc of _twentySixthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentySixthAttribute(): Long = {
		return this._twentySixthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator twentySixthAttribute_ -->
	 * ScalaDoc of twentySixthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentySixthAttribute_(new_twentySixthAttribute: Long) {
		this._twentySixthAttribute = new_twentySixthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor twentySeventhAttribute -->
	 * ScalaDoc of _twentySeventhAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentySeventhAttribute(): Map = {
		return this._twentySeventhAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator twentySeventhAttribute_ -->
	 * ScalaDoc of twentySeventhAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentySeventhAttribute_(new_twentySeventhAttribute: Map) {
		this._twentySeventhAttribute = new_twentySeventhAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor twentyEighthAttribute -->
	 * ScalaDoc of _twentyEighthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentyEighthAttribute(): Resource = {
		return this._twentyEighthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator twentyEighthAttribute_ -->
	 * ScalaDoc of twentyEighthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentyEighthAttribute_(new_twentyEighthAttribute: Resource) {
		this._twentyEighthAttribute = new_twentyEighthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor twentyNinthAttribute -->
	 * ScalaDoc of _twentyNinthAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentyNinthAttribute(): ResourceSet = {
		return this._twentyNinthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator twentyNinthAttribute_ -->
	 * ScalaDoc of twentyNinthAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def twentyNinthAttribute_(new_twentyNinthAttribute: ResourceSet) {
		this._twentyNinthAttribute = new_twentyNinthAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor thirtiethAttribute -->
	 * ScalaDoc of _thirtiethAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def thirtiethAttribute(): Short = {
		return this._thirtiethAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator thirtiethAttribute_ -->
	 * ScalaDoc of thirtiethAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def thirtiethAttribute_(new_thirtiethAttribute: Short) {
		this._thirtiethAttribute = new_thirtiethAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor thirtyFirstAttribute -->
	 * ScalaDoc of _thirtyFirstAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def thirtyFirstAttribute(): Short = {
		return this._thirtyFirstAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator thirtyFirstAttribute_ -->
	 * ScalaDoc of thirtyFirstAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def thirtyFirstAttribute_(new_thirtyFirstAttribute: Short) {
		this._thirtyFirstAttribute = new_thirtyFirstAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor thirtySecondAttribute -->
	 * ScalaDoc of _thirtySecondAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def thirtySecondAttribute(): String = {
		return this._thirtySecondAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator thirtySecondAttribute_ -->
	 * ScalaDoc of thirtySecondAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def thirtySecondAttribute_(new_thirtySecondAttribute: String) {
		this._thirtySecondAttribute = new_thirtySecondAttribute;
	}
	
	/**
	 * <!-- Start of user code for the accessor thirtyThirdAttribute -->
	 * ScalaDoc of _thirtyThirdAttribute.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def thirtyThirdAttribute(): TreeIterator = {
		return this._thirtyThirdAttribute;
	}
	
	/**
	 * <!-- Start of user code for the mutator thirtyThirdAttribute_ -->
	 * ScalaDoc of thirtyThirdAttribute_.
	 * @inheritdoc
	 * <!-- End of user code -->
	 */
	def thirtyThirdAttribute_(new_thirtyThirdAttribute: TreeIterator) {
		this._thirtyThirdAttribute = new_thirtyThirdAttribute;
	}
}
