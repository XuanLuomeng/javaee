package com.javaee.service;

import com.javaee.impl.SteelAxe;
import com.javaee.tools.Axe;
import org.junit.Test;

public class PersonTest {
    @Test
    public void useAxeTest(){
        Person person = new Person();
        Axe axe = new SteelAxe();
        person.setAxe(axe);
        person.useAxe();
    }
}
