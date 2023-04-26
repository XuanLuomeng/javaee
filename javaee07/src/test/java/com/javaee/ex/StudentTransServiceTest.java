package com.javaee.ex;

import com.javaee.ex.dao.HistoryInfoDao;
import com.javaee.ex.dao.StudentDao;
import com.javaee.ex.service.StudentTransService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTransServiceTest {
    private ApplicationContext applicationContext;
    private HistoryInfoDao historyInfoDao;
    private StudentDao studentDao;

    @Before
    public void ready() {
        applicationContext =
                new ClassPathXmlApplicationContext("config/beans.xml");
        historyInfoDao = applicationContext.getBean(HistoryInfoDao.class);
        studentDao = applicationContext.getBean(StudentDao.class);
    }

    @Test
    public void queryTest() {
        StudentTransService service = new StudentTransService(historyInfoDao, studentDao);
        service.trans("100000001", 2);
    }

}
