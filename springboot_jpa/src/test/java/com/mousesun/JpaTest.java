package com.mousesun;

import com.mousesun.domain.User;
import com.mousesun.repository.UserRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest(classes = SpringbootJpaApplication.class)
public class JpaTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void test(){
        List<User> all = userRepository.findAll();
        System.out.println(all);
    }
}
