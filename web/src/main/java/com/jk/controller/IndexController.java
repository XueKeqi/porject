package com.jk.controller;

import com.jk.service.DeptService;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;

@Controller
public class IndexController {
    @Resource
    private DeptService deptService;

    @RequestMapping("login")
    public String login(){
        return "login";
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("show")
    public String show(){
        return "show";
    }


    @RequestMapping("dept")
    public String dept(){
        return "dept";
    }

    @RequestMapping("user/list")
    public String userlist(){
        return "user/userList";
    }


}
