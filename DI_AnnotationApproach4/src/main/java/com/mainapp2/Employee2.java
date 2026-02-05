package com.mainapp2;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee2 {

	@Value("#{    {'shiv','raju','kaju'}    }")
	private List<String> list;

	@Value("#{    {'shiv','raju','kaju'}    }")
	private Set<String> set;

	@Value("#{    {'key1':'shiv','key2':'raju','key3':'kaju'}    }")
	private Map<String, String> map;

	@Value("#{ new int[]{1,2,3,4,5} }")
	private int[] array;

	public Employee2() {

	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	@Override
	public String toString() {
		return "Employee2 [list=" + list + ", set=" + set + ", map=" + map + "]";
	}

}
