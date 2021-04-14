package com.test.aoptest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


//이 클래스가 AOP가 바라보는 관점 정의, Bean 등록
@Aspect
@Component
public class LogAspect {
    Logger logger = LoggerFactory.getLogger(LogAspect.class);

    //BookService의 모든 메서드
    //@Around : 메서드의 실행 전 / 후, @Before : 메서드 실행 전, @After : 메서드 실행 후
    //execution 북서비스 밑의 모든 메서드에서 실행
//    @Around("execution(* com.test.aoptest.service.BookService.*(..))")
//    @Around("execution(* com.test.aoptest.controller..*.*(..))")
    @Around("execution(* com.test.aoptest..*.*(..))")
    public Object logging(ProceedingJoinPoint pjp) throws Throwable {
        logger.info("start - " + pjp.getSignature().getDeclaringTypeName() + " / " + pjp.getSignature().getName());
        Object result = pjp.proceed();
        logger.info("finished - " + pjp.getSignature().getDeclaringTypeName() + " / " + pjp.getSignature().getName());
        return result;
    }
}
