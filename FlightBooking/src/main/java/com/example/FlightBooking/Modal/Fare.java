	package com.example.FlightBooking.Modal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fare")
public class Fare {

	@Id
	@Column(name="fareid")
	private long fareId;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="fare")
	private double fare;

	
	
	public Fare() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fare(long fareId, String currency, double fare, double amount) {
		super();
		this.fareId = fareId;
		this.currency = currency;
		this.fare = fare;
	}

	public long getFareId() {
		return fareId;
	}

	public void setFareId(long fareId) {
		this.fareId = fareId;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	
	
}