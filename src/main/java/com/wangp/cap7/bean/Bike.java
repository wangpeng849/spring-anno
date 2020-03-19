package com.wangp.cap7.bean;

/**
 * @Author wangp
 * @Date 2020/3/17
 * @Version 1.0
 */
public class Bike {

    public Bike(){
        System.out.println("Bike constructor........");
    }

    public void init(){
        System.out.println("Bike init .............");
    }

    public void destroy(){
        System.out.println("Bike destroy ...........");
    }
}
