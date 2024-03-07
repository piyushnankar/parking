package com.piyush.parking.DTO;

public class AddParkingResponse {
	
	String message;
	String description;
	
	public AddParkingResponse(String message,String description) {
		this.message = message;
		this.description = description;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
