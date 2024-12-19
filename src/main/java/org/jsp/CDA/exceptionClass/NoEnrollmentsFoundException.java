package org.jsp.CDA.exceptionClass;

import lombok.Builder;

@Builder
public class NoEnrollmentsFoundException extends RuntimeException {

	
	private String message;
	
	NoEnrollmentsFoundException(){
				
				
			}
	NoEnrollmentsFoundException(String messge){
				
				this.message =message;
			}
			
			public String getMessage() {
				return this.message;
			}
	
}
