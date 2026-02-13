package com;

import com.jsp.Config;
import com.qsp.Car;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Car c = context.getBean(Car.class);

        c.setCarModel("Creta");
        c.setCarId(1732);

        System.out.println(c.getCarModel());
        System.out.println(c.getCarId());

        context.close();
        System.out.println("closed");
    }
}
