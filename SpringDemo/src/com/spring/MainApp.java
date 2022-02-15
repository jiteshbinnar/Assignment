package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
       ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("com/spring/spring.config.xml");
        Book book =(Book) context.getBean("book");
        System.out.println(book);


        Book book1=(Book) context.getBean("book1");
        System.out.println(book1);




     Author author=(Author) context.getBean("author");
        System.out.println(author);

        Demo demo=(Demo) context.getBean("demo");
       demo.sum();


    }
}
