package com.itors.fastspringboot.controller;

import com.itors.fastspringboot.common.utils.Result;
import com.itors.fastspringboot.common.utils.ResultCode;
import com.itors.fastspringboot.common.utils.ResultUtils;
import com.itors.fastspringboot.dto.UserInfoDto;
import com.itors.fastspringboot.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    /**
     * 根据用户id查询用户
     * @param id
     * @return
     */
    @RequestMapping("/getUserById/{id}")
    public Result list(@PathVariable String id ){
         return ResultUtils.success(userService.getUserById(id));
    }
    /**
     *  分页查询用户
     * @param userInfoDto
     * @return
     */
    @RequestMapping("/listByPage")
    public Result listByPage(UserInfoDto userInfoDto){
        return ResultUtils.success(userService.getUserListByPage(userInfoDto));
    }

    /**
     * 根据用户 ID 修改用户信息
     * @param userInfoDto
     * @return
     */
    @PostMapping("/updateUserByUserId")
    public Result updateUserByUserId(UserInfoDto userInfoDto){
        if(userService.updateUserByUserId(userInfoDto)){
            return ResultUtils.success(ResultCode.SUCCESS);
        }
        return ResultUtils.error(ResultCode.UPDATE_ERROR);
    }

    /**
     * 根据用户ID 删除用户 （逻辑删除）
     * @param id
     * @return
     */
    @RequestMapping("/delUserById/{id}")
    public Result delUserById(@PathVariable Integer id){
        if(userService.deleteUserById(id)){
            return ResultUtils.success(ResultCode.SUCCESS);
        }
        return ResultUtils.error(ResultCode.DEL_ERROR);
    }



}
