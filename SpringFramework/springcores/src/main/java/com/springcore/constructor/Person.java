package com.springcore.constructor;

import java.util.List;

public class Person {
	private String name;
	private int id;
	private Address Ad;
	private List<String>month;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int id,Address Ad,List<String> month) {
		super();
		this.name = name;
		this.id = id;
		this.Ad=Ad;
		this.month=month;
	}
	@Override
	public String toString() {
	
		return this.name+" "+this.id+" "+this.Ad+" "+this.month;
	}
	

}
