package com.javaee.ex;

import com.javaee.ex.dao.StudentDao;
import com.javaee.ex.po.Student;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class StudentDaoTest {
    private ApplicationContext applicationContext;
    private StudentDao studentDao;
    @Before
    public void ready(){
        applicationContext =
                new ClassPathXmlApplicationContext("config/beans.xml");
        studentDao = applicationContext.getBean(StudentDao.class);
    }
    @Test
    public void queryTest(){
        insertStudentTest();
        selectStudentBySnoTest();
        updateStudentTest();
        selectStudentBySnoTest();
        selectStudentByNameTest();
        deleteStudentTest();
    }
    private void insertStudentTest(){
        Student student = new Student();
        student.setSno("18181818");
        student.setSname("张晓晓");
        student.setSsex("男");
        student.setSnative("广东广州");
        student.setMno(1);
        int res = studentDao.insertStudent(student);
        System.out.println("插入了" + res + "条记录");
    }
    private void selectStudentBySnoTest(){
        Student student = studentDao.selectStudentBySno("18181818");
        System.out.println(student);
    }
    private void selectStudentByNameTest(){
        List<Student> studentList = studentDao.selectStudentByName("小");
        System.out.println(studentList);
    }
    private void updateStudentTest(){
        Student student = new Student();
        student.setSno("18181818");
        student.setSname("张大大");
        student.setSsex("女");
        int res = studentDao.updateStudent(student);
        System.out.println("更新了" + res + "条记录");
    }
    private void deleteStudentTest(){
        int res = studentDao.deleteStudentBySno("18181818");
        System.out.println("删除了" + res + "条记录");
    }
}
