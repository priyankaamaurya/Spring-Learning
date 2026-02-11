package com.qsp;

import org.springframework.stereotype.Component;

@Component (value = "person")
public class Person {

    private String name;
    private String city;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
