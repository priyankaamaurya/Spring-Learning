package com.jsp;

public class Employee {

    private String ename;
    private int eid;

    public Employee(){

    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public Employee(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }
}
