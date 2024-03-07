package com.piyush.parking.util;

import com.piyush.parking.DTO.ErrorInterface;

public enum ErrorEnum implements ErrorInterface{
	
	NAME_CANNOT_BE_NULL("B400","Name cannot be null","Name cannot be null"),
	
	CITY_CANNOT_BE_NULL("B401","City name cannot be null","City name cannot be null"),
	
	ADDRESS_CANNOT_BE_NULL("B402","Address cannot be null","Address cannot be null"),
	
	NUMBER_OF_SLOTS_CANT_BE_NULL("B403","Number of slots should be greater than zero","Number of slots should be greater than zero");
	
	private String code;
	private String title;
	private String description;
	
	ErrorEnum(String code, String title, String description) {
		System.out.println("Inside constructor");
		this.code = code;
		this.title = title;
		this.description = description;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getDescription() {
		return this.description;
	}
}
