package com.factory;

import com.tools.Pen;

public class DynamicBeanFactory {
    public Pen getPen() {
        return new Pen();
    }
}
