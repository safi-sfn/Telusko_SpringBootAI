package com.safi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.safi.config.Password;

public class LaunchApp {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		Password ps =container.getBean(Password.class);
		System.out.println("Password :"+ps.getAlgo());
	}

}
