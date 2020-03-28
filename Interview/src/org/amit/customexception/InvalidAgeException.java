package org.amit.customexception;

public class InvalidAgeException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidAgeException(String message){
		super(message);
	}
}
