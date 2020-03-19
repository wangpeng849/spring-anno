package com.wangp.cap9.bean;

import org.springframework.stereotype.Component;

/**
 * @Author wangp
 * @Date 2020/3/18
 * @Version 1.0
 */
@Component
public class Moon {
    public Moon (){
        System.out.println("Moon constructor...");
    }

    public void init(){
        System.out.println("Moon init...");
    }

    public void destroy(){
        System.out.println("Moon destroy...");
    }


}
