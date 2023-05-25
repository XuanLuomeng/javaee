package com.po;

import java.util.List;

/**
 * @author LuoXuanwei
 * @date 2023/5/25 0:53
 */
public class StuCourse {
    private String sno;
    private String sname;
    private List<String> courseList;

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

    public List<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }
}

