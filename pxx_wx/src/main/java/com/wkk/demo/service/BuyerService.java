package com.wkk.demo.service;

import com.wkk.demo.comm.Page;
import com.wkk.demo.dao.BuyerDAOImpl;
import com.wkk.demo.entity.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerService {

    @Autowired
    private BuyerDAOImpl dao;


    //全部查询
    public Page<Buyer> queryAll(Page<Buyer> page){
        return dao.queryAll(page);
    }

    //修改
    public int update_Buyer(Buyer b){
        return dao.update_Buyer(b);
    }
    //单条查询
    public Buyer getOne(String id){
        return dao.getOne(id);
    }

    //入库
    public int update_Stock(Buyer b){
        return dao.update_Stock(b);
    }
}
