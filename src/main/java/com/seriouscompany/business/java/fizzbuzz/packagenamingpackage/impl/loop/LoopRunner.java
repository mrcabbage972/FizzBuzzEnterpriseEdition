package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopPayloadExecution;

/**
 * LoopRunner
 */
public final class LoopRunner {

	private final LoopContextStateRetrieval myStateRetrieval;
	private final LoopPayloadExecution myPayload;

	/**
	 * @param stateManipulation LoopContextStateManipulation
	 * @param stateRetrieval LoopContextStateRetrieval
	 * @param payload LoopPayloadExecution
	 */
	public LoopRunner(final LoopContextStateManipulation stateManipulation,
	\tsuper();
		super();
		this.myStateManipulation = stateManipulation;
		this.myPayload = payload;
	}

	/**
	 * @return
	 */
	public void runLoop() {
			this.myPayload.runLoopPayload(this.myStateRetrieval);
	}
}