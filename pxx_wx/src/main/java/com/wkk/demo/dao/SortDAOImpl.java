package com.wkk.demo.dao;

import com.wkk.demo.comm.Page;
import com.wkk.demo.entity.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SortDAOImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /***
     * 查询总记录数
     * @return
     */
    public Integer queryCount(){
        String sql = "select count(*) from Sort";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

    /***
     * 获取查询分页结果集
     */
    public Page<Sort> queryAll(Page<Sort> page){
        page.setTotalCount(queryCount());

        String sql = "select * from Sort limit ?,? ";
        RowMapper<Sort> rowMapper = new BeanPropertyRowMapper<>(Sort.class);
        List<Sort> list = jdbcTemplate.query(sql,rowMapper,(page.getCurenPage()-1)*page.getPageSize(),page.getPageSize());
        page.setArrys(list);
        return page;
    }

    /***
     * 添加种类
     */
    public int add_Sort(Sort s){
        String sql = "insert into Sort values (?,?,?)";
        return jdbcTemplate.update(sql,s.getSort_id(),s.getG_kind(),s.getSort_details());
    }
}
