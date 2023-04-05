package com.javaee.po;

import java.util.List;

public class Course {
    private int cno;
    private String cname;
    private int period;
    private List<Student> studentList;
    /*private List<Sc> scList;*/
    /*private Book book;*/

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

    /*public List<Sc> getScList() {
        return scList;
    }

    public void setScList(List<Sc> scList) {
        this.scList = scList;
    }*/

    /*public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }*/

    public List<Student> getStudents() {
        return studentList;
    }

    public void setStudents(List<Student> students) {
        this.studentList = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cno=" + cno +
                ", cname='" + cname + '\'' +
                ", period=" + period +
                ", students=" + studentList +
                '}';
    }
}
