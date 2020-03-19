package com.wangp.cap3.config;

import com.sun.deploy.net.protocol.ProtocolType;
import com.wangp.cap1.Person;
import org.springframework.context.annotation.*;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
@Configuration
public class Cap3MainConfig {
    //一个bean默认是单实例的
    @Bean
    /**
     * prototype:多实例：IOC容器启动的时候，不会调用方法创建对象
     * singleton（默认）:单实例，Ioc启动创建，以后每次获取都是容器获取相同的bean
     * request: 主要针对web应用 递交一次请求创建个实例
     * session:同一个session创建一个实例
     */
    @Scope(value = "prototype")//多实例
    public Person person(){
        return new Person();
    }
}
