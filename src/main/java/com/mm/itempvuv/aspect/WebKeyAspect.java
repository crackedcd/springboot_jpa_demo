package com.mm.itempvuv.aspect;

import com.mm.itempvuv.common.finals.Keys;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
@Component
public class WebKeyAspect {

    private static final Log logger = LogFactory.getLog(WebKeyAspect.class);

    @Pointcut("execution(public * com.mm.itempvuv.controller.OpenapiController..*(..))")
    public void webKey() {
    }

    @Before("webKey()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        if (!chkKey(Arrays.toString(request.getParameterMap().get("sk")))) {
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST);
        }
    }

    private boolean chkKey(String k) {
        return k.equals("[" + Keys.WebKey + "]");
    }
}
