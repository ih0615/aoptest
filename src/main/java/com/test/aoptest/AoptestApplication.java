package com.test.aoptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//AOP를 찾을 수 있게 하는 어노테이션
@EnableAspectJAutoProxy
@SpringBootApplication
public class AoptestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AoptestApplication.class, args);
    }

}
