		package com.example.FlightBooking.Modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity(name ="bookingrecord")
public class BookingRecord {
	
	@Id
	@Column(name="bookingrecordid")
	private long bookingRecordId;
	
	@Column(name="bookingDate")
	private String bookingDate;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="fare")
	private double fare;
	
	@Column(name="flightdate")
	private String flightDate;
	
	@Column(name="flightnumber")
	private String flightNumber;
	
	@Column(name="flighttime")
	private String flightTime;
	
	@Column(name="origin")
	private String origin;
	
	@Column(name="status")
	private String status;

	
	public BookingRecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookingRecord(long bookingRecordId, String bookingDate, String destination, double fare, String flightDate,
			String flightNumber, String flightTime, String origin, String status) {
		super();
		this.bookingRecordId = bookingRecordId;
		this.bookingDate = bookingDate;
		this.destination = destination;
		this.fare = fare;
		this.flightDate = flightDate;
		this.flightNumber = flightNumber;
		this.flightTime = flightTime;
		this.origin = origin;
		this.status = status;
	}

	public long getBookingRecordId() {
		return bookingRecordId;
	}

	public void setBookingRecordId(long bookingRecordId) {
		this.bookingRecordId = bookingRecordId;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	
}