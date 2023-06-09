package com.ex.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AxeProxyJdk {
    private Object target;

    public AxeProxyJdk(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        /**
         * ClassLoader loader:指定加载动态生成的代理类的类加载器
         * Class[] interfaces:获取目标对象实现的所有接口的class对象的数组
         * InvocationHandler h:设置代理类中的抽象方法如何重写
         */
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                System.out.println("钢斧磨刀……");
                //proxy表示代理对象,method表示要执行的方法,args表示要执行的方法的参数列表
                result = method.invoke(target, args);
                System.out.println("钢斧维护……");
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader, interfaces, h);
    }
}
