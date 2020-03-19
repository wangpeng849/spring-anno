package com.wangp.cap1.config;

import com.wangp.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
//配置文件 == 配置类
@Configuration
public class MainConfig {
    @Bean("man")
    public Person person(){
        return new Person("wangp",18);
    }
}
