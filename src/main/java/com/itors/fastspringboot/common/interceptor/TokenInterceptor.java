package com.itors.fastspringboot.common.interceptor;

import com.itors.fastspringboot.common.exception.FastSptingbootException;
import com.itors.fastspringboot.common.utils.ResultCode;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TokenInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        //FIXME 这里只是做了一下简单的过滤，真是开发中可以将token放置redis中，在这里过滤时去redis里取token
        if(!"aOXnjYZyn==".equals(token)){
            throw  new FastSptingbootException(ResultCode.TOKEN_ERROR);
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
