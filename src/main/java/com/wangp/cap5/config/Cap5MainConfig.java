package com.wangp.cap5.config;

import com.wangp.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
@Configuration
public class Cap5MainConfig {

    @Bean("person")
    public Person person(){
        System.out.println("容器中添加对象");
        return new Person();
    }

    @Bean("lison")
    @Conditional(value = WinCondition.class)
    public Person lison(){
        System.out.println("容器中添加lison...");
        return new Person("Lison",50);
    }

    @Bean("wangp") //bean的id
    @Conditional(value = LinuxCondition.class)
    public Person wangp(){
        System.out.println("容器中添加wangp...");
        return new Person("wangp",15);
    }
}
