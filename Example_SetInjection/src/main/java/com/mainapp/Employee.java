package com.mainapp;

import java.util.Set;

public class Employee {

	private int eid;
	private String ename;
	private Set<Account> setOfBooks;

	public Employee() {
		System.out.println("Employee Bean Instanciated");
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Set<Account> getSetOfBooks() {
		return setOfBooks;
	}

	public void setSetOfBooks(Set<Account> setOfBooks) {
		this.setOfBooks = setOfBooks;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", setOfBooks=" + setOfBooks + "]";
	}

}
