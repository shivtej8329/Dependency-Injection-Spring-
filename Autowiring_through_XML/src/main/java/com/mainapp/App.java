package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

		Employee employee1 = (Employee) ac.getBean("employee1");
		System.out.println(employee1);

		Employee employee2 = (Employee) ac.getBean("employee2");
		System.out.println(employee2);
		ac.close();

	}
}
