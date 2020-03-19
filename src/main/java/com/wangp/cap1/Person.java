package com.wangp.cap1;

/**
 * @Author wangp
 * @Date 2020/3/16
 * @Version 1.0
 */
public class Person {
    private String name;
    private Integer age;

    public Person(){
        super();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
