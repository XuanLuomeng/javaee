package com.service;

import com.po.Student;

import java.util.List;

/**
 * @author LuoXuanwei
 * @date 2023/5/31 23:39
 */
public interface StudentService {
    List<Student> findAllStudent();
    Student findStudentBySno(String sno);
    void addStudent(Student student);
    void deleteStudents(String[] snoArray);
    void updateStudent(Student student);

}
