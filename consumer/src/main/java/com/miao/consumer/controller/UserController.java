package com.miao.consumer.controller;

import com.miao.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.miao.api.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(Long id) {
        User user = userService.getUser(id);
        return user.toString();
    }
}
