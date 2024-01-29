package com.bezkoder.spring.jpa.h2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.PostConstruct;

@SpringBootTest
class SpringBootJpaH2ApplicationTests {
	public static final Logger logger = LoggerFactory.getLogger(SpringBootJpaH2ApplicationTests.class);


	@Test
	void contextLoads() {
		logger.info("Application Tests Started...");
		assertEquals(true,true);
	}

	@Test
	void test2() {
		logger.info("Executing Test test2...");
		assertEquals(true,true);
	}

}
