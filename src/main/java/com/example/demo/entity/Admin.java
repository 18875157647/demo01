package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: Airth
 * @Description: 管理员实体类
 * @Date: Create in 2020/7/6 16:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_admin")
public class Admin {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String username;
    private String password;
    private Integer status;
}
