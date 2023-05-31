package com.po;

/**
 * @author LuoXuanwei
 * @date 2023/5/31 23:38
 */
public class Student {
    private String sno;
    private String sname;
    private String ssex;
    private String snative;
    private int mno;
    // 省略了Getter和Setter方法

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSnative() {
        return snative;
    }

    public void setSnative(String snative) {
        this.snative = snative;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                ", snative='" + snative + '\'' +
                ", mno=" + mno +
                '}';
    }
}

