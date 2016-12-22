package com.practice.akhilesh;

import java.util.Properties;

public class ChildBean {
	private Properties beanProperties;

	public Properties getBeanProperties() {
		return beanProperties;
	}

	public void setBeanProperties(Properties beanProperties) {
		this.beanProperties = beanProperties;
	}
	
	public void destroy() {
		System.out.println("Destroy method is called");
	}
}
