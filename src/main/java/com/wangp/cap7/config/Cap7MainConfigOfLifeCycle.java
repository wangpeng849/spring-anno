package com.wangp.cap7.config;

import com.wangp.cap1.Person;
import com.wangp.cap7.bean.Bike;
import com.wangp.cap7.bean.Jeep;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author wangp
 * @Date 2020/3/17
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.wangp.cap7.bean")
public class Cap7MainConfigOfLifeCycle {

    @Bean("person")
    public Person person() {
        System.out.println("容器中添加对象");
        return new Person();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Bike bike(){
        return new Bike();
    }


    @Bean(initMethod = "init",destroyMethod = "destroy1")
    public Jeep jeep(){
        return new Jeep();
    }

}
