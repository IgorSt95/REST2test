package com.example.GBSFOtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com/example/GBSFOtest")
//@EnableJpaRepositories("com/example/GBSFOtest/dao")
public class GBSFOTestApplication {

	public static void main(String[] args) {

		SpringApplication.run(GBSFOTestApplication.class, args);
	}

}
