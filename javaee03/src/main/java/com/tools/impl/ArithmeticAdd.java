package com.tools.impl;

import com.tools.Arithmetic;

public class ArithmeticAdd implements Arithmetic {
    @Override
    public double calc(double num1, double num2) {
        double num = num1 + num2;
        return num;
    }
}
