package com.po;

import java.util.List;

/**
 * @author LuoXuanwei
 * @date 2023/5/25 0:54
 */
public class TeacherCourse {
    private String tno;
    private String tname;
    private List<String> courseList;

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "TeacherCourse{" +
                "tno='" + tno + '\'' +
                ", tname='" + tname + '\'' +
                ", courseList=" + courseList +
                '}';
    }

    public List<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }
}
