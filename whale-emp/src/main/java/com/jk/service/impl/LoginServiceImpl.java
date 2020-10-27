package com.jk.service.impl;

import com.jk.dao.UserMapper;
import com.jk.entity.emp.User;
import com.jk.service.ServiceLogin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements ServiceLogin {

    @Resource
    private UserMapper userMapper;


    @Override
    public User login(String name) {
        return userMapper.findAll(name);
    }
}
