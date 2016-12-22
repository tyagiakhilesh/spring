package com.practice.akhilesh.override.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyCustomBeanPostProcessorImpl implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(String.format("postProcessBeforeInitialization: Got bean of class %s with bean name %s", bean.getClass().getName(), beanName));
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(String.format("postProcessAfterInitialization: Got bean of class %s with bean name %s", bean.getClass().getName(), beanName));
		return bean;
	}
}
