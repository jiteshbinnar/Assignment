package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {

	public static void main(String[] args) {
		  ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructor/configcons.xml");
                         Person p=(Person)context.getBean("per");
                         System.out.println(p.toString());
                         Addition a=(Addition)context.getBean("Add");
                         a.doSum();
                
	}

}
