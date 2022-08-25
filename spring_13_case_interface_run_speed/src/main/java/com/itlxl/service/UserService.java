package com.itlxl.service;

import com.itlxl.domain.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void delete(int id);
    void update(User user);
    User selectById(int id);
    List<User> selectAll();
}
