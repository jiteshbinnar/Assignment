package com.springcores;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        context.registerShutdownHook();
                Student student1=(Student)context.getBean("Student1");
                System.out.println(student1);
           
               Student student2=(Student)context.getBean("Student2");
                System.out.println(student2);
                
                Hefshine hefshine=(Hefshine)context.getBean("hef");
                System.out.println(hefshine);
    }
}
