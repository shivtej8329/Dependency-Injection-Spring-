package com.mainapp;

import java.util.List;

public class Employee {

	private int eid;
	private String ename;
	private List<String> listOfBooks;

	public Employee() {
		System.out.println("Employee Bean Instanciated");
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setListOfBooks(List<String> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}
	
	

	public List<String> getListOfBooks() {
		return listOfBooks;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", listOfBooks=" + listOfBooks + "]";
	}

}
