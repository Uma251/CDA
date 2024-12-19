package org.jsp.CDA.exceptionClass;

import lombok.Builder;

@Builder
public class NoFacultyFoundException  extends RuntimeException{

	
private String message;
	
NoFacultyFoundException(){
			
			
		}
NoFacultyFoundException(String messge){
			
			this.message =message;
		}
		
		public String getMessage() {
			return this.message;
		}
}
