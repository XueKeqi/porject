package com.jk.controller;

import com.jk.entity.emp.EmployeeEntity;
import com.jk.service.EmpService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EmpController {

    @Resource
    private EmpService empService;
    @RequestMapping("/findList")
    public List<EmployeeEntity> findList(@RequestBody EmployeeEntity employee){

        return empService.findList(employee);
    }
    @RequestMapping("/addEmp")
    public void addEmp(@RequestBody EmployeeEntity employee){
        empService.addEmp(employee);
    }
}
