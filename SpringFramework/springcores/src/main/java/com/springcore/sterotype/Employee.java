package com.springcore.sterotype;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("employee")
public class Employee {
	@Value("Jitesh Binnar")
    private String name;
	@Value("IT")
	private List<String>deptAndSalary;
	public Employee() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getDeptAndSalary() {
		return deptAndSalary;
	}
	public void setDeptAndSalary(List<String> deptAndSalary) {
		this.deptAndSalary = deptAndSalary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", deptAndSalary=" + deptAndSalary + "]";
	}

}
