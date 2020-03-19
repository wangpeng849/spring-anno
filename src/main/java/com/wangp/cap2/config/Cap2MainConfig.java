package com.wangp.cap2.config;

import com.wangp.cap1.Person;
import com.wangp.cap2.controller.OrderController;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
@Configuration
//@ComponentScan(value = "com.wangp.cap2",includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)   //仅注入controller
//} ,useDefaultFilters = false)
//@ComponentScan(value = "com.wangp.cap2",excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)   //仅不注入controller
//} ,useDefaultFilters = true)
//@ComponentScan(value = "com.wangp.cap2",includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = OrderController.class)   // 仅不注入controller(FilterType.ASSIGNABLE_TYPE)
//} ,useDefaultFilters = false)
@ComponentScan(value = "com.wangp.cap2",includeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = WangpTypeFilter.class)   // 自定义(FilterType.CUSTOM)
} ,useDefaultFilters = false)
public class Cap2MainConfig {
    @Bean
    public Person person01(){
        return new Person();
    }
}
