package com.mousesun.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickController2 {
//    get set方法就可以通过注解进行获取
    @Value("${name}")
    private String name;

    @Value("${person.addr}")
    private String addr;

    @RequestMapping("/quick3")
    @ResponseBody
    public String quick3(){
//        获取配置文件的信息
        return "name "+name+" addr: "+addr;
    }
}
