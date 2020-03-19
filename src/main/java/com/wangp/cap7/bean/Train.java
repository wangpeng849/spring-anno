package com.wangp.cap7.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Author wangp
 * @Date 2020/3/17
 * @Version 1.0
 */
@Component
public class Train implements InitializingBean, DisposableBean {
    public Train(){
        System.out.println("train constructor...");
    }

    //当bean销毁是调用
    @Override
    public void destroy() throws Exception {
        System.out.println("train destroy ....");
    }

    //当bean属性赋值和初始化完成时调用
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("train ...... afterPropertiesSet");
    }
}
