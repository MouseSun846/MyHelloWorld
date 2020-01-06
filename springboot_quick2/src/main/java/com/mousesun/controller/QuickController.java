package com.mousesun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController 将controller与responsebody绑定在一起
 */
@RestController
public class QuickController {

    @RequestMapping("/quick2")
    public String quick(){
        return "springBoot ! By：繁花落叶" +
                "springBoot ! By：繁花落叶";
    }
}
