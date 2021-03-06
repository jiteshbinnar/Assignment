package com.springcore.standalone;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/standalone/config.xml");
                     Student student =(Student)context.getBean("student");
                     System.out.println(student);
                     System.out.println(student.getName().getClass());
                     Student student1 =(Student)context.getBean("student1");
                     System.out.println(student1);
                     Student student2 =(Student)context.getBean("student2");
                     System.out.println(student2.getCoursesFees());
                     Student student3 =(Student)context.getBean("student3");
                  System.out.println(student3.getProperties());
	}

}
