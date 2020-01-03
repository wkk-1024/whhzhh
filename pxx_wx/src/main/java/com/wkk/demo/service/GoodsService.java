package com.wkk.demo.service;

import com.wkk.demo.comm.Page;
import com.wkk.demo.dao.GoodsDAOImpl;
import com.wkk.demo.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsService {

    @Autowired
    private GoodsDAOImpl dao;
//全部查询
    public Page<Goods> queryAll(Page<Goods> page){
        return dao.queryAll(page);
    }
    //单条查询
    public Goods getGoodsOne(Integer id){
        return dao.getGoodsOne(id);
    }

    //修改
    public int update_Goods(Goods g){
        return dao.update_Goods(g);
    }

    //添加
    public int add_Goods(Goods g){
        return dao.add_Goods(g);
    }

    //删除
    public int del_Goods(Integer id){
        return dao.del_Goods(id);
    }

    public int add1_buyer(Goods g){
        return dao.add1_buyer(g);
    }

    public int add1_Stock(Goods g){
        return dao.add1_Stock(g);
    }
}
