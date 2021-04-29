package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService customerService = applicationContext.getBean("service",ICustomerService.class);
		

		customerService.add();
	}

}
