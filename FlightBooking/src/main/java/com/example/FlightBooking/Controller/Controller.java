package com.example.FlightBooking.Controller;
	
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlightBooking.Modal.Flight;
import com.example.FlightBooking.Modal.Passenger;
import com.example.FlightBooking.Service.FlightService;
import com.example.FlightBooking.Service.FlightServiceImpl;
import com.example.FlightBooking.Service.PassengerService;

@RestController
@RequestMapping("/flightbooking")
public class Controller {
	@Autowired
	FlightService flightService;
	

	@Autowired 
	PassengerService passengerService;
	
	@GetMapping("/getflights")
	public @ResponseBody List<Flight> getAllFlights(){
		//System.out.println(".............."+ flightService.getAll().get(0));
		return flightService.getAll();
	}
	
	@GetMapping("/getflights/{flightType}/{origin}/{date}")
	public @ResponseBody List<Flight> getFlightsfrom(@PathVariable String origin, @PathVariable String date, @PathVariable String flightType) {
		return flightService.getFlightType(flightType, origin, date);
	}
	
	@GetMapping("/getflight/{origin}/{destination}/{date}")
	public @ResponseBody List<Flight> getFlightsTofrom(@PathVariable String origin, @PathVariable String date, @PathVariable String destination) {
		return flightService.getFlightToFrom(origin,destination, date);
		
	}
	
	@GetMapping("/getcombination/{origin}/{destination}/{flightnumber}")
	public @ResponseBody List<Flight> getFlightsCombo(@PathVariable String origin, @PathVariable String destination, @PathVariable String flightnumber) {
		return flightService.getFlightCombo(origin,destination, flightnumber);
	}
	
	@GetMapping("/getflightbytime/{flightnumber}/{flightdate}/{flighttime}")
	public @ResponseBody List<Flight> getFlightByTime(@PathVariable String flightnumber, @PathVariable String flightdate, @PathVariable String flighttime ) {
		return flightService.getFlightByTime(flightnumber,flightdate,flighttime);
	}
	
	@PostMapping("/createnewflights")
	public ResponseEntity<Flight> createNewFlight(@RequestBody Flight flight){
		return new ResponseEntity<>(flightService.createNewFlight(flight), HttpStatus.CREATED);	
	}
	
	@PostMapping("/booktickets")
	public ResponseEntity<Passenger> bookTicket(@RequestBody Passenger passenger) {
		return new ResponseEntity<>(passengerService.addPassenger(passenger), HttpStatus.CREATED);
	}
	
	@GetMapping("/getpassenger")
	public @ResponseBody List<Passenger> getPassengers() {
		return passengerService.getAll();
	}

	@PutMapping("/updateflight/{date}/{flightnumber}")
	public ResponseEntity<Flight> updateFLight(@PathVariable String date, @PathVariable String flightnumber, @RequestBody Flight flight) {
		return new ResponseEntity<>(flightService.updateFlight(date, flightnumber, flight), HttpStatus.OK);
	}
}
