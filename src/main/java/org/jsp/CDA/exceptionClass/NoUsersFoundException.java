package org.jsp.CDA.exceptionClass;

import lombok.Builder;

@Builder
public class NoUsersFoundException  extends RuntimeException{

	
	private String message;
	
	
	public String getMessage() {
		
		return this.message;
	}
	
	NoUsersFoundException (){
		
		
	}
	NoUsersFoundException (String message){
		this.message = message;
	}
}
