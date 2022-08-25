package com.itlxl.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    // 切入点
//    @Pointcut("execution(void com.itlxl.dao.BookDao.update())")
    @Pointcut("execution(* com.itlxl.*.*Dao.update(..))")
    private void pt(){}

    @Pointcut("execution(* com.itlxl.*.*Dao.select(..))")
    private void pt2(){}

    // 通知
    // 绑定
//    @Before("pt()")
    public void before(){
        System.out.println("before advice ...");
    }

//    @After("pt()")
    public void after(){
        System.out.println("after advice ...");
    }

//    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice ...");
        Object ret = pjp.proceed();
        System.out.println("around after advice ...");
        return ret;
    }

//    @Around("pt2()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice ...");
        Object ret = pjp.proceed();
        System.out.println("around after advice ...");
        return ret;
    }

//    @AfterReturning("pt2()")
    public void afterReturning(){
        System.out.println("afterReturning advice ...");
    }

//    @AfterThrowing("pt2()")
    public void afterThrowing(){
        System.out.println("afterThrowing advice ...");
    }
}
