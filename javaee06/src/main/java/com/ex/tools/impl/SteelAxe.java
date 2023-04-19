package com.ex.tools.impl;

import com.ex.tools.Axe;
import org.springframework.stereotype.Component;

@Component
public class SteelAxe implements Axe {
    @Override
    public void chop() {
        System.out.println("使用钢斧砍柴");
    }
}
