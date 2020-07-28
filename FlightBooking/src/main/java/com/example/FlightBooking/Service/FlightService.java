package com.example.FlightBooking.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.FlightBooking.Modal.Flight;

@Service
public interface FlightService {
	List<Flight> getAll();
}
