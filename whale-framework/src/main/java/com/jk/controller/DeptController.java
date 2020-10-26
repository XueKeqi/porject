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

}
