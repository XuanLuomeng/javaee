package com.javaee.ex.po;

import java.util.Arrays;
import java.util.List;

public class Student {
    private String sno;
    private String sname;
    private int age;
    private float[] scores;
    private List<Course> courseList;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public float[] getScores() {
        return scores;
    }

    public void setScores(float[] scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", scores=" + Arrays.toString(scores) +
                ", courseList=" + courseList +
                '}';
    }
}
