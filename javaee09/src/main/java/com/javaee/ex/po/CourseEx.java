package com.javaee.ex.po;

public class CourseEx {
    private int cno;
    private String cname;
    private int period;
    private Book book;

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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "CourseEx{" +
                "cno=" + cno +
                ", cname='" + cname + '\'' +
                ", period=" + period +
                ", book=" + book +
                '}';
    }
}
