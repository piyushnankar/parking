package com.piyush.parking.exceptions;

import com.piyush.parking.DTO.ErrorInterface;
import com.piyush.parking.util.ErrorEnum;

public class InvalidRequestException extends RuntimeException{
	private ErrorInterface error;
	
	public InvalidRequestException(ErrorInterface error) {
		this.error = error;
	}

	public ErrorInterface getError() {
		return error;
	}

	public void setError(ErrorInterface error) {
		this.error = error;
	}
}
