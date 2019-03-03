package com.exceptions;

public class EmployeeException extends Exception {

	/**
	 * 
	 */
	
	String errorMessage;
	String errorCode;
	public EmployeeException(ExceptionCode exceptionCode) {
		this.errorMessage=exceptionCode.getMsg();
		this.errorCode=exceptionCode.getId();
	}
	
	public EmployeeException(String errorMessage) {
		this.errorMessage=errorMessage;
	}

	private static final long serialVersionUID = 1L;
	public String exceptionCode;
	
}
