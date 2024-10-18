package com.daniel.spring_boot_estudo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.spring_boot_estudo.service.HelloWorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/")
public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;

    @Autowired
    private SDKAWS sdkAWS;
    
    @GetMapping
    public String HelloWorld(){
        return helloWorldService.Test("Daniel");
    }
}
