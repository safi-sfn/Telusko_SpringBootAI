package com.safi.service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements IGreetingService {

	@Autowired		 // field Injection
	private LocalTime time;
	
	public GreetingServiceImpl() {
		System.out.println("Greeting Service impl bean");
	}

	@Override
	public String generateGreetings(String name) {
		int hour = time.getHour();
		if(hour<13) {
			return "Good Morning "+name;
		}
		else if(hour<16) {
			return "Good Afternoon "+name;
		}
		else if(hour<20) {
			return "Good Evening "+name;
		}
		else
			return "Good Night"+name;
	}

}
