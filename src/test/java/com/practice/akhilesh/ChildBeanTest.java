package com.practice.akhilesh;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChildBeanTest {

	@Test
	public void testChildBean() {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("resources/childBean.test.xml");
		ChildBean aBean = aContext.getBean("child", ChildBean.class);
		Properties prop = aBean.getBeanProperties();
		Assert.assertTrue(prop.getProperty("adminEmail").equals("admin@hpe.com"));
		Assert.assertTrue(prop.getProperty("secondaryEmail").equals("akhilesh.tyagi@hpe.com"));
	}
}
