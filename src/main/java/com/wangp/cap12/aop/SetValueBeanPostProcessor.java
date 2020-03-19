package com.wangp.cap12.aop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * @Author wangp
 * @Date 2020/3/19
 * @Version 1.0
 */
@Component
public class SetValueBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] declaredFields = bean.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            SetValue setValue = declaredField.getAnnotation(SetValue.class);
            if(setValue == null){
                continue;
            }
            declaredField.setAccessible(true);
            try {
                declaredField.set(bean,setValue.value());
            } catch (IllegalAccessException e) {
                System.out.println("错误信息---->"+e.getMessage());
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
