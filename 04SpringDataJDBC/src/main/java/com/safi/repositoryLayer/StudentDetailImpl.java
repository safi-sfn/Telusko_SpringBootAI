package com.safi.repositoryLayer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.safi.modelLayer.Student;

@Repository("studentDetailBean")
public class StudentDetailImpl implements IStudentDetail {

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Override
	public void input(Student std) {
		
		
	}

	
}
