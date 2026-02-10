package com.jsp;

public class Product {

    private String pname;
    private String pstatus;

    public Product() {

    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPstatus() {
        return pstatus;
    }

    public void setPstatus(String pstatus) {
        this.pstatus = pstatus;
    }

    public Product(String pname, String pstatus) {
        this.pname = pname;
        this.pstatus = pstatus;
    }
}
