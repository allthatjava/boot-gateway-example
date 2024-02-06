package com.example.gatewayfirstservice.service;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class FirstServiceService {

//    @Bulkhead(name = "backendA", type = Bulkhead.Type.THREADPOOL)
//    @CircuitBreaker(name = "backendA", fallbackMethod = "fallback")
//    @TimeLimiter(name = "backendA")
    public CompletableFuture<String> actualTimeMethod() throws Exception {

//        if( true ) throw new Exception("intend error");

        Thread.sleep(10000);
        System.out.println("10000 milli second passed");
        return CompletableFuture.completedFuture("10 seconds passed");
    }

    private CompletableFuture<String> fallback(Throwable t){
        return CompletableFuture.completedFuture("fallback from /time end point");
    }
}
