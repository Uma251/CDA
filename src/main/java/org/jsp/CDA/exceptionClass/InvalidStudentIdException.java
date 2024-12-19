package org.jsp.CDA.exceptionClass;

import lombok.Builder;

@Builder
public class InvalidStudentIdException extends RuntimeException {
 
private String message;
	
	
	public String getMessage() {
		
		return this.message;
	}
	
	InvalidStudentIdException(){
		
		
	}
	InvalidStudentIdException (String message){
		this.message = message;
	}
}
