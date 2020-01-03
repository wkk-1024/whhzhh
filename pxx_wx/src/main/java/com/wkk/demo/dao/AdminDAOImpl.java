package com.wkk.demo.dao;

import com.wkk.demo.entity.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDAOImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //判断登录
    public admin Login(String a_name, String a_pwd){
        String sql = "select * from admin where a_name = ? and a_pwd = ?";
        RowMapper<admin> rowMapper = new BeanPropertyRowMapper<>(admin.class);
        admin a = null;
        try {
            a = jdbcTemplate.queryForObject(sql,rowMapper,a_name,a_pwd);
        }catch (Exception e){

        }
        return a;
    }
}
