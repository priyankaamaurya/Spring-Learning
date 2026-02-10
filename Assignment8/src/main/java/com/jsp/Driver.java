package com.jsp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        User user = (User) context.getBean("user");

        System.out.println(user.getName());
        System.out.println(user.getCity());

        context.close();
        System.out.println("Constructor based DI");
    }
}
