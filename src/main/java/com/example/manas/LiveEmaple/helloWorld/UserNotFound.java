package com.example.manas.LiveEmaple.helloWorld;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFound extends RuntimeException {

	public UserNotFound(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/*public UserNotFound() {
		super();
		// TODO Auto-generated constructor stub
	}*/
	
	
}
