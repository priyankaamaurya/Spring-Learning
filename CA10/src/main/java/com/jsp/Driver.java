package com.jsp;

import com.qsp.University;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        University u = context.getBean(University.class);

        u.setUniversityName("Integral University");
        u.setLocation("Lucknow");

        System.out.println(u.getUniversityName());
        System.out.println(u.getLocation());

        context.close();
        System.out.println("closed");
    }
}
