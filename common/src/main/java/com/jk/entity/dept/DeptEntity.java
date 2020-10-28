package com.jk.entity.dept;

import lombok.Data;

@Data
public class DeptEntity {
    private Integer deptId;
    private String  deptText;
    private Integer deptType;
    private Integer deptPid;
    private String  deptNicheng;
    private String  deptPhone;
    private String deptBeizhu;

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
