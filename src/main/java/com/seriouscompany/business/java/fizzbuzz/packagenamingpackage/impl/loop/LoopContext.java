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
	private final LoopStep myLoopStep;
	private final LoopFinalizer myLoopFinalizer;
	private final LoopCondition myLoopCondition;
	private int myCurrentControlParameterValue;

	/**
	 * @param nLoopControlParameterInitialValue int
	 */
	public LoopContext(final int nLoopControlParameterFinalValue) {
		super();
		final ApplicationContext context = new ClassPathXmlApplicationContext(Constants.SPRING_XML);
		final LoopComponentFactory myLoopComponentFactory = context.getBean(Constants.LOOP_COMPONENT_FACTORY,
--- a/src/main/java/com/seriouscompany/business/java/fizzbuzz/packagenamingpackage/impl/loop/LoopContext.java
+ b/src/main/java/com/seriouscompany/business/java/fizzbuzz/packagenamingpackage/impl/loop/LoopContext.java
		LoopComponentFactory.class);
		this.myLoopInitializer = myLoopComponentFactory.createLoopInitializer();
		this.myLoopStep = myLoopComponentFactory.createLoopStep();
		this.myLoopFinalizer = myLoopComponentFactory.createLoopFinalizer(nLoopControlParameterFinalValue);
		this.myLoopCondition = myLoopComponentFactory.createLoopCondition();
		((ConfigurableApplicationContext) context).close();
	}

	/**
	 *
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
	 *
	 * @param nLoopControlParameterInitialValue int
	 * @param nLoopControlParameterFinalValue int
	 * @param sFizzBuzzString String
	 * @param sFizzString String
	 * @param sBuzzString String
	 * @param sFizzBuzzThreeString String
	 * @param sFizzBuzzFourString String
	 * @param sFizzStringFourString String
	 * @param sBuzzStringFourString String
	 * @param sFizzStringFiveString String
	 * @param sBuzzStringFiveString String
	 * @param sFizzStringSixString String
	 * @param sBuzzStringSixString String
	 * @param sFizzStringSevenString String
	 * @param sBuzzStringSevenString String
	 * @param sFizzBuzzEightString String
	 * @param sFizzStringEightString String
	 * @param sBuzzStringEightString String
	 */
	public LoopContext(final int nLoopControlParameterInitialValue, final int nLoopControlParameterFinalValue, final String sFizzBuzzString, final String sFizzString, final String sBuzzString, final String sFizzBuzzThreeString,  final String sFizzBuzzFourString, final String sFizzStringFourString, final String sBuzzStringFourString, final String sFizzStringFiveString, final String sBuzzStringFiveString, final String sFizzStringSixString, final String sBuzzStringSixString, final String sFizzStringSevenString, final String sBuzzStringSevenString, final String sFizzBuzzEightString,  final String sFizzStringEightString, final String sBuzzStringEightString) {
		super();

	/**
	 * @return int
	 */
	@Override
	public int getControlParameter() {
		return this.myCurrentControlParameterValue;
	}

}