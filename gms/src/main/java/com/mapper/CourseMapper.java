package com.mapper;


import com.po.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author LuoXuanwei
 * @date 2023/6/1 0:12
 */
@Mapper
public interface CourseMapper {
    Course selectCourseByCno(String cno);
    List<Course> selectCourseByCname(String cname);
    List<Course> selectCourses();
    void insertCourse(Course course);
    void updateCourse(Course course);
    void deleteCourseByCno(String cno);
}
