package com.capgemini.main.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = InvalidOrderIdException.class)
	public ResponseEntity<Object> bookOrderEntityException(InvalidOrderIdException orderObj, WebRequest web)
	{
		CustomEntityException err = new CustomEntityException(new Date(), orderObj.getMessage(), web.getDescription(false));
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(value = NoOrderException.class)
	public ResponseEntity<Object> emptyOrderException(NoOrderException orderObj , WebRequest req)
	{
		CustomEntityException err = new CustomEntityException(new Date(),orderObj.getMessage(),req.getDescription(false));
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	}
	
}
