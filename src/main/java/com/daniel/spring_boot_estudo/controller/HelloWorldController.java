package com.daniel.spring_boot_estudo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.spring_boot_estudo.domain.User;
import com.daniel.spring_boot_estudo.service.HelloWorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/")
public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;

    // @Autowired
    // private SDKAWS sdkAWS;
    
    @GetMapping
    public String helloWorld(){
        return helloWorldService.Test("Daniel");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable String id,@RequestParam(value = "filter", defaultValue = "none") String filter , @RequestBody User body) {
        return id + " Ola POST " + body.getName() + " " + body.getEmail();
    }
    
}
