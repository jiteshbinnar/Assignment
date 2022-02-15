package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Trsting {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/configcollection.xml");
                        Emp emp1=(Emp)context.getBean("Emp1");
		               System.out.println(emp1.getId());
		                 System.out.println(emp1.getMarks());
		                 System.out.println(emp1.getProps()
		                		 );
	}

}
