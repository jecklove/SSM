package com.service.impl;

import com.entity.User;
import com.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
@SpringJUnitConfig(locations = {"classpath:spring-mybatis.xml"})
class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Test
    void deleteByPrimaryKey() {
        int result = userService.deleteByPrimaryKey(3);
        log.info("================>{}",result);
    }

    @Test
    void insert() {
    }

    @Test
    void insertSelective() {
    }

    @Test
    void selectByPrimaryKey() {
    }

    @Test
    void updateByPrimaryKeySelective() {
    }

    @Test
    void updateByPrimaryKey() {
    }
    @Test
    void selectList(){
        List<User> userList = userService.selectList();
        userList.forEach(x->log.info("{}",x));
    }
}