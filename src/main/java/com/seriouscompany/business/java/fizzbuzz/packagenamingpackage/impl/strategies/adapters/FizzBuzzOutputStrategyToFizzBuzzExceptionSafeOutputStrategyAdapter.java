package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzExceptionSafeOutputStrategy;

/**
 * Adapter for FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategy
 */
public final class FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter implements FizzBuzzExceptionSafeOutputStrategy {

	private final FizzBuzzOutputStrategy _fizzBuzzOutputStrategy;

	/**
	 * @param fizzBuzzOutputStrategy FizzBuzzOutputStrategy
	 */
	public FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(final FizzBuzzOutputStrategy fizzBuzzOutputStrategy) {
		this._fizzBuzzOutputStrategy = fizzBuzzOutputStrategy;
	}

	/**
	 * @param outputStringToOutput String
	 * @return void
	 */
	@Override
	public void output(final String outputStringToOutput) {
		try {
		this._fizzBuzzOutputStrategy.output(outputStringToOutput);

}