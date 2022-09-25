package com.example.manas.LiveEmaple.exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.manas.LiveEmaple.basic.BasicUserNotFoundDB;


@ControllerAdvice
@RestController
public class LiveExceptionHandling extends ResponseEntityExceptionHandler  {
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex,WebRequest web){
		
		CustomException customException = new CustomException(new Date(),ex.getMessage(),web.getDescription(false));
		
		return new ResponseEntity(customException, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(BasicUserNotFoundDB.class)
	public final ResponseEntity<Object> handleUsernotFoundException(Exception ex,WebRequest web){
			CustomException customException = new CustomException(new Date(),ex.getMessage(),web.getDescription(false));
		
		return new ResponseEntity(customException, HttpStatus.NOT_FOUND);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		CustomException customException = new CustomException(new Date(),ex.getMessage(),request.getDescription(false));

		return new ResponseEntity(customException,HttpStatus.BAD_REQUEST);
	}
	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(
			HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		CustomException customException = new CustomException(new Date(),"Please Check your JSON syntax",request.getDescription(false));
		
		return new ResponseEntity(customException,HttpStatus.BAD_REQUEST);
	}
}
