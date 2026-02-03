package com.mainapp;

public class Employee {

	private String url;
	private int countryCode;
	private int id;

	public Employee() {
		System.out.println("Employee Bean Instanciated");
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void test() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Employee test running");
		}
	}

	@Override
	public String toString() {
		return "Employee [url=" + url + ", countryCode=" + countryCode + ", id=" + id + "]";
	}

}
