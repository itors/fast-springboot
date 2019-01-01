package com.itors.fastspringboot.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;

import java.io.Serializable;

public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String userId;
    private String userName;
    private String passWord;

    @TableLogic
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
