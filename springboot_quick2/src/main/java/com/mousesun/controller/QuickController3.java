package com.mousesun.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ConfigurationProperties(prefix= "person")
public class QuickController3 {
//    get set方法就可以通过注解进行获取

    private String name;
    private String addr;
    private Integer age;

    @RequestMapping("/quick4")
    @ResponseBody
    public String quick3(){
//        获取配置文件的信息
        return "name "+name+" addr: "+addr+" age: "+age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
