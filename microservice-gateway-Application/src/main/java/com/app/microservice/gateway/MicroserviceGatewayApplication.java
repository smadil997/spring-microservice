package com.app.microservice.gateway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
@EnableEurekaClient
public class MicroserviceGatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceGatewayApplication.class, args);
	}
	
	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder){
	    return builder.routes()
	            .route(r -> r
	                    .path("/business/**")
	                    .filters(f->f.stripPrefix(1))
	                    .uri("lb://BUSINESS-ONE")
	                    .id("business-one"))
	            .route(r -> r
	                    .path("/business2/**")
	                    .filters(f->f.stripPrefix(1))
	                    .uri("lb://BUSINESS-TWO")
	                    .id("business-two"))
	            .build();
	    
	}
}
