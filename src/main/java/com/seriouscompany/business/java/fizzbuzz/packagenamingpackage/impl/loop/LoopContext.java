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
	private final LoopStep myLoopStep;

	/**
	 * @param nLoopControlParameterFinalValue int
	 */
	public LoopContext(final int nLoopControlParameterFinalValue) {
		super();
		final ApplicationContext context = new ClassPathXmlApplicationContext(Constants.SPRING_XML);
		final LoopComponentFactory myLoopComponentFactory = context.getBean(Constants.LOOP_COMPONENT_FACTORY,
				Constants.LOOP_COMPONENT_FACTORY, LoopComponentFactory.class);
		this.myLoopFinalizer = myLoopComponentFactory.createLoopFinalizer(nLoopControlParameterFinalValue);
		this.myLoopCondition = myLoopComponentFactory.createLoopCondition();
		this.myLoopStep = myLoopComponentFactory.createLoopStep();
		((ConfigurableApplicationContext) context).close();

	/**
	 * @return void
	 */
	@Override
	public void start() {
		this.myCurrentControlParameterValue =
				this.myLoopStep.getLoopInitializationPoint();
	}

	/**
	 * @return boolean
	 */
	}

	/**
	 * @return void
	 */
	@Override
	public void proceed() {
		this.myCurrentControlParameterValue =
				this.myLoopStep.stepForward(this.myCurrentControlParameterValue);
	}

	/**
	 * @return void
	 */
	@Override
	public void finish() {
		this.myLoopFinalizer.finalizeLoop(this.myCurrentControlParameterValue);

		((ConfigurableApplicationContext) this.context).close();
	}

	/**
	 * @return int
	 */
	@Override
	public int getControlParameter() {
		return this.myCurrentControlParameterValue;
	}

}