package com.valadez.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.Gen9EurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class Gen9EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Gen9EurekaServerApplication.class, args);
	}

}
