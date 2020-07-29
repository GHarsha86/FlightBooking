package com.example.FlightBooking.Modal;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bookingdetails")
public class BookingDetails implements Serializable  {

	@ManyToOne	
	@JoinColumn(name="bookingrecordid")
	private BookingRecord bookingId;
	
	@Id
	@ManyToOne
	@JoinColumn(name="passengerid")	
	private Passenger passengerId;

	
	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

 
	public BookingDetails(BookingRecord bookingId, Passenger passengerId) {
		super();
		this.bookingId = bookingId;
		this.passengerId = passengerId;
	}


	public BookingRecord getBookingId() {
		return bookingId;
	}


	public void setBookingId(BookingRecord bookingId) {
		this.bookingId = bookingId;
	}


	public Passenger getPassengerId() {
		return passengerId;
	}


	public void setPassengerId(Passenger passengerId) {
		this.passengerId = passengerId;
	}
	
	
}