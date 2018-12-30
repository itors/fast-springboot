package com.itors.fastspringboot.controller;

import com.itors.fastspringboot.common.exception.FastSptingbootException;
import com.itors.fastspringboot.common.utils.Result;
import com.itors.fastspringboot.common.utils.ResultCode;
import com.itors.fastspringboot.common.utils.ResultUtils;
import com.itors.fastspringboot.entity.UserInfo;
import com.itors.fastspringboot.service.impl.UserServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/{id}")
    public Result<UserInfo> getUserById(@PathVariable String id){
        return ResultUtils.success(userService.getUserById(id));
    }

    @RequestMapping("/list")
    public Result<UserInfo> list(HttpServletRequest request, HttpServletResponse response){
         return ResultUtils.success(userService.getUserList());
    }
    @RequestMapping("/listByPage")
    public Result<UserInfo> listByPage(Integer pageSize,Integer page){
        return ResultUtils.success(userService.getUserListByPage());
    }



}
