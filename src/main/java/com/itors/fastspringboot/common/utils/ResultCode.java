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
    SUCCESS(200, "请求成功"),

    /**
     * 业务处理类
     */
    PARAMETER_ERROR(10001, "未登录"),
    TOKEN_ERROR(10002, "参数错误"),
    UPDATE_ERROR(10003, "更新失败"),
    INSERT_ERROR(10004, "新增失败"),
    DEL_ERROR(10005, "删除失败");


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
