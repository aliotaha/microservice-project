package com.servicea.students;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableDiscoveryClient
public class StudentsApplication {
// test
	public static void main(String[] args) {
		SpringApplication.run(StudentsApplication.class, args);
	}

}
