package com.piyush.parking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.piyush.parking.DTO.ErrorInterface;
import com.piyush.parking.DTO.ErrorResponse;

import com.piyush.parking.exceptions.InvalidRequestException;

@RestControllerAdvice
public class ExceptionControllerAdvice {
	
	@SuppressWarnings("unchecked")
	@ExceptionHandler({InvalidRequestException.class})
	public <T> ResponseEntity<T> handleInvalidRequestError(InvalidRequestException ex){
		ErrorInterface error = ex.getError();
		return new ResponseEntity<T>((T) new ErrorResponse(error),HttpStatus.BAD_REQUEST);
	}
}
