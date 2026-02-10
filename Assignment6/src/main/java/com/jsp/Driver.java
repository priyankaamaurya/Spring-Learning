package com.jsp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Product product = (Product) context.getBean("product");

        System.out.println(product.getPname());
        System.out.println(product.getPstatus());

        context.close();
        System.out.println("Constructor based DI");

    }
}
