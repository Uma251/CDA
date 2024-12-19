package org.jsp.CDA.exceptionClass;

import lombok.Builder;

@Builder
public  class InvalidCredentialsException  extends RuntimeException{
	
	private String message;
	
	InvalidCredentialsException(){
		
		
	}
	InvalidCredentialsException(String message){
		this.message=message;
		
	}
	public String getMessage() {
		
		return this.message;
	}

	
}
