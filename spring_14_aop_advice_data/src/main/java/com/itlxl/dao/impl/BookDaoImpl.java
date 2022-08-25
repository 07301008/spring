package com.itlxl.dao.impl;

import com.itlxl.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {


    @Override
    public String selectName(int id,String name) {
        System.out.println("id:" + id);
        return "itlxl";
    }
}
