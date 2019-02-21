package com.food.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.exceptions.DaoException;
import com.exceptions.ExceptionCode;
import com.food.models.Student;


@Repository
public class StudentDaoImpl  implements StudentDao  {

	
	  public StudentDaoImpl(DataSource dataSource) {
	        jdbcTemplate = new JdbcTemplate(dataSource);
	    }
	  
	private JdbcTemplate jdbcTemplate;
	
	public Student saveOrUpdate(Student student) throws Exception {
		
	try {
		 String sql = "INSERT INTO student (StudentId, LastName, FirstName, Address,Email)"
                 + " VALUES (?, ?, ?, ?,?)";
     jdbcTemplate.update(sql, 2, student.getName(),
            "awasthi", "address",student.getEmail());
		return student;
	}
	catch(Exception ex) {
		throw new DaoException(ExceptionCode.INVALID_REQUEST) ;
	}
	}

}
