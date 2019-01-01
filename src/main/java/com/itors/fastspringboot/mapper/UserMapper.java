package com.itors.fastspringboot.mapper;

import com.itors.fastspringboot.entity.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends SuperMapper<UserInfo>{

    Integer updateByUserId(UserInfo userInfo);



}
