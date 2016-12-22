package com.practice.akhilesh;

import java.util.Properties;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.practice.akhilesh.override.spring.MyCustomBeanPostProcessorImpl;

public class MyCustomBeanPostProcessorImplTest {
	@Test
	public void testBeanPostProcessor() {
		// NOTE: I am using ConfigurableApplicationContext
		@SuppressWarnings("resource")
		ConfigurableApplicationContext aContext = new ClassPathXmlApplicationContext("resources/beanpostprocessorandinit.xml");
		MyCustomBeanPostProcessorImpl aBean = aContext.getBean("myChildBeanWithPostProcessor", MyCustomBeanPostProcessorImpl.class);
		Properties prop = aBean.getBeanProperties();
		Assert.assertTrue(prop.getProperty("secondaryEmail").equals("akhilesh.tyagi@hpe.com"));
		Assert.assertTrue(prop.getProperty("overridenInChild").equals("ChildSpcificProperty"));
		// This causes container to call shutdown hooks.
		aContext.registerShutdownHook();
	}
}
