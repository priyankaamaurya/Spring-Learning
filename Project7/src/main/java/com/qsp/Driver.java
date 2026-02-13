package com.qsp;

import com.qsp.config.Config;
import com.qsp.model.Employee;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Employee emp  = context.getBean(Employee.class);

        System.out.println(emp.getEname());
        System.out.println(emp.getLoc());

        System.out.println(emp.getDept());

    }
}
