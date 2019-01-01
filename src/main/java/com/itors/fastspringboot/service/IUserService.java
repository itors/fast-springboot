package com.itors.fastspringboot.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itors.fastspringboot.dto.UserInfoDto;
import com.itors.fastspringboot.entity.UserInfo;
import org.springframework.stereotype.Service;

/**
 * @author itors
 * @date 2018/12/28  - 下午11:52
 */
@Service
public interface IUserService {

    /**
     * 根据用户Id查询用户信息
     * @param id
     * @return
     */
    UserInfo getUserById(String id);

    /**
     * 分页查询用户信息
     * @return
     */
    Page<UserInfo> getUserListByPage(UserInfoDto userInfoDto);

    /**
     * 更新用户信息
     * @param userInfoDto
     * @return
     */
    boolean updateUserByUserId(UserInfoDto userInfoDto);


    /**
     * 逻辑删除用户
     *  （将用户的状态置为无效）
     * @param id
     * @return
     */
    boolean deleteUserById(Integer id);


}
