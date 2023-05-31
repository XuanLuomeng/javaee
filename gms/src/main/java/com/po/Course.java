package com.po;

/**
 * @author LuoXuanwei
 * @date 2023/6/1 0:08
 */
public class Course {
    private String cno;
    private String cname;
    private String period;

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                ", period='" + period + '\'' +
                '}';
    }
}
