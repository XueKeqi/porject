package com.jk.entity.emp;

import lombok.Data;

@Data
public class EmployeeEntity {

    private Integer empId;
    private String  empNiCheng;
    private String  empPhone;
    private String  empZhuDepartment;
    private String  empFuDepartment;
    private String  empPosition;
    private String  empRole;
    private Integer empStatus;
    private String  empRemark;
    //
    private String deptName;
    private String roleName;
    private String staName;
}
