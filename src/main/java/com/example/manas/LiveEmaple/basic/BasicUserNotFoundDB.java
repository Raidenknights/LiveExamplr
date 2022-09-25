package com.example.manas.LiveEmaple.basic;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BasicUserNotFoundDB extends RuntimeException {

	public BasicUserNotFoundDB(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
