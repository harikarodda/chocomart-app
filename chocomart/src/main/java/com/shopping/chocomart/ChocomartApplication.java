package com.shopping.chocomart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
 
@ComponentScan("com.shopping.*")
//@EntityScan("com.shopping.entity.*")
@EntityScan("com.shopping.entity")	
//@EnableJpaRepositories("com.shopping.repository")
@EnableJpaRepositories(basePackages="com.shopping.repository")
@EnableAutoConfiguration
public class ChocomartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChocomartApplication.class, args);
		
		
		
	}
}
