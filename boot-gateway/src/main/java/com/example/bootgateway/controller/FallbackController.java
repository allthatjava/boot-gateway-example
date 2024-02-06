package com.example.bootgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @GetMapping("/fallback/first-service")
    public Mono<String> fallbackForFirstService(){
        return Mono.just("This is fallback from first service");
    }
}
