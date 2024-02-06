package com.example.bootgateway.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Value("${service.first.uri}")
    private String firstServiceURI;
    @Value("${service.second.uri}")
    private String secondServiceURI;


    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r -> r.path("/employee/**")
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
