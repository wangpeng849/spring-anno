package com.wangp.cap9.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Author wangp
 * @Date 2020/3/17
 * @Version 1.0
 */
@Repository
public class TestDao {
    private String flag = "1";

    @Override
    public String toString() {
        return "TestDao{" +
                "flag='" + flag + '\'' +
                '}';
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
