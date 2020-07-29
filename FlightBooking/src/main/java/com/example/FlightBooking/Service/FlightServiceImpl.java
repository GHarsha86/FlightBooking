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
	@Override
	public List<Flight> getFlightCombo(String origin, String destination, String flightnumber) {
		// TODO Auto-generated method stub
		return flightRepo.findFlightCombo(origin,destination,flightnumber);
	}
	@Override
	public List<Flight> getFlightByTime(String flightnumber, String flightdate, String flighttime) {
		// TODO Auto-generated method stub
		return flightRepo.findFlightTime(flightnumber, flightdate, flighttime);
	}
	@Override
	public Flight createNewFlight(Flight flight) {
		// TODO Auto-generated method stub
		Flight flight1 =  new Flight();
		flight1.setId(flight.getId());
		flight1.setDestination(flight.getDestination());
		flight1.setOrigin(flight.getOrigin());
		flight1.setFlightNumber(flight.getFlightNumber());
		flight1.setFlightDate(flight.getFlightDate());
		flight.setFlightTime(flight.getFlightTime());
	
		return flightRepo.save(flight1);
	}
	@Override
	public Flight updateFlight(String date, String flightnumber, Flight flight) {
		// TODO Auto-generated method stub
		Flight flight1 = new Flight();
		flight1.setId(flight.getId());
		flight1.setDestination(flight.getDestination());
		flight1.setOrigin(flight.getOrigin());
		flight1.setFlightNumber(flightnumber);
		flight1.setFlightDate(date);
		flight.setFlightTime(flight.getFlightTime());
		flight.setFlightInfo(flight.getFlightInfo());
		flight.setFareId(flight.getFareId());
		flight.setInvId(flight.getInvId());
		System.out.println(".........."+ flight1);
		return flightRepo.save(flight1);
	}
	@Override
	public List<Flight> getFlightByType(String flighttype, String flightdate) {
		// TODO Auto-generated method stub
		return flightRepo.flightByType(flighttype,flightdate);
	}

}
