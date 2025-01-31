package com.example.URL.Shortener.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UrlController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
