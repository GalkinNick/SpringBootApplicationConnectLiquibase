package com.example.springbootapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringApp {
    public static void main(String[] args) {
        ApplicationContext contexn = SpringApplication.run(SpringApp.class, args);
    }
}
