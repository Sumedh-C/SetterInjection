package com.program2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) 
	{
		
		ApplicationContext context1 =new ClassPathXmlApplicationContext("ApplicationContext2.xml");
		
		Employee std=(Employee)context1.getBean("employee1");
//		std.setEmployeeId(101);
//		std.setEmployeeName("TheWeeknd");
//		std.setEmloyeeAddress("Los angelis");
		System.out.println(std.toString());
	}

}
