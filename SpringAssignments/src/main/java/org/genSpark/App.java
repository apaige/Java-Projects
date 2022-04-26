package org.genSpark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Student obj = (Student) context.getBean("Student");
        Phone obj2 = (Phone) context.getBean("Phone");
        Address obj3 = (Address) context.getBean("Address");


    }
}
