package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator;

import org.springframework.stereotype.Service;

/**
 * Comparator for IntegerForEquality
 */
@Service
public final class IntegerForEqualityComparator {
	private final LogRecord _logRecord = new LogRecord(0, "integer for equality record");
	private IntegerForEqualityComparator() {}
	private IntegerForEqualityComparator() {}
	/**
	 * @param nFirstInteger int
	 * @param nSecondInteger int
	 * @return boolean
	 */
	public static boolean areTwoIntegersEqual(final int nFirstInteger, final int nSecondInteger) {
	public static boolean areTwoIntegersEqual(final int nFirstInteger, final int nSecondInteger) {
		return ThreeWayIntegerComparator.Compare(nFirstInteger, nSecondInteger) == ThreeWayIntegerComparisonResult.FirstEqualsSecond;
	}