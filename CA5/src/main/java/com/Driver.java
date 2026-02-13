package com;

import com.jsp.Config;
import com.qsp.Fruits;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Fruits f = context.getBean(Fruits.class);

        f.setName("Pineapple");
        f.setTaste("Sweet");

        System.out.println(f.getName());
        System.out.println(f.getTaste());

        context.close();
        System.out.println("closed");
    }
}
