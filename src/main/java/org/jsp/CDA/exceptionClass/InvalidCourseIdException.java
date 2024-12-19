package org.jsp.CDA.exceptionClass;
import lombok.Builder;

@Builder
public class InvalidCourseIdException extends RuntimeException{
	
private String message;
	
 InvalidCourseIdException(){
		
		
	}
    InvalidCourseIdException(String messge){
		
		this.message =message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
}
