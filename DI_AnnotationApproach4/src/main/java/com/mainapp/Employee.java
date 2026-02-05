package com.mainapp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	//@Value("#{40 + 10}")
	
	@Value("#{test.checkSalary()}")
	private int eid;

	//@Value("#{'Kaju'}") -> direct value
	//@Value("#{test.doTest}") -> instance method
	//@Value("#{T(com.mainapp.TestStatic).doTestStatic()}") ->  static method
	//@Value("   #{   test.checkSalary() > 500 ? 'valid' : 'invalid'  }   ")  -> ternary operator
	
	@Value("#{'Hey'}")
	private String ename;

	@Value("#{environment['db.url']}")
	private String url;

	public Employee() {
		System.out.println("Constructor Injection : non-parameterized");
	}

	public Employee(int eid, String ename, String url) {
		System.out.println("Constructor Injection");
		this.eid = eid;
		this.ename = ename;
		this.url = url;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", url=" + url + "]";
	}

}
