package com.example.psidiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PsiDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsiDiscoveryServerApplication.class, args);
	}

}
