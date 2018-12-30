package com.itors.fastspringboot.service.impl;

import com.itors.fastspringboot.mapper.UserMapper;
import com.itors.fastspringboot.entity.UserInfo;
import com.itors.fastspringboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfo getUserById(String id) {
        return userMapper.selectById(id);
    }
}
