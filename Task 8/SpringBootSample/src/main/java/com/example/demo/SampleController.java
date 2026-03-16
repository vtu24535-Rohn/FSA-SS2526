package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public String home() {
        return "Welcome! Spring Boot Servlet is running by Roohan.";
    }

    @GetMapping("/Roohan")
    public String sayHello() {
        return "Hello! Spring Boot Servlet is working By Roohan.";
    }
}