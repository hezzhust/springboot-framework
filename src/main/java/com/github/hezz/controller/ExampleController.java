package com.github.hezz.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ExampleController {
    @RequestMapping("/")
    String home(){
        return "hello world !";
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(ExampleController.class, args);
    }
}
