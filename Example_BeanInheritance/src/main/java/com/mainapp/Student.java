package com.mainapp;

public class Student {

	private String url;
	private int countryCode;
	private int roll;

	public void setUrl(String url) {
		this.url = url;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public Student() {
		System.out.println("Student Bean Instanciated");
	}

	public void test() {
		System.out.println("Student tested");
	}

	@Override
	public String toString() {
		return "Student [url=" + url + ", countryCode=" + countryCode + ", roll=" + roll + "]";
	}

}
