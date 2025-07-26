package com.safi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.safi.service.GreetingServiceImpl;

@SpringBootApplication  //==> @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Application.class, args);
		GreetingServiceImpl greeting = container.getBean(GreetingServiceImpl.class);
		System.out.println(greeting.generateGreetings("Ahmed"));
	}

}
