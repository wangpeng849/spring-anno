package com.wangp.cap5.config;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
public class WinCondition implements Condition {
    /**
     *       是否为windows操作系统
     * @param context 判断条件可以使用的上下文
     * @param metadata 注解信息
     * @return
     */
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //问  FactoryBean 和 BeanFactory 区别
        //FactoryBean 可以把我们java实例通过FactoryBean注入到容器中
        //BeanFactory 从我们容器中获取实例化后的bean
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //获取环境变量 是windows还是Linux
        Environment environment = context.getEnvironment();
        String osName = environment.getProperty("os.name");
        if(osName.contains("Windows")){
            return true;
        }
        return false;
    }
}
