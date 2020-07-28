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

}
