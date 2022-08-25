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
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User selectById(int id) {
        User user = userDao.selectById(id);
        return user;
    }

    @Override
    public List<User> selectAll() {
        List<User> users = userDao.selectAll();
        return users;
    }
}
