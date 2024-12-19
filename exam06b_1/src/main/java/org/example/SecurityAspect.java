package org.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
@Order(1)
public class SecurityAspect {
    private static final Logger logger = Logger.getLogger(SecurityAspect.class.getName());

    @Around("@annotation(ToLog)")
    public Object secure(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("############# SECURITY secure 실행 #################");

        Object returnValue = joinPoint.proceed();
        logger.info("호출 결과 :" + returnValue);
        logger.info("############# SECURITY secure 실행 완료 #################");
        return returnValue;
    }



}
