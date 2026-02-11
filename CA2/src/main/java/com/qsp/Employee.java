package com.qsp;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private int eid;
    private String dept;


    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
