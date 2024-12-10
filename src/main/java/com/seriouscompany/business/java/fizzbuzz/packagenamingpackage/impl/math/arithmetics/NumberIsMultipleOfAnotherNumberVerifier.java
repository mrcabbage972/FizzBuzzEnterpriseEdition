package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.ApplicationContextHolder;
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
	private ApplicationContextHolder applicationContextHolder;

	/**
	 * @return
	 */
	@PostConstruct
	public void init() {
 * 		integerDivider = applicationContextHolder.getApplicationContext().getBean(IntegerDivider.class);
 * 	}
	/**
	private IntegerDivider integerDivider;
	 * @return
	 */
	public boolean numberIsMultipleOfAnotherNumber(final int nFirstNumber, final int nSecondNumber) {
					nFirstNumber)) {
 * 				return true;
		} catch (final ArithmeticException ae) {
			return false;
		}

}