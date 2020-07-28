package com.example.FlightBooking.Modal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flightinfo")
public class FlightInfo {
	
	@Id
	@Column(name="flightinfoid")
	private long flightInfoId;
	
	@Column(name="flightnumber")
	private String FlightNumber;
	
	@Column(name="flighttype")
	private String FlightType;
	
	@Column(name="numberofseats")
	private String numberOfSeats;
	
	

	public FlightInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlightInfo(long flightInfoId, String flightNumber, String flightType, String numberOfSeats) {
		super();
		this.flightInfoId = flightInfoId;
		FlightNumber = flightNumber;
		FlightType = flightType;
		this.numberOfSeats = numberOfSeats;
	}

	public long getFlightInfoId() {
		return flightInfoId;
	}

	public void setFlightInfoId(long flightInfoId) {
		this.flightInfoId = flightInfoId;
	}

	public String getFlightNumber() {
		return FlightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		FlightNumber = flightNumber;
	}

	public String getFlightType() {
		return FlightType;
	}

	public void setFlightType(String flightType) {
		FlightType = flightType;
	}

	public String getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(String numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	
}