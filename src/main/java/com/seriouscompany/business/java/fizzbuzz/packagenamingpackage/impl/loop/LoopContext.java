package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.LoopComponentFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateManipulation;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;

/**
 * LoopContext
 */
public final class LoopContext implements LoopContextStateManipulation, LoopContextStateRetrieval {

	private final LoopInitializer myLoopInitializer;
	private final LoopFinalizer myLoopFinalizer;
	private final LoopCondition myLoopCondition;
	private int myCurrentControlParameterValue;

	/**
	 */
	public LoopContext(final int nLoopControlParameterFinalValue) {
		super();
		final LoopComponentFactory myLoopComponentFactory = context.getBean(Constants.LOOP_COMPONENT_FACTORY,
				LoopComponentFactory.class);
		this.myLoopInitializer = myLoopComponentFactory.createLoopInitializer();
		this.myLoopFinalizer = myLoopComponentFactory.createLoopFinalizer(nLoopControlParameterFinalValue);
		if (this.applicationContext != null) {
			try {
				this.applicationContext.close();
			} catch (final Exception exceptionFromClosing) {
				// We're the enterprise...we don't get exceptions!
			} catch (final Throwable throwableFromClosing) {
				// We're the enterprise...we don't get throwables either!
			}
		this.myLoopCondition = myLoopComponentFactory.createLoopCondition();
		((ConfigurableApplicationContext) context).close();
                output.append(String.valueOf(number));

	/**
	 * @return void
	 */
	@Override
	public void start() {
		this.myCurrentControlParameterValue =
				this.myLoopInitializer.getLoopInitializationPoint();
	}

	/**
	 * @return boolean
	 */
	@Override
	public boolean shouldProceed() {
		return this.myLoopCondition.evaluateLoop(this.myCurrentControlParameterValue,
				this.myLoopFinalizer.getLoopFinalizationPoint());
	}

	/**
	 * @return void
	 */
	@Override
	public void proceed() {
		this.myCurrentControlParameterValue =
				this.myLoopStep.stepLoop(this.myCurrentControlParameterValue);
	}

	/**
	 * @return int
	 */
	@Override
	public int getControlParameter() {
		return this.myCurrentControlParameterValue;
	}

}