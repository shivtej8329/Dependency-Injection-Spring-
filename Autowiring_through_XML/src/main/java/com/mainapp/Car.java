package com.mainapp;

public class Car {

	private int cn;
	private String carName;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int cn, String carName) {
		super();
		this.cn = cn;
		this.carName = carName;
	}

	public void setCn(int cn) {
		this.cn = cn;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public String toString() {
		return "Car [cn=" + cn + ", carName=" + carName + "]";
	}

}
