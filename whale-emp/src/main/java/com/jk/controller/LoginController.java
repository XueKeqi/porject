package com.jk.controller;

import com.jk.entity.emp.User;
import com.jk.service.ServiceLogin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Resource
    private ServiceLogin serviceLogin;

    @RequestMapping("login")
    public String login(@RequestBody User user, HttpSession session){

        User user1 =serviceLogin.login(user.getName());
        if(user1==null){
            return "登录失败 账号不存在";
        }
        if(!user.getPassword().equals(user1.getPassword())){
            return "登录失败 密码错误";
        }

        //往前台传值
        session.setAttribute("users",user1);

        return "登录成功";

    }
}
