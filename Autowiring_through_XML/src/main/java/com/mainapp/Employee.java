package com.mainapp;

import java.util.List;


public class Employee {

	private int eid;
	private Account account;
	private Car car;
	private List<String> listOfBooks;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, Account account, Car car, List<String> listOfBooks) {
		super();
		this.eid = eid;
		this.account = account;
		this.car = car;
		this.listOfBooks = listOfBooks;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void setListOfBooks(List<String> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}

	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", account=" + account + ", car=" + car + ", listOfBooks=" + listOfBooks + "]";
	}

}
