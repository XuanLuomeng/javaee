package com.javaee.impl;

import com.javaee.tools.Axe;
import org.springframework.stereotype.Component;

@Component
public class StoneAxe implements Axe {
    @Override
    public void chop(){
        System.out.println("用石斧砍柴。");
    }
}
