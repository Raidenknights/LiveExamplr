package com.example.manas.LiveEmaple.exceptions;

import java.util.Date;

public class CustomException {
	private Date timeStamp;
	private String message;
	private String problem;
	
	public CustomException(Date timeStamp, String message, String problem) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.problem = problem;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return problem;
	}
	public void setDetails(String problems) {
		this.problem = problems;
	}	
}
