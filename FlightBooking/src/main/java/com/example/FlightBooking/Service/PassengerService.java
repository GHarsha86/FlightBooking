package com.example.FlightBooking.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.FlightBooking.Modal.Passenger;

@Service
public interface PassengerService {

	Passenger addPassenger(Passenger passenger);

	List<Passenger> getAll();
}
