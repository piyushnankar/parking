package com.piyush.parking.util;

import com.piyush.parking.Model.ParkingAddress;
import com.piyush.parking.exceptions.InvalidRequestException;

public class ValidationUtil {
	
	public static void validAddParkingRequest(ParkingAddress parkAddress) {
		if(parkAddress.getName()==null) {
			System.out.println("Name cannot be null");
			throw new InvalidRequestException(ErrorEnum.NAME_CANNOT_BE_NULL);
		}
		
		if(parkAddress.getAddress()==null) {
			System.out.println("Address cannot be null");
			throw new InvalidRequestException(ErrorEnum.ADDRESS_CANNOT_BE_NULL);
		}
		
		if(parkAddress.getCity()==null) {
			System.out.println("city name cannot be null");
			throw new InvalidRequestException(ErrorEnum.CITY_CANNOT_BE_NULL);
		}
		
		if(parkAddress.getNumber_of_slots()<=0) {
			System.out.println("Number of slots should be greater than zero");
			throw new InvalidRequestException(ErrorEnum.NUMBER_OF_SLOTS_CANT_BE_NULL);
		}
	}
}
