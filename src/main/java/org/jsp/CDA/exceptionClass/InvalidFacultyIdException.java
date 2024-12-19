package org.jsp.CDA.exceptionClass;

import lombok.Builder;

@Builder
public class InvalidFacultyIdException  extends RuntimeException{

	
	private String message;
	
	InvalidFacultyIdException(){
				
				
			}
	InvalidFacultyIdException(String messge){
				
				this.message =message;
			}
			
			public String getMessage() {
				return this.message;
			}

			
}
