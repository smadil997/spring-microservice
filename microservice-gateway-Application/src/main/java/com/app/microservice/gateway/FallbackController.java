package com.app.microservice.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/businessOneFallBack")
    public Mono<String> buinessOneServiceFallBack() {
        return Mono.just("Business Service is taking too long to respond or is down. Please try again later");
    }
//    @RequestMapping("/paymentFallback")
//    public Mono<String> paymentServiceFallBack() {
//        return Mono.just("Payment Service is taking too long to respond or is down. Please try again later");
//    }
}