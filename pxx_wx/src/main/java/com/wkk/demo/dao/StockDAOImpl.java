package com.wkk.demo.dao;

import com.wkk.demo.comm.Page;
import com.wkk.demo.entity.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StockDAOImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /***
     * 查询总记录数
     * @return
     */
    public Integer queryCount(){
        String sql = "select count(*) from Stock";

        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

    /***
     * 获取查询分页结果集
     */
    public Page<Stock> queryAll(Page<Stock> page){
        page.setTotalCount(queryCount());

        String sql = "select * from Stock limit ?,?";
        RowMapper<Stock> rowMapper = new BeanPropertyRowMapper<>(Stock.class);
        List<Stock> list = jdbcTemplate.query(sql,rowMapper,(page.getCurenPage()-1)*page.getPageSize(),page.getPageSize());
        page.setArrys(list);
        return page;
    }

    /***
     * 单条查询
     */

    public Stock getOne(String id){
        String sql = "select * from Stock where g_code = ?";
        RowMapper<Stock> rowMapper = new BeanPropertyRowMapper<>(Stock.class);
        return jdbcTemplate.queryForObject(sql,rowMapper,id);
    }
    /**
     * 上架商品
     */
    public int update_Stock(Stock s ){
        String sql = "update Stock set g_price = ?,s_added = 1 where g_code = ?";
        return jdbcTemplate.update(sql,s.getG_price(),s.getG_code());
    }
    /***
     * 修改商品表中上下架状态
     */
    public int update_Goods_Added(Stock s){
        String sql = "update Goods set g_price = ?,sellcount = ?,s_added = 1 where g_code = ?";
        return jdbcTemplate.update(sql,s.getG_price(),s.getSellcount(),s.getG_code());
    }
    /***
     * 下架商品
     */
    public int update_Stock1(Stock s ){
        String sql = "update Stock set s_added = 0 where g_code = ?";
        return jdbcTemplate.update(sql,s.getG_code());
    }

    /***
     * 修改商品表中上下架状态
     */
    public int update_Goods_Added1(Stock s){
        String sql = "update Goods set s_added = 0 where g_code = ?";
        return jdbcTemplate.update(sql,s.getG_code());
    }
}
