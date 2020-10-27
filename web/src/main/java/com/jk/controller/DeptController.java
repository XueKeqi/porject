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
public class DeptController {
    @Resource
    private DeptService deptService;

    @RequestMapping("dept/findPage")
    @ResponseBody
    public PageResult findPage(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        return deptService.findPage(currPage, pageSize);
    }

    @RequestMapping("dept/add")
    public String add(DeptEntity dept){
        deptService.add(dept);
        return "dept";
    }
    @RequestMapping("dept/deleteall")
    public String deleteall(@RequestParam String [] id){
        deptService.deleteall(id);
        return "dept";
    }
    @RequestMapping("dept/selectbyid")
    @ResponseBody
    public DeptEntity selectbyid(@RequestParam Integer id){
        return deptService.selectbyid(id);
    }

}
