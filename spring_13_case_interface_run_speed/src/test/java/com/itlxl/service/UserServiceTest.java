package com.itlxl.service;

import com.itlxl.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void testSelectById(){
        System.out.println(userService.selectById(2));
    }
    @Test
    public void testSelectAll(){
        System.out.println(userService.selectAll());
    }
}
