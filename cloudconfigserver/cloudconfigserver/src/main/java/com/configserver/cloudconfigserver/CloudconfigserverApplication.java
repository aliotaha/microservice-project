package com.configserver.cloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigServer
public class CloudconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudconfigserverApplication.class, args);
	}

}
