package com.mainapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	// @Value("1000")
	private int eid;

	// @Value("raju")
	private String ename;

	// @Value("${db.url}")
	private String url;

	public Employee() {
		System.out.println("Constructor Injection : non-parameterized");
	}

	// @Autowired
	public Employee(@Value("1000") int eid, @Value("raju") String ename, @Value("${db.url}") String url) {
		System.out.println("Constructor Injection");
		this.eid = eid;
		this.ename = ename;
		this.url = url;
	}

	@Value("1000")
	public void setEid(int eid) {
		this.eid = eid;
	}

	@Value("raju")
	public void setEname(String ename) {
		this.ename = ename;
	}

	@Value("${db.url}")
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", url=" + url + "]";
	}

}
