package com.example.demo.baseDao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author: Airth
 * @Description: 公用mapper接口
 * @Date: Create in 2020/7/7 16:31
 */
public interface MyBaseDao<T> extends Mapper<T>, MySqlMapper<T> {
}
