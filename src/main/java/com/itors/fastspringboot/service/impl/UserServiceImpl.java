package com.itors.fastspringboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itors.fastspringboot.dto.UserInfoDto;
import com.itors.fastspringboot.entity.UserInfo;
import com.itors.fastspringboot.mapper.UserMapper;
import com.itors.fastspringboot.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    private final static Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfo getUserById(String id) {
        return userMapper.selectById(id);
    }

    @Override
    public Page<UserInfo> getUserListByPage(UserInfoDto userInfoDto){
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userInfoDto,userInfo);
        LambdaQueryWrapper<UserInfo> wrapper = new LambdaQueryWrapper<>();
        // 1、直接使用构造器setEntity 传入参数实体
        // wrapper.setEntity(userInfo);
        // 2、构造 这里用like构造 当然可以用其他的
        wrapper.like(UserInfo::getUserName,userInfo.getUserName());
        return (Page<UserInfo>) userMapper.selectPage(new Page<>(userInfoDto.getCurrent(),userInfoDto.getSize()),wrapper);
    }

    public boolean updateUserByUserId(UserInfoDto userInfoDto){
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userInfoDto,userInfo);
        return userMapper.updateByUserId(userInfo)==1?true:false;
    }

    @Override
    public boolean deleteUserById(Integer id){
        LOG.info("删除用户id{}",id);
        return userMapper.deleteById(id) ==1?true:false;
    }



}
