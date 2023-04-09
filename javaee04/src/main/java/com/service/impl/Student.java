package com.service.impl;

import com.service.Person;
import com.tools.Pen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student implements Person {
    @Autowired
    private Pen pen;
    @Value("218888999")
    private String sno;
    @Value("张三")
    private String sname;
    @Value("19")
    private int age;
    /*private String[] interests;
    List<String> course;
    Set<Double> score;
    Map<String, String> otherInfo;//如address,mobile,qq等*/

    /*public Student(Pen pen, String sno, String sname, int age*//*, String[] interests, List<String> course, Set<Double> score, Map<String, String> otherInfo*//*) {
        this.pen = pen;
        this.sno = sno;
        this.sname = sname;
        this.age = age;
        this.interests = interests;
        this.course = course;
        this.score = score;
        this.otherInfo = otherInfo;
    }*/

    @Override
    public void usePen() {
        System.out.print("我开始学习用笔");
        pen.write();
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    public List<String> getCourse() {
        return course;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }

    public Set<Double> getScore() {
        return score;
    }

    public void setScore(Set<Double> score) {
        this.score = score;
    }

    public Map<String, String> getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(Map<String, String> otherInfo) {
        this.otherInfo = otherInfo;
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "pen=" + pen +
                ", sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", age=" + age +/*
                ", interests=" + Arrays.toString(interests) +
                ", course=" + course +
                ", score=" + score +
                ", otherInfo=" + otherInfo +*/
                '}';
    }
}
