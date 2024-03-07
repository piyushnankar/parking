package com.piyush.parking.DTO;

public class ErrorResponse {
	private String code;
	private String error;
	private String description;
	
	public ErrorResponse(String code, String error, String description) {
		this.code = code;
		this.error = error;
		this.description = description;
	}
	
	public ErrorResponse(ErrorInterface error) {
		this.code = error.getCode();
		this.error = error.getTitle();
		this.description = error.getDescription();
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getError() {
		return error;
	}
	
	public void setError(String error) {
		this.error = error;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
