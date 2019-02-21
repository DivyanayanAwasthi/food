package com.exceptions;

public class DaoException extends Exception {

	
	/**
	 * 
	 */
	
	String errorMessage;
	String errorCode;
	public DaoException(ExceptionCode exceptionCode) {
		this.errorMessage=exceptionCode.getMsg();
		this.errorCode=exceptionCode.getId();
	}
	
	public DaoException(String errorMessage) {
		this.errorMessage=errorMessage;
	}

	private static final long serialVersionUID = 1L;
	public String exceptionCode;
	
	
}
