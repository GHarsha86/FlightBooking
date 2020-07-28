package com.example.FlightBooking.Modal;
import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Embeddable 
@Table(name="flightsinfo")
public class FlightsInfo implements Serializable {
	
	@ManyToOne	
	@JoinColumn(name="airlineid")
	private AirlineInfo airlineId;
	
	@ManyToOne
	@JoinColumn(name="flightinfoid")
	private FlightInfo flightInfoId;

	
	public FlightsInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlightsInfo(AirlineInfo airlineId, FlightInfo flightInfoId) {
		super();
		this.airlineId = airlineId;
		this.flightInfoId = flightInfoId;
	}

	public AirlineInfo getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(AirlineInfo airlineId) {
		this.airlineId = airlineId;
	}

	public FlightInfo getFlightInfoId() {
		return flightInfoId;
	}

	public void setFlightInfoId(FlightInfo flightInfoId) {
		this.flightInfoId = flightInfoId;
	}
	
	
	
}