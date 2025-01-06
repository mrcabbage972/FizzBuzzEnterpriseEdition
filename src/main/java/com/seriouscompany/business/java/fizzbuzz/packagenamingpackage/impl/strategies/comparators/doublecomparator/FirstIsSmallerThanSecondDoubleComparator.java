package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.doublecomparator;

import org.springframework.stereotype.Service;

/**
 * Comparator for FirstIsSmallerThanSecondDouble
 */
@Service
public class FirstIsSmallerThanSecondDoubleComparator {

	/**
	 * @param dbFirstDoubleToCompare double
	 * @param dbSecondDoubleToCompare double
	 * @return boolean
	 */
	public  boolean FirstIsSmallerThanSecond(double dbFirstDoubleToCompare, double dbSecondDoubleToCompare) { return dbFirstDoubleToCompare < dbSecondDoubleToCompare; }
	}
}