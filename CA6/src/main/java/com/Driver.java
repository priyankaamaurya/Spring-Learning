package com;

import com.jsp.Config;
import com.qsp.Animal;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Animal a = context.getBean(Animal.class);

        a.setName("Cat");
        a.setSound("Meow Meow");

        System.out.println(a.getName());
        System.out.println(a.getSound());

        context.close();
        System.out.println("closed");

    }
}
