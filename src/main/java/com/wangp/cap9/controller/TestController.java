package com.wangp.cap9.controller;

import com.wangp.cap9.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Author wangp
 * @Date 2020/3/17
 * @Version 1.0
 */

@Controller
public class TestController {

    @Autowired
    private TestService testService;
}
