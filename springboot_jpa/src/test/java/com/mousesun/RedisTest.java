package com.mousesun;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mousesun.domain.User;
import com.mousesun.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

@SpringBootTest(classes = SpringbootJpaApplication.class)
public class RedisTest {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    @Autowired
    private UserRepository userRepository;
    @Test
    public void test(){
        //1、从Redis中获得数据 数据的形式json字符串.
        String userListJson = redisTemplate.boundValueOps("user.findall").get();
        //2、判断Redis中是否存在数据
        if (null == userListJson){
            //3、不存在数据 将从数据库中查询
            List<User> all = userRepository.findAll();
            //4、将查询的数据存储在Redis缓存中 SpringMVC默认集成json格式
            //向将list集合转换成json格式的字符串 使用Jackson进行转换
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                String userjson = objectMapper.writeValueAsString(all);
                redisTemplate.boundValueOps("user.findall").set(userjson);
                System.out.println("===========从数据库中获得user数据===========");

            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("===========从Redis获得user数据===========");
        }
        //3、不存在数据 将从数据库中查询

        //4、将数据在控制台打印




    }
}
