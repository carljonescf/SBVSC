package com.example.sb2.demo.web;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

@GetMapping("/")
public String sayHello(){
    return "HELLO!";
}

}