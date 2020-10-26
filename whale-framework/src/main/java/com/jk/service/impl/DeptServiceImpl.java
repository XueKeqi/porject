package com.jk.service.impl;

import com.jk.dao.DeptMapper;
import com.jk.entity.dept.DeptEntity;
import com.jk.pojo.PageResult;
import com.jk.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptMapper deptMapper;

    @Override
    public PageResult findPage(Integer currPage, Integer pageSize) {
        Long total = deptMapper.count();
        List<DeptEntity> deptlist=deptMapper.findPage(currPage, pageSize);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total, deptlist, currPage, pageSize, totalPage);
    }
}
