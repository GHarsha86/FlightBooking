package com.example.FlightBooking.Modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {

	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="duration")
	private String duration;
	
	@Column(name="flightdate")
	private String flightDate;
	

	@Column(name="flightnumber")
	private String flightNumber;
	
	@Column(name="flighttime")
	private String flightTime;
	
	@Column(name="origin")
	private String origin;
	
	@ManyToOne
	@JoinColumn(name="fareid")
	private Fare fareId;
	
	@ManyToOne
	@JoinColumn(name="flightinfo")
	private FlightInfo flightInfo;
	
	@ManyToOne
	@JoinColumn(name="invid")
	private Inventory invId;

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flight(long id, String destination, String duration, String flightDate, String flightNumber,
			String flightTime, String origin, Fare fareId, FlightInfo flightInfo, Inventory invId) {
		super();
		this.id = id;
		this.destination = destination;
		this.duration = duration;
		this.flightDate = flightDate;
		this.flightNumber = flightNumber;
		this.flightTime = flightTime;
		this.origin = origin;
		this.fareId = fareId;
		this.flightInfo = flightInfo;
		this.invId = invId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
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

	public Fare getFareId() {
		return fareId;
	}

	public void setFareId(Fare fareId) {
		this.fareId = fareId;
	}

	public FlightInfo getFlightInfo() {
		return flightInfo;
	}

	public void setFlightInfo(FlightInfo flightInfo) {
		this.flightInfo = flightInfo;
	}

	public Inventory getInvId() {
		return invId;
	}

	public void setInvId(Inventory invId) {
		this.invId = invId;
	}
	

}