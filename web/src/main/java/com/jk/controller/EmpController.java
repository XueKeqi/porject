package com.jk.controller;

import com.jk.entity.emp.EmployeeEntity;
import com.jk.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class EmpController {
    @Resource
    private EmpService empService;

    @RequestMapping("/findList")
    public String findList(EmployeeEntity employee, Model model){

       List<EmployeeEntity> list=empService.findList(employee);
        model.addAttribute("emp",list);
       return "employee/emplist";
    }


}
