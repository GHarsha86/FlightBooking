package com.example.FlightBooking.Modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "passenger")
public class Passenger {
	@Id
	@Column(name = "passengerid")
	private long passengerId;
	
	@Column(name = "emailaddress")
	private String emailAddress;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name="mobilenumber")
	private long mobileNumber;
	

	@ManyToOne
	@JoinColumn(name="bookingrecordid")
	private BookingRecord bookingRecordId;

	
	
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(long passengerId, String emailAddress, String firstName, String gender, String lastName,
			long mobileNumber, BookingDetails bookingId, BookingRecord bookingRecordId) {
		super();
		this.passengerId = passengerId;
		this.emailAddress = emailAddress;
		this.firstName = firstName;
		this.gender = gender;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		
		this.bookingRecordId = bookingRecordId;
	}

	public long getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(long passengerId) {
		this.passengerId = passengerId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public BookingRecord getBookingRecordId() {
		return bookingRecordId;
	}

	public void setBookingRecordId(BookingRecord bookingRecordId) {
		this.bookingRecordId = bookingRecordId;
	}

	
	

	
}