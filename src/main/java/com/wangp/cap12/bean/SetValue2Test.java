package com.wangp.cap12.bean;

import com.wangp.cap12.aop.SetValue2;
import org.springframework.stereotype.Component;

/**
 * @Author wangp
 * @Date 2020/3/19
 * @Version 1.0
 */
@Component
public class SetValue2Test {

    @SetValue2("一个值")
    public void helloWorld(String name){
//        System.out.println("hello "+ name);
    }

    public void hello(){}
}
