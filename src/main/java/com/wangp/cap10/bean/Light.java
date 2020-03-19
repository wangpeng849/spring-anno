package com.wangp.cap10.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * @Author wangp
 * @Date 2020/3/18
 * @Version 1.0
 */
//实现BeanNameAware , ApplicationContextAware
@Component
public class Light implements ApplicationContextAware,BeanNameAware, EmbeddedValueResolverAware {

    private ApplicationContext applicationContext;

    public void setBeanName(String s) {
        System.out.println("当前BeanName=" + s);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("传入IOC容器：" + applicationContext);
        this.applicationContext = applicationContext;
    }

    /**
     *
     * @param resolver 解析器
     */
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String result = resolver.resolveStringValue("雷猴,${os.name},计算:3*8 --> #{3*8}");
        System.out.println("解析的字符串为：" + result);
    }
}
