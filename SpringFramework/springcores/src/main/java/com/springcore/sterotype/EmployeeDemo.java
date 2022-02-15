package com.springcore.sterotype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDemo {

	public static void main(String[] args) {
		   AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/sterotype/configsterotype.xml");
                         Employee employee=context.getBean("employee",Employee.class);
                         System.out.println(employee);
	}

}
