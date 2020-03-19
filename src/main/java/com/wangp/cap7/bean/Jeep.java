package com.wangp.cap7.bean;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author wangp
 * @Date 2020/3/17
 * @Version 1.0
 */
public class Jeep implements InitializingBean, DisposableBean {
    public Jeep(){
        System.out.println("Jeep constructor....");
    }

    @PostConstruct
    public void post(){
        System.out.println("Jeep PostConstruct");
    }

    public void init(){
        System.out.println("Jeep init ....");
    }

    @PreDestroy
    public void pre(){
        System.out.println("Jeep PreDestroy");
    }

    public void destroy1(){
        System.out.println("Jeep destroy ...");
    }

    public void destroy(){
        System.out.println("Jeep DisposableBean ...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Jeep afterPropertiesSet ... ");
    }
}
