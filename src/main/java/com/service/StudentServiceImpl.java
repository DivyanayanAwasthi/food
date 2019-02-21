package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.dao.impl.StudentDao;
import com.food.models.Student;

@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	private StudentDao studentDao;
	public Student saveOrUpdate(Student student) throws Exception {
		
		return studentDao.saveOrUpdate(student);
	}

}
