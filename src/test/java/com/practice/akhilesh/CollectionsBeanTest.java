package com.practice.akhilesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CollectionsBeanTest {

	@Test
	public void testACollectionBeanCreation() {
		@SuppressWarnings("resource")
		ApplicationContext aContext = new ClassPathXmlApplicationContext("resources/collections.test.xml");
		ABeanHavingCollections aBean = aContext.getBean("aBeanHavingCollections", ABeanHavingCollections.class);
		Assert.assertEquals(aBean.name, "akhilesh", "Value should be 'akhilesh'");
		Assert.assertTrue(aBean.aMap.containsKey("firstMapKey"));
		Assert.assertTrue(aBean.aMap.containsKey("secondMapKey"));
		Assert.assertTrue(aBean.aMap.get("firstMapKey").equals("firstMapKeyValue"));
		Assert.assertTrue(aBean.aMap.get("secondMapKey").equals("secondMapKeyValue"));
	}
}
