package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.publisher.UserSendEmailEventPublisher;



public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserSendEmailEventPublisher mailPublisher= applicationContext.getBean("userSendEmailEventPublisher",UserSendEmailEventPublisher.class);
		mailPublisher.setMessage();
		
		applicationContext.close();

	}

}
