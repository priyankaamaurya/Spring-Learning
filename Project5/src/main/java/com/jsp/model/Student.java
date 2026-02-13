package com.jsp.model;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Student {

//    ** Dependencies Injection **

//    * setter injection  --> put @value annotation just above the setter
//    * constructor injection  --> put @value annotation inside the constructor i.e, @Value(value = "${name}")
//    * field injection  --> put @value annotation in the field

//    @Value --> primitive and string
//    @Autowired --> non-primitive

//    @PropertySource(value = "app.properties")

    //    bean cannot work with constructor

    private String name;
    private String city;

    public Student(@Value(value = "${name}") String name, @Value(value = "${city}") String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

//    @Value(value = "${name}")
    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

//    @Value(value = "${city}")
    public void setCity(String city) {
        this.city = city;
    }
}
