package com.itors.fastspringboot.common.advice;

import com.itors.fastspringboot.common.exception.FastSptingbootException;
import com.itors.fastspringboot.common.utils.Result;
import com.itors.fastspringboot.common.utils.ResultCode;
import com.itors.fastspringboot.common.utils.ResultUtils;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

/**
 * controller 增强器
 * 异常拦截处理
 * @author itors
 * @since 2018/12/30
 */
@RestControllerAdvice
public class ExceptionHandlerAdvice {
    /**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public Result errorHandler(HttpServletRequest req,Exception ex) {
        /**
         * 404
         */
        if (ex instanceof NoHandlerFoundException) {
            return ResultUtils.warn(ResultCode.NOT_FONUD);
        /**
         *  参数异常
         */
        } else if( ex instanceof MissingServletRequestParameterException) {
            return ResultUtils.warn(ResultCode.PARAMETER_ERROR);
        /**
         *  无权限
         */
        }else if(ex instanceof FastSptingbootException){
            return ResultUtils.warn(((FastSptingbootException) ex).getResultCode());
        /**
         *  其他（视为500 系统错误）
         */
        }else{
            return ResultUtils.warn(ResultCode.SYS_ERROR);
        }
    }

}
