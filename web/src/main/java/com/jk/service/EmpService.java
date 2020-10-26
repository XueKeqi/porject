package com.jk.service;

import com.jk.entity.emp.EmployeeEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "whale-emp")
public interface EmpService {
    @RequestMapping("/findList")
    public List<EmployeeEntity> findList(@RequestBody EmployeeEntity employee);
}
