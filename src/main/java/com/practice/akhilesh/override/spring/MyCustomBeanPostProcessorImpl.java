package com.practice.akhilesh.override.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.practice.akhilesh.ChildBean;

public class MyCustomBeanPostProcessorImpl extends ChildBean implements BeanPostProcessor {
	
	public void init() {
		System.out.println("This is the method that shall be called during initialization phase"
				+ " but before BeanPostProcessor methods.");	
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(String.format("Got bean of class %s with bean name %s", bean.getClass().getName(), beanName));
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(String.format("Got bean of class %s with bean name %s", bean.getClass().getName(), beanName));
		return bean;
	}
}
