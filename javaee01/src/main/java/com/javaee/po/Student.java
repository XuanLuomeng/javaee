package com.javaee.po;

import java.util.List;

public class Student {
    private String sno;
    private String sname;
    private String ssex;
    private String snative;
    private int mno;
    List<Course> courseList;
    /*private Idcard idCard;*/
    /*private List<Sc> scList;*/

    public Student() {
    }

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

    /*public Idcard getIdCard() {
        return idCard;
    }

    public void setIdCard(Idcard idCard) {
        this.idCard = idCard;
    }*/

    /*public List<Sc> getScList() {
        return scList;
    }

    public void setScList(List<Sc> scList) {
        this.scList = scList;
    }*/

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                ", snative='" + snative + '\'' +
                ", mno=" + mno +
                ", courseList=" + courseList +
                '}';
    }
}
