package com.jk.dao;

import com.jk.entity.emp.EmployeeEntity;
import com.jk.entity.emp.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmpMapper {
    public List<EmployeeEntity> findList(@Param("employee") EmployeeEntity employee);

    void addEmp(EmployeeEntity employee);

    User te(User user);

    User tea(String name);

    void delEmp(Integer empId);

    EmployeeEntity selectById(Integer empId);

    void updateEmp(EmployeeEntity employee);
}
