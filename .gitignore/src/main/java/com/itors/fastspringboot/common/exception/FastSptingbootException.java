package com.itors.fastspringboot.common.exception;

import com.itors.fastspringboot.common.utils.ResultCode;

/**
 * 自定义异常
 * 结果异常，会被 ExceptionHandler 捕捉并返回给前端
 * @author itors
 * @date 2017/12/30
 */
public class FastSptingbootException extends RuntimeException {

    private ResultCode resultCode;

    public FastSptingbootException(ResultCode resultCode) {
        super(resultCode.getMsg());
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }
}
