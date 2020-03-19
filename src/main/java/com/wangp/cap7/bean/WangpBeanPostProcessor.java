package com.wangp.cap7.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author wangp
 * @Date 2020/3/17
 * @Version 1.0
 */
@Component
public class WangpBeanPostProcessor implements BeanPostProcessor {
    //返回一个对象
    //在初始化方法之前调用 增强功能
    //
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization....." + beanName + "---->" + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization....." + beanName + "---->" + bean);
        return bean;
    }
}
