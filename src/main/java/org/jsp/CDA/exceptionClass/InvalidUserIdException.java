package org.jsp.CDA.exceptionClass;

import lombok.Builder;

@Builder
public class InvalidUserIdException  extends RuntimeException{

	
	private String message;
	
	InvalidUserIdException(){
		
		
	}
	InvalidUserIdException(String messge){
		
		this.message =message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
}

