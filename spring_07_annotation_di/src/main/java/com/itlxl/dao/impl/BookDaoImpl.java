package com.itlxl.dao.impl;

import com.itlxl.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

//@Component("bookDao")
@Repository("bookDao1")
public class BookDaoImpl implements BookDao {
    @Value("${name}")
    private String name;

    @Override
    public void save() {
        System.out.println("book dao save ..." + name);
    }
}
