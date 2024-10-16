package com.daniel.spring_boot_estudo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/")
public class HelloWorldController {

    
    @GetMapping
    public String index(){
        return "Hello";
    }
}
