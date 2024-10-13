package com.danielproject.spring_boot_estudo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping
    public ResponseEntity getAllProducts() {
        return ResponseEntity.ok("Deu bom");
    }
    
}
