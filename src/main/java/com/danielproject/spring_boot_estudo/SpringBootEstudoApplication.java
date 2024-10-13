package com.danielproject.spring_boot_estudo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootEstudoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEstudoApplication.class, args);
	}

	@RequestMapping("/")
	public String index(){
		return "Hello";
	}

}
