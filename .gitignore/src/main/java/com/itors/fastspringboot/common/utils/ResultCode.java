package com.itors.fastspringboot.common.utils;

/**
 * @author itors
 * @date 2018/12/28  - 下午11:23
 */
public enum  ResultCode {

    /**
     * 系统提示类
     */
    NOT_FONUD(404,"接口不存在"),
    SYS_ERROR(500, "系统异常"),
    NO_AUTHO(401,"无权限访问"),
    PARAMETER_ERROR(10101, "参数错误"),
    SUCCESS(0, "请求成功"),

    /**
     * 业务处理类
     */
    PASSWORD_ERROR(10001, "用户名或密码错误");


    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
