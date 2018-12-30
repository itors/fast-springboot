package com.itors.fastspringboot.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itors.fastspringboot.mapper.UserMapper;
import com.itors.fastspringboot.entity.UserInfo;
import com.itors.fastspringboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfo getUserById(String id) {
        return userMapper.selectById(id);
    }

    public List<UserInfo> getUserList(){
        return userMapper.selectList(null);
    }

    public Page<UserInfo> getUserListByPage(){
        return (Page<UserInfo>) userMapper.selectPage(new Page<>(1,10),null);
    }


}
