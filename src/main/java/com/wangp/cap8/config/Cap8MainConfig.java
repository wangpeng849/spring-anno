package com.wangp.cap8.config;

import com.wangp.cap8.bean.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author wangp
 * @Date 2020/3/17
 * @Version 1.0
 */
@Configuration
@PropertySource(value = "classpath:/test.properties")
public class Cap8MainConfig {

    @Bean
    public Bird bird(){
        return new Bird();
    }
}
