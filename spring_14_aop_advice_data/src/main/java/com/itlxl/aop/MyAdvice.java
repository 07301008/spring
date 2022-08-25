package com.itlxl.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {
    // 切入点
    @Pointcut("execution(* com.itlxl.*.*Dao.selectName(..))")
    private void pt(){}

    // 通知
    // 绑定
//    @Before("pt()")
    public void before(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice ...");
    }

//    @After("pt()")
    public void after(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice ...");
    }

//    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) {
        System.out.println("around before advice ...");
        Object[] args = pjp.getArgs();
        args[0] = 666;
        System.out.println(Arrays.toString(args));
        Object ret = null;
        try {
            ret = pjp.proceed(args);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("around after advice ...");
        return ret;
    }


    @AfterReturning(value = "pt()",returning = "ret")
    public void afterReturning(JoinPoint jp,Object ret){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("afterReturning advice ..." + ret);
    }

    @AfterThrowing(value = "pt()",throwing = "t")
    public void afterThrowing(JoinPoint jp,Throwable t){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("afterThrowing advice ..." + t);
    }
}
