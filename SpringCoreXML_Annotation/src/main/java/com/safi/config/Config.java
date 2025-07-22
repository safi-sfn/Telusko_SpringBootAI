package com.safi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	public Config() {
		System.out.println("Config Bean Created");
	}
	
	@Bean
	public Password createPasswordObj() {
		Password pass = new Password("SHA");
		return pass;
	}

}
