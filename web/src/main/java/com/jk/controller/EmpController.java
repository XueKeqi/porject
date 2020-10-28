package com.jk.controller;

import com.jk.entity.emp.EmployeeEntity;
import com.jk.entity.emp.User;
import com.jk.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class EmpController {
    @Resource
    private EmpService empService;



    @RequestMapping("tea")
    @ResponseBody
    public String login(User user){
        User u = empService.tea(user.getName());
        System.out.print(u);
        if(u==null){
            return "没有该用户";
        }
        if(!user.getPassword().equals(u.getPassword())){
            return "密码错误";
        }

        return "成功";
    }

    @RequestMapping("/findList")
    public String findList(EmployeeEntity employee, Model model){

       List<EmployeeEntity> list=empService.findList(employee);
        model.addAttribute("emp",list);
       return "employee/emplist";
    }


    @RequestMapping("/toAdd")
    public String toAdd(Model model){
        model.addAttribute("emp",new EmployeeEntity());
        return "employee/addemp";
    }
    @RequestMapping("/addEmp")
    public String addEmp( EmployeeEntity employee){
        empService.addEmp(employee);
        return "redirect:findList";
    }
    /**
     * 删除
     * @param empId
     * @return
     */
    @RequestMapping("/delEmp")
    public String delEmp(Integer empId){
        empService.delEmp(empId);
        return "redirect:findList";
    }
    /**
     * 修改-回显
     * @param empId
     * @param model
     * @return
     */
    @RequestMapping("selectById")
    public String selectById(Integer empId,Model model){
        EmployeeEntity aa =empService.selectById(empId);
        model.addAttribute("emp",aa);
        return "employee/addemp";
    }

}
