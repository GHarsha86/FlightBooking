package com.example.FlightBooking.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.FlightBooking.Modal.Flight;

@Service
public interface FlightService {
	List<Flight> getAll();
	List<Flight> getFlights(String origin, String date);
	List<Flight> getFlightType(String flightType, String origin, String date);
	List<Flight> getFlightToFrom(String origin, String destination, String date);
}
