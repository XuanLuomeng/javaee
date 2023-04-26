package com.javaee.ex;

import com.javaee.ex.dao.CourseDao;
import com.javaee.ex.po.Course;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CourseDaoTest {
    private ApplicationContext applicationContext;
    private CourseDao courseDao;
    @Before
    public void ready(){
        applicationContext =
                new ClassPathXmlApplicationContext("config/beans.xml");
        courseDao = applicationContext.getBean(CourseDao.class);
    }
    @Test
    public void queryTest(){
        insertCourseTest();
        selectCourseByCnoTest();
        updateCourseTest();
        selectCourseByCnoTest();
        selectCourseByNameTest();
        deleteCourseTest();
    }
    private void insertCourseTest(){
        Course course = new Course();
        course.setCno(2);
        course.setCname("线性代数");
        course.setPeriod(50);
        int res = courseDao.insertCourse(course);
        System.out.println("插入了" + res + "条记录");
    }
    private void selectCourseByCnoTest(){
        Course course = courseDao.selectCourseByCno("1");
        System.out.println(course);
    }
    private void selectCourseByNameTest(){
        List<Course> courseList = courseDao.selectCourseByName("数");
        System.out.println(courseList);
    }
    private void updateCourseTest(){
        Course course = new Course();
        course.setCno(1);
        course.setCname("数据库原理");
        course.setPeriod(40);
        int res = courseDao.updateCourse(course);
        System.out.println("更新了" + res + "条记录");
    }
    private void deleteCourseTest(){
        int res = courseDao.deleteCourseByCno("2");
        System.out.println("删除了" + res + "条记录");
    }
}
