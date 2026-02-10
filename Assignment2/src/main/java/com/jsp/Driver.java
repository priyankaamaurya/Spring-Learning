package com.jsp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Employee employee = (Employee) context.getBean("employee");

        System.out.println(employee.getEname());
        System.out.println(employee.getEid());

        context.close();
        System.out.println("Constructor based DI");
    }
}
