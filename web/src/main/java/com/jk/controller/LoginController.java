package com.jk.controller;



import com.jk.entity.emp.User;
import com.jk.service.ServiceLogin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Resource
    private ServiceLogin serviceLogin;

    @RequestMapping("user/login")
    public String login(User user){

        return serviceLogin.login(user);
    }



}
