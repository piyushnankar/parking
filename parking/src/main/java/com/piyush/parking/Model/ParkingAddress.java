package com.piyush.parking.Model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PARKING_ADDRESS")
public class ParkingAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int parkingId;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false)
	private String city;
	
	private String locality1;
	private String locality2;
	private String locality3;
	
	@Column(nullable = false) 
	private int number_of_slots;
	
	@OneToMany(mappedBy="parkingAddress", fetch = FetchType.LAZY)
	private Set<SlotBooking> bookings;
	
	public int getParkingId() {
		return parkingId;
	}

	public void setParkingId(int parkingId) {
		this.parkingId = parkingId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLocality1() {
		return locality1;
	}

	public void setLocality1(String locality1) {
		this.locality1 = locality1;
	}

	public String getLocality2() {
		return locality2;
	}

	public void setLocality2(String locality2) {
		this.locality2 = locality2;
	}

	public String getLocality3() {
		return locality3;
	}

	public void setLocality3(String locality3) {
		this.locality3 = locality3;
	}

	public int getNumber_of_slots() {
		return number_of_slots;
	}

	public void setNumber_of_slots(int number_of_slots) {
		this.number_of_slots = number_of_slots;
	}

	public Set<SlotBooking> getBookings() {
		return bookings;
	}

	public void setBookings(Set<SlotBooking> bookings) {
		this.bookings = bookings;
	}
	
}
