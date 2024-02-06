package com.example.gatewayfirstservice.controller;

import com.example.gatewayfirstservice.service.FirstServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class FirstServiceController {

    @Autowired
    private FirstServiceService service;

    @GetMapping("/message")
    public String test() throws InterruptedException {
        return "Hello from First Service";
    }

    @GetMapping("/fail")
    public ResponseEntity<String> fail() {
        return new ResponseEntity<>("first-service failed", HttpStatus.SERVICE_UNAVAILABLE);
    }

    @GetMapping("/time")
    public String time() throws Exception {
        return service.actualTimeMethod().get();
    }




}
