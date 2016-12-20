package com.practice.akhilesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CollectionsBeanTest {

	@Test
	public void testACollectionBeanCreation() {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("resources/collections.test.xml");
		ABeanHavingCollections aBean = aContext.getBean("aBeanHavingCollections", ABeanHavingCollections.class);
		Assert.assertEquals(aBean.name, "akhilesh", "Value should be 'akhilesh'");
	}
}
