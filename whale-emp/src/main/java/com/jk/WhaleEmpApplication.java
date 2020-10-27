package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@ServletComponentScan
@EnableEurekaClient
@SpringBootApplication
public class WhaleEmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhaleEmpApplication.class);
	}

}
