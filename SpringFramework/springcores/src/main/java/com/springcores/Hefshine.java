package com.springcores;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Hefshine {
	private String name;
	private int fees;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public Hefshine() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Hefshine [name=" + name + ", fees=" + fees + "]";
	}
	@PostConstruct
	public void Start() {
		System.out.println("Starting");
	}
	@PreDestroy
	public void End()
	{
		System.out.println("Ending");
	}

}
