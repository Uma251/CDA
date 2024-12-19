package org.jsp.CDA.ResponseStrcture;

import lombok.Builder;

@Builder
public class ResponseStrcture<T> {

	
	private int httpStatus;
	private String message;
	private T body;
	public int getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(int httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getBody() {
		return body;
	}
	public void setBody(T body) {
		this.body = body;
	}
	
	
	
	
}
