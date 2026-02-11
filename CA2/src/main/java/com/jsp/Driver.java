package com.jsp;

import com.qsp.Employee;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Employee e = context.getBean(Employee.class);

        e.setEid(1);
        e.setDept("IT");

        System.out.println(e.getEid());
        System.out.println(e.getDept());

        context.close();
        System.out.println("Container closed");
    }




}
