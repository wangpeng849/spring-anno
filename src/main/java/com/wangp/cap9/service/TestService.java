package com.wangp.cap9.service;

import com.wangp.cap9.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author wangp
 * @Date 2020/3/17
 * @Version 1.0
 */

@Service
public class TestService {
    @Qualifier("testDao")  //优先导入testDao2 从容器中拿指定名字的bean  一般与@Autowired连用
    @Autowired
    //@Resource(name = "testDao")  //效果与@Autowired一样
    private TestDao testDao;

    public void print(){
        System.out.println(testDao);
    }
}
