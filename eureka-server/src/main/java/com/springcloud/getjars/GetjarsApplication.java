package com.springcloud.getjars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GetjarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetjarsApplication.class, args);
	}
}
