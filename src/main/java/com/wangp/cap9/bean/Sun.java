package com.wangp.cap9.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author wangp
 * @Date 2020/3/18
 * @Version 1.0
 */
@Component
public class Sun {
    @Autowired
    private Moon moon;

    public Sun() {
        System.out.println("sun constructor...");
    }

//    @Autowired
    public Sun(Moon moon) {
        this.moon = moon;
    }

    public Moon getMoon() {
        return moon;
    }

//    @Autowired
    public void setMoon(Moon moon) {
        this.moon = moon;
    }

    @Override
    public String toString() {
        return "Sun{" +
                "moon=" + moon +
                '}';
    }
}
