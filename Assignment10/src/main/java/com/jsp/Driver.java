package com.jsp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Trainer trainer = (Trainer) context.getBean("trainer");

        System.out.println(trainer.getTname());
        System.out.println(trainer.getBranchName());

        context.close();
        System.out.println("Constructor based DI");
    }
}
