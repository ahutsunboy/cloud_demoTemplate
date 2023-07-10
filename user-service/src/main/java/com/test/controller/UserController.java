package com.test.controller;

import com.test.pojo.User;
import com.test.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author : Scott Chen
 * @create 2023/7/10 18:07
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/user/{uid}")
    public User getUserById(@PathVariable("uid") Integer uid){
        return userService.getUserById(uid);
    }
}
