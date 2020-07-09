package com.example.demo.service;

import com.example.demo.entity.Admin;

import java.util.List;

/**
 * @Author: Airth
 * @Description: 管理员业务层接口类
 * @Date: Create in 2020/7/6 16:21
 */
public interface AdminService {
    /**
     * 查询所有管理员信息
     * @return 返回所有管理源列表
     */
    public List<Admin> list();
}
