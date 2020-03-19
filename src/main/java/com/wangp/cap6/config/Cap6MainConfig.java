package com.wangp.cap6.config;

import com.wangp.cap1.Person;
import com.wangp.cap6.bean.Cat;
import com.wangp.cap6.bean.Dog;
import com.wangp.cap6.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
@Configuration
@Import(value = { Dog.class , Cat.class , WangpImportSelector.class , WangpImportBeanDefinitionRegistrar.class})
public class Cap6MainConfig {
    /**
     * 给容器中注册组件的方式
     * 1. @Bean 【当我们导入第三方类或者包的组件】 如 person 为第三方的类，需要在我们的IOC容器中使用
     * 2，包扫描 +  组件的标注注解（@ComponentScan: @Controller @Service @Repository @Component） 一般针对自己工程类
     * 3. @import [快速给容器导入一个组件] 注意：@Bean比较简单
     *          1) @Import:引入class容器会自动注册这个组件 bean的id为类的全类名
     *          2) ImportSelector 导入到容器的全类名
     *          3) ImportBeanDefinitionRegistrar:
     * 4. 使用Spring提供的FactoryBean（工厂bean）注册
     */
    //容器启动时初始化bean实例
    @Bean("person")
    public Person person() {
        System.out.println("容器中添加对象");
        return new Person();
    }

    @Bean
    public WangpFactoryBean wangpFactoryBean() throws Exception {
        return new WangpFactoryBean();
    }
}
