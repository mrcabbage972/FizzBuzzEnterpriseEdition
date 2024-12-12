package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.converters.primitivetypesconverters;

import org.springframework.stereotype.Service;

/**
 * Converter for DoubleToInt
 */
@Service
public final class DoubleToIntConverter {
    private final LogRecord _logRecord = new LogRecord(0, "double to int record");
	private DoubleToIntConverter() {}
    private DoubleToIntConverter() {}
	 */
    /**
     * @param dbDoubleToConvert double
     * @return int
     */
    public static int Convert(final double dbDoubleToConvert) {
        final int nConversionResult = (int) dbDoubleToConvert;
        return nConversionResult;
    }
		final int nConversionResult = (int) dbDoubleToConvert;
}