package com.jsp;

import com.jsp.config.Config;
import com.jsp.model.Student;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Student student = context.getBean(Student.class);

        System.out.println(student.getName());
        System.out.println(student.getCity());

        context.close();


    }
}
