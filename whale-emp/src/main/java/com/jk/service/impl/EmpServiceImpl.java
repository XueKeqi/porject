package com.jk.service.impl;


import com.jk.dao.EmpMapper;
import com.jk.entity.emp.EmployeeEntity;
import com.jk.entity.emp.User;
import com.jk.service.EmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpMapper empMapper;

    @Override
    public List<EmployeeEntity> findList(EmployeeEntity employee) {
        return empMapper.findList(employee);
    }

    @Override
    public void addEmp(EmployeeEntity employee) {
        if(employee.getEmpId()==null){
            empMapper.addEmp(employee);
        }else{
            empMapper.updateEmp(employee);
        }

    }

    @Override
    public User te(User user) {
        return empMapper.te(user);
    }

    @Override
    public User tea(String name) {
        return empMapper.tea(name);
    }

    @Override
    public void delEmp(Integer empId) {
        empMapper.delEmp(empId);
    }

    @Override
    public EmployeeEntity selectById(Integer empId) {
        return empMapper.selectById(empId);
    }
}
