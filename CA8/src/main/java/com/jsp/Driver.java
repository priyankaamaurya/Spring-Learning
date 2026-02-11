package com.jsp;

import com.qsp.Sports;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Sports s = context.getBean(Sports.class);

        s.setSportsName("Cricket");
        s.setNoOfPlayers(11);

        System.out.println(s.getSportsName());
        System.out.println(s.getNoOfPlayers());

        context.close();
        System.out.println("closed");
    }
}
