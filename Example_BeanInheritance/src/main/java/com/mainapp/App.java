package com.mainapp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

		Employee e = (Employee) ac.getBean("employee");
		e.test();
		System.out.println(e);

		Manager m = (Manager) ac.getBean("manager");
		System.out.println(m);
		Student s = (Student) ac.getBean("student");
		System.out.println(s);

		ac.close();

	}
}
