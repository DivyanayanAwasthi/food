package com.exceptions;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.controllers.SignUpController;

public class Student {
	
	private static final Logger logger = Logger.getLogger(Student.class);	
	
	
	public String addOrder(Integer employeeId) throws EmployeeException  {
		
		try {
			
			logger.info("Going to add employee for emp id - "+employeeId);
			List<Object>  myList=new ArrayList<Object>();
			
			myList.add(new Student());
			
			throw new EmployeeException(ExceptionCode.INVALID_REQUEST);
			//Call to database and update the status to 1
		}
		catch(EmployeeException ex) {
			
			logger.error("Exception Occured"+ex);
			throw ex;
			
			
		}
		
		
		
		
		
	}

}
