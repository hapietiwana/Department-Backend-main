package com.dailyCodeBuffer.Spring.boot.tutorial.entity;

import org.springframework.http.HttpStatus;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ErrorMessage {
	
	
	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	private HttpStatus status;
	private String Message;
	
	public ErrorMessage(HttpStatus notFound, String message2) {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
