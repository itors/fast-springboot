package com.itors.fastspringboot.service;

import com.itors.fastspringboot.common.utils.ResultCode;
import com.itors.fastspringboot.common.exception.ResultException;
import com.itors.fastspringboot.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author itors
 * @date 2018/12/28  - 下午11:52
 */
@Service
public interface IUserService {

    UserInfo getUserById(String id);


}
