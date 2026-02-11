package com.jsp;

import com.qsp.Student;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

    public Driver() {
    }

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Student s = context.getBean(Student.class);

        s.setName("Anamika");
        s.setSchoolName("XYZ Public School");

        System.out.println(s.getName());
        System.out.println(s.getSchoolName());

        context.close();
        System.out.println("Without xml based");
    }
}
