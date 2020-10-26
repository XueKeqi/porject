package com.jk.controller;

import com.jk.entity.dept.DeptEntity;
import com.jk.pojo.PageResult;
import com.jk.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController {
    @Resource
    private DeptService deptService;

    /**
     * 查询
     *
     * @return
     */
    @RequestMapping("dept/findPage")
    public PageResult findPage(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        return deptService.findPage(currPage, pageSize);
    }

    /**
     *
     * 删除批删
     *
     * @param id
     */
    @RequestMapping("dept/deleteall")
    public void deleteall(@RequestParam String [] id){
        deptService.deleteall(id);
    }

    /*
    新增
     */
    @RequestMapping("dept/add")
    public void add(@RequestBody DeptEntity dept){
        deptService.add(dept);
    }

    @RequestMapping("dept/selectbyid")
    public DeptEntity selectbyid(@RequestParam Integer id){
        return deptService.selectbyid(id);
    }

}
