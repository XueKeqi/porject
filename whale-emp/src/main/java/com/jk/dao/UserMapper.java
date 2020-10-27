package com.jk.dao;

import com.jk.entity.emp.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    User findAll(String name);
}
