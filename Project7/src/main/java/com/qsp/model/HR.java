package com.qsp.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HR implements Department{

    @Override
    public void call(){

    }
}
