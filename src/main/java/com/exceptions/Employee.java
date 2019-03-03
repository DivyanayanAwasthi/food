package com.exceptions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.controllers.SignUpController;

public class Employee  implements Serializable{
	
	
	
	private static final Logger logger = Logger.getLogger(Employee.class);	
	
	
	public   void addNumbers() {
		
	}
	
	public String addOrder(Integer employeeId)  {
		
		
		List<Student> emp=new ArrayList<Student>();
		
		
			logger.info("Going to add employee for emp id - "+employeeId);
			List<? super Number>  myList=new ArrayList<Number>();
			
			myList.add(new Integer(1));
			myList.add(new Float(0.0));
			
			int i=5/0;
			
			//			for(int i=0;i<myList.size();i++) {
//				
//				System.out.println(myList.get(i));
//			}
//			
//			List<? extends Number>  secondList=new ArrayList<Number>();
//			myList.add(new Integer(1));
//			myList.add(new Float(0.0));
		
		
		return null;
		
		
	}

}
