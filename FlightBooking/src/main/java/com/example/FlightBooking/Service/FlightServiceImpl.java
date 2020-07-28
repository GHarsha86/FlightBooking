package com.example.FlightBooking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FlightBooking.Modal.Flight;
import com.example.FlightBooking.Repository.FlightRepo;

@Service
public class FlightServiceImpl implements FlightService{

	@Autowired
	FlightRepo flightRepo;
	@Override
	public List<Flight> getAll() {
		// TODO Auto-generated method stub
		return flightRepo.findAll();
	}
	@Override
	public List<Flight> getFlights(String origin, String date) {
		// TODO Auto-generated method stub
		return flightRepo.findOriginFlight(origin, date);
	}
	@Override
	public List<Flight> getFlightType(String flightType, String origin, String date) {
		// TODO Auto-generated method stub
		return flightRepo.findFlightType(flightType, origin, date);
	}
	@Override
	public List<Flight> getFlightToFrom(String origin, String destination, String date) {
		// TODO Auto-generated method stub
		return flightRepo.findFlightToFrom(origin, destination, date);
	}

}
