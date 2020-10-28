package com.jk.controller;

import com.jk.entity.emp.EmployeeEntity;
import com.jk.entity.emp.User;
import com.jk.service.EmpService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EmpController {

    @Resource
    private EmpService empService;


    @RequestMapping("te")
    public String te(@RequestBody User user){

        user.setName("xkq");
        user.setPassword("123");

        User u = empService.te(user);


        if(u==null){
            return "登录失败 账号不存在";
        }
        if(!user.getPassword().equals(u.getPassword())){
            return "登录失败 密码错误";
        }

        return "成功";

    }
    @RequestMapping("tea")
    public User tea(@RequestParam String name){
        return empService.tea(name);
    }


    @RequestMapping("/findList")
    public List<EmployeeEntity> findList(@RequestBody EmployeeEntity employee){

        return empService.findList(employee);
    }
    @RequestMapping("/addEmp")
    public void addEmp(@RequestBody EmployeeEntity employee){
        empService.addEmp(employee);
    }

    @RequestMapping("/delEmp")
    public void delEmp(@RequestParam Integer empId){
        empService.delEmp(empId);
    }
    @RequestMapping("/selectById")
    public EmployeeEntity selectById(@RequestParam Integer empId){
      return   empService.selectById(empId);
    }

}
