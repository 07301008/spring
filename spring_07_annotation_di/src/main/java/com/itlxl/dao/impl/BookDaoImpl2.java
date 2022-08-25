package com.itlxl.dao.impl;

import com.itlxl.dao.BookDao;
import org.springframework.stereotype.Repository;

//@Component("bookDao")
@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save2 ..." );
    }
}
