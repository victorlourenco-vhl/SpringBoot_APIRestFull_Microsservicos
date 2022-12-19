package com.apirest.microsservicos.resources.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handlerResourceNotFoundException(ResourceNotFoundException ex){
		
		FieldMessage error = new FieldMessage(HttpStatus.NOT_FOUND.value(), "Not Found",  ex.getMessage());
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		
		
		
	}

}
