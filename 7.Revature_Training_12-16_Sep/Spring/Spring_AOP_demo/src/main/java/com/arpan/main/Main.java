package com.arpan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arpan.service.MyService;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring_aop.xml");
		MyService service=(MyService) context.getBean("service");
		
		service.validate1();
		service.validate2();
		service.validUserPassword("fdadsfdsfd");
		service.transact();
		
		try {
			service.testException(19);
		} catch (Exception e) {
		}

	}

}
