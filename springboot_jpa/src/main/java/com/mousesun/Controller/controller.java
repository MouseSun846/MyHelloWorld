package com.mousesun.Controller;

import com.mousesun.domain.User;
import com.mousesun.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class controller {
    @Autowired
    private UserRepository userRepository;

    @ResponseBody
    @RequestMapping("/jpaQuery")
    public List<User> queryList(){
        return userRepository.findAll();
    }
}
