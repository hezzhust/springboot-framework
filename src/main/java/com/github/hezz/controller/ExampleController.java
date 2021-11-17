package com.github.hezz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
public class ExampleController {
    @RequestMapping("/")
    String home(){
        return "hello world !";
    }


}
