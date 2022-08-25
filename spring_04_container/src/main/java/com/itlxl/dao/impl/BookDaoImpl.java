package com.itlxl.dao.impl;

import com.itlxl.dao.BookDao;

public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save ..." );
    }
}
