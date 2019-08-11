package com.stackroute.configurationserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigurationServerApplication {
	private static final Logger log = (Logger) LoggerFactory.getLogger(ConfigurationServerApplication.class);
	public static void main(String[] args) {


		SpringApplication.run(ConfigurationServerApplication.class, args);
		log.debug("This is main class");
	}

}
