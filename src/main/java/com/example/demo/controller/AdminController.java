package com.example.demo.controller;

import com.example.demo.entity.Admin;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: Airth
 * @Description: 管理员控制类
 * @Date: Create in 2020/7/7 14:39
 */

@Controller
//@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Admin> list() {
        return adminService.list();
    }
}
