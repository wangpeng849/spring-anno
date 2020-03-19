package com.wangp.cap6.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author wangp
 * @Date 2020/3/17
 * @Version 1.0
 */
public class WangpImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.wangp.cap6.bean.Fish","com.wangp.cap6.bean.Tiger"};
    }
}
