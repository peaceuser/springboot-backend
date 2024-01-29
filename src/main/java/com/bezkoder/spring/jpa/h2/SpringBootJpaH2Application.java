package com.bezkoder.spring.jpa.h2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootJpaH2Application {
	public static final Logger logger = LoggerFactory.getLogger(SpringBootJpaH2Application.class);

	@PostConstruct
	public void init(){
		logger.info("Application Started...");
	}
	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(SpringBootJpaH2Application.class, args);
	}

}
