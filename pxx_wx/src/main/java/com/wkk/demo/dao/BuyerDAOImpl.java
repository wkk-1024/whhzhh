package com.wkk.demo.dao;


import com.wkk.demo.comm.Page;
import com.wkk.demo.entity.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BuyerDAOImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /***
     * 查询总记录数
     * @return
     */
    public Integer queryCount(){
        String sql = "select count(*) from Buyer";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

    /***
     * 获取查询分页结果集
     */
    public Page<Buyer> queryAll(Page<Buyer> page){
        page.setTotalCount(queryCount());

        String sql = "select * from Buyer limit ?,? ";
        RowMapper<Buyer> rowMapper = new BeanPropertyRowMapper<>(Buyer.class);
        List<Buyer> list = jdbcTemplate.query(sql,rowMapper,(page.getCurenPage()-1)*page.getPageSize(),page.getPageSize());
        page.setArrys(list);
        return page;
    }

    /***
     * 单条查询
     */

    //单条查询
    public Buyer getOne(String id){
        String sql = "select * from Buyer where g_code = ?";
        RowMapper<Buyer> rowMapper = new BeanPropertyRowMapper<>(Buyer.class);
        return jdbcTemplate.queryForObject(sql,rowMapper,id);
    }

    /***
     * 修改进货价与数量
     */
    public int update_Buyer(Buyer b){
        String sql = "update Buyer set g_price = ?,sellcount = ? where g_code = ?";
        return jdbcTemplate.update(sql,b.getG_price(),b.getSellcount(),b.getG_code());
    }
    /**
     *入库
     */
    public int update_Stock(Buyer b){
        String sql = "update Stock set g_price = ?,sellcount = ?,s_added = 0 where g_code = ?";
        return jdbcTemplate.update(sql,b.getG_price(),b.getSellcount(),b.getG_code());
    }
}
