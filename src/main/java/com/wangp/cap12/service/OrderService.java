package com.wangp.cap12.service;

import com.wangp.cap12.aop.SetValue;
import com.wangp.cap12.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author wangp
 * @Date 2020/3/19
 * @Version 1.0
 */
@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    @SetValue(value = 2)
    private int value;

    @Transactional
    public void addOrder(){
        orderDao.insert();
        System.out.println("操作完成");
        System.out.println(value);
        int i = 2/Integer.valueOf(value);
    }
}
