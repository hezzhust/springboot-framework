package com.github.hezz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {
    public static void main(String[] args) {
//        System.setProperty("spring.devtools.restart.enabled", "false");//禁用重启
        SpringApplication.run(Application.class, args);
    }
}
