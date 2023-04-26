package com.javaee.ex.po;

public class Course {
    private int cno;
    private String cname;
    private int period;

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

    // 省略了getter和setter方法

    @Override
    public String toString() {
        return "Course{" +
                "cno=" + cno +
                ", cname='" + cname + '\'' +
                ", period=" + period +
                '}';
    }
}

