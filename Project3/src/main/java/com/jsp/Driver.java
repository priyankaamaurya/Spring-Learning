package com.jsp;

import com.qsp.Person;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

    public Driver() {

    }

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Person person = (Person) context.getBean("person");

        System.out.println(person.getName());
        System.out.println(person.getCity());

        context.close();
        System.out.println("without xml based");
    }
}
