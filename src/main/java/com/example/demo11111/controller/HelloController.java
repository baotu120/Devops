package com.example.demo11111.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Vic
 * @Create 2023-06-30 15:30
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return  "hello victor";
    }
}
