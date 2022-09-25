/*import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.context.request.WebRequest;

/*package com.example.manas.LiveEmaple.exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.manas.LiveEmaple.helloWorld.UserNotFound;
import com.fasterxml.jackson.core.JsonParseException;


@ControllerAdvice
@RestController
public class HandlingExceptions extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex,WebRequest web){

		CustomException customException = new CustomException(new Date(),ex.getMessage(),web.getDescription(false));
		if (ex instanceof HttpMessageNotReadableException) {
			return new ResponseEntity(customException,HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity(customException,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(UserNotFound.class)
	public final ResponseEntity<Object> UserNotFoundException(Exception ex,WebRequest req){
		CustomException customException = new CustomException(new Date(),ex.getMessage(),req.getDescription(false));
		
		return new ResponseEntity(customException,HttpStatus.NOT_FOUND);
	}
	 @Override
	 protected ResponseEntity<Object> handleMethodArgumentNotValid(
				MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) 
	 	{
		 CustomException exceptionResponse= new CustomException(new Date(),"Not a valid Input",
				 request.getDescription(false));

			return new ResponseEntity(exceptionResponse,HttpStatus.BAD_REQUEST);
	 	}
	/* @ExceptionHandler(HttpMessageConversionException.class)
	 protected ResponseEntity<Object> handleHttpValid (
			 HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) 
	 	{
		 CustomException exceptionResponse= new CustomException(new Date(),"Not a valid Input",
				 "message should have atleast 2 characters");

			return new ResponseEntity(exceptionResponse,HttpStatus.BAD_REQUEST);
	 	}
	 	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(
			HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		CustomException customException = new CustomException(new Date(),"Please Check your JSON body",request.getDescription(false));
		
		return new ResponseEntity(customException,HttpStatus.BAD_REQUEST);
	}
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

	CustomException customException = new CustomException(new Date(),"Validation Failed",ex.getBindingResult().toString());
	
	return new ResponseEntity(customException,HttpStatus.BAD_REQUEST);
	}
	
}*/
