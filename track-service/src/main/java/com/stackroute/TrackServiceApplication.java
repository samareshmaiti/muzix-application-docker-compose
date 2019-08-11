package com.stackroute;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class TrackServiceApplication {

	public static void main(String[] args) {
		log.debug("This is the main debug message");
		SpringApplication.run(TrackServiceApplication.class, args);
	}

}
