package com.ex.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 前置通知、后置通知、环绕通知、异常通知及最终通知
 */
@Component
@Aspect
public class ToolUpkeep {
    @Pointcut("execution(* com.ex.tools.impl.SteelAxe.*(..))")
    public void pointCut() {
    }

    //前置通知
    @Before("pointCut()")
    public void beforeAdviceMethod() {
        System.out.println("使用前保养，将斧子磨锋利一些");
    }

    //最终通知
    @After("pointCut()")
    public void afterAdviceMethod() {
        System.out.println("砍柴结束，期间未出现意外，记录下这次事件");
    }

    //返回通知（后置通知）
    @AfterReturning("pointCut()")

    public void afterReturningAdviceMethod() {
        System.out.println("收拾柴火回家");
    }
    //异常通知
    @AfterThrowing("pointCut()")
    public void afterThrowingAdviceMethod() {
        System.out.println("出现意外");
    }

    //环绕通知
    @Around("pointCut()")
    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint) {
        Object result = null;
        try {
            System.out.println("去砍柴地点");
            //表示目标对象方法的执行
            result = joinPoint.proceed();
            System.out.println("收斧，休息一下");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return result;
    }
}
