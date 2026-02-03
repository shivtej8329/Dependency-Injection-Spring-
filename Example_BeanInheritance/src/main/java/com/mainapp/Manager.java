package com.mainapp;

public class Manager {

	private String url;
	private int countryCode;
	private int mid;

	public void setUrl(String url) {
		this.url = url;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public Manager() {
		System.out.println("Manager Bean Instanciated");
	}

	public void test() {
		System.out.println("Manager tested");
	}

	@Override
	public String toString() {
		return "Manager [url=" + url + ", countryCode=" + countryCode + ", mid=" + mid + "]";
	}

}
