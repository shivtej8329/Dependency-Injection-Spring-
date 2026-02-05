package com.mainapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Autowired
	private Account account;

	@Autowired
	@Qualifier("list1")
	private List<String> listOfBooks;

	public Employee() {
		System.out.println("Employee Bean Instantiation");
	}

	//@Autowired
	public Employee(Account account, List<String> listOfBooks) {
		System.out.println("Constructor injection");
		this.account = account;
		this.listOfBooks = listOfBooks;
	}

	//@Autowired
	public void setAccount(Account account) {
		System.out.println("Setter injection");
		this.account = account;
	}

	//@Autowired
	public void setListOfBooks(List<String> listOfBooks) {
		System.out.println("Setter injection");
		this.listOfBooks = listOfBooks;
	}

	@Override
	public String toString() {
		return "Employee [account=" + account + ", listOfBooks=" + listOfBooks + "]";
	}

}
