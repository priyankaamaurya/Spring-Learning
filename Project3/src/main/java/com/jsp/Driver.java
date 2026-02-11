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

        person.setName("Anjali");
        person.setCity("Jaipur");

        System.out.println(person.getName());
        System.out.println(person.getCity());

        context.close();
        System.out.println("without xml based");
    }
}
