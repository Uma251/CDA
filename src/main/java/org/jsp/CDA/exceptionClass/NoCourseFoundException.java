package org.jsp.CDA.exceptionClass;

import lombok.Builder;

@Builder
public class NoCourseFoundException extends RuntimeException {

private String message;
	
NoCourseFoundException(){
		
		
	}
NoCourseFoundException(String messge){
		
		this.message =message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	
}
