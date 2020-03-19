package com.wangp.cap2.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
public class WangpTypeFilter implements TypeFilter {


    private ClassMetadata classMetadata;

    /**
     *
     * @param metadataReader   读取当前正在扫描类的信息
     * @param metadataReaderFactory    可以获取其他任何类的信息
     * @return
     * @throws IOException
     */
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前类注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //获取正在扫描的类的信息
        classMetadata = metadataReader.getClassMetadata();
        //获取当前类资源（类的路劲）
        Resource resource = metadataReader.getResource();

        String className = classMetadata.getClassName();
        System.out.println("classname  -----> " + className);
//        if(className.contains("er")){
//            return true;
//        }
        //返回true 则会注入 bean
        //返回false 则不会注入 bean
        return false;
    }
}
