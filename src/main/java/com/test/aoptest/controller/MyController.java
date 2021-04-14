package com.test.aoptest.controller;

import com.test.aoptest.service.BookService;
import com.test.aoptest.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private BookService bookService;
    @Autowired
    private HelloService helloService;

    @GetMapping("/")
    public String index(){
        bookService.findBookByTitle("spring");
        return "indexPage";
    }

    @GetMapping("/hello")
    public String hello(){
        helloService.hello();
        return "hello";
    }
}
