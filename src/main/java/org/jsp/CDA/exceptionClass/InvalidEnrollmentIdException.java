package org.jsp.CDA.exceptionClass;

import lombok.Builder;

@Builder
public class InvalidEnrollmentIdException  extends RuntimeException{

	private String message;
	
	InvalidEnrollmentIdException(){
				
				
			}
	InvalidEnrollmentIdException(String messge){
				
				this.message =message;
			}
			
			public String getMessage() {
				return this.message;
			}
	
			
	
}
