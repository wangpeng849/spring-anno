package com.wangp.cap12.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import com.wangp.cap12.aop.SetValue2;

import java.lang.annotation.Annotation;

/**
 * @Author wangp
 * @Date 2020/3/19
 * @Version 1.0
 */
@Aspect
@Component
public class SetValue2Aop {

    @Pointcut("@annotation(com.wangp.cap12.aop.SetValue2)")
    public void pointCut()  {}

    @Before(value = "pointCut() && args(name)")
    public void before(JoinPoint joinPoint,String name){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        SetValue2 annotation = signature.getMethod().getAnnotation(SetValue2.class);
        if(annotation == null){
            return;
        }
        System.out.println("I will inject a value is :"+annotation.value());
        System.out.println("and hello " + name);
    }
    
}
