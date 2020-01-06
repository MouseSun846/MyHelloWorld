package com.mousesun.controller;

import com.mousesun.domain.User;
import com.mousesun.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MyBatisController {

    /**
     * 红线警告是因为还容器还没有没有创建mapper
     */
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/mybatis")
    @ResponseBody
    public List<User> queryUserList(){
        List<User> users = userMapper.queryUserList();
        return users;
    }

}
