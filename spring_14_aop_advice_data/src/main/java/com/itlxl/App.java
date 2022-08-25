package com.itlxl;

import com.itlxl.config.SpringConfig;
import com.itlxl.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
//        bookDao.update();
        String selectName = bookDao.selectName(100,"itlxl");
        System.out.println(selectName);
    }
}
