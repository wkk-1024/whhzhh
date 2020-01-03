package com.wkk.demo.service;

import com.wkk.demo.comm.Page;
import com.wkk.demo.dao.StockDAOImpl;
import com.wkk.demo.entity.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @Autowired
    private StockDAOImpl dao;

    //全部查询
    public Page<Stock> queryAll(Page<Stock> page){
        return dao.queryAll(page);
    }

    //单条查询
    public Stock getOne(String id){
        return dao.getOne(id);
    }

    //上架商品
    public int update_Stock(Stock s){
        return dao.update_Stock(s);
    }

    //修改goods下架
    public int update_Goods_Added(Stock stock){
        return dao.update_Goods_Added(stock);
    }

    //下架商品
    public int update_Stock1(Stock s){
        return dao.update_Stock1(s);
    }

    //修改goods下架
    public int update_Goods_Added1(Stock stock){
        return dao.update_Goods_Added1(stock);
    }
}
