package org.jsp.CDA.exceptionClass;

import lombok.Builder;

@Builder
public class InvalidAdminIdException  extends RuntimeException{

	private String message;
	
	InvalidAdminIdException(){
			
			
		}
	InvalidAdminIdException(String messge){
			
			this.message =message;
		}
		
		public String getMessage() {
			return this.message;
		}
		
	
}
