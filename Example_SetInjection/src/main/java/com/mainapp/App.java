package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Employee emp = (Employee) ac.getBean("emp");

		System.out.println(emp.getSetOfBooks().getClass());
		System.out.println(emp);
		ac.close();

	}
}
