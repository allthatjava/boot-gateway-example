package com.example.bootgateway.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import java.util.List;
import java.util.Set;

@Configuration
public class GatewayConfig {

    @Value("${service.first.uri}")
    private String firstServiceURI;
    @Value("${service.second.uri}")
    private String secondServiceURI;


    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
        System.out.println("!!!!!!!!!! gatewayRoutes Init");
        return builder.routes()
                .route(r -> r.path("/employee/**")
                                .filters(f -> f.circuitBreaker(c -> c.setName("backendA")
                                        .setFallbackUri("forward:/fallback/first-service")
                                        .setStatusCodes(Set.of("500", "502", "503", "504"))
                                ))
                        .uri(firstServiceURI)
//                        .id("employeeModule")
                )

                .route(r -> r.path("/consumer/**")
                        .uri(secondServiceURI)
//                        .id("consumerModule")
                )
                .build();
    }
}
