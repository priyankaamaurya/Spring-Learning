package com.jsp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Student {

    private String name;
    private String city;

    @Autowired
    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Autowired
    @Qualifier("vivo")
    private Mobile mobile;

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

//    public Student(String name, String city) {
//        this.name = name;
//        this.city = city;
//    }

    public String getName() {
        return name;
    }

    @Value(value = "${name}")
    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }
    @Value(value = "${city}")
    public void setCity(String city) {
        this.city = city;
    }

}
