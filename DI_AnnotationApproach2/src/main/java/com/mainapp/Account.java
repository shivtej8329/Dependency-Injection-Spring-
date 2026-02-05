package com.mainapp;

import org.springframework.stereotype.Component;

@Component
public class Account {

	private int an = 10;;
	private String bankName = "SBi";

	public Account() {

	}

	public Account(int an, String bankName) {
		this.an = an;
		this.bankName = bankName;
	}

	public void setAn(int an) {
		this.an = an;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "Account [an=" + an + ", bankName=" + bankName + "]";
	}

}
