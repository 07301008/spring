package com.itlxl.service;

import com.itlxl.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
//    @Transactional(readOnly = true,timeout = -1)
    @Transactional
    void transfer(String out,String in,Double money);
}
