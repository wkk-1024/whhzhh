package com.wkk.demo.service;

import com.wkk.demo.dao.AdminDAOImpl;
import com.wkk.demo.entity.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminDAOImpl dao;

    public admin Login(String a_uname, String a_pwd){
        return dao.Login(a_uname,a_pwd);
    }
}
