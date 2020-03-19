package com.wangp.cap11.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @Author wangp
 * @Date 2020/3/18
 * @Version 1.0
 */
//日志切面类
@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.wangp.cap11.aop.Calculator.*(..))")
    public void pointCut(){}

    //@before指定在哪个方法前切入
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        System.out.println("除法运行前...参数列表是：{"+ Arrays.asList(joinPoint.getArgs())+"}");
    }

    @After("pointCut()")
    public void logEnd(){
        System.out.println("除法结束.....");
    }

    @AfterReturning(value = "pointCut()",returning = "result")
    public void logReturn(Object result){
        System.out.println("除法正常结束.....运行结果是：{"+result+"}");
    }

    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void logException(Exception exception){
        System.out.println("除法异常结束.....异常信息是：{"+exception+"}");
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("方法前");
        Object obj = joinPoint.proceed();
        System.out.println("方法后");
        return obj;
    }
}
