package com;

import com.jsp.Config;
import com.qsp.User;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        User u = context.getBean(User.class);

        u.setName("Anshika");
        u.setCity("Raipur");

        System.out.println(u.getName());
        System.out.println(u.getCity());

        context.close();
        System.out.println("closed");


    }

}
