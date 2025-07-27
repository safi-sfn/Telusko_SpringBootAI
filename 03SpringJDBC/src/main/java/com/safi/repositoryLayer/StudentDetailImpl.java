package com.safi.repositoryLayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.safi.modelLayer.Student;

@Repository("studentDetailBean")
public class StudentDetailImpl implements IStudentDetail {

	private static final String SQL_QUERY = "SELECT * FROM StudentDetail";
	
	@Autowired
	private DataSource dataSource;
	
	
	
	List<Student> students = null;
	
	@Override
	public List<Student> getStudentInfo() {
	
		try {
			Connection connection = dataSource.getConnection();
//			System.out.println("DataSource is : "+connection.getClass().getName());
			PreparedStatement prst = connection.prepareStatement(SQL_QUERY);
			ResultSet rs = prst.executeQuery();
			
			students = new ArrayList<>();
			
			while(rs.next()) {
				Student std = new Student();
				std.setStId(rs.getInt(1));
				std.setStGender(rs.getString(2));
				std.setStCity(rs.getString(3));
				std.setStName(rs.getString(4));
				
				students.add(std);
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return students;
	}

}
