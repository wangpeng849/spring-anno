package com.wangp.cap1;

import com.wangp.cap1.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
public class MainTest2 {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
//        Person person = (Person) context.getBean("man");
//        System.out.println(person);

        String[] namesForBean = context.getBeanNamesForType(Person.class);
        for (String s : namesForBean) {
            System.out.println(s);
        }
    }
}
