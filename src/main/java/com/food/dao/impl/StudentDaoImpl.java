package com.food.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.food.models.Student;

public class StudentDaoImpl  {

	
	  public StudentDaoImpl(DataSource dataSource) {
	        jdbcTemplate = new JdbcTemplate(dataSource);
	    }
	  
	private JdbcTemplate jdbcTemplate;
	
	public Student saveOrUpdate(Student student) {
		 String sql = "INSERT INTO student (StudentId, LastName, FirstName, Address,Email)"
                 + " VALUES (?, ?, ?, ?,?)";
     jdbcTemplate.update(sql, 1, student.getName(),
            "awasthi", "address",student.getEmail());
		return student;
	}

}
