package com.itlxl.service.impl;

import com.itlxl.dao.UserDao;
import com.itlxl.domain.User;
import com.itlxl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void transfer(String out, String in, Double money) {
        userDao.outmoney(out,money);
//        int i = 1/0;
        userDao.inmoney(in,money);
    }
}
