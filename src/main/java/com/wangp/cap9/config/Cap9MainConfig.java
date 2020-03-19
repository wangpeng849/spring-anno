package com.wangp.cap9.config;

import com.wangp.cap9.dao.TestDao;
import org.springframework.context.annotation.*;

/**
 * @Author wangp
 * @Date 2020/3/17
 * @Version 1.0
 */
@Configuration
@ComponentScan({"com.wangp.cap9.controller","com.wangp.cap9.service","com.wangp.cap9.dao","com.wangp.cap9.bean"})
public class Cap9MainConfig {

    @Primary //首选默认bean
    @Bean("testDao2")
    public TestDao testDao(){
        TestDao testDao = new TestDao();
        testDao.setFlag("2");
        return testDao;
    }
}
