package com.jk.dao;

import com.jk.entity.emp.EmployeeEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmpMapper {
    public List<EmployeeEntity> findList(@Param("employee") EmployeeEntity employee);

    void addEmp(EmployeeEntity employee);
}
