package com.mapper;

import com.po.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author LuoXuanwei
 * @date 2023/5/31 23:40
 */
@Mapper
public interface StudentMapper {
    Student selectStudentBySno(String sno);
    List<Student> selectStudentBySname(String sname);
    List<Student> selectStudents();
    void insertStudent(Student student);
    void updateStudent(Student student);
    void deleteStudentBySno(String sno);
}
