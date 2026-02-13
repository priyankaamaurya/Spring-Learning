package com.jsp.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Apple implements Mobile{

    @Override
    public void call() {
        System.out.println("apple is calling");
    }
}
