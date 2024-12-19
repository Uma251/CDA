package org.jsp.CDA.exceptionClass;

import lombok.Builder;

@Builder
public class NoDepartmentFoundException  extends RuntimeException{

	private String message;
	
	NoDepartmentFoundException(){
			
			
		}
	NoDepartmentFoundException(String messge){
			
			this.message =message;
		}
		
		public String getMessage() {
			return this.message;
		}
		
	
		
	
}
