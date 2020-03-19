package com.wangp.cap11.aop;

/**
 * @Author wangp
 * @Date 2020/3/18
 * @Version 1.0
 */
public class Calculator {
    //业务逻辑方法
    public int div(int i, int j) {
            System.out.println("---------------");
            return i / j;
    }
}
