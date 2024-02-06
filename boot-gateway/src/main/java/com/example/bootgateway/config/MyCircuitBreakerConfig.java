package com.example.bootgateway.config;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class MyCircuitBreakerConfig {

//    @Bean
//    public Customizer<Resilience4JCircuitBreakerFactory> defaultCustomizer() {
//        System.out.println("MyCircuitBreakerConfig init!!!!!!!!!!");
//
//        return factory -> factory.configureDefault(id -> new Resilience4JConfigBuilder("myCircuitBreaker")
//                .circuitBreakerConfig(CircuitBreakerConfig.custom()
//                        .waitDurationInOpenState(Duration.ofSeconds(4))
//                        .build()
//                )
//                .timeLimiterConfig(TimeLimiterConfig.custom().timeoutDuration(Duration.ofSeconds(4)).build())
//                .build());
//    }

//    @Bean
//    public Customizer<Resilience4JCircuitBreakerFactory> customCircuitBreakerFactory() {
//        System.out.println("Circuit Breaker Factory Init !!!!!!!!!");
//        return factory -> {
//            CircuitBreakerConfig circuitBreakerConfig = CircuitBreakerConfig.custom()
//                    .failureRateThreshold(50)
//                    .waitDurationInOpenState(Duration.ofMillis(10000))
//                    .build();
//
//            TimeLimiterConfig timeLimiterConfig = TimeLimiterConfig.custom()
//                    .timeoutDuration(Duration.ofSeconds(4)) // Set the timeout here
//                    .build();
//
//            factory.configure(builder -> builder.circuitBreakerConfig(circuitBreakerConfig)
//                    .timeLimiterConfig(timeLimiterConfig), "myCircuitBreaker");
//        };
//    }
}