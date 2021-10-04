package com.arpan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arpan.dao.EmployeeDAO;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring_hibernate_beans.xml");
		
//		EmployeeDAO employeeDAO=(EmployeeDAO) context.getBean("employeeDAO");
	}

}
