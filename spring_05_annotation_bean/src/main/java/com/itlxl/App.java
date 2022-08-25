package com.itlxl;

import com.itlxl.dao.BookDao;
import com.itlxl.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookDao bookDao = ctx.getBean(BookDao.class);
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
//        bookDao.save();
    }
}
