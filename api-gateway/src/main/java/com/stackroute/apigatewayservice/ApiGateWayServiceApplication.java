package com.stackroute.apigatewayservice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ApiGateWayServiceApplication {
	private static final Logger logger = LoggerFactory.getLogger(ApiGateWayServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ApiGateWayServiceApplication.class, args);
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is warn message");
		logger.error("This is error message");



	}

}
