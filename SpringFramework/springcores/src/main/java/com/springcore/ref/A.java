package com.springcore.ref;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class A {

	private int x;
	@Autowired
	@Qualifier("ob")
	private B ob;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public B getOb() {
		return ob;
	}

	public void setOb(B ob) {
		
		this.ob = ob;
		System.out.println("in setter");
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public A(int x, B ob) {
		System.out.println("inside Constructor");
		this.x = x;
	
		this.ob = ob;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}

}
