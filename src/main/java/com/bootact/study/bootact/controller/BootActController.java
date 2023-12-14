package com.bootact.study.bootact.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BootActController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello Everyone";
    }
}
