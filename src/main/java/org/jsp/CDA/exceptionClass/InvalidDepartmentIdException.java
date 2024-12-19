package org.jsp.CDA.exceptionClass;

import lombok.Builder;

@Builder
public class InvalidDepartmentIdException  extends RuntimeException{

private String message;
	
InvalidDepartmentIdException(){
		
		
	}
InvalidDepartmentIdException(String messge){
		
		this.message =message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	
	
	
}
