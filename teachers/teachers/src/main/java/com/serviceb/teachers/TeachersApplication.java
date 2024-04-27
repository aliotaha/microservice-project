package com.serviceb.teachers;

import com.serviceb.teachers.service.AccountsContactInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties({AccountsContactInfoDto.class})
public class TeachersApplication {

	public static void main(String[] args) {

		SpringApplication.run(TeachersApplication.class, args);
	}

}
