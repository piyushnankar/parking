package com.piyush.parking.Model;

import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="SLOT_BOOKING")
public class SlotBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="SLOT_BOOKING_ID")
	private long slotBookingId;
	
	private Timestamp startTime;
	
	private Timestamp EndTime;
	
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="user_id", nullable=false)
	private User user;
	
	@ManyToOne
	@JoinColumn(name="parking_id", nullable=false)
	private ParkingAddress parkingAddress;

	public long getSlotBookingId() {
		return slotBookingId;
	}

	public void setSlotBookingId(long slotBookingId) {
		this.slotBookingId = slotBookingId;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return EndTime;
	}

	public void setEndTime(Timestamp endTime) {
		EndTime = endTime;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ParkingAddress getParkingAddress() {
		return parkingAddress;
	}

	public void setParkingAddress(ParkingAddress parkingAddress) {
		this.parkingAddress = parkingAddress;
	}
	
	
}
