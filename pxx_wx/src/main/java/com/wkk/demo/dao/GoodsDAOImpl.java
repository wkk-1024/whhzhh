package com.wkk.demo.dao;

import com.wkk.demo.comm.Page;
import com.wkk.demo.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GoodsDAOImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /***
     * 查询总记录数
     * @return
     */
    public Integer queryCount(){
        String sql = "select count(*) from Goods where s_added = 1";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

    /***
     * 获取查询分页结果集
     */
    public Page<Goods> queryAll(Page<Goods> page){
        page.setTotalCount(queryCount());

        String sql = "select * from Goods where s_added = 1 limit ?,? ";
        RowMapper<Goods> rowMapper = new BeanPropertyRowMapper<>(Goods.class);
        List<Goods> list = jdbcTemplate.query(sql,rowMapper,(page.getCurenPage()-1)*page.getPageSize(),page.getPageSize());
        page.setArrys(list);
        return page;
    }

    //单条查询
    public Goods getGoodsOne(Integer id){
        String sql = "select * from Goods where g_id = ?";
        RowMapper<Goods> rowMapper = new BeanPropertyRowMapper<>(Goods.class);
        return jdbcTemplate.queryForObject(sql,rowMapper,id);
    }

    //添加
    public int add_Goods(Goods g){
        String sql = "insert into Goods (g_id,g_code,g_name,g_kind,g_unit,Pic_Url,g_Intro,s_added) values(null,?,?,?,?,?,?,0);";
        return jdbcTemplate.update(sql,g.getG_code(),g.getG_name(),g.getG_kind(),g.getG_unit(),g.getPic_Url(),g.getG_Intro());
    }

    /***
     * 修改
     * 修改商品种类、单位、介绍
     * @param g
     * @return
     */
    public int update_Goods(Goods g){
        String sql = "update Goods set g_kind = ?,g_unit = ?,g_Intro = ?,g_price = ? where g_id = ?";
        return jdbcTemplate.update(sql,g.getG_kind(),g.getG_unit(),g.getG_Intro(),g.getG_price(),g.getG_id());
    }
    //删除
    public int del_Goods(Integer id){
        String sql = "DELETE FROM Goods WHERE g_id = ?";
        return jdbcTemplate.update(sql,id);
    }
    /***
     * 写入数据写入到采购表中
     */

    public int add1_buyer(Goods g){
        String sql = "insert into Buyer (g_code,g_name,pic_url,sellcount) values(?,?,?,0)";
        return jdbcTemplate.update(sql,g.getG_code(),g.getG_name(),g.getPic_Url());
    }
    /***
     * 写入数据写入到库存表中
     */

    public int add1_Stock(Goods g){
        String sql = "insert into Stock(g_code,g_name,pic_url,s_added) values(?,?,?,0)";
        return jdbcTemplate.update(sql,g.getG_code(),g.getG_name(),g.getPic_Url());
    }
}
