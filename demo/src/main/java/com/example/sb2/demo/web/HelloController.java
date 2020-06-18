package com.example.sb2.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

@GetMapping("/")
public String sayHello(){
    
    System.out.println("-------------------------");
    System.out.println("-- in Hello Controller --");
    System.out.println("-------------------------");
    

    return "HELLO WORLD!";
}

}