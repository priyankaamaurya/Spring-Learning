package com.jsp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Customer customer = (Customer) context.getBean("customer");

        System.out.println(customer.getEmail());
        System.out.println(customer.getPhoneNumber());

        context.close();
        System.out.println("Constructor based DI");

    }
}
