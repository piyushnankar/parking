package com.piyush.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.parking.Model.User;
import com.piyush.parking.repository.UserRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/v1/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;

	@SuppressWarnings("unchecked")
	@PostMapping("/addUser")
	@Transactional
	public <T> ResponseEntity<T> addUser(@RequestBody User user){
		System.out.println("Add request for user " + user.getName());
		userRepository.save(user);
		System.out.println("Request completed for add user " + user.getName());
		return new ResponseEntity<T>((T) "User Added successfully",HttpStatus.OK);
	}
}
