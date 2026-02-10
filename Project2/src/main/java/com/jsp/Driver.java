package com.jsp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

//    3 ways for dependency injection
//    1. field
//    2. setter
//    3. constructor

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Person person =  (Person) context.getBean("person");

        System.out.println(person.getName());
        System.out.println(person.getId());

        context.close();
        System.out.println("container closed");

    }
}
