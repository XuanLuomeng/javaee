package com.javaee.ex.dao;

import com.javaee.ex.po.Student;

import java.util.List;

public interface StudentDao {
    Student selectStudentBySno(String sno);
    List<Student> selectStudentByName(String sname);
    int updateStudent(Student student);
    int deleteStudentBySno(String sno);
    int deleteStudentBySname(String sname);
    int insertStudent(Student student);
    int updateMnoBySno(String sno, int mno);
}
