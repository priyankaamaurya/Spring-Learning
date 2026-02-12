package com.jsp;

import com.jsp.config.Config;
import com.jsp.model.Student;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Student student = context.getBean(Student.class);
        Student student1 = context.getBean(Student.class);
        Student student2 = context.getBean(Student.class);

        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);

        context.close();


    }
}
