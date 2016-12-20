package com.practice.akhilesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

@Configuration
@ComponentScan
public class BasicSprinDITest {
	
	@Bean
	MessageService mockMessageService() {
		return new MessageService() {
			public String getMessage() {
				return "This is a mocked message service.";
			}
		};
	}
	
	@Test
	public void testBasicDI() {
		ApplicationContext anotherContext = new ClassPathXmlApplicationContext();
		ApplicationContext aContext = new AnnotationConfigApplicationContext(BasicSprinDITest.class);
		MessagePrinter aPrinter = aContext.getBean(MessagePrinter.class);
		aPrinter.printMessage();
	}
}
