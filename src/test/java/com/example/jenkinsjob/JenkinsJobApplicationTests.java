package com.example.jenkinsjob;

import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsJobApplicationTests {

	public static final Logger Logger = LoggerFactory.getLogger(JenkinsJobApplicationTests.class);

	@Test
	void contextLoads() {
		Logger.info("Its a test class");
		assertEquals(true, true);
	}

}
