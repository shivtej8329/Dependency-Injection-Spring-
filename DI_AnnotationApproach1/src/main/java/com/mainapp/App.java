package com.mainapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mainapp.config.MyConfiguration;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);

		Employee bean1 = ac.getBean(Employee.class);
		System.out.println(bean1);
		bean1.test();

		Employee bean2 = ac.getBean(Employee.class);
		System.out.println(bean2);

		ac.close();
	}
}
