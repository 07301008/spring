package com.itlxl;

import com.itlxl.dao.BookDao;
import com.itlxl.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // 1、加载类路径下的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2、从文件系统下加载配置文件
//        ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\code\\java\\spring\\spring_04_container\\src\\main\\resources\\applicationContext.xml");
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        BookDao bookDao = ctx.getBean("bookDao",BookDao.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.save();
    }
}
