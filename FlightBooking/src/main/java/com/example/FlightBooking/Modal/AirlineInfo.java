package com.example.FlightBooking.Modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airlineinfo")
public class AirlineInfo {

	@Id
	@Column(name="airlineid")
	private long airlineId;
	
	@Column(name="airlinelogo")
	private String airlineLogo;
	
	@Column(name="nameofairline")
	private String nameOfAirline;

	
	
	public AirlineInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AirlineInfo(long airlineId, String airlineLogo, String nameOfAirline) {
		super();
		this.airlineId = airlineId;
		this.airlineLogo = airlineLogo;
		this.nameOfAirline = nameOfAirline;
	}

	public long getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(long airlineId) {
		this.airlineId = airlineId;
	}

	public String getAirlineLogo() {
		return airlineLogo;
	}

	public void setAirlineLogo(String airlineLogo) {
		this.airlineLogo = airlineLogo;
	}

	public String getNameOfAirline() {
		return nameOfAirline;
	}

	public void setNameOfAirline(String nameOfAirline) {
		this.nameOfAirline = nameOfAirline;
	}
	
	
}