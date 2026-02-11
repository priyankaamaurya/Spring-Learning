package com.jsp;

import com.qsp.Product;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Product p = context.getBean(Product.class);

        p.setpId("AED124");
        p.setpName("Washing Machine");

        System.out.println(p.getpId());
        System.out.println(p.getpName());

        context.close();
        System.out.println("closed");
    }
}
