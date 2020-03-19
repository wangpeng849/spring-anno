package com.wangp.cap6.config;

import com.wangp.cap6.bean.Pig;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author wangp
 * @Date 2020/3/17
 * @Version 1.0
 */
public class WangpImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     *
     * @param importingClassMetadata    当前类的注解信息
     * @param registry BeanDefinition注册类  把所有需要添加到容器中的bean加入
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean b1 = registry.containsBeanDefinition("com.wangp.cap6.bean.Dog");
        boolean b2 = registry.containsBeanDefinition("com.wangp.cap6.bean.Cat");
//        boolean b3 = registry.containsBeanDefinition("com.wangp.cap6.bean.Monkey");
        //容器中有 dog 和 cat 才添加 pig
        if(b1 && b2 ){
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Pig.class);
            registry.registerBeanDefinition("pig",rootBeanDefinition);
        }
    }
}
