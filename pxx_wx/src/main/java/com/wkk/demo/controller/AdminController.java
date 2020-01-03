package com.wkk.demo.controller;

import com.wkk.demo.entity.admin;
import com.wkk.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @Autowired
    private AdminService service;

    @RequestMapping("/login")
    public String Login(String a_name, String a_pwd){
        admin admin = service.Login(a_name,a_pwd);
        if (admin != null){
            return "forward:queryProByPage/1";

        }else {
            return "login";
        }

    }
}
