package com.service;

import com.po.Course;

import java.util.List;

/**
 * @author LuoXuanwei
 * @date 2023/6/1 0:09
 */
public interface CourseService {
    List<Course> findAllCourse();
    Course findCourseByCno(String cno);
    void addCourse(Course course);
    void deleteCourses(String[] cnoArray);
    void updateCourse(Course course);
}
