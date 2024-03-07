package com.piyush.parking.Model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "USERS")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private String username;
	
	@Column(nullable=false)
	private String carNumber;
	
	@Column(nullable=false)
	private String password;
	
	@OneToMany(mappedBy="user")
	private Set<SlotBooking> bookings;

	public Set<SlotBooking> getBookings() {
		return bookings;
	}

	public void setBookings(Set<SlotBooking> bookings) {
		this.bookings = bookings;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
