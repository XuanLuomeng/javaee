package com.ex.proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class AxeProxyCglib implements MethodInterceptor {

    private Object target;

    public AxeProxyCglib(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("钢斧磨刀……");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("钢斧维护……");
        return result;
    }
}
