package com.javaee.dao;

import com.javaee.po.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface StudentDao {
    @Select("select * from stu where sno in (select sno from sc where cno=#{cno});")
    Student findStudentBySno(String cno);
    @Select("select * from stu;")
    List<Student> findStudentAll();
    @Select("select * from stu where sname like '%${sname}%';")
    List<Student> findStudentBySname(String sname);
    @Insert("insert into stu(sno,sname,ssex,snative,mno) values(#{sno},#{sname},#{ssex},#{snative},#{mno});")
    int insertStudent(Student student);
    @Update({"update stu set sno=#{sno},sname=#{sname},ssex=#{ssex},snative=#{snative},mno=#{mno}"," where sno=#{sno};"})
    int updateStudent(Student student);
    @Delete("delete from stu where " + "sno=#{sno};")
    int deleteStudentBySno(String sno);

    @Select("select * from stu where sno=#{sno};")
    @Results({@Result(column = "sno", property = "courseList", many = @Many(select = "com.javaee.dao.CourseDao.findCourseBySno"))})
    Student findStudentCourseBySno(String sno);
}
