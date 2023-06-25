package com.housney.lolvs.common.aspect;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
@RequiredArgsConstructor
public class ControllerAuthAspect {

    @Before("@annotation(org.springframework.web.bind.annotation.RequestMapping) && "
            +" execution(* com.housney.lolvs..controller.*Controller.*(..))")
    public void preSetAuthArg(JoinPoint joinPoint) throws Throwable {
        //TODO :: 토큰 가져와서 권한 셋팅필요

        ServletRequestAttributes servletContainer = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = servletContainer.getRequest();

        String uri = request.getRequestURI();
        System.out.println("uri :: " + uri);
    }
}
