package com.itors.fastspringboot.mapper;

import com.alibaba.fastjson.JSON;
import com.itors.fastspringboot.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper  userMapper;

    @Test
    public void getById(){
        String id = "1";
        UserInfo userInfo = userMapper.selectById(id);
        System.out.println(JSON.toJSON(userInfo));
    }

}
