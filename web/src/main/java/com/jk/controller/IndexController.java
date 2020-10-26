package com.jk.controller;

import com.jk.entity.dept.DeptEntity;
import com.jk.pojo.PageResult;
import com.jk.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
