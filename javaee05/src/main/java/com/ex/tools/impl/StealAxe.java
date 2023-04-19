package com.ex.tools.impl;

import com.ex.tools.Axe;

public class StealAxe implements Axe {
    @Override
    public void chop() {
        System.out.println("使用钢斧砍柴");
    }
}
