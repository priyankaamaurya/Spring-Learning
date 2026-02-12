package com.jsp.model;

//import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

//@Component
@Scope(value ="prototype")
public class Student {


    private String name;
    private String city;

}
