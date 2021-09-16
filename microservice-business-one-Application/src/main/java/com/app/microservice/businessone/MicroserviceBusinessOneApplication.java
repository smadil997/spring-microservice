package com.app.microservice.businessone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages={"com.app.microservice.businessone"})
public class MicroserviceBusinessOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBusinessOneApplication.class, args);
	}

}
