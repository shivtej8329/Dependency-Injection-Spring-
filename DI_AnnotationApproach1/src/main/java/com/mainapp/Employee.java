package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Component("emp")
//@Lazy
//@Scope(scopeName = "prototype")
public class Employee {

	public Employee() {
		System.out.println("Bean Instantiation");
	}

	@PostConstruct
	public void init() {
		System.out.println("init method");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy method");
	}

	public void test() {
		System.out.println("Bean tested");
	}

}
