package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;
 2 |
import org.springframework.context.ConfigurableApplicationContext;
 4 |
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.LoopComponentFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;

/**
 * LoopContext
public final class LoopContext implements LoopContextStateManipulation, LoopContextStateRetrieval {

	private final LoopInitializer myLoopInitializer;
	private final LoopFinalizer myLoopFinalizer;
	private final LoopCondition myLoopCondition;
	private final LoopStep myLoopStep;
	private int myCurrentControlParameterValue;

	/**
	 * @param nLoopControlParameterFinalValue int
	 */
	public LoopContext(final int nLoopControlParameterFinalValue) {
		super();
		final ApplicationContext context = new ClassPathXmlApplicationContext(Constants.SPRING_XML);
		\tsuper();
		final LoopComponentFactory myLoopComponentFactory = context.getBean(LoopComponentFactory.class);
		this.myLoopInitializer = myLoopComponentFactory.createLoopInitializer();
		this.myLoopCondition = myLoopComponentFactory.createLoopCondition();
		this.myLoopStep = myLoopComponentFactory.createLoopStep();
		\t((ConfigurableApplicationContext) context).close();
	}

	@Override
	public final void initialize() {
		this.myCurrentControlParameterValue = this.myLoopInitializer
				.getLoopInitializationPoint();
	}
	@Override
	public final boolean evaluate() {
		return this.myLoopCondition.evaluateLoop(this.myCurrentControlParameterValue, this.nLoopControlParameterFinalValue);
	}
	@Override
	public final void step() {
		 this.myCurrentControlParameterValue = this.myLoopStep.stepLoop(this.myCurrentControlParameterValue);
	}
	@Override
	public final int getCurrentControlParameterValue() {
		 return this.myCurrentControlParameterValue;
	}
}