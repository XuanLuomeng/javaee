package com.javaee.context;

import com.javaee.service.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    @Test
    public void beanTest(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("config/beans.xml");
        Person person = (Person) ioc.getBean("person");
        person.useAxe();
    }

    @Test
    public void annotationTest(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("config/beans.xml");
        Person person = ioc.getBean(Person.class);
        person.useAxe();
    }
}
