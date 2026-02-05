package com.mainapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mainapp.config.MyConfiguration;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);

		Employee bean1 = ac.getBean(Employee.class);
		System.out.println(bean1);

		ac.close();
	}
}
