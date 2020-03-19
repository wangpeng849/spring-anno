package com.wangp.cap7.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author wangp
 * @Date 2020/3/17
 * @Version 1.0
 */
public class Plane implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public Plane(){
        System.out.println("Plane constructor....");
    }

    @PostConstruct
    public void post(){
        System.out.println("Plane PostConstruct");
    }

    @PreDestroy
    public void pre(){
        System.out.println("Plane PreDestroy");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
