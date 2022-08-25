package com.itlxl.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    // 切入点
//    @Pointcut("execution(void com.itlxl.dao.BookDao.update())")
    @Pointcut("execution(* com.itlxl.*.*Dao.update(..))")
    private void pt(){}

    // 通知
    // 绑定
    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
