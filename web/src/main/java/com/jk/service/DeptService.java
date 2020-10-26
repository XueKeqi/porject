package com.jk.service;

import com.jk.entity.dept.DeptEntity;
import com.jk.pojo.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "framework")
public interface DeptService {

    @RequestMapping("dept/findPage")
    public PageResult findPage(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize);

    @RequestMapping("dept/add")
    public void add(@RequestBody DeptEntity dept);

    @RequestMapping("dept/deleteall")
    public void deleteall(@RequestParam String [] id);

    @RequestMapping("dept/selectbyid")
    public DeptEntity selectbyid(@RequestParam Integer id);
}
