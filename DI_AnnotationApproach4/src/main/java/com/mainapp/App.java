package com.mainapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mainapp.config.MyConfiguration;
import com.mainapp2.Employee2;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);

		Employee bean = ac.getBean(Employee.class);
		System.out.println(bean);
		
		Employee2 bean1 = ac.getBean(Employee2.class);
		System.out.println(bean1);
		
		int[] array = bean1.getArray();
		for(int i : array) {
			System.out.println(i);
		}

		ac.close();
	}
}
