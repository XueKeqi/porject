package com.jk.service;

import com.jk.entity.emp.EmployeeEntity;
import com.jk.entity.emp.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "whale-emp")
public interface EmpService {
    @RequestMapping("/findList")
    public List<EmployeeEntity> findList(@RequestBody EmployeeEntity employee);

    @RequestMapping("/addEmp")
    public void addEmp(EmployeeEntity employee);

    @RequestMapping("te")
    public String te(@RequestBody User user);

    @RequestMapping("tea")
    public User tea(@RequestParam String name);
}
