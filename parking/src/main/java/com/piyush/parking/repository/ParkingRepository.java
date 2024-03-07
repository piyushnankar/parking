package com.piyush.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.piyush.parking.Model.ParkingAddress;

@Repository
public interface ParkingRepository extends JpaRepository<ParkingAddress,Integer>{
	
}
