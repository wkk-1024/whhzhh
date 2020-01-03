package com.wkk.demo.service;


import com.wkk.demo.comm.Page;
import com.wkk.demo.dao.SortDAOImpl;
import com.wkk.demo.entity.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SortService {

    @Autowired
    private SortDAOImpl dao;

    //全部查询
    public Page<Sort> queryAll(Page<Sort> page){
        return dao.queryAll(page);
    }

    //添加种类
    public int add_Sort(Sort sort){
        return dao.add_Sort(sort);
    }
}
