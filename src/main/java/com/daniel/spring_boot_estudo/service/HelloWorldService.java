package com.daniel.spring_boot_estudo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String Test(String name){
        return "Aoba " + name;
    }
}
