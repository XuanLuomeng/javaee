package com.javaee.dao;

import com.javaee.po.Teacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TeacherDao {
    @Select("select * from teacher where tno=#{tno};")
    Teacher findTeacherByTno(int tno);
    @Select("select * from teacher;")
    List<Teacher> findTeacherAll();
    @Select("select * from teacher where tname like '%${tname}%';")
    List<Teacher> findTeachherBytname(String tname);
    @Insert("insert into teacher(tno,tname,tsex,tel) values(#{tno},#{tname},#{tsex},#{tel});")
    int insertTeacher(Teacher teacher);
    @Update({"update teacher set tno=#{tno},tname=#{tname},tsex=#{tsex},tel=#{tel}"," where tno=#{tno};"})
    int updateTeacher(Teacher teacher);
    @Delete("delete from teacher where " + "tno=#{tno};")
    int deleteTeacherByTno(int tno);
}
