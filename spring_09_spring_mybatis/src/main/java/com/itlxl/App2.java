package com.itlxl;

import com.itlxl.config.SpringConfig;
import com.itlxl.domain.User;
import com.itlxl.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        User user = userService.selectById(1);
        System.out.println(user);
    }
}
