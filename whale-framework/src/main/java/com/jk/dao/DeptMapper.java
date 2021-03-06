package com.jk.dao;

import com.jk.entity.dept.DeptEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface DeptMapper {
    Long count();

    List<DeptEntity> findPage(@Param("currPage")Integer currPage,@Param("pageSize") Integer pageSize);

    void deleteall(String s);

    void add(DeptEntity dept);

    void update(DeptEntity dept);

    DeptEntity selectbyid(Integer id);
}
