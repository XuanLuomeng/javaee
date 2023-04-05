package com.javaee.po;

public class Teacher {
    private int tno;
    private String tname;
    private String tsex;
    private String tel;

    public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tno=" + tno +
                ", tname='" + tname + '\'' +
                ", tsex='" + tsex + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
