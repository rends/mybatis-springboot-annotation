package com.mybatis.controller;

import com.mybatis.entity.User;
import com.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @PutMapping("user/insert")
    public void insertUser(@RequestBody User user){
      userMapper.insertUser(user);
    }

    @PutMapping("user/insert2")
    public void insert(){
        User user = new User();
        user.setUsername("张三");
        user.setPassword("mimimm");
        int a =userMapper.insert(user);
        System.out.printf("a-"+a);
        System.out.println(user.getId());
    }
}
