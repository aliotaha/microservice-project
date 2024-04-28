package com.servicea.students;

import com.servicea.students.service.AccountsContactInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties({AccountsContactInfoDto.class})
public class StudentsApplication {
// test
	public static void main(String[] args) {
		SpringApplication.run(StudentsApplication.class, args);
	}

}
