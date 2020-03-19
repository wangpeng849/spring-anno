package com.wangp.cap4.config;

import com.wangp.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
@Configuration
public class Cap4MainConfig {
    @Bean
    /**
     * 懒加载：针对单实例bean：默认在容器启动时创建对象
     * 懒加载：容器启动的时候不创建对象，仅在使用（获取）bean的时候才创建初始化
     */
//    @Lazy
    public Person person(){
        System.out.println("容器中添加对象");
        return new Person();
    }
}
