package com.jk.service.impl;

import com.jk.dao.EmpMapper;
import com.jk.entity.emp.EmployeeEntity;
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
        empMapper.addEmp(employee);
    }
}
