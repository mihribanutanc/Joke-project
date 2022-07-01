package com.example.joke.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@RestControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(value = {BusinessException.class})
	 ResponseEntity<ErrorMessage> resourceNotFoundException(BusinessException exception, WebRequest request){
		ErrorMessage errorMessage = new ErrorMessage(HttpStatus.NOT_FOUND.value(),
				exception.getMessage(),
				request.getDescription(false),
				new Date());

		return ResponseEntity.ok(errorMessage);
	}

	@ExceptionHandler
	ResponseEntity<ErrorMessage> globalExceptionHandler(Exception exception, WebRequest request){
		ErrorMessage errorMessage = new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR.value(),
				exception.getMessage(),
				request.getDescription(false),
				new Date());

		return ResponseEntity.ok(errorMessage);
	}

}
