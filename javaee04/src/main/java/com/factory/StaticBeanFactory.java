package com.factory;

import com.tools.Pen;

public class StaticBeanFactory{
    public static Pen getPen(){
        return new Pen();
    }
}
