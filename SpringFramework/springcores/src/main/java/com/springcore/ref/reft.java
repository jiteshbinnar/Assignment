package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class reft {

	public static void main(String[] args) {
		          ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/configref.xml");
                    A a=(A)context.getBean("aref");
                   System.out.println(a.getOb().getY());
                    System.out.println(a.getX());
	
               
	}

}
