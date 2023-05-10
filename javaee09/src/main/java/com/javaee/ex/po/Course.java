package com.javaee.ex.po;

import java.util.Arrays;

public class Course {
    private int cno;
    private String cname;
    private int period;
    private String bname;
    private String pub;
    private float price;

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cno=" + cno +
                ", cname='" + cname + '\'' +
                ", period=" + period +
                ", bname='" + bname + '\'' +
                ", pub='" + pub + '\'' +
                ", price=" + price +
                '}';
    }
}
