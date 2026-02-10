package com.jsp;

public class Person {

    private String name;
    private int id;

//    setter based DI
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


// constructor based DI
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
