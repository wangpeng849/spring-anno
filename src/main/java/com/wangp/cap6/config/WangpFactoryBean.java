package com.wangp.cap6.config;

import com.wangp.cap6.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author wangp
 * @Date 2020/3/17
 * @Version 1.0
 */
public class WangpFactoryBean implements FactoryBean<Monkey> {
    @Override
    public Monkey getObject() throws Exception {
        return new Monkey();
    }

    @Override
    public Class<?> getObjectType() {
        return Monkey.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
