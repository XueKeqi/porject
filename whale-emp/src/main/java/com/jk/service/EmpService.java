package com.jk.service;

import com.jk.entity.emp.EmployeeEntity;

import java.util.List;

public interface EmpService {
    List<EmployeeEntity> findList(EmployeeEntity employee);

    void addEmp(EmployeeEntity employee);
}
