package com.springcore.constructor;

public class Addition {
private int a;
private int b;
public Addition(int a, int b) {
	super();
	System.out.println("int constructor");
	this.a = a;
	this.b = b;
}
public Addition(double a, double b) {
	System.out.println("double constructor");
	this.a = (int)a;
	this.b = (int)b;
}
public void doSum() {
	System.out.println("value of a is "+a);
	System.out.println("value of b is "+b);
	System.out.println("sum is: "+(this.a+this.b));
}


}
