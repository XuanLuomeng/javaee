package com.javaee.service;

import com.javaee.tools.Axe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Person {
    @Autowired
    private Axe axe;

    public void useAxe() {
        if(axe==null){
            System.out.println("斧头不存在！");
            return ;
        }
        axe.chop();
    }

    public void setAxe(Axe axe) {
        this.axe = axe;
    }
}
