package com.wangp.cap8.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Author wangp
 * @Date 2020/3/17
 * @Version 1.0
 */
public class Bird {
    // @Value进行赋值 1，基本字符   2，SpringEL表达式   3,读取配置文件
    @Value("${bird.name}")
    private String name;
    @Value("#{20-5}")
    private Integer age;

    @Value("${bird.color}")
    private String color;

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bird() {
    }

    public Bird(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
