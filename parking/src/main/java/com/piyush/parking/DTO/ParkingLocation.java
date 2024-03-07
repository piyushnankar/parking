package com.piyush.parking.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParkingLocation {
	private String name;
	private String address;
	private String city;
	private String locality1;
	private String locality2;
	private String locality3;
	private String number_of_slots;
}
