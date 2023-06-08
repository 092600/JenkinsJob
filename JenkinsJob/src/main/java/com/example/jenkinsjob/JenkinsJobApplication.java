package com.example.jenkinsjob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsJobApplication {

	private static final Logger Logger = LoggerFactory.getLogger(JenkinsJobApplication.class);

	public static void main(String[] args) {
		Logger.info("Its a continous integration job");
		SpringApplication.run(JenkinsJobApplication.class, args);
	}


}
