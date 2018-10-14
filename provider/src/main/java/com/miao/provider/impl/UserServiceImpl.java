package com.miao.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.miao.api.model.User;
import com.miao.api.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(Long id) {
        System.out.println("你好ID" + id);
        User user = new User();
        user.setId(id);
        user.setName("张三");
        user.setPassword("123456");
        return user;
    }
}
