package com.piyush.parking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.parking.DTO.AddParkingResponse;
import com.piyush.parking.Model.ParkingAddress;
import com.piyush.parking.repository.ParkingRepository;
import com.piyush.parking.util.ValidationUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;


@RestController
@RequestMapping("/v1")
public class ParkingController {
	
	@Autowired
	EntityManager entityManager;
	
	@Autowired
	ParkingRepository parkingRepository;
	
	@GetMapping("/parking")
	public void getParkingDetails() {
		System.out.println("Piyush Nankar");
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping("/addParking")
	@Transactional
	public <T> ResponseEntity<T> addParking(@RequestBody ParkingAddress parkAddress) {
		
		System.out.println("Request for add parking controller : " + parkAddress.getName());
		ValidationUtil.validAddParkingRequest(parkAddress);
		
		parkingRepository.save(parkAddress);
		System.out.println("Request completed for add parking controller : " + parkAddress.getName());
		AddParkingResponse addParkingResponse = new AddParkingResponse("Address saved successfully","Parking data added successfully in database");
		return new ResponseEntity<T>((T) addParkingResponse,HttpStatus.OK);
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/getParkingDetails")
	public <T> ResponseEntity<T> getParkingDetails(@RequestBody ParkingAddress parkAddress){
		System.out.println(" Request for get parking details controller : " + parkAddress.getName());
		
		StringBuilder customQuery = new StringBuilder("Select p from ParkingAddress p");
		if(parkAddress.getName() != null) {
			customQuery.append(" where name like '%" + parkAddress.getName() +"%'");
		}
		System.out.println(" Query to execute " + customQuery);
		Query query = entityManager.createQuery(customQuery.toString());
		List<ParkingAddress> parkingAddressList = query.getResultList();
		return new ResponseEntity<T>((T) parkingAddressList,HttpStatus.OK);
	}
}
