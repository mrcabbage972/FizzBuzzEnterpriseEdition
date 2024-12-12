package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.IntegerForEqualityComparator;

/**
 * NumberIsMultipleOfAnotherNumberVerifier
 */
@Service
public class NumberIsMultipleOfAnotherNumberVerifier {

	/**
	 * @param firstNumber
	 * @param secondNumber
	 * @return true if the first number is a multiple of the second number and false otherwise.
	 */
	public boolean isMultiple(final int firstNumber, final int secondNumber) {
		return (firstNumber % secondNumber) == 0;
	}

}