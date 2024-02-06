package com.example.gatewayfirstservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class FirstServiceController {

    @GetMapping("/message")
    public String test(){
        return "Hello from First Service";
    }
}
