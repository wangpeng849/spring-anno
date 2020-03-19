package com.wangp.cap11.config;

import com.wangp.cap11.aop.Calculator;
import com.wangp.cap11.aop.LogAspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * @Author wangp
 * @Date 2020/3/18
 * @Version 1.0
 */

/**
 * 日志切面类的方法需要动态感知div()方法运行，
 *      通知方法：
 *          前置通知：logStart(),在执行div()之前执行    --> @Before
 *          后置通知：logEnd(),在执行div()之后执行，不管有没有异常 --> @After
 *          返回通知：logReturn(),在正常执行div()之后执行， --> @AfterReturning
 *          异常通知：logException(),在执行div()出现异常之后执行， --> @AfterThrowing
 *          环绕通知：logAround(),手动执行joinPoint.proceed()才执行div() --> @Around
 */
@Configuration
@Import(LogAspects.class)
@EnableAspectJAutoProxy
public class Cap11MainConfig {

    @Bean
    public Calculator calculator(){
        return new Calculator();
    }
}
