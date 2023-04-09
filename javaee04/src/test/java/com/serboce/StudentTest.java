package com.serboce;

import com.service.impl.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void Test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("config/beans.xml");
        Student student = (Student) ioc.getBean("student");
        System.out.println(student);
    }

    @Test
    public void constructorTest(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("config/beans.xml");
        Student student = (Student) ioc.getBean("student");
        System.out.println(student);
    }

    @Test
    public void annotationTest(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("config/beans.xml");
        Student student = (Student) ioc.getBean("student");
        System.out.println(student);
    }
}
