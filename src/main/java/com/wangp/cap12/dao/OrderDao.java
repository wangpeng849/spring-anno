package com.wangp.cap12.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @Author wangp
 * @Date 2020/3/19
 * @Version 1.0
 */
@Repository
public class OrderDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(){
        String sql = "insert into `order` (ordertime,ordermoney,orderstatus) value (?,?,?)";
        jdbcTemplate.update(sql,new Date(),20,1);
    }
}
