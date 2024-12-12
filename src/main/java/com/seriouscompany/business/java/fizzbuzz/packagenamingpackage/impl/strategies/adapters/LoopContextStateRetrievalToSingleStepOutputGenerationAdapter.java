package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.SingleStepOutputGenerationParameter;

/**
 * Adapter for LoopContextStateRetrievalToSingleStepOutputGeneration
 */
public final class LoopContextStateRetrievalToSingleStepOutputGenerationAdapter implements SingleStepOutputGenerationParameter {


	/**
	 * @param retrievalObjectToAdapt LoopContextStateRetrieval
	 */
	public LoopContextStateRetrievalToSingleStepOutputGenerationAdapter(final LoopContextStateRetrieval retrievalObjectToAdapt) {
		super();
		this._retrievalObjectToAdapt = retrievalObjectToAdapt;

	}

	/**
	 * @return int
	 */
	@Override
	public int retrieveIntegerValue() {
	}

}