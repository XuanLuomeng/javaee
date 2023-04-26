package com.javaee.ex.dao;

import com.javaee.ex.po.Course;

import java.util.List;

public interface CourseDao {
    Course selectCourseByCno(String cno);
    List<Course> selectCourseByName(String cname);
    int updateCourse(Course course);
    int deleteCourseByCno(String cno);
    int deleteCourseByCname(String cname);
    int insertCourse(Course course);
}
