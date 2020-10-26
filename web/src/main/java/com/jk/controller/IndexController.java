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
    public String index(){
        return "login";
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
