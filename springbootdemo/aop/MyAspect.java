package com.yunque.www.springbootdemo.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {

    @Pointcut("execution(* com.yunque.www.springbootdemo.service.serviceimpl.UserServiceImpl.*(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before() {
        System.out.println("before");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        jp.proceed();
    }

    @After("pointCut()")
    public void after() {
        System.out.println("after");

    }

    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("afterReturning");

    }

    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }
}
