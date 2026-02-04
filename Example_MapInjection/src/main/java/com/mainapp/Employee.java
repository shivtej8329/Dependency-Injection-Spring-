package com.mainapp;

import java.util.Map;
import java.util.Set;

public class Employee {

	private int eid;
	private String ename;
	private Map<String, Account> mapOfBooks;

	public Employee() {
		System.out.println("Employee Bean Instanciated");
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Map<String, Account> getMapOfBooks() {
		return mapOfBooks;
	}

	public void setMapOfBooks(Map<String, Account> mapOfBooks) {
		this.mapOfBooks = mapOfBooks;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", mapOfBooks=" + mapOfBooks + "]";
	}

}
