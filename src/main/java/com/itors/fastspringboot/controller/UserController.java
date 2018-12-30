package com.itors.fastspringboot.controller;

import com.itors.fastspringboot.common.exception.FastSptingbootException;
import com.itors.fastspringboot.common.utils.Result;
import com.itors.fastspringboot.common.utils.ResultCode;
import com.itors.fastspringboot.common.utils.ResultUtils;
import com.itors.fastspringboot.entity.UserInfo;
import com.itors.fastspringboot.service.impl.UserServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/getUserById")
    public Result<UserInfo> getUserById(@RequestParam("id") String id){
        return ResultUtils.success(userService.getUserById(id));
    }

    @RequestMapping("/getUserByIds")
    public Result<UserInfo> getUserByIds(String id){
        throw  new FastSptingbootException(ResultCode.NO_AUTHO);
    }

}
