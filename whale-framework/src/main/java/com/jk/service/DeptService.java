package com.jk.service;

import com.jk.entity.dept.DeptEntity;
import com.jk.pojo.PageResult;

import java.util.List;

public interface DeptService {

    PageResult findPage(Integer currPage, Integer pageSize);
}
