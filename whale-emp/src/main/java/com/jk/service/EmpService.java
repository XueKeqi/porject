package com.jk.service;

import com.jk.entity.emp.EmployeeEntity;
import com.jk.entity.emp.User;

import java.util.List;

public interface EmpService {
    List<EmployeeEntity> findList(EmployeeEntity employee);

    void addEmp(EmployeeEntity employee);

    User te(User user);

    User tea(String name);
}
