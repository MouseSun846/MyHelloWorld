package com.mousesun;

import com.mousesun.domain.User;
import com.mousesun.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

//指名引导类
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class MyBatisTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void test(){
        List<User> users = userMapper.queryUserList();
        System.out.println(users);
    }
}
