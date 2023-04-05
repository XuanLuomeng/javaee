package com.javaee.dao;

import com.javaee.po.Course;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface CourseScDao {
    @Select("select * from course where cno=#{cno};")
    @Results({@Result(column = "cno", property = "scList",
            many = @Many(select = "com.javaee.dao.ScDao.findScByCno"))})
    Course findCourseScByCno(String cno);
}
