package com.example.demo.service.impl;

import com.example.demo.entity.Admin;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Airth
 * @Description: 管理员业务接口实现类
 * @Date: Create in 2020/7/6 16:23
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    /**
     * 查询所有管理员信息
     *
     * @return 返回所有管理源列表
     */
    @Override
    public List<Admin> list() {
        return adminMapper.selectAll();
    }
}
