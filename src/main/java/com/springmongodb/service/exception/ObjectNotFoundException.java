package com.springmongodb.service.exception;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -11494203602471664L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
}
