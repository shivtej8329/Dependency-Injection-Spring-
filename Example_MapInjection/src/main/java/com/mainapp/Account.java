package com.mainapp;

public class Account implements Comparable<Account>  {

	private int an;
	private String bankName;

	public Account() {

	}

	public void setAn(int an) {
		this.an = an;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Account(int an, String bankName) {
		super();
		this.an = an;
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "Account [an=" + an + ", bankName=" + bankName + "]";
	}

	@Override
    public int compareTo(Account o) {
        return Integer.compare(this.an, o.an);
    }

}
