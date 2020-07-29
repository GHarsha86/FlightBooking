package com.example.FlightBooking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.FlightBooking.Modal.Passenger;
import com.example.FlightBooking.Repository.PassengerRepo;

public class PassengerServiceImpl implements PassengerService{

	@Autowired
	PassengerRepo passengerRepo;
	@Override
	public Passenger addPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		Passenger passenger1 = new Passenger();
		passenger1.setFirstName(passenger.getFirstName());
		passenger1.setLastName(passenger.getLastName());
		passenger1.setGender(passenger.getGender());
		passenger1.setEmailAddress(passenger.getEmailAddress());
		passenger1.setMobileNumber(passenger.getMobileNumber());
		passenger1.setBookingRecordId(passenger.getBookingRecordId());
		return passengerRepo.save(passenger1);
	}
	@Override
	public List<Passenger> getAll() {
		// TODO Auto-generated method stub
		return passengerRepo.findAllPassengers();
	}

}
