package com.online.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.online")
@EntityScan(basePackages= {"com.online.model"})
@SpringBootApplication
public class OnlineSellingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineSellingApplication.class, args);
	}

}
