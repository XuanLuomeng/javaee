package com.javaee.dao;

import com.javaee.po.Course;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseDao {
    @Select("select * from course where cno in (select cno from sc where sno=#{sno});")
    List<Course> findCourseBySno(String sno);
}
