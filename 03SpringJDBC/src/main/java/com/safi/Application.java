package com.safi;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.safi.modelLayer.Student;
import com.safi.repositoryLayer.StudentDetailImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Application.class, args);
		StudentDetailImpl stDetail = container.getBean(StudentDetailImpl.class);
		
//		List<Student> stList = stDetail.getStudentInfo();
//		for(Student st : stList) {
//			System.out.println(st);
//		}
		
		// using Lambda expression
		stDetail.getStudentInfo().forEach(st->System.out.println(st));
	}

}
