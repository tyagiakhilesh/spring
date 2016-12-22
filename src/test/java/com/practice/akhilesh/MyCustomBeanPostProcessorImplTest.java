package com.practice.akhilesh;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class MyCustomBeanPostProcessorImplTest {
	@Test
	public void testBeanPostProcessor() {
		// NOTE: I am using ConfigurableApplicationContext
		@SuppressWarnings("resource")
		ConfigurableApplicationContext aContext = new ClassPathXmlApplicationContext("resources/beanpostprocessorandinit.xml");
		aContext.registerShutdownHook();
	}
}
